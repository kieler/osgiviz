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

import de.cau.cs.kieler.klighd.KlighdDataManager
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Calls the corresponding reveal*Actions for all elements visualized in this overview.
 * 
 * @author nre
 */
class ConnectAllAction extends AbstractVisualizationContextChangingAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = ConnectAllAction.name
    
    override <M> changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        val kdm = KlighdDataManager.instance
        val revealImplementedServiceInterfacesAction = kdm.getActionById(RevealImplementedServiceInterfacesAction.ID)
            as RevealImplementedServiceInterfacesAction
        val revealImplementingServiceComponentsAction = kdm.getActionById(RevealImplementingServiceComponentsAction.ID)
            as RevealImplementingServiceComponentsAction
        val revealReferencedServiceInterfacesAction = kdm.getActionById(RevealReferencedServiceInterfacesAction.ID)
            as RevealReferencedServiceInterfacesAction
        val revealReferencingServiceComponentsAction = kdm.getActionById(RevealReferencingServiceComponentsAction.ID)
            as RevealReferencingServiceComponentsAction
        val revealRequiredBundlesAction = kdm.getActionById(RevealRequiredBundlesAction.ID)
            as RevealRequiredBundlesAction
        val revealUsedByBundlesAction = kdm.getActionById(RevealUsedByBundlesAction.ID) as RevealUsedByBundlesAction
        val revealUsedPackagesAction = kdm.getActionById(RevealUsedPackagesAction.ID) as RevealUsedPackagesAction
        val revealInjectedInterfacesAction = kdm.getActionById(RevealInjectedServiceInterfacesAction.ID)
            as RevealInjectedServiceInterfacesAction
		val OpenBundleManifestAction = kdm.getActionById(OpenBundleManifestAction.ID) as OpenBundleManifestAction
		        
        if (!(modelVisualizationContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalStateException("The ConnectAllAction is only callable on IOverviewVisualizationContexts,"
                + " but was called on a " + modelVisualizationContext.class)
        }
        val ovc = modelVisualizationContext as IOverviewVisualizationContext<?>
        
        // Expand all context not that are not yet in their detailed form.
        val collapsedContexts = ovc.collapsedElements.clone
        collapsedContexts.forEach [ collapsed |
            (ovc as IOverviewVisualizationContext<Object>).makeDetailed(collapsed as IVisualizationContext<Object>)
        ]
        
        // For each child context, call actions on all their connections.
        // Also remember all elements added later so that for them all connections can be shown as well // TODO: needed?
        ovc.childContexts.clone.forEach [ childContext |
            switch (childContext) {
                BundleCategoryContext: {
                    // Do nothing.
                }
                BundleContext: {
                    if (ovc instanceof BundleOverviewContext) {
                        // Connect all required and requiring bundles and the required packages.
                        revealRequiredBundlesAction.changeVisualization(childContext, actionContext)
                        revealUsedByBundlesAction  .changeVisualization(childContext, actionContext)
                        revealUsedPackagesAction   .changeVisualization(childContext, actionContext)
                    }
                    OpenBundleManifestAction .execute(actionContext)
                }
                FeatureContext: {
                    // Do nothing.
                }
                PackageObjectContext: {
                    // Do nothing.
                }
                ProductContext: {
                    // Do nothing.
                }
                ServiceComponentContext: {
                    // Connect all implemented and referenced service interfaces.
                    revealImplementedServiceInterfacesAction.changeVisualization(childContext, actionContext)
                    revealReferencedServiceInterfacesAction .changeVisualization(childContext, actionContext)
                }
                ServiceInterfaceContext: {
                    // Connect all implementing and referencing service components.
                    revealImplementingServiceComponentsAction.changeVisualization(childContext, actionContext)
                    revealReferencingServiceComponentsAction .changeVisualization(childContext, actionContext)
                }
                ClassContext: {
                    // Connect all injected interfaces.
                    revealInjectedInterfacesAction.changeVisualization(childContext, actionContext)
                }
                default: {
                    throw new IllegalStateException("Unknown child context. " + childContext.class)
                }
            }
        ]
    }

    
}
