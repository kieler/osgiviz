/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2020 by
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
    	OsgiVizFileHandler.writeCurrentModelToFile(context.viewContext, false)
        return ActionResult.createResult(false)
    }
}
