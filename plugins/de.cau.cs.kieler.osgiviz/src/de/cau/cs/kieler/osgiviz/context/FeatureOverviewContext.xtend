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
import de.scheidtbachmann.osgimodel.Feature
import java.util.LinkedList
import java.util.List
import java.util.Map

/**
 * Context for the OSGi synthesis that contains information about {@link Feature} overviews.
 * 
 * @author nre
 */
class FeatureOverviewContext extends IOverviewVisualizationContext<Feature> {
    
    /**
     * The feature contexts for all features in their collapsed form.
     */
    List<FeatureContext> collapsedFeatureContexts
    
    /**
     * The feature contexts for all features in their detailed form.
     */
    List<FeatureContext> detailedFeatureContexts
    
    /**
     * The features displayed in this context.
     */
    List<Feature> features
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    private new() {}
    
    new(List<Feature> features, IVisualizationContext<?> parent) {
        this.parent = parent
        this.features = features
        collapsedFeatureContexts = new LinkedList
        detailedFeatureContexts = new LinkedList
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return ImmutableList.copyOf(detailedFeatureContexts + collapsedFeatureContexts)
    }
    
    override getModelElement() {
        return features
    }
    
    override getDetailedElements() {
        return detailedFeatureContexts
    }
    
    override getCollapsedElements() {
        return collapsedFeatureContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        features.forEach [
            collapsedFeatureContexts += new FeatureContext(it, this)
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
            return alreadyCloned as FeatureOverviewContext
        }
        
        val copy = new FeatureOverviewContext
        copy.collapsedFeatureContexts = new LinkedList
        collapsedFeatureContexts.forEach [
            val newFeatureContext = deepCopy(seenContexts) as FeatureContext
            newFeatureContext.parentVisualizationContext = copy
            copy.collapsedFeatureContexts.add(newFeatureContext)
        ]
        copy.detailedFeatureContexts = new LinkedList
        detailedFeatureContexts.forEach [
            val newFeatureContext = deepCopy(seenContexts) as FeatureContext
            newFeatureContext.parentVisualizationContext = copy
            copy.detailedFeatureContexts.add(newFeatureContext)
        ]
        
        copy.features = features.clone
        
        copy.expanded = isExpanded
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        val parentContext = this.parentVisualizationContext
        switch (parentContext) {
            OsgiProjectContext: {
                "All features contained in this project."
            }
            ProductContext: {
                "All features contained in the product " + parentContext.modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this feature overview available yet."
            }
        }
    }
    
}
