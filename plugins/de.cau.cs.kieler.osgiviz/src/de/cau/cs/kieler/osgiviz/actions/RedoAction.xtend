/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties

/**
 * Redoes the last action that was undone on the view model.
 * 
 * @author nre
 */
class RedoAction implements IAction {
    /**
     * This action's ID.
     */
    public static val String ID = RedoAction.name
    
    override execute(ActionContext context) {
        // Just increment the current index pointing towards the current visualization by one.
        var index = context.viewContext.getProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX).intValue
        val visualizationContexts = context.viewContext.getProperty(OsgiSynthesisProperties.VISUALIZATION_CONTEXTS)
        index = Math.min(index + 1, visualizationContexts.size - 1)
        context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, Integer.valueOf(index))
        
        return ActionResult.createResult(true).doSynthesis
    }
    
}
