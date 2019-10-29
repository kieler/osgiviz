package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiOptions.SimpleTextType
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.FeatureContext
import de.cau.cs.kieler.osgiviz.context.FeatureOverviewContext
import java.util.EnumSet
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*

/**
 * Transformation as an overview of all features in the given list of features.
 * 
 * @author nre
 */
class FeatureOverviewSynthesis extends AbstractSubSynthesis<FeatureOverviewContext, KNode> {
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension OsgiStyles
    @Inject SimpleFeatureSynthesis simpleFeatureSynthesis
    @Inject FeatureSynthesis featureSynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(FeatureOverviewContext featureOverviewContext) {
        return #[
            createNode => [
                associateWith(featureOverviewContext)
                data += createKIdentifier => [ it.id = featureOverviewContext.hashCode.toString ]
                if (featureOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                setLayoutOption(it, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                setLayoutOption(it, CoreOptions::DIRECTION, Direction.DOWN)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                addOverviewRendering("Features", featureOverviewContext.overviewText)
                
                // remove the padding of the invisible container.
                addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
                
                // Add all simple feature renderings in a first subgraph (top)
                val collapsedOverviewNode = transformCollapsedFeaturesOverview(featureOverviewContext)
                children += collapsedOverviewNode
                
                // Add all detailed feature renderings and their connections in a second subgraph (bottom)
                val detailedOverviewNode = transformDetailedFeaturesOverview(featureOverviewContext)
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
     * The top part of the feature overview rendering containing all collapsed feature renderings in a box layout.
     * 
     * @param featureOverviewContext The overview context for all features in this subsynthesis.
     */
    private def KNode transformCollapsedFeaturesOverview(FeatureOverviewContext featureOverviewContext) {
        val filteredCollapsedFeatureContexts = SynthesisUtils.filteredElementContexts(
            featureOverviewContext.collapsedElements, usedContext)
        createNode => [
            associateWith(featureOverviewContext)
            configureBoxLayout
            addInvisibleContainerRendering
            tooltip = featureOverviewContext.overviewText
            
            filteredCollapsedFeatureContexts.sortBy [
                // The string to sort by. Either the shortened ID or the name.
                switch usedContext.getOptionValue(SIMPLE_TEXT) {
                    case SimpleTextType.Id: {
                        SynthesisUtils.getId(modelElement.uniqueId, usedContext)
                    }
                    case SimpleTextType.Name: {
                        modelElement.descriptiveName
                    }
                } ?: ""
            ].forEach [ collapsedFeatureContext, index |
                children += simpleFeatureSynthesis.transform(collapsedFeatureContext as FeatureContext, -index)
            ]
        ]
    }
    
    /**
     * The bottom part of the feature overview rendering containing all detailed feature renderings and their
     * connections in a layered layout.
     * 
     * @param featureOverviewContext The overview context for all features in this subsynthesis.
     */
    private def KNode transformDetailedFeaturesOverview(FeatureOverviewContext featureOverviewContext) {
        val filteredDetailedFeatureContexts = SynthesisUtils.filteredElementContexts(
            featureOverviewContext.detailedElements, usedContext)
        createNode => [
            associateWith(featureOverviewContext)
            configureOverviewLayout
            addInvisibleContainerRendering
            tooltip = featureOverviewContext.overviewText
            
            children += filteredDetailedFeatureContexts.flatMap [
                return featureSynthesis.transform(it as FeatureContext)
            ]
        ]
    }
    
}
