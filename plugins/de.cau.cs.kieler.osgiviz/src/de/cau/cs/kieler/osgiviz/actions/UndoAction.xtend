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

/**
 * Undoes the last action performed on the view model.
 * 
 * @author nre
 */
class UndoAction implements IAction {
    /**
     * This action's ID.
     */
    public static val String ID = UndoAction.name
    
    override execute(ActionContext context) {
        // Just decrement the current index pointing towards the current visualization by one.
        var index = context.viewContext.getProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX).intValue
        index = Math.max(index - 1, 0)
        context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, Integer.valueOf(index))
        
        return ActionResult.createResult(true).doSynthesis
    }
    
}
