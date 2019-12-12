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

import de.scheidtbachmann.osgimodel.Feature
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link Feature}s.
 * 
 * @author nre
 */
class FeatureContext implements IVisualizationContext<Feature> {
    
    /**
     * The feature to get the data from when visualizing this context.
     */
    Feature feature
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<Feature> parent
    
    /**
     * The context for the bundle overview shown in detailed features.
     */
    @Accessors
    BundleOverviewContext bundleOverviewContext
    
    private new() {}
    
    new(Feature feature, IOverviewVisualizationContext<Feature> parent) {
        this.parent = parent
        this.feature = feature
    }
    
    override getChildContexts() {
        return #[bundleOverviewContext]
    }
    
    override getModelElement() {
       return feature
    }
    
    override IOverviewVisualizationContext<Feature> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<Feature>
    }
    
    override initializeChildVisualizationContexts() {
        // The bundles in features should only be shown if there are any.
        if (!feature.bundles.empty) {
            bundleOverviewContext = new BundleOverviewContext(feature.bundles, this)
        }
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as FeatureContext
        }
        
        val clone = new FeatureContext
        if (bundleOverviewContext !== null) {
            clone.bundleOverviewContext = bundleOverviewContext.deepCopy(seenContexts) as BundleOverviewContext
            clone.bundleOverviewContext.parentVisualizationContext = clone
        }
        clone.feature = feature
        clone.parent = null
        
        seenContexts.put(this, clone)
        return clone
    }
    
}
