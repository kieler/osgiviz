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

import de.scheidtbachmann.osgimodel.ServiceComponent
import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ProductContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentOverviewContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceOverviewContext
import org.eclipse.emf.ecore.EObject

/**
 * Abstract action to reveal service interfaces connected to a service component caused by an action on a service
 * component. Handles the different parent visualization context stacks the component and interface could be in in
 * own methods.
 * 
 * @author nre
 */
abstract class AbstractRevealServiceInterfacesAction extends AbstractVisualizationContextChangingAction {
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The ServiceComponentContext element for the element that was clicked on.
        val serviceComponentContext = modelVisualizationContext as ServiceComponentContext
        
        // The ServiceComponent itself from the context.
        val serviceComponent = serviceComponentContext.modelElement
        
        // The overview context this service component is shown in.
        val overviewContext = serviceComponentContext.parentVisualizationContext
            as IOverviewVisualizationContext<?>
        
        // Handle this action differently, depending on in which overview context stack this is contained in.
        val parent1 = overviewContext.parentVisualizationContext
        val parent2 = parent1?.parentVisualizationContext
        val parent3 = parent2?.parentVisualizationContext
        switch overviewContext {
            ServiceInterfaceOverviewContext: {
                // Revealed component in an interface context in PLAIN view. Also update the corresponding IN_BUNDLES
                // view.
                revealInInterfaceOverview(serviceComponent, overviewContext)
            }
            ServiceComponentOverviewContext: {
                switch parent1 {
                    BundleContext: {
                        switch parent2 {
                            ServiceInterfaceOverviewContext: {
                                // Revealed component in an interface context in IN_BUNDLES view. Also update the
                                // corresponding PLAIN view.
                                revealInInterfaceOverview(serviceComponent, parent2)
                            }
                            BundleOverviewContext: {
                                // Component in an independent bundle context. Only available as a plain view.
                                revealInIndependentBundle(serviceComponentContext, overviewContext)
                            }
                            ServiceComponentOverviewContext case parent3 instanceof ProductContext: {
                                // Component defined inside a product in IN_BUNDLES view. Also update the corresponding
                                // PLAIN view.
                                revealInProduct(serviceComponent, parent2)
                            }
                            default: throwUnknown
                        }
                    }
                    ProductContext: {
                        // Component defined inside a product in PLAIN view. Also update the corresponding IN_BUNDLES
                        // view.
                        revealInProduct(serviceComponent, overviewContext)
                    }
                    default: throwUnknown
                }
            }
            default: throwUnknown
        }
        
        return null
    }
    
    /**
     * Reveal the connected service interfaces in the case it is contained in a service interface overview context in
     * IN_BUNDLES or PLAIN view. Updates both views accordingly.
     * 
     * @param serviceComponent The service component that the connection is for.
     * @param serviceInterfaceOverviewContext The SI overview context this action is issued in.
     */
    protected abstract def void revealInInterfaceOverview(ServiceComponent serviceComponent, 
        ServiceInterfaceOverviewContext serviceInterfaceOverviewContext)
    
    /**
     * Reveal the connected service interfaces in the case it is contained in a service component overview context.
     * This is only possible and available as a PLAIN view.
     * 
     * @param serviceComponentContext The context representing the service component that the connection is for.
     * @param serviceComponentOverviewContext The SC overview context this action is issued in.
     */
    protected abstract def void revealInIndependentBundle(ServiceComponentContext serviceComponentContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext)
    
    /**
     * Reveal the connected service interfaces in the case it is contained in a product in IN_BUNDLES or PLAIN view.
     * Updates both views accordingly.
     * 
     * @param serviceComponent The serviceComponent that the connection is for.
     * @param serviceComponentOverviewContext The SC overview context in the product context that this action is issued
     * in.
     */
    protected abstract def void revealInProduct(ServiceComponent serviceComponent, 
        ServiceComponentOverviewContext serviceComponentOverviewContext)
    
    private static def throwUnknown() {
        throw new IllegalStateException("Hierarchy of this service component is unknown and is not able to reveal its "
            + "connected service interfaces.")
    }
    
}
