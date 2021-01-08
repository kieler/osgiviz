/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.osgiviz.OsgiVizFileHandler
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext

/**
 * Persists the currently viewed {@link IVisualizationContext} and the model it belongs to to disk.
 * Uses the path relative to the execution of this model
 * "models/[projectName]-visualization-[yyyyMMddHHmmss].osgiviz".
 * The .osgiviz file can then be opened and viewed and will generate the exact view on the underlying .model file as
 * visualized when saved.
 * Note that the .model file needs to be located next to the .osgiviz file when opening.
 * 
 * @author nre, ldi
 */
class StoreModelAction implements IAction {
	
	
    /**
     * This action's ID.
     */
    public static val String ID = StoreModelAction.name
    
    override execute(ActionContext context) {
    	OsgiVizFileHandler.writeCurrentModelToFile(context, false)
        return ActionResult.createResult(false)
    }
}