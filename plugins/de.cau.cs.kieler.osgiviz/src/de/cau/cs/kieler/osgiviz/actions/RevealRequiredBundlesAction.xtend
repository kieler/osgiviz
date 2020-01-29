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

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Expands the required bundles of any bundle and connects the bundles with an edge from the new bundle's
 * 'usedByBundles' port to this bundle's 'requiredBundles' port. 
 * If all required bundles are already shown, this action reverses its functionality and removes all bundles again.
 * 
 * @author nre
 */
class RevealRequiredBundlesAction extends AbstractVisualizationContextChangingAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealRequiredBundlesAction.name
    
    override <M> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The BundleContext element for the element that was clicked on.
        val bundleContext = modelVisualizationContext as BundleContext
        
        // The bundle itself from the context.
        val bundle = bundleContext.modelElement
        
        // The bundle overview context this bundle is shown in.
        val bundleOverviewContext = bundleContext.parent as BundleOverviewContext
        
        // The required bundles that are currently not yet in their detailed view need to be put in that state first.
        val collapsedRequiredBundleContexts = bundleOverviewContext.collapsedElements.filter [
            bundle.requiredBundles.contains(it.modelElement)
        ].toList
        collapsedRequiredBundleContexts.forEach [
            bundleOverviewContext.makeDetailed(it)
        ]
        
        // The bundle contexts in the overview that the requiredBundle connection can connect to.
        // Use the detailed bundle contexts only, as they are all made detailed above.
        val requiredBundleContexts = bundleOverviewContext.detailedElements.filter [
            bundle.requiredBundles.contains(it.modelElement)
        ].toList
        
        // If all bundles are already connected, remove them all. Otherwise, connect them all.
//        if (ContextUtils.allConnected(bundleContext, requiredBundleContexts, bundleOverviewContext, true)) {
//            requiredBundleContexts.forEach [ requiredBundleContext |
//                ContextUtils.removeRequiredBundleEdge(bundleContext, requiredBundleContext as BundleContext)
//            ]
//        } else {
            requiredBundleContexts.forEach [ requiredBundleContext |
                bundleContext.addRequiredBundleEdge(requiredBundleContext as BundleContext)
            ]
//        }
        return null
    }
    
}
