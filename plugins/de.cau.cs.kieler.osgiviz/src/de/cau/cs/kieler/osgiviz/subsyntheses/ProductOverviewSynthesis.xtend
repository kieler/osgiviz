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
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext
import de.scheidtbachmann.osgimodel.Product
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.core.options.BoxLayouterOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.util.BoxLayoutProvider.PackingMode

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*
import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Transformation as an overview of all products in the given list of products.
 * 
 * @author nre
 */
class ProductOverviewSynthesis extends AbstractSubSynthesis<ProductOverviewContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    @Inject SimpleProductSynthesis simpleProductSynthesis
    @Inject ProductSynthesis productSynthesis
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ProductOverviewContext productOverviewContext) {
        return #[
            createNode => [
                associateWith(productOverviewContext)
                data += createKIdentifier => [ it.id = productOverviewContext.hashCode.toString ]
                if (productOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                configureBoxLayout
                setLayoutOption(BoxLayouterOptions.BOX_PACKING_MODE, PackingMode.GROUP_MIXED)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                addOverviewRendering("Products", productOverviewContext.overviewText, false, usedContext)
                
                val filteredCollapsedProducts = SynthesisUtils.filteredElementContexts(
                    productOverviewContext.collapsedElements as List<ProductContext>, usedContext)
                val indexOffset = filteredCollapsedProducts.size
                filteredCollapsedProducts.sortBy [ sortBy ].forEach [ collapsedProductContext, index |
                    children += simpleProductSynthesis.transform(collapsedProductContext as ProductContext, -index)
                ]
                
                val filteredDetailedProducts = SynthesisUtils.filteredElementContexts(
                    productOverviewContext.detailedElements as List<ProductContext>, usedContext)
                filteredDetailedProducts.sortBy [ sortBy ].forEach [ detailedProductContext, index |
                    children += productSynthesis.transform(detailedProductContext as ProductContext, -index
                        - indexOffset)
                ]
            ]
        ]
    }
    
    /**
     * The string to sort by. Either the shortened ID or the name.
     */
    def sortBy(IVisualizationContext<Product> it) {
        switch usedContext.getOptionValue(SIMPLE_TEXT) {
            case SimpleTextType.Id: {
                SynthesisUtils.getId(modelElement.uniqueId, usedContext)
            }
            case SimpleTextType.Name: {
                modelElement.descriptiveName
            }
        } ?: ""
    }
    
}
