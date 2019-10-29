package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.context.BundleCategoryContext
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a bundle category that provides functionality to be expanded, when the
 * specific synthesis for bundle categories is called.
 * 
 * @author nre
 */
class SimpleBundleCategorySynthesis extends AbstractSubSynthesis<BundleCategoryContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(BundleCategoryContext bcc) {
        transform(bcc, 0)
    }
    
    def transform(BundleCategoryContext bcc, int priority) {
        val bundleCategory = bcc.modelElement
        return #[
            bcc.createNode() => [
                associateWith(bcc)
                data += createKIdentifier => [ it.id = bcc.hashCode.toString ]
                val label = bundleCategory.categoryName
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addGenericRendering(label) // TODO: add a bundle category specific rendering.
            ]
        ]
    }
    
}
