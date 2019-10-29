package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import org.eclipse.emf.ecore.EObject

/**
 * Focuses the element this action is issued on and replaces the view model with the focused element.
 * 
 * @author nre
 */
class FocusAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = FocusAction.name
    
    override <M extends EObject> changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // Changing the focus element is exactly what returning a non-null visualization context to the
        // AbstractVisualizationContextChangingAction does, so just return the given context.
        return modelVisualizationContext
    }
    
    override protected ActionResult getActionResult(ActionContext context) {
        return super.getActionResult(context).doZoomToFit
    }
    
}
