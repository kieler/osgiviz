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
import de.cau.cs.kieler.osgiviz.OsgiVizFileHandler

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
        
        OsgiVizFileHandler.writeCurrentModelToFile(context.viewContext, true)
        
        return ActionResult.createResult(true).doSynthesis.doZoomToFit
    }
    
}
