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

import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext

/**
 * An action that collapses or expands an overview by setting its {@link IOverviewVisualizationContext} that way.
 * 
 * @author nre
 */
class OverviewContextCollapseExpandAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = OverviewContextCollapseExpandAction.name 
    
    override <M> changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        if (!(modelVisualizationContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalArgumentException("This action can only be called on a IOverviewVisualizationContext. "
                + "Was called on " + modelVisualizationContext.class)
        }
        // Just invert the expanded state.
        val c = modelVisualizationContext as IOverviewVisualizationContext<M>
        c.expanded = !c.expanded
        
        // Also, toggle the expansion state in the viewer.
        actionContext.getActiveViewer().toggleExpansion(actionContext.getKNode());
    }
    
}
