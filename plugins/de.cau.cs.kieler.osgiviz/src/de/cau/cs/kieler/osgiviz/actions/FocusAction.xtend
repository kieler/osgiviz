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
    
    override <M> changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // Changing the focus element is exactly what returning a non-null visualization context to the
        // AbstractVisualizationContextChangingAction does, so just return the given context.
        return modelVisualizationContext
    }
    
    override protected ActionResult getActionResult(ActionContext context) {
        return super.getActionResult(context).doZoomToFit
    }
    
}
