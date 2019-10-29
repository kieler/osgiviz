package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import org.eclipse.emf.ecore.EObject

/**
 * An action that collapses or expands an element by making it detailed in an {@link IOverviewVisualizationContext}.
 * 
 * @author nre
 */
class ContextCollapseExpandAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = ContextCollapseExpandAction.name
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // This action will always be performed on a child visualization context of a IOverviewVisualizationContext.
        val overviewVisContext = modelVisualizationContext.parentVisualizationContext
        if (!(overviewVisContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not inside an overview " +
                "visualization!")
        }
        val ovc = (overviewVisContext as IOverviewVisualizationContext<M>)
        
        if (ovc.collapsedElements.contains(modelVisualizationContext)) {
            ContextUtils.makeDetailed(ovc, modelVisualizationContext)
        } else if (ovc.detailedElements.contains(modelVisualizationContext)) {
            ContextUtils.collapse(ovc, modelVisualizationContext)
        } else { // This error should not be reachable.
            throw new IllegalStateException("Bug in code detected. This context has to be either contained within " +
                "the collapsed or the contained elements")
        }
        return null
    }
    
}
