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

import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext

/**
 * Expands the bundles used by any bundle and connects the bundles with an edge from the new bundle's
 * 'requiredBundles' port to this bundle's 'usedByBundles' port. 
 * If all used by bundles are already shown, this action reverses its functionality and removes all bundles again.
 * 
 * @author nre
 */
class RevealUsedByBundlesAction extends AbstractVisualizationContextChangingAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealUsedByBundlesAction.name
    
    override <M> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The BundleContext element for the element that was clicked on.
        val bundleContext = modelVisualizationContext as BundleContext
        
        // The bundle itself from the context.
        val bundle = bundleContext.modelElement
        
        // The bundle overview context this bundle is shown in.
        val bundleOverviewContext = bundleContext.parentVisualizationContext as BundleOverviewContext
        
        // The used by bundles that are currently not yet in their detailed view need to be put in that state first.
        val collapsedUsedByBundleContexts = bundleOverviewContext.collapsedElements.filter [
            bundle.usedByBundle.contains(it.modelElement)
        ].toList
        collapsedUsedByBundleContexts.forEach [
            bundleOverviewContext.makeDetailed(it)
        ]
        
        // The bundle contexts in the overview that the usedByBundle connection can connect to.
        // Use the detailed bundle contexts only, as they are all made detailed above.
        val usedByBundleContexts = bundleOverviewContext.detailedElements.filter [
            bundle.usedByBundle.contains(it.modelElement)
        ].toList
        
        // If all bundles are already connected, remove them all. Otherwise, connect them all.
        // TODO: Put this functionality in own actions and use that when everything is already connected.
//        if (ContextUtils.allConnected(bundleContext, usedByBundleContexts, bundleOverviewContext, false)) {
//            usedByBundleContexts.forEach [ usedByBundleContext |
//                ContextUtils.removeRequiredBundleEdge(usedByBundleContext as BundleContext, bundleContext)
//            ]
//        } else {
            usedByBundleContexts.forEach [ usedByBundleContext |
                ContextUtils.addRequiredBundleEdge(usedByBundleContext as BundleContext, bundleContext)
            ]
//        }
        return null
    }
    
}
