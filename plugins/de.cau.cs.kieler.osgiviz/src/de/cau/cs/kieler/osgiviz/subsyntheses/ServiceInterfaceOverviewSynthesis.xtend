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
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses
import de.cau.cs.kieler.osgiviz.OsgiCommonSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.ReferencedInterfaceEdgeConnection
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceOverviewContext
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.alg.layered.options.LayeredMetaDataProvider
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.HierarchyHandling
import org.eclipse.elk.core.options.SizeConstraint

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*

/**
 * Transformation as an overview of all service interfaces in the given list of service interfaces.
 * 
 * @author nre
 */
class ServiceInterfaceOverviewSynthesis extends AbstractSubSynthesis<ServiceInterfaceOverviewContext, KNode> {
    @Inject extension KEdgeExtensions kEdgeExtensions
    @Inject extension KNodeExtensions kNodeExtensions
    @Inject extension KRenderingExtensions kRenderingExtensions
    @Inject extension OsgiStyles osgiStyles
    @Inject BundleSynthesis bundleSynthesis
    @Inject ServiceComponentSynthesis serviceComponentSynthesis
    @Inject ServiceInterfaceSynthesis serviceInterfaceSynthesis
    @Inject SimpleServiceInterfaceSynthesis simpleServiceInterfaceSynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ServiceInterfaceOverviewContext serviceInterfaceOverviewContext) {
        return #[
            createNode => [
                associateWith(serviceInterfaceOverviewContext)
                data += createKIdentifier => [ it.id = serviceInterfaceOverviewContext.hashCode.toString ]
                if (serviceInterfaceOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                DiagramSyntheses.setLayoutOption(it, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                DiagramSyntheses.setLayoutOption(it, CoreOptions::DIRECTION, Direction.DOWN)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                addOverviewRendering("Service Interfaces", serviceInterfaceOverviewContext.overviewText)
                
                // remove the padding of the invisible container.
                addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
                
                // Add all simple service interface renderings in a first subgraph (top)
                val collapsedOverviewNode = transformCollapsedServiceInterfacesOverview(serviceInterfaceOverviewContext)
                children += collapsedOverviewNode
                
                // Add all detailed service interface renderings and their connections in a second subgraph (bottom)
                val detailedOverviewNode = transformDetailedServiceInterfacesOverview(serviceInterfaceOverviewContext)
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
     * The top part of the service interface overview rendering containing all collapsed service interface renderings in
     * a box layout.
     * 
     * @param serviceInterfaceOverviewContext The overview context for all service interfaces in this subsynthesis.
     */
    private def KNode transformCollapsedServiceInterfacesOverview(
        ServiceInterfaceOverviewContext serviceInterfaceOverviewContext) {
        val filteredCollapsedServiceInterfaceContexts = SynthesisUtils.filteredElementContexts(
            serviceInterfaceOverviewContext.collapsedElements, usedContext)
        createNode => [
            associateWith(serviceInterfaceOverviewContext)
            configureBoxLayout
            addInvisibleContainerRendering
            tooltip = serviceInterfaceOverviewContext.overviewText
            
            filteredCollapsedServiceInterfaceContexts.sortBy [
                SynthesisUtils.getId(modelElement.name, usedContext)
            ].forEach [ serviceInterfaceContext, index |
                children += simpleServiceInterfaceSynthesis.transform(
                    serviceInterfaceContext as ServiceInterfaceContext, -index)
            ]
        ]
    }
    
    /**
     * The bottom part of the service interface overview rendering containing all detailed service interface renderings
     * and their connections in a layered layout.
     * 
     * @param serviceInterfaceOverviewContext The overview context for all service interfaces in this subsynthesis.
     */
    private def KNode transformDetailedServiceInterfacesOverview(
        ServiceInterfaceOverviewContext serviceInterfaceOverviewContext) {
        createNode => [
            associateWith(serviceInterfaceOverviewContext)
            configureOverviewLayout
            setLayoutOption(LayeredMetaDataProvider::SPACING_NODE_NODE_BETWEEN_LAYERS, 30.0)
            setLayoutOption(CoreOptions.SPACING_EDGE_LABEL, 4.0)
            addInvisibleContainerRendering
            tooltip = serviceInterfaceOverviewContext.overviewText
            
            // All service interfaces.
            val filteredDetailedServiceInterfaceContexts = SynthesisUtils.filteredElementContexts(
                serviceInterfaceOverviewContext.detailedElements, usedContext)
            children += filteredDetailedServiceInterfaceContexts.flatMap [
                return serviceInterfaceSynthesis.transform(it as ServiceInterfaceContext)
            ]
            
            var List<Pair<ServiceComponentContext, ServiceInterfaceContext>>  implementedInterfaceEdges
            var List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdges
            switch (usedContext.getProperty(OsgiSynthesisProperties.CURRENT_SERVICE_COMPONENT_VISUALIZATION_MODE)) {
                case PLAIN: {
                    // All service components.
                    val filteredServiceComponentContexts = SynthesisUtils.filteredElementContexts(
                        serviceInterfaceOverviewContext.implementingOrReferencingServiceComponentContexts, usedContext)
                    children += filteredServiceComponentContexts.flatMap [
                        return serviceComponentSynthesis.transform(it as ServiceComponentContext)
                    ]
                    implementedInterfaceEdges = serviceInterfaceOverviewContext.implementedInterfaceEdgesPlain
                    referencedInterfaceEdges = serviceInterfaceOverviewContext.referencedInterfaceEdgesPlain
                }
                case IN_BUNDLES: {
                    setLayoutOption(CoreOptions::HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN)
                    // All bundles containing the service components.
                    val filteredBundleContexts = SynthesisUtils.filteredElementContexts(
                        serviceInterfaceOverviewContext.referencedBundleContexts, usedContext)
                    children += filteredBundleContexts.flatMap [
                        return bundleSynthesis.transform(it as BundleContext)
                    ]
                    implementedInterfaceEdges = serviceInterfaceOverviewContext.implementedInterfaceEdgesInBundles
                    referencedInterfaceEdges = serviceInterfaceOverviewContext.referencedInterfaceEdgesInBundles
                }
            }
            
            // Add all implementing service component edges.
            OsgiCommonSynthesis.addImplementedInterfaceEdges(implementedInterfaceEdges, kEdgeExtensions,
                kNodeExtensions, osgiStyles)
            
            // Add all referenced service interface edges.
            OsgiCommonSynthesis.addReferencedInterfaceEdges(referencedInterfaceEdges, kEdgeExtensions,
                kNodeExtensions, osgiStyles, usedContext)
        ]
    }
    
}
