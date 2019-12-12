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

import de.scheidtbachmann.osgimodel.BundleCategory
import java.util.Map

/**
 * Context for the OSGi synthesis that contains information about {@link BundleCategory}s.
 * 
 * @author nre
 */
class BundleCategoryContext implements IVisualizationContext<BundleCategory> {
    
    /**
     * The bundle category to get the data from when visualizing this context.
     */
    BundleCategory bundleCategory
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<BundleCategory> parent
    
    private new() {}
    
    new(BundleCategory bundleCategory, IOverviewVisualizationContext<BundleCategory> parent) {
        this.parent = parent
        this.bundleCategory = bundleCategory
    }
    
    override getChildContexts() {
        return #[]
    }
    
    override getModelElement() {
       return bundleCategory
    }
    
    override IOverviewVisualizationContext<BundleCategory> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<BundleCategory>
    }
    
    override initializeChildVisualizationContexts() {
        // Nothing to do yet.
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as BundleCategoryContext
        }
        
        val clone = new BundleCategoryContext
        clone.bundleCategory = bundleCategory
        clone.parent = null
        
        seenContexts.put(this, clone)
        return clone
    }
    
}
