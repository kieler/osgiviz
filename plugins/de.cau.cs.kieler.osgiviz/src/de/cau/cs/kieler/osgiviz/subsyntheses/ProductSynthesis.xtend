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
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.ProductContext
import de.cau.cs.kieler.osgiviz.context.ProductOverviewContext
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.Product
import java.util.EnumSet
import org.eclipse.elk.core.options.BoxLayouterOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.util.BoxLayoutProvider.PackingMode

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Sub-synthesis of {@link OsgiProject}s that handles expanded {@link Product} views.
 * 
 * @author nre
 */
class ProductSynthesis extends AbstractSubSynthesis<ProductContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    @Inject FeatureOverviewSynthesis featureOverviewSynthesis
    @Inject BundleOverviewSynthesis bundleOverviewSynthesis
    @Inject ServiceOverviewSynthesis serviceOverviewSynthesis
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ProductContext pc) {
        transform(pc, 0)
    }
    
    def transform(ProductContext pc, int priority) {
        val product = pc.modelElement
        return #[
            pc.createNode() => [
                associateWith(pc)
                data += createKIdentifier => [ it.id = pc.hashCode.toString ]
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                SynthesisUtils.configureBoxLayout(it)
                setLayoutOption(BoxLayouterOptions.BOX_PACKING_MODE, PackingMode.GROUP_MIXED)
                
                // Show a feature overview of all features within this product.
                val overviewFeatureNodes = featureOverviewSynthesis.transform(pc.featureOverviewContext)
                children += overviewFeatureNodes
                
                // Show a bundle overview of all bundles within this product.
                val overviewBundleNodes = bundleOverviewSynthesis.transform(pc.bundleOverviewContext)
                children += overviewBundleNodes
                
                // Show a service overview of all service elements defined by bundles of this product.
                val overviewServiceComponentNodes = serviceOverviewSynthesis.transform(
                    pc.serviceOverviewContext)
                children += overviewServiceComponentNodes
                
                setLayoutOption(CoreOptions::PRIORITY, priority)
                // Add the rendering.
                val hasChildren = !children.empty
                addProductRendering(product,
                    pc.parentVisualizationContext instanceof ProductOverviewContext, hasChildren, usedContext)
            ]
        ]
    }
    
}
