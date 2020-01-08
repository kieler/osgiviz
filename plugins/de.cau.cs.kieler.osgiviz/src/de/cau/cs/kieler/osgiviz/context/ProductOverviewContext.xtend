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

import com.google.common.collect.ImmutableList
import de.scheidtbachmann.osgimodel.Product
import java.util.LinkedList
import java.util.List
import java.util.Map

/**
 * Context for the OSGi synthesis that contains information about {@link Product} overviews.
 * 
 * @author nre
 */
class ProductOverviewContext extends IOverviewVisualizationContext<Product> {
    
    /**
     * All products that should be drawn in their detailed form.
     */
    List<ProductContext> detailedProductContexts
    
    /**
     * All products that should be drawn in their collapsed, non-detailed form.
     */
    List<ProductContext> collapsedProductContexts
    
    /**
     * The products shown in this overview.
     */
    List<Product> products
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    private new() {}
    
    new(List<Product> products, IVisualizationContext<?> parent) {
        this.parent = parent
        this.products = products
        detailedProductContexts = new LinkedList
        collapsedProductContexts = new LinkedList
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return ImmutableList.copyOf(detailedProductContexts + collapsedProductContexts)
    }
    
    override getModelElement() {
        return products
    }
    
    override getDetailedElements() {
        return detailedProductContexts
    }
    
    override getCollapsedElements() {
        return collapsedProductContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        products.forEach[
            collapsedProductContexts += new ProductContext(it, this)
        ]
    }
    
    override isExpanded() {
        return expanded
    }
    
    override setExpanded(boolean newExpanded) {
        this.expanded = newExpanded
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as ProductOverviewContext
        }
        
        val copy = new ProductOverviewContext
        copy.detailedProductContexts = new LinkedList
        detailedProductContexts.forEach[
            val newProductContext = deepCopy(seenContexts) as ProductContext
            newProductContext.parentVisualizationContext = copy
            copy.detailedProductContexts.add(newProductContext)
        ]
        copy.collapsedProductContexts = new LinkedList
        collapsedProductContexts.forEach [
            val newProductContext = deepCopy(seenContexts) as ProductContext
            newProductContext.parentVisualizationContext = copy
            copy.collapsedProductContexts.add(newProductContext)
        ]
        copy.products = products.clone
        
        copy.expanded = isExpanded
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        val parentContext = this.parentVisualizationContext
        switch (parentContext) {
            OsgiProjectContext: {
                "All products contained in this project."
            }
            default: {
                "No descriptive text for this product overview available yet."
            }
        }
    }
    
}
