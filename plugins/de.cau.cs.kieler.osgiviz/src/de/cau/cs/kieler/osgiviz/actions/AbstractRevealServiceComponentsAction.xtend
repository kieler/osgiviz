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
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ServiceOverviewContext
import org.eclipse.emf.ecore.EObject

/**
 * Abstract action to reveal service components connected to a service element caused by an action on a service
 * element. Handles the different parent visualization context stacks the component and other element could be in in
 * own methods.
 * 
 * @author nre
 */
abstract class AbstractRevealServiceComponentsAction extends AbstractVisualizationContextChangingAction {
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The overview context this element is shown in.
        val overviewContext = modelVisualizationContext.parentVisualizationContext as ServiceOverviewContext
        
        // Handle this action differently, depending on in which overview context stack this is contained in.
        val parent1 = overviewContext.parentVisualizationContext
        
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
        
        return null
    }
    
    /**
     * Reveal the connected service components in the case it is contained in a service overview context in
     * IN_BUNDLES or PLAIN view. Updates both views accordingly.
     * 
     * @param elementContext The context representing the service element that the connection is for.
     * @param serviceOverviewContext The service overview context this action is issued in.
     */
    protected abstract def <M extends EObject> void revealInServiceOverview(IVisualizationContext<M> elementContext,
        ServiceOverviewContext serviceOverviewContext)
    
    /**
     * Reveal the connected service components in the case it is contained in a service overview of a single bundle.
     * This is only possible in PLAIN view.
     * 
     * @param elementContext The context representing the service element that the connection is for.
     * @param serviceOverviewContext The service overview context this action is issued in.
     */
    protected abstract def <M extends EObject> void revealInIndependentBundle(IVisualizationContext<M> elementContext,
        ServiceOverviewContext serviceOverviewContext)
    
}
