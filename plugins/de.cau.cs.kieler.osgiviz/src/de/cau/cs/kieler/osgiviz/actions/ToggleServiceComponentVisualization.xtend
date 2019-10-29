package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties.ServiceComponentVisualizationMode

/**
 * An action that toggles the visualization of service components to be on their own or in their bundle context.
 * 
 * @author nre
 */
class ToggleServiceComponentVisualization implements IAction {
    /**
     * This action's ID.
     */
    public static val String ID = ToggleServiceComponentVisualization.name
    
    override execute(ActionContext context) {
        var visualizationMode = context.viewContext.getProperty(
            OsgiSynthesisProperties.CURRENT_SERVICE_COMPONENT_VISUALIZATION_MODE)
        switch (visualizationMode) {
            case PLAIN: {
                visualizationMode = ServiceComponentVisualizationMode.IN_BUNDLES
            }
            case IN_BUNDLES: {
                visualizationMode = ServiceComponentVisualizationMode.PLAIN
            }
        }
        context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_SERVICE_COMPONENT_VISUALIZATION_MODE,
            visualizationMode)
        
        return ActionResult.createResult(true).doSynthesis
    }
    
}
