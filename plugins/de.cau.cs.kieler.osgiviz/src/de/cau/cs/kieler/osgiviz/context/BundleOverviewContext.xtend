package de.cau.cs.kieler.osgiviz.context

import com.google.common.collect.ImmutableList
import de.scheidtbachmann.osgimodel.Bundle
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link Bundle} overviews.
 * 
 * @author nre
 */
class BundleOverviewContext implements IOverviewVisualizationContext<Bundle> {
    
    /**
     * All connections for the required bundles hierarchy that should be drawn.
     * The pairs should be viewed that the first bundle requires the second.
     */
    @Accessors
    List<Pair<BundleContext, BundleContext>> requiredBundleEdges
    
    /**
     * All connections for the required packages with resolved bundles that should be drawn.
     */
    @Accessors
    List<UsedPackagesOfBundleEdgeConnection> usedPackagesOfBundleEdges
    
    /**
     * All connections for the required packages without known source bundles that should be drawn.
     */
    @Accessors
    List<Pair<BundleContext, PackageObjectContext>> usedPackageEdges
    
    /**
     * The bundle contexts for all bundles in their collapsed form.
     */
    List<BundleContext> collapsedBundleContexts
    
    /**
     * The bundle contexts for all bundles in their detailed form.
     */
    List<BundleContext> detailedBundleContexts
    
    /**
     * All used packages not contained within another internal bundle where the providing bundle is unknown.
     */
    @Accessors
    List<PackageObjectContext> usedPackageContexts
    
    /**
     * The bundles displayed in this context.
     */
    List<Bundle> bundles
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    private new() {}
    
    new(List<Bundle> bundles, IVisualizationContext<?> parent) {
        this.parent = parent
        this.bundles = bundles
        requiredBundleEdges = new LinkedList
        usedPackagesOfBundleEdges = new LinkedList
        usedPackageEdges = new LinkedList
        collapsedBundleContexts = new LinkedList
        detailedBundleContexts = new LinkedList
        usedPackageContexts = new LinkedList
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return ImmutableList.copyOf(detailedBundleContexts + collapsedBundleContexts + usedPackageContexts)
    }
    
    override getModelElement() {
        return bundles
    }
    
    override getDetailedElements() {
        return detailedBundleContexts
    }
    
    override getCollapsedElements() {
        return collapsedBundleContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        bundles.forEach [
            collapsedBundleContexts += new BundleContext(it, this)
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
            return alreadyCloned as BundleOverviewContext
        }
        
        val copy = new BundleOverviewContext
        copy.collapsedBundleContexts = new LinkedList
        collapsedBundleContexts.forEach [
            val newBundleContext = deepCopy(seenContexts) as BundleContext
            newBundleContext.parentVisualizationContext = copy
            copy.collapsedBundleContexts.add(newBundleContext)
        ]
        copy.detailedBundleContexts = new LinkedList
        detailedBundleContexts.forEach [
            val newBundleContext = deepCopy(seenContexts) as BundleContext
            newBundleContext.parentVisualizationContext = copy
            copy.detailedBundleContexts.add(newBundleContext)
        ]
        
        copy.usedPackageContexts = new LinkedList
        usedPackageContexts.forEach [
            val newUsedPackageContext = deepCopy(seenContexts) as PackageObjectContext
            newUsedPackageContext.parentVisualizationContext = copy
            copy.usedPackageContexts.add(newUsedPackageContext)
        ]
        
        copy.requiredBundleEdges = new LinkedList<Pair<BundleContext, BundleContext>>
        requiredBundleEdges.forEach[
            copy.requiredBundleEdges.add(key.deepCopy(seenContexts) as BundleContext
                -> value.deepCopy(seenContexts)as BundleContext)
        ]
        
        copy.usedPackagesOfBundleEdges = new LinkedList
        usedPackagesOfBundleEdges.forEach [
            copy.usedPackagesOfBundleEdges.add(new UsedPackagesOfBundleEdgeConnection(sourceBundleContext.deepCopy(seenContexts)
                as BundleContext, usedPackages, product, targetBundleContext.deepCopy(seenContexts) as BundleContext))
        ]
        
        copy.usedPackageEdges = new LinkedList
        usedPackageEdges.forEach [
            copy.usedPackageEdges.add(key.deepCopy(seenContexts) as BundleContext
                -> value.deepCopy(seenContexts) as PackageObjectContext)
        ]
        
        copy.bundles = bundles.clone
        
        copy.expanded = isExpanded
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        val parentContext = this.parentVisualizationContext
        switch (parentContext) {
            OsgiProjectContext: {
                "All bundles contained in or referenced in this project."
            }
            FeatureContext: {
                "All bundles contained in the feature " + parentContext.modelElement.uniqueId + "."
            }
            ProductContext: {
                "All bundles contained in the product " + parentContext.modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this bundle overview available yet."
            }
        }
    }
    
}
