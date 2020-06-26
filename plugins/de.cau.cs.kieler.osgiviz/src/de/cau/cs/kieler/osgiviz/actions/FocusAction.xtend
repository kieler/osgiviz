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

import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Focuses the element this action is issued on by setting the 'focus' attribute on the root visualization.
 * 
 * @author nre
 */
class FocusAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = FocusAction.name
    
    override <M> changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        val rootVisualization = modelVisualizationContext.rootVisualization
        rootVisualization.focus = modelVisualizationContext
    }
    
    override protected ActionResult getActionResult(ActionContext context) {
        return super.getActionResult(context).doZoomToFit
    }
    
}
