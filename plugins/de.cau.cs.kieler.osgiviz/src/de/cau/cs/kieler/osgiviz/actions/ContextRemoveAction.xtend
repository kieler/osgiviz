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

import de.cau.cs.kieler.osgiviz.context.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.PackageObjectContext
import org.eclipse.emf.ecore.EObject

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
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // This action will always be performed on a child visualization context of a IOverviewVisualizationContext.
        val overviewVisContext = modelVisualizationContext.parentVisualizationContext
        if (!(overviewVisContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not inside an overview " +
                "visualization!")
        }
        val ovc = overviewVisContext as IOverviewVisualizationContext<? extends EObject>
        
        switch modelVisualizationContext {
            PackageObjectContext case ovc instanceof BundleOverviewContext: {
                (ovc as BundleOverviewContext).usedPackageContexts.remove(modelVisualizationContext)
            }
            default: {
                throw new IllegalArgumentException("ContextRemoveAction does not support removing "
                    + modelVisualizationContext.class + " from " + ovc.class + " yet.")
            }
        }
        ContextUtils.removeEdges(ovc, modelVisualizationContext)
        
        return null
    }
    
}
