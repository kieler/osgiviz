package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import org.eclipse.emf.ecore.EObject

/**
 * An action that expands all element by making them detailed in an {@link IOverviewVisualizationContext}.
 * 
 * @author nre
 */
class ContextExpandAllAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = ContextExpandAllAction.name
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // This action will always be performed on an IOverviewVisualizationContext.
        if (!(modelVisualizationContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not inside an overview " +
                "visualization!")
        }
        val ovc = (modelVisualizationContext as IOverviewVisualizationContext<M>)
        
        val collapsedElements = ovc.collapsedElements.clone
        collapsedElements.forEach [
            ContextUtils.makeDetailed(ovc, it)
        ]
        return null
    }
    
}
