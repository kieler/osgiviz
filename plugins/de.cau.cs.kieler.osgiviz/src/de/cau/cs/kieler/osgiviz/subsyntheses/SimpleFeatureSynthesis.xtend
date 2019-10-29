package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiOptions.SimpleTextType
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.FeatureContext
import org.eclipse.elk.core.options.CoreOptions

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a feature that provides functionality to be expanded, when the specific 
 * synthesis for features is called.
 * 
 * @author nre
 */
class SimpleFeatureSynthesis extends AbstractSubSynthesis<FeatureContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(FeatureContext fc) {
        transform(fc, 0)
    }
    
    def transform(FeatureContext fc, int priority) {
        val feature = fc.modelElement
        return #[
            fc.createNode() => [
                associateWith(fc)
                data += createKIdentifier => [ it.id = fc.hashCode.toString ]
                val label = switch usedContext.getOptionValue(SIMPLE_TEXT) {
                    case SimpleTextType.Id: {
                        SynthesisUtils.getId(feature.uniqueId, usedContext)
                    }
                    case SimpleTextType.Name: {
                        feature.descriptiveName
                    }
                } ?: ""
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addFeatureInOverviewRendering(feature, label)
            ]
        ]
    }
    
}
