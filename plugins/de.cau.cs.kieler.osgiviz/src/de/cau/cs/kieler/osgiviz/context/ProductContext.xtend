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
package de.cau.cs.kieler.osgiviz.context

import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.modelExtension.ModelUtils
import de.scheidtbachmann.osgimodel.Product
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link Product}s.
 * 
 * @author nre
 */
class ProductContext implements IVisualizationContext<Product> {
    
    /**
     * The product to get the data from when visualizing this context.
     */
    Product product
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<Product> parent
    
    /**
     * The context for the feature overview shown in detailed products.
     */
    @Accessors
    FeatureOverviewContext featureOverviewContext
    
    /**
     * The context for the bundle overview shown in detailed products.
     */
    @Accessors
    BundleOverviewContext bundleOverviewContext
    
    /**
     * The context for the service component overview shown in detailed products.
     */
    @Accessors
    ServiceOverviewContext serviceOverviewContext
    
    private new() {}
    
    new(Product product, IOverviewVisualizationContext<Product> parent) {
        this.parent = parent
        this.product = product
    }
    
    override getChildContexts() {
        return #[featureOverviewContext, bundleOverviewContext, serviceOverviewContext]
    }
    
    override getModelElement() {
       return product
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<Product>
    }
    
    override IOverviewVisualizationContext<Product> getParentVisualizationContext() {
        return parent
    }
    
    override initializeChildVisualizationContexts() {
        val allFeatures = product.features
        featureOverviewContext = new FeatureOverviewContext(allFeatures, this)
        // Any bundle could be referenced in more than one feature, so make sure they are included only once.
        val allBundles = product.features.flatMap [ bundles ].toSet.toList
        bundleOverviewContext = new BundleOverviewContext(allBundles, this)
        
        val allServiceComponents = allBundles.flatMap [ serviceComponents ].toList
        val allInjections = allBundles.flatMap [ eclipseInjections ].toList
        val allClasses = ModelUtils.injectionClasses(allInjections)
        val allServiceInterfaces = SynthesisUtils.referencedInterfaces(allServiceComponents, allInjections).toList
        
        serviceOverviewContext = new ServiceOverviewContext(allServiceComponents, allServiceInterfaces,
            allClasses, this, true)
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as ProductContext
        }
        
        val copy = new ProductContext
        if (featureOverviewContext !== null) {
            copy.featureOverviewContext = featureOverviewContext.deepCopy(seenContexts) as FeatureOverviewContext
            copy.featureOverviewContext.parentVisualizationContext = copy
        }
        if (bundleOverviewContext !== null) {
            copy.bundleOverviewContext = bundleOverviewContext.deepCopy(seenContexts) as BundleOverviewContext
            copy.bundleOverviewContext.parentVisualizationContext = copy
        }
        if (serviceOverviewContext !== null) {
            copy.serviceOverviewContext = serviceOverviewContext.deepCopy(seenContexts)
                as ServiceOverviewContext
            copy.serviceOverviewContext.parentVisualizationContext = copy
        }
        copy.product = product
        
        seenContexts.put(this, copy)
        return copy
    }
    
}
