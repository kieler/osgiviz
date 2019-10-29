package de.cau.cs.kieler.osgiviz.context

import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * Interface for a visualization context for overviews that simply shows a list of elements in collapsed or detailed
 * fashion individually.
 * 
 * @param <M> The model element class of the child contexts of this context.
 * 
 * @author nre
 */
interface IOverviewVisualizationContext<M extends EObject> extends IVisualizationContext<List<M>> {
    
    /**
     * The visualization contexts of the detailed elements.
     */
    def List<? extends IVisualizationContext<M>> getDetailedElements()
    
    /**
     * The visualization contexts of the collapsed elements.
     */
    def List<? extends IVisualizationContext<M>> getCollapsedElements()
    
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
