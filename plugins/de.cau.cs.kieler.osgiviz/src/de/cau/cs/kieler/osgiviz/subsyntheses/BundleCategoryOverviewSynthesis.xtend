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
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*
import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Transformation as an overview of all bundle categories in the given list of bundle categories.
 * 
 * @author nre
 */
class BundleCategoryOverviewSynthesis extends AbstractSubSynthesis<BundleCategoryOverviewContext, KNode> {
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension OsgiStyles
    @Inject SimpleBundleCategorySynthesis simpleBundleCategorySynthesis
    @Inject BundleCategorySynthesis bundleCategorySynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(BundleCategoryOverviewContext bundleCategoryOverviewContext) {
        return #[
            createNode => [
                associateWith(bundleCategoryOverviewContext)
                data += createKIdentifier => [ it.id = bundleCategoryOverviewContext.hashCode.toString ]
                if (bundleCategoryOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                setLayoutOption(it, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                setLayoutOption(it, CoreOptions::DIRECTION, Direction.DOWN)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                addOverviewRendering("Bundle Categories", bundleCategoryOverviewContext.overviewText, usedContext)
                
                // remove the padding of the invisible container.
                addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
                
                // Add all simple bundle category renderings in a first subgraph (top)
                val collapsedOverviewNode = transformCollapsedBundleCategoriesOverview(bundleCategoryOverviewContext)
                children += collapsedOverviewNode
                
                // Add all detailed bundle category renderings and their connections in a second subgraph (bottom)
                val detailedOverviewNode = transformDetailedBundleCategoriesOverview(bundleCategoryOverviewContext)
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
     * The top part of the bundle category overview rendering containing all collapsed bundle category renderings in a
     * box layout.
     * 
     * @param bundleCategoryOverviewContext The overview context for all bundle categories in this subsynthesis.
     */
    private def KNode transformCollapsedBundleCategoriesOverview(
        BundleCategoryOverviewContext bundleCategoryOverviewContext) {
        val filteredCollapsedBundleCategoryContexts = SynthesisUtils.filteredElementContexts(
            bundleCategoryOverviewContext.collapsedElements as List<BundleCategoryContext>, usedContext)
        createNode => [
            associateWith(bundleCategoryOverviewContext)
            configureBoxLayout
            addInvisibleContainerRendering
            tooltip = bundleCategoryOverviewContext.overviewText
            
            filteredCollapsedBundleCategoryContexts.sortBy [
                modelElement.categoryName
            ].forEach [ collapsedBundleCategoryContext, index |
                children += simpleBundleCategorySynthesis.transform(
                    collapsedBundleCategoryContext as BundleCategoryContext, -index)
            ]
        ]
    }
    
    /**
     * The bottom part of the bundle category overview rendering containing all detailed bundle category renderings and
     * their connections in a layered layout.
     * 
     * @param bundleCategoryOverviewContext The overview context for all bundle categories in this subsynthesis.
     */
    private def KNode transformDetailedBundleCategoriesOverview(
        BundleCategoryOverviewContext bundleCategoryOverviewContext) {
        val filteredDetailedBundleCategoryContexts = SynthesisUtils.filteredElementContexts(
            bundleCategoryOverviewContext.detailedElements, usedContext)
        createNode => [
            associateWith(bundleCategoryOverviewContext)
            configureOverviewLayout
            addInvisibleContainerRendering
            tooltip = bundleCategoryOverviewContext.overviewText
            
            children += filteredDetailedBundleCategoryContexts.flatMap [
                return bundleCategorySynthesis.transform(it as BundleCategoryContext)
            ]
        ]
    }
    
}
