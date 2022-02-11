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

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Expands the bundles used by any bundle and connects the bundles with an edge from the new bundle's
 * 'requiredBundles' port to this bundle's 'usedByBundles' port. 
 * If all used by bundles are already shown, this action reverses its functionality and removes all bundles again.
 * 
 * @author nre
 */
class RevealUsedByBundlesAction extends RevealAction<BundleContext> {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealUsedByBundlesAction.name
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        // The BundleContext element for the element that was clicked on.
        val bundleContext = modelVisualizationContext as BundleContext
        
        // The bundle itself from the context.
        val bundle = bundleContext.modelElement
        
        // The bundle overview context this bundle is shown in.
        val bundleOverviewContext = bundleContext.parent as BundleOverviewContext
        
        // The used by bundles that are currently not yet in their detailed view need to be put in that state first.
        val collapsedUsedByBundleContexts = bundleOverviewContext.collapsedElements.filter [
            bundle.usedByBundle.contains(it.modelElement)
        ].toList
        collapsedUsedByBundleContexts.forEach [
            bundleOverviewContext.makeDetailed(it)
        ]
        
        // The bundle contexts in the overview that the usedByBundle connection can connect to.
        // Use the detailed bundle contexts only, as they are all made detailed above.
        newlyConnectedContexts = bundleOverviewContext.detailedElements.filter [
            bundle.usedByBundle.contains(it.modelElement)
        ].toList
        
        // If all bundles are already connected, remove them all. Otherwise, connect them all.
        // TODO: Put this functionality in own actions and use that when everything is already connected.
//        if (ContextUtils.allConnected(bundleContext, usedByBundleContexts, bundleOverviewContext, false)) {
//            usedByBundleContexts.forEach [ usedByBundleContext |
//                ContextUtils.removeRequiredBundleEdge(usedByBundleContext as BundleContext, bundleContext)
//            ]
//        } else {
            newlyConnectedContexts.forEach [ usedByBundleContext |
                (usedByBundleContext as BundleContext).addRequiredBundleEdge(bundleContext)
            ]
//        }
    }
    
    override applicableContext() {
        return BundleContext
    }
    
    /**
     * Recursive version of the parent class's action, revealing all elements using the same connection type connected.
     */
    static class Recursive extends RecursiveRevealAction<BundleContext, RevealUsedByBundlesAction> {
        
        /**
         * This action's ID.
         */
        public static val String ID = Recursive.name
        
        override revealActionClass() {
            return RevealUsedByBundlesAction
        }
        
    }
    
}