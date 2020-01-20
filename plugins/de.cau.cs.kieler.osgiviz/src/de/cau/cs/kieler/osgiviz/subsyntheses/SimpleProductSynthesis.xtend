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
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiOptions.SimpleTextType
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.ProductContext
import org.eclipse.elk.core.options.CoreOptions

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a product that provides functionality to be expanded, when the specific 
 * synthesis for products is called.
 * 
 * @author nre
 */
class SimpleProductSynthesis extends AbstractSubSynthesis<ProductContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ProductContext pc) {
        transform(pc, 0)
    }
    
    def transform(ProductContext pc, int priority) {
        val product = pc.modelElement
        return #[
            product.createNode() => [
                associateWith(pc)
                data += createKIdentifier => [ it.id = pc.hashCode.toString ]
                val label = switch usedContext.getOptionValue(SIMPLE_TEXT) {
                    case SimpleTextType.Id: {
                        SynthesisUtils.getId(product.uniqueId, usedContext)
                    }
                    case SimpleTextType.Name: {
                        product.descriptiveName
                    }
                } ?: ""
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addProductInOverviewRendering(product, label, usedContext)
            ]
        ]
    }
    
}
