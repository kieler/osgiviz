/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2022 by
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

import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Defocuses the element this action is issued on by unsetting the 'focus' attribute on the root visualization.
 * 
 * @author nre
 */
class DefocusAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = DefocusAction.name
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        val rootVisualization = modelVisualizationContext.rootVisualization
        if (!(rootVisualization.focus === modelVisualizationContext)) {
            throw new IllegalStateException("Defocus called on an overview that was not focused!")
        }
        rootVisualization.focus = null
    }
    
    override protected ActionResult getActionResult(ActionContext context) {
        return super.getActionResult(context).doZoomToFit
    }
    
}
