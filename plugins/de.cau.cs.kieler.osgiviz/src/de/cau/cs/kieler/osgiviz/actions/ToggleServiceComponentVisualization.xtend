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
