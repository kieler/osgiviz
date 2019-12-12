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
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ProductContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentOverviewContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceOverviewContext
import org.eclipse.emf.ecore.EObject

/**
 * Abstract action to reveal service components connected to a service interface caused by an action on a service
 * interface. Handles the different parent visualization context stacks the component and interface could be in in
 * own methods.
 * 
 * @author nre
 */
abstract class AbstractRevealServiceComponentsAction extends AbstractVisualizationContextChangingAction {
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The ServiceInterfaceContext element for the element that was clicked on.
        val serviceInterfaceContext = modelVisualizationContext as ServiceInterfaceContext
        
        // The overview context this service interface is shown in.
        val overviewContext = serviceInterfaceContext.parentVisualizationContext
            as IOverviewVisualizationContext<?>
        
        // Handle this action differently, depending on in which overview context stack this is contained in.
        val parent1 = overviewContext.parentVisualizationContext
        switch overviewContext {
            ServiceInterfaceOverviewContext: {
                // Interface in its default interface overview. Component to that may be in PLAIN or IN_BUNDLES view.
                revealInInterfaceOverview(serviceInterfaceContext, overviewContext)
            }
            ServiceComponentOverviewContext: {
                switch parent1 {
                    BundleContext: {
                        // Interface defined inside an independent bundle context. Only available as a plain view.
                        revealInIndependentBundle(serviceInterfaceContext, overviewContext)
                    }
                    ProductContext: {
                        // Interface defined inside a product. Component to that may be in PLAIN or IN_BUNDLES view.
                        revealInProduct(serviceInterfaceContext, overviewContext, actionContext)
                    }
                    default: throwUnknown
                }
            }
            default: throwUnknown
        }
        
        return null
    }
    
    /**
     * Reveal the connected service components in the case it is contained in a service interface overview context in
     * IN_BUNDLES or PLAIN view. Updates both views accordingly.
     * 
     * @param serviceInterfaceContext The service interface that the connection is for.
     * @param serviceInterfaceOverviewContext The SI overview context this action is issued in.
     */
    protected abstract def void revealInInterfaceOverview(ServiceInterfaceContext serviceInterfaceContext,
        ServiceInterfaceOverviewContext serviceInterfaceOverviewContext)
    
    /**
     * Reveal the connected service components in the case it is contained in a service component overview context. This
     * is only possible in PLAIN view.
     * 
     * @param serviceInterfaceContext The service interface that the connection is for.
     * @param serviceComponentOverviewContext The SC overview context this action is issued in.
     */
    protected abstract def void revealInIndependentBundle(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext)
    
    /**
     * Reveal the connected service components in the case it is contained in a product in IN_BUNDLES or PLAIN view.
     * Updates both views accordingly.
     * 
     * @param serviceInterfaceContext The service interface that the connection is for.
     * @param serviceComponentOverviewContext The SC overview context in the product context that this action is issued
     * in.
     */
    protected abstract def void revealInProduct(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext, ActionContext actionContext)
    
    private static def throwUnknown() {
        throw new IllegalStateException("Hierarchy of this service interface is unknown and is not able to reveal its "
            + "implementing service components.")
    }
    
}
