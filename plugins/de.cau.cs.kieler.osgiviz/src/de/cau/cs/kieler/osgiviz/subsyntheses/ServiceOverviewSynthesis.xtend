/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2019 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
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
import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionContext
import de.cau.cs.kieler.osgiviz.context.ReferencedInterfaceEdgeConnection
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.context.ServiceOverviewContext
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
    @Inject EclipseInjectionSynthesis eclipseInjectionSynthesis
    @Inject ServiceComponentSynthesis serviceComponentSynthesis
    @Inject ServiceInterfaceSynthesis serviceInterfaceSynthesis
    @Inject SimpleBundleSynthesis simpleBundleSynthesis
    @Inject SimpleEclipseInjectionSynthesis simpleEclipseInjectionSynthesis
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
                addOverviewRendering("Services", serviceOverviewContext.overviewText, usedContext)
                
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
        val filteredCollapsedServiceComponentContexts = SynthesisUtils.filteredElementContexts(
            serviceOverviewContext.collapsedServiceComponentContexts, usedContext)
        val filteredCollapsedServiceInterfaceContexts = SynthesisUtils.filteredElementContexts(
            serviceOverviewContext.collapsedServiceInterfaceContexts, usedContext)
        val filteredCollapsedEclipseInjectionContexts = SynthesisUtils.filteredElementContexts(
            serviceOverviewContext.collapsedEclipseInjectionContexts, usedContext)
        createNode => [
            associateWith(serviceOverviewContext)
            configureBoxLayout
            addInvisibleContainerRendering
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
                // All eclipse injections.
                val injectionIndexOffset = children.size
                filteredCollapsedEclipseInjectionContexts.sortBy [
                    modelElement.displayedString
                ].forEach [ collapsedEclipseInjectionContext, index |
                    children += simpleEclipseInjectionSynthesis.transform(
                        collapsedEclipseInjectionContext as EclipseInjectionContext, -index - injectionIndexOffset)
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
                val filteredBundleContexts = serviceOverviewContext.collapsedReferencedBundleContexts
                filteredBundleContexts.forEach [ bundleContext, index |
                    children += simpleBundleSynthesis.transform(bundleContext as BundleContext, -index - bundleIndexOffset)
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
            }
            
            // All service interfaces.
            val filteredServiceInterfaceContexts = SynthesisUtils.filteredElementContexts(
                serviceOverviewContext.detailedServiceInterfaceContexts, usedContext)
            children += filteredServiceInterfaceContexts.flatMap [
                return serviceInterfaceSynthesis.transform(it as ServiceInterfaceContext)
            ]
            
            // All eclipse injections.
            val filteredEclipseInjectionContexts = SynthesisUtils.filteredElementContexts(
                serviceOverviewContext.detailedEclipseInjectionContexts, usedContext)
            children += filteredEclipseInjectionContexts.flatMap [
                return eclipseInjectionSynthesis.transform(it as EclipseInjectionContext)
            ]
            
            var List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdges
            var List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdges
            var List<Pair<EclipseInjectionContext, ServiceInterfaceContext>> injectedInterfaceEdges
            if (serviceOverviewContext.allowInBundleConnections && currentVisualizationModeInBundles) {
                setLayoutOption(CoreOptions::HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN)
                // All bundles containing the service components and injections.
                val filteredBundleContexts = serviceOverviewContext.detailedReferencedBundleContexts
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
     * Adds edges between injections and their injected interfaces. Assumes that the nodes for the elements have already
     * been generated previously.
     * 
     * @param injectedInterfaceEdges A list of all injection->interface pairs for whose nodes edges should be added.
     */
    private def addInjectedInterfaceEdges(
        List<Pair<EclipseInjectionContext, ServiceInterfaceContext>> injectedInterfaceEdges) {
        injectedInterfaceEdges.forEach [
            // Connects the injection element with the interface via an arrow in UML style
            // so [interface] )--injectedBy--[element]
            val injection = key
            val interface = value
            if (!nodeExists(injection) || !nodeExists(interface)) {
                // Only add edges if the nodes are actually shown
                return
            }
            val injectionNode = injection.node
            val interfaceNode = interface.node
            val injectionPort = injectionNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "injectedServiceInterface"
            ]
            val interfacePort = interfaceNode.ports.findFirst [
                data.filter(KIdentifier).head?.id === "referencingServiceComponents" // TODO: rename port / create own
            ]
            
            val edge = createEdge(injection, interface) => [
                addImplementingComponentEdgeRendering // TODO: own rendering
                source = interfaceNode
                target = injectionNode
                sourcePort = interfacePort
                targetPort = injectionPort
            ]
            interfaceNode.outgoingEdges += edge
        ]
    }
    
}
