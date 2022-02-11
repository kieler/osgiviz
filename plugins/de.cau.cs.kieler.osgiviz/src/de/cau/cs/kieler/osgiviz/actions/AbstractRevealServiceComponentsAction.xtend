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
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext

/**
 * Abstract action to reveal service components connected to a service element caused by an action on a service
 * element. Handles the different parent visualization context stacks the component and other element could be in in
 * own methods.
 * 
 * @author nre
 */
abstract class AbstractRevealServiceComponentsAction extends AbstractVisualizationContextChangingAction {
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        // The overview context this element is shown in.
        val overviewContext = modelVisualizationContext.parent as ServiceOverviewContext
        
        // Handle this action differently, depending on in which overview context stack this is contained in.
        val parent1 = overviewContext.parent
        
        switch parent1 {
            BundleContext: {
                // Element inside an independent bundle context. Only available as a plain view.
                revealInIndependentBundle(modelVisualizationContext, overviewContext)
            }
            default: {
                // Element defined inside some overview. Component to that may be in PLAIN or IN_BUNDLES view.
                revealInServiceOverview(modelVisualizationContext, overviewContext)
            }
        }
    }
    
    /**
     * Reveal the connected service components in the case it is contained in a service overview context in
     * IN_BUNDLES or PLAIN view. Updates both views accordingly.
     * 
     * @param elementContext The context representing the service element that the connection is for.
     * @param serviceOverviewContext The service overview context this action is issued in.
     */
    protected abstract def void revealInServiceOverview(IVisualizationContext<?> elementContext,
        ServiceOverviewContext serviceOverviewContext)
    
    /**
     * Reveal the connected service components in the case it is contained in a service overview of a single bundle.
     * This is only possible in PLAIN view.
     * 
     * @param elementContext The context representing the service element that the connection is for.
     * @param serviceOverviewContext The service overview context this action is issued in.
     */
    protected abstract def void revealInIndependentBundle(IVisualizationContext<?> elementContext,
        ServiceOverviewContext serviceOverviewContext)
    
}
