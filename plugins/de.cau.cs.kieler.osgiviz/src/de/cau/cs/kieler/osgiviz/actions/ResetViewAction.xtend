package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties

/**
 * Resets the view to its default overview state.
 * 
 * @author nre
 */
class ResetViewAction implements IAction {
    /**
     * This action's ID.
     */
    public static val String ID = ResetViewAction.name
    
    override execute(ActionContext context) {
        // Just set the current index pointing towards the current visualization to 0.
        context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, Integer.valueOf(0))
        
        return ActionResult.createResult(true).doSynthesis.doZoomToFit
    }
    
}
