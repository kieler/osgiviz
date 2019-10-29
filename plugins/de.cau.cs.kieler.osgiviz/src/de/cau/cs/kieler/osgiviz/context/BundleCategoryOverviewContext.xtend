package de.cau.cs.kieler.osgiviz.context

import com.google.common.collect.ImmutableList
import de.scheidtbachmann.osgimodel.BundleCategory
import java.util.LinkedList
import java.util.List
import java.util.Map

/**
 * Context for the OSGi synthesis that contains information about {@link BundleCategory} overviews.
 * 
 * @author nre
 */
class BundleCategoryOverviewContext implements IOverviewVisualizationContext<BundleCategory> {
    
    /**
     * The bundle category contexts for all bundle categories in their collapsed form.
     */
    List<BundleCategoryContext> collapsedBundleCategoryContexts
    
    /**
     * The bundle category contexts for all bundle categories in their detailed form.
     */
    List<BundleCategoryContext> detailedBundleCategoryContexts
    
    /**
     * The bundle categories displayed in this context.
     */
    List<BundleCategory> bundleCategories
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    private new() {}
    
    new(List<BundleCategory> bundleCategories, IVisualizationContext<?> parent) {
        this.parent = parent
        this.bundleCategories = bundleCategories
        collapsedBundleCategoryContexts = new LinkedList
        detailedBundleCategoryContexts = new LinkedList
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return ImmutableList.copyOf(detailedBundleCategoryContexts + collapsedBundleCategoryContexts)
    }
    
    override getModelElement() {
        return bundleCategories
    }
    
    override getDetailedElements() {
        return detailedBundleCategoryContexts
    }
    
    override getCollapsedElements() {
        return collapsedBundleCategoryContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        bundleCategories.forEach [
            collapsedBundleCategoryContexts += new BundleCategoryContext(it, this)
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
            return alreadyCloned as BundleCategoryOverviewContext
        }
        
        val copy = new BundleCategoryOverviewContext
        copy.collapsedBundleCategoryContexts = new LinkedList
        collapsedBundleCategoryContexts.forEach [
            val newBundleCategoryContext = deepCopy(seenContexts) as BundleCategoryContext
            newBundleCategoryContext.parentVisualizationContext = copy
            copy.collapsedBundleCategoryContexts.add(newBundleCategoryContext)
        ]
        copy.detailedBundleCategoryContexts = new LinkedList
        detailedBundleCategoryContexts.forEach [
            val newBundleCategoryContext = deepCopy(seenContexts) as BundleCategoryContext
            newBundleCategoryContext.parentVisualizationContext = copy
            copy.detailedBundleCategoryContexts.add(newBundleCategoryContext)
        ]
        
        copy.bundleCategories = bundleCategories.clone
        
        copy.expanded = isExpanded
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        switch (this.parentVisualizationContext) {
            OsgiProjectContext: {
                "All bundle categories in this project."
            }
            default: {
                "No descriptive text for this bundle category overview available yet."
            }
        }
    }
    
}
