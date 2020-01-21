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

import java.util.List

/**
 * Interface for a visualization context for overviews that simply shows a list of elements in collapsed or detailed
 * fashion individually.
 * 
 * @param <M> The model element class of the child contexts of this context.
 * 
 * @author nre
 */
abstract class IOverviewVisualizationContext<M> implements IVisualizationContext<List<M>> {
    
    /**
     * The visualization contexts of the detailed elements.
     */
    def List<? extends IVisualizationContext<M>> getDetailedElements()
    
    /**
     * The visualization contexts of the collapsed elements.
     */
    def List<? extends IVisualizationContext<M>> getCollapsedElements()
    
    /**
     * Makes the {@code collapsedContext} that is a collapsed visualization context within this overview context
     * so it is detailed and handles the initialization of the child visualization contexts of that now detailed
     * context.
     * 
     * @param overviewContext The parent overview context that contains the collapsed context in its collapsedElements
     * field.
     * @param collapsedContext The context that is now a collapsed element in the parent overview and should be put in
     * the detailed elements as well as be initialized for its child contexts.
     */
    def void makeDetailed(IVisualizationContext<? extends M> collapsedContext) {
        // Only execute this if the element is not already detailed.
        if (detailedElements.contains(collapsedContext)) {
            return
        }
        
        // This element was previously collapsed, so put it in the detailed list now and initialize its child
        // visualization contexts.
        collapsedElements.remove(collapsedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (detailedElements as List<IVisualizationContext<M>>).add(collapsedContext as IVisualizationContext<M>)
        collapsedContext.initializeChildVisualizationContexts
    }
    
    /**
     * Collapses the {@code expandedContext} that is an expanded visualization context within this overview context
     * so it is collapsed after this method.
     * Also removes any edges connected to the now collapsed element.
     * 
     * @param overviewContext The parent overview context that contains the expanded context in its detailedElements
     * field.
     * @param detailedContext The context that is now a detailed element in the parent overview and should be put in
     * the collapsed elements.
     */
    def void collapse(IVisualizationContext<? extends M> detailedContext) {
        // Only execute this if the element is not already collapsed
        if (collapsedElements.contains(detailedContext)) {
            return
        }
        
        // This element was previously detailed, so put it in the collapsed list now.
        detailedElements.remove(detailedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (collapsedElements as List<IVisualizationContext<M>>).add(detailedContext as IVisualizationContext<M>)
    }
    
    /**
     * Indicates whether the overview should be shown plain or expanded with its contents shown.
     */
    def boolean isExpanded()
    
    /**
     * Sets a new value for the expanded state of this overview.
     */
    def void setExpanded(boolean newExpanded)
    
    override List<? extends IVisualizationContext<?>> getChildContexts()
    
    /**
     * A descriptive text about what is contained in this overview visualization.
     */
    def String overviewText()
    
}
