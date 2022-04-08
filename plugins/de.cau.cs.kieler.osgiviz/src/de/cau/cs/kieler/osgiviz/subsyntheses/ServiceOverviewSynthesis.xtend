/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019-2022 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KIdentifier
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.Pair
import de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.HierarchyHandling
import org.eclipse.elk.core.options.SizeConstraint

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*
import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Transformation as an overview of all services in the given lists of service elements.
 * 
 * @author nre
 */
class ServiceOverviewSynthesis extends AbstractSubSynthesis<ServiceOverviewContext, KNode> {
    @Inject extension KEdgeExtensions kEdgeExtensions
    @Inject extension KNodeExtensions kNodeExtensions
    @Inject extension KRenderingExtensions kRenderingExtensions
    @Inject extension OsgiStyles osgiStyles
    @Inject BundleSynthesis bundleSynthesis
    @Inject ClassSynthesis classSynthesis
    @Inject ServiceComponentSynthesis serviceComponentSynthesis
    @Inject ServiceInterfaceSynthesis serviceInterfaceSynthesis
    @Inject SimpleBundleSynthesis simpleBundleSynthesis
    @Inject SimpleClassSynthesis simpleClassSynthesis
    @Inject SimpleServiceComponentSynthesis simpleServiceComponentSynthesis
    @Inject SimpleServiceInterfaceSynthesis simpleServiceInterfaceSynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ServiceOverviewContext serviceOverviewContext) {
        return #[
            createNode => [
                associateWith(serviceOverviewContext)
                data += createKIdentifier => [ it.id = serviceOverviewContext.hashCode.toString ]
                if (serviceOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                setLayoutOption(it, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                setLayoutOption(it, CoreOptions::DIRECTION, Direction.DOWN)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                val isFocus = serviceOverviewContext.rootVisualization.focus === serviceOverviewContext
                addOverviewRendering("Services", serviceOverviewContext.overviewText, true, isFocus, usedContext)
                
                // remove the padding of the invisible container.
                addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
                
                // Add all simple service renderings in a first subgraph (top)
                val collapsedOverviewNode = transformCollapsedServiceOverview(serviceOverviewContext)
                children += collapsedOverviewNode
                
                // Add all detailed service renderings and their connections in a second subgraph (bottom)
                val detailedOverviewNode = transformDetailedServiceOverview(serviceOverviewContext)
                children += detailedOverviewNode
                
                // Put an invisible edge between the collapsed and detailed overviews to guarantee the simple renderings
                // are above the detailed ones.
                collapsedOverviewNode.outgoingEdges += createEdge => [
                    addPolyline => [
                        invisible = true
                    ]
                    target = detailedOverviewNode
                ]
            ]
        ]
    }
    
    /**
     * The top part of the service overview rendering containing all collapsed service renderings in a box layout.
     * 
     * @param serviceOverviewContext The overview context for all service elements in this subsynthesis.
     */
    private def KNode transformCollapsedServiceOverview(ServiceOverviewContext serviceOverviewContext) {
        val shown = serviceOverviewContext.showCollapsedElements
        val filteredCollapsedServiceComponentContexts = if (shown) {
            SynthesisUtils.filteredElementContexts(
                serviceOverviewContext.collapsedServiceComponentContexts, usedContext)
        } else {
            #[]
        }
        val filteredCollapsedServiceInterfaceContexts = if (shown) {
            SynthesisUtils.filteredElementContexts(
                serviceOverviewContext.collapsedServiceInterfaceContexts, usedContext)
        } else {
            #[]
        }
        val filteredCollapsedClassContexts = if (shown) {
            SynthesisUtils.filteredElementContexts(
                serviceOverviewContext.collapsedClassContexts, usedContext)
        } else {
            #[]
        }
        val filteredCollapsedBundleContexts = if (shown) {
            SynthesisUtils.filteredElementContexts(
                serviceOverviewContext.collapsedReferencedBundleContexts, usedContext)
        } else {
            #[]
        }
        createNode => [
            associateWith(serviceOverviewContext)
            configureBoxLayout
            addOverviewOfCollapsedRendering(shown, usedContext)
            tooltip = serviceOverviewContext.overviewText
            
            val boolean currentVisualizationModeInBundles = usedContext
                .getOptionValue(SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES) as Boolean
            if (!serviceOverviewContext.allowInBundleConnections || !currentVisualizationModeInBundles) {
                // All service components.
                filteredCollapsedServiceComponentContexts.sortBy [
                    // The string to sort by. Either the shortened ID or the name.
                    modelElement.name
                ].forEach [ collapsedServiceComponentContext, index |
                    children += simpleServiceComponentSynthesis.transform(
                        collapsedServiceComponentContext as ServiceComponentContext , -index)
                ]
                // All classes.
                val classIndexOffset = children.size
                filteredCollapsedClassContexts.sortBy [
                    modelElement.displayedString
                ].forEach [ collapsedClassContext, index |
                    children += simpleClassSynthesis.transform(
                        collapsedClassContext as ClassContext, -index - classIndexOffset)
                ]
            }
            
            // All service interfaces.
            val interfaceIndexOffset = children.size
            filteredCollapsedServiceInterfaceContexts.sortBy [
                SynthesisUtils.getId(modelElement.name, usedContext)
            ].forEach [ serviceInterfaceContext, index |
                children += simpleServiceInterfaceSynthesis.transform(
                    serviceInterfaceContext as ServiceInterfaceContext, -index - interfaceIndexOffset)
            ]
            
            if (serviceOverviewContext.allowInBundleConnections && currentVisualizationModeInBundles) {
                // All bundles.
                val bundleIndexOffset = children.size
                filteredCollapsedBundleContexts.forEach [ bundleContext, index |
                    children += simpleBundleSynthesis.transform(bundleContext as BundleContext,
                        -index - bundleIndexOffset)
                ]   
            }
        ]
    }
    
    /**
     * The bottom part of the service overview rendering containing all detailed service renderings and their
     * connections in a layered layout.
     * 
     * @param serviceOverviewContext The overview context for all services in this subsynthesis.
     */
    private def KNode transformDetailedServiceOverview(ServiceOverviewContext serviceOverviewContext) {
        createNode => [
            associateWith(serviceOverviewContext)
            configureOverviewLayout
            setLayoutOption(CoreOptions.SPACING_EDGE_LABEL, 4.0)
            addInvisibleContainerRendering
            tooltip = serviceOverviewContext.overviewText
            
            val boolean currentVisualizationModeInBundles = usedContext
                .getOptionValue(SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES) as Boolean
            // All service components.
            if (!serviceOverviewContext.allowInBundleConnections || !currentVisualizationModeInBundles) {
                val filteredDetailedServiceComponentContexts = SynthesisUtils.filteredElementContexts(
                    serviceOverviewContext.detailedServiceComponentContexts, usedContext)
                children += filteredDetailedServiceComponentContexts.flatMap [
                    return serviceComponentSynthesis.transform(it as ServiceComponentContext)
                ]
                // All classes.
                val filteredClassContexts = SynthesisUtils.filteredElementContexts(
                    serviceOverviewContext.detailedClassContexts, usedContext)
                children += filteredClassContexts.flatMap [
                    return classSynthesis.transform(it as ClassContext)
                ]
            }
            
            // All service interfaces.
            val filteredServiceInterfaceContexts = SynthesisUtils.filteredElementContexts(
                serviceOverviewContext.detailedServiceInterfaceContexts, usedContext)
            children += filteredServiceInterfaceContexts.flatMap [
                return serviceInterfaceSynthesis.transform(it as ServiceInterfaceContext)
            ]
            
            
            var List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdges
            var List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdges
            var List<Pair<ClassContext, ServiceInterfaceContext>> injectedInterfaceEdges
            if (serviceOverviewContext.allowInBundleConnections && currentVisualizationModeInBundles) {
                setLayoutOption(CoreOptions::HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN)
                // All bundles containing the service components and injections.
                val filteredBundleContexts = SynthesisUtils.filteredElementContexts(
                    serviceOverviewContext.detailedReferencedBundleContexts, usedContext)
                children += filteredBundleContexts.flatMap [
                    return bundleSynthesis.transform(it as BundleContext)
                ]
                implementedInterfaceEdges = serviceOverviewContext.implementedInterfaceEdgesInBundles
                referencedInterfaceEdges = serviceOverviewContext.referencedInterfaceEdgesInBundles
                injectedInterfaceEdges = serviceOverviewContext.injectedInterfaceEdgesInBundles
            } else {
                implementedInterfaceEdges = serviceOverviewContext.implementedInterfaceEdgesPlain
                referencedInterfaceEdges = serviceOverviewContext.referencedInterfaceEdgesPlain
                injectedInterfaceEdges = serviceOverviewContext.injectedInterfaceEdgesPlain
            }
            
            
            // Add all implementing service component edges.
            addImplementedInterfaceEdges(implementedInterfaceEdges)
            
            // Add all referenced service interface edges.
            addReferencedInterfaceEdges(referencedInterfaceEdges)
            
            // Add all injected interface edges.
            addInjectedInterfaceEdges(injectedInterfaceEdges)
        ]
    }
    
    /**
     * Adds edges between components and their implemented interfaces. Assumes that the nodes for the components and
     * interfaces have already been generated previously.
     * 
     * @param implementedInterfaceEdges A list of all component->interface pairs for whose nodes edges should be added.
     */
    private def addImplementedInterfaceEdges(
        List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdges) {
        implementedInterfaceEdges.forEach [
            // Connects the service component and -interface via an arrow in UML style,
            // so [component] ---implements--|> [interface]
            val component = key
            val interface = value
            if (!nodeExists(component) || !nodeExists(interface)) {
                // Only Add edges if the nodes are actually shown.
                return
            }
            val componentNode = component.node
            val interfaceNode = interface.node
            val componentPort = componentNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "implementedServiceInterfaces"
            ]
            val interfacePort = interfaceNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "implementingServiceComponents"
            ]
            
            val edge = createEdge(component, interface) => [
                addImplementingComponentEdgeRendering
                sourcePort = componentPort
                targetPort = interfacePort
                source = componentNode
                target = interfaceNode
            ]
            componentNode.outgoingEdges += edge
        ]
    }
    
    /**
     * Adds edges between components and their referenced interfaces. Assumes that the nodes for the components and
     * interfaces have already been generated previously.
     * 
     * @param referencedInterfaceEdges A list of all components and interfaces for whose nodes edges should be
     * generated and the reference relation they stand in.
     */
    private def addReferencedInterfaceEdges(List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdges) {
        referencedInterfaceEdges.forEach [
            // Connects the service component and -interface via an arrow.
            val component = it.serviceComponentContext
            val interface = it.serviceInterfaceContext
            if (!nodeExists(component) || !nodeExists(interface)) {
                // Only Add edges if the nodes are actually shown.
                return
            }
            val reference = it.reference
            val componentNode = component.node
            val interfaceNode = interface.node
            val componentPort = componentNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "referencedServiceInterfaces"
            ]
            val interfacePort = interfaceNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "referencingServiceComponents"
            ]
            
            val edge = createEdge(component, interface, reference) => [
                addReferencedInterfaceEdgeRendering(reference, usedContext)
                source = interfaceNode
                target = componentNode
                sourcePort = interfacePort
                targetPort = componentPort
            ]
            interfaceNode.outgoingEdges += edge
        ]
    }
    
    /**
     * Adds edges between classes and their injected interfaces. Assumes that the nodes for the elements have already
     * been generated previously.
     * 
     * @param injectedInterfaceEdges A list of all class->interface pairs for whose nodes edges should be added.
     */
    private def addInjectedInterfaceEdges(
        List<Pair<ClassContext, ServiceInterfaceContext>> injectedInterfaceEdges) {
        injectedInterfaceEdges.forEach [
            // Connects the class with the interface via an arrow in UML style
            // so [interface] )--injectedBy--[class]
            val theClass = key
            val interface = value
            if (!nodeExists(theClass) || !nodeExists(interface)) {
                // Only add edges if the nodes are actually shown
                return
            }
            val classNode = theClass.node
            val interfaceNode = interface.node
            val injectionPort = classNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "injectedServiceInterfaces"
            ]
            val interfacePort = interfaceNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "referencingServiceComponents" // TODO: rename port / create own
            ]
            
            val edge = createEdge(theClass, interface) => [
                addImplementingComponentEdgeRendering // TODO: own rendering
                source = interfaceNode
                target = classNode
                sourcePort = interfacePort
                targetPort = injectionPort
            ]
            interfaceNode.outgoingEdges += edge
        ]
    }
    
}
