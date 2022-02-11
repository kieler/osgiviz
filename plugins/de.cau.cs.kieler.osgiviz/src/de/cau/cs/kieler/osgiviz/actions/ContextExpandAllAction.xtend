/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019-2022 by
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

import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * An action that expands all element by making them detailed in an {@link IOverviewVisualizationContext}.
 * 
 * @author nre
 */
class ContextExpandAllAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = ContextExpandAllAction.name
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        // This action will always be performed on an IOverviewVisualizationContext.
        if (!(modelVisualizationContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not inside an overview " +
                "visualization!")
        }
        val ovc = (modelVisualizationContext as IOverviewVisualizationContext<?>)
        
        val collapsedElements = ovc.collapsedElements.clone
        collapsedElements.forEach [
            ovc.makeDetailed(it)
        ]
    }
    
}
