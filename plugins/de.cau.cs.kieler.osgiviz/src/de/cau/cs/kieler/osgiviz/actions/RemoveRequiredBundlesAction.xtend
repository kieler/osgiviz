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

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import java.util.List

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Disconnects the bundles required by any bundle from it and collapses them if they are not
 * connected to anything anymore.
 * 
 * @author nre
 */
class RemoveRequiredBundlesAction extends AbstractVisualizationContextChangingAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RemoveRequiredBundlesAction.name
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        // The BundleContext element for the element that was clicked on.
        val bundleContext = modelVisualizationContext as BundleContext
        
        // The bundle itself from the context.
        val bundle = bundleContext.modelElement
        
        // The bundle overview context this bundle is shown in.
        val bundleOverviewContext = bundleContext.parent as BundleOverviewContext
        
        // The required bundles that are currently in their detailed view.
        val detailedRequiredBundleContexts = bundleOverviewContext.detailedElements.filter [
            bundle.requiredBundles.contains(it.modelElement)
        ].toList as List<BundleContext>
        detailedRequiredBundleContexts.forEach [
            bundleContext.removeRequiredBundleEdge(it)
            if (bundleOverviewContext.hasNoConnections(it)) {
                bundleOverviewContext.collapse(it)
            }
        ]
    }
    
}
