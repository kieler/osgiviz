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

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * An action that removes an element's context from an {@link IOverviewVisualizationContext}.
 * 
 * @author nre
 */
class ContextRemoveAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = ContextRemoveAction.name
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        // This action will always be performed on a child visualization context of a IOverviewVisualizationContext.
        val overviewVisContext = modelVisualizationContext.parent
        if (!(overviewVisContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not inside an overview " +
                "visualization!")
        }
        val ovc = overviewVisContext as IOverviewVisualizationContext<?>
        
        switch modelVisualizationContext {
            PackageObjectContext case ovc instanceof BundleOverviewContext: {
                (ovc as BundleOverviewContext).usedPackageContexts.remove(modelVisualizationContext)
            }
            default: {
                throw new IllegalArgumentException("ContextRemoveAction does not support removing "
                    + modelVisualizationContext.class + " from " + ovc.class + " yet.")
            }
        }
        ovc.removeEdges(modelVisualizationContext)
    }
    
}
