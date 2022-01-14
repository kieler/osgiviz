/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019 by
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
import de.cau.cs.kieler.osgiviz.OsgiOptions.SimpleTextType
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*
import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Transformation as an overview of all bundles in the given list of bundles.
 * 
 * @author nre
 */
class BundleOverviewSynthesis extends AbstractSubSynthesis<BundleOverviewContext, KNode> {
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension OsgiStyles
    @Inject BundleSynthesis bundleSynthesis
    @Inject PackageObjectSynthesis packageObjectSynthesis
    @Inject SimpleBundleSynthesis simpleBundleSynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(BundleOverviewContext bundleOverviewContext) {
        return #[
            createNode => [
                associateWith(bundleOverviewContext)
                data += createKIdentifier => [ it.id = bundleOverviewContext.hashCode.toString ]
                if (bundleOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                addOverviewRendering("Bundles", bundleOverviewContext.overviewText, true, usedContext)
                
                // remove the padding of the invisible container.
                addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
                
                // Add all simple bundle renderings in a first subgraph (top)
                val collapsedOverviewNode = transformCollapsedBundlesOverview(bundleOverviewContext)
                children += collapsedOverviewNode
                
                // Add all detailed bundle renderings and their connections in a second subgraph (bottom)
                val detailedOverviewNode = transformDetailedBundlesOverview(bundleOverviewContext)
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
     * The top part of the bundle overview rendering containing all collapsed bundle renderings in a box layout.
     * Has an interactive button hovering in the corner to show or hide the contents of this node.
     * 
     * @param bundleOverviewContext The overview context for all bundles in this subsynthesis.
     */
    private def KNode transformCollapsedBundlesOverview(BundleOverviewContext bundleOverviewContext) {
        val shown = bundleOverviewContext.showCollapsedElements
        val filteredCollapsedBundleContexts = if (shown) {
            SynthesisUtils.filteredElementContexts(
                bundleOverviewContext.collapsedElements as List<BundleContext>, usedContext).toList
        } else {
            #[]
        }
        createNode => [
            associateWith(bundleOverviewContext)
            configureBoxLayout
            addOverviewOfCollapsedRendering(shown, usedContext)
            tooltip = bundleOverviewContext.overviewText
            
            filteredCollapsedBundleContexts.sortBy [
                // The string to sort by. Either the shortened ID or the name.
                switch usedContext.getOptionValue(SIMPLE_TEXT) {
                    case SimpleTextType.Id: {
                        SynthesisUtils.getId(modelElement.uniqueId, usedContext)
                    }
                    case SimpleTextType.Name: {
                        modelElement.descriptiveName
                    }
                } ?: ""
            ].forEach [ collapsedBundleContext, index |
                children += simpleBundleSynthesis.transform(collapsedBundleContext as BundleContext, -index)
            ]
        ]
    }
    
    /**
     * The bottom part of the bundle overview rendering containing all detailed bundle renderings and their connections
     * in a layered layout.
     * 
     * @param bundleOverviewContext The overview context for all bundles in this subsynthesis.
     */
    private def KNode transformDetailedBundlesOverview(BundleOverviewContext bundleOverviewContext) {
        val filteredDetailedBundleContexts = SynthesisUtils.filteredElementContexts(
            bundleOverviewContext.detailedElements, usedContext)
        createNode => [
            associateWith(bundleOverviewContext)
            configureOverviewLayout
            addInvisibleContainerRendering
            tooltip = bundleOverviewContext.overviewText
            
            // All bundles.
            children += filteredDetailedBundleContexts.flatMap [
                return bundleSynthesis.transform(it as BundleContext)
            ]
            
            // All packages.
            val filteredPackageObjects = SynthesisUtils.filteredElementContexts(
                bundleOverviewContext.usedPackageContexts, usedContext)
            children += filteredPackageObjects.flatMap [
                return packageObjectSynthesis.transform(it as PackageObjectContext)
            ]
            
            // Add all required bundle edges.
            bundleOverviewContext.requiredBundleEdges.forEach [
                // Connects the {@code sourceBundleNode} and the {@code usedByBundleNode} via an arrow in UML style,
                // so [usedByBundleNode] ----- uses -----> [sourceBundleNode]
                val requiring = key
                val required = value
                if (!nodeExists(requiring) || !nodeExists(required)) {
                    // Only Add edges if the nodes are actually shown.
                    return
                }
                val requiringNode = requiring.node
                val requiredNode = required.node
                val requiringPort = requiringNode.ports.findFirst [
                    data.filter(KIdentifier).head?.id === "requiredBundles"
                ]
                val requiredPort = requiredNode.ports.findFirst [
                    data.filter(KIdentifier).head?.id === "usedByBundles"
                ]
                
                val edge = createEdge(requiring, required) => [
                    addRequiredBundleEdgeRendering
                    sourcePort = requiringPort
                    targetPort = requiredPort
                    source = requiringNode
                    target = requiredNode
                ]
                requiringNode.outgoingEdges += edge
            ]
            
            // Add all used packages edges of bundles.
            bundleOverviewContext.usedPackagesOfBundleEdges.forEach [ connection |
                if (!nodeExists(connection.sourceBundleContext) || !nodeExists(connection.targetBundleContext)) {
                    // Only Add edges if the nodes are actually shown.
                    return
                }
                val sourceBundleNode = connection.sourceBundleContext.node
                val sourceBundlePort = sourceBundleNode.ports.findFirst [
                    data.filter(KIdentifier).head?.id === "importedPackages"
                ]
                val targetBundleNode = connection.targetBundleContext.node
                
                val edge = createEdge(sourceBundleNode, targetBundleNode, connection.usedPackages, connection.product)
                    => [
                    addInternalUsedPackagesBundleEdgeRendering(connection.usedPackages, connection.product, usedContext)
                    sourcePort = sourceBundlePort
                    source = sourceBundleNode
                    target = targetBundleNode
//                    data += createKIdentifier => [ 
//                        it.id = "usedPackageBy:" + connection.product.uniqueId  + "," + 
//                            connection.sourceBundleContext.bundle.uniqueId + "," + 
//                            connection.targetBundleContext.bundle.uniqueId
//                    ]
                ]
                sourceBundleNode.outgoingEdges += edge
            ]
            
            // Add all other used package edges.
            bundleOverviewContext.usedPackageEdges.forEach [
                if (!nodeExists(key) || !nodeExists(value)) {
                    // Only Add edges if the nodes are actually shown.
                    return
                }
                val bundleNode = key.node
                val bundlePort = bundleNode.ports.findFirst [
                    data.filter(KIdentifier).head?.id === "importedPackages"
                ]
                val packageNode = value.node
                
                val edge = createEdge(bundleNode, packageNode) => [
                    addUsedPackagesEdgeRendering
                    sourcePort = bundlePort
                    source = bundleNode
                    target = packageNode
                ]
                bundleNode.outgoingEdges += edge
            ]
        ]
    }
    
}
