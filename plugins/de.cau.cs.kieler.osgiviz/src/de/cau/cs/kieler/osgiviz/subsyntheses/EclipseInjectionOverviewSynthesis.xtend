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
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionContext
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionOverviewContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*

/**
 * Transformation as an overview of all eclipse injections in the given list of eclipse injections.
 * 
 * @author nre
 */
class EclipseInjectionOverviewSynthesis extends AbstractSubSynthesis<EclipseInjectionOverviewContext, KNode> {
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension OsgiStyles
    @Inject EclipseInjectionSynthesis eclipseInjectionSynthesis
    @Inject SimpleEclipseInjectionSynthesis simpleEclipseInjectionSynthesis
    @Inject ServiceInterfaceSynthesis serviceInterfaceSynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(EclipseInjectionOverviewContext eclipseInjectionOverviewContext) {
        return #[
            createNode => [
                associateWith(eclipseInjectionOverviewContext)
                data += createKIdentifier => [ it.id = eclipseInjectionOverviewContext.hashCode.toString ]
                if (eclipseInjectionOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                setLayoutOption(it, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                setLayoutOption(it, CoreOptions::DIRECTION, Direction.DOWN)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                addOverviewRendering("Eclipse Injections", eclipseInjectionOverviewContext.overviewText)
                
                // remove the padding of the invisible container.
                addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
                
                // Add all simple eclipse injection renderings in a first subgraph (top)
                val collapsedOverviewNode = transformCollapsedEclipseInjectionsOverview(eclipseInjectionOverviewContext)
                children += collapsedOverviewNode
                
                // Add all detailed eclipse injection renderings and their connections in a second subgraph (bottom)
                val detailedOverviewNode = transformDetailedEclipseInjectionsOverview(eclipseInjectionOverviewContext)
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
     * The top part of the eclipse injection overview rendering containing all collapsed eclipse injection renderings in a
     * box layout.
     * 
     * @param eclipseInjectionOverviewContext The overview context for all eclipse injections in this subsynthesis.
     */
    private def KNode transformCollapsedEclipseInjectionsOverview(
        EclipseInjectionOverviewContext eclipseInjectionOverviewContext) {
        val eclipseInjectionContexts = eclipseInjectionOverviewContext.collapsedElements
        createNode => [
            associateWith(eclipseInjectionOverviewContext)
            configureBoxLayout
            addInvisibleContainerRendering
            tooltip = eclipseInjectionOverviewContext.overviewText
            
            eclipseInjectionContexts.sortBy [
                modelElement.displayedString
            ].forEach [ collapsedEclipseInjectionContext, index |
                children += simpleEclipseInjectionSynthesis.transform(
                    collapsedEclipseInjectionContext as EclipseInjectionContext, -index)
            ]
        ]
    }
    
    /**
     * The bottom part of the eclipse injection overview rendering containing all detailed eclipse injection renderings and
     * their connections in a layered layout.
     * 
     * @param eclipseInjectionOverviewContext The overview context for all eclipse injections in this subsynthesis.
     */
    private def KNode transformDetailedEclipseInjectionsOverview(
        EclipseInjectionOverviewContext eclipseInjectionOverviewContext) {
        val filteredDetailedEclipseInjectionContexts = SynthesisUtils.filteredElementContexts(
            eclipseInjectionOverviewContext.detailedElements, usedContext)
        createNode => [
            associateWith(eclipseInjectionOverviewContext)
            configureOverviewLayout
            addInvisibleContainerRendering
            tooltip = eclipseInjectionOverviewContext.overviewText
            
            // All eclipse injections.
            children += filteredDetailedEclipseInjectionContexts.flatMap [
                return eclipseInjectionSynthesis.transform(it as EclipseInjectionContext)
            ]
            
            // All service interfaces.
            children += SynthesisUtils.filteredElementContexts(eclipseInjectionOverviewContext
                .injectedInterfaces, usedContext).flatMap [
                    return serviceInterfaceSynthesis.transform(it as ServiceInterfaceContext)
                ]
            
            // All injection edges.
            addInjectedInterfaceEdges(eclipseInjectionOverviewContext.injectedInterfaceEdges)
        ]
    }
    
    def addInjectedInterfaceEdges(List<Pair<EclipseInjectionContext, ServiceInterfaceContext>> edges) {
        edges.forEach [
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
