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
