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
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ServiceOverviewContext

/**
 * Abstract action to reveal service interfaces connected to a service elements caused by an action on a service
 * element. Handles the different parent visualization context stacks the interface and other element could be in in
 * own methods.
 * 
 * @author nre
 */
abstract class AbstractRevealServiceInterfacesAction extends AbstractVisualizationContextChangingAction {
    
    override <M> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        
        // The element itself from the context.
        val element = modelVisualizationContext.modelElement
        
        // The overview context this element is shown in.
        val overviewContext = modelVisualizationContext.parentVisualizationContext as ServiceOverviewContext
        
        // Handle this action differently, depending on in which overview context stack this is contained in.
        val parent1 = overviewContext.parentVisualizationContext
        val parent2 = parent1?.parentVisualizationContext
        val parent3 = parent2?.parentVisualizationContext
        switch parent1 {
            BundleContext: {
                switch parent2 {
                    BundleOverviewContext: {
                        // Element in an independent bundle context. Only available as a plain view.
                        revealInIndependentBundle(modelVisualizationContext, overviewContext)
                    }
                    ServiceOverviewContext case !(parent3 instanceof BundleContext): {
                        // Element defined inside some overview in IN_BUNDLES view. Also update the corresponding
                        // PLAIN view.
                        revealInServiceOverview(element, parent2)
                    }
                    default: throwUnknown
                }
            }
            default: {
                // Element defined inside some overview in PLAIN view. Also update the corresponding IN_BUNDLES view.
                revealInServiceOverview(element, overviewContext)
            }
        }
        
        return null
    }
    
    /**
     * Reveal the connected service interfaces in the case it is contained in a service overview context in
     * IN_BUNDLES or PLAIN view. Updates both views accordingly.
     * 
     * @param element The element that the connection is for.
     * @param serviceOverviewContext The service overview context this action is issued in.
     */
    protected abstract def void revealInServiceOverview(Object element, ServiceOverviewContext serviceOverviewContext)
    
    /**
     * Reveal the connected service interfaces in the case it is contained in a service overview of a single bundle.
     * This is only available in PLAIN view.
     * 
     * @param elementContext The context representing the element that the connection is for.
     * @param serviceOverviewContext The service overview context this action is issued in.
     */
    protected abstract def <M> void revealInIndependentBundle(IVisualizationContext<M> elementContext,
        ServiceOverviewContext serviceOverviewContext)
    
    private static def throwUnknown() {
        throw new IllegalStateException("Hierarchy of this service element is unknown and is not able to reveal its "
            + "connected service interfaces.")
    }
    
}
