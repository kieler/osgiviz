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
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext

/**
 * Abstract action to reveal service interfaces connected to a service elements caused by an action on a service
 * element. Handles the different parent visualization context stacks the interface and other element could be in in
 * own methods.
 * 
 * @author nre
 */
abstract class AbstractRevealServiceInterfacesAction extends AbstractVisualizationContextChangingAction {
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        
        // The element itself from the context.
        val element = modelVisualizationContext.modelElement
        
        // The overview context this element is shown in.
        val overviewContext = modelVisualizationContext.parent as ServiceOverviewContext
        
        // Handle this action differently, depending on in which overview context stack this is contained in.
        val parent1 = overviewContext.parent
        val parent2 = parent1?.parent
        val parent3 = parent2?.parent
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
    protected abstract def void revealInIndependentBundle(IVisualizationContext<?> elementContext,
        ServiceOverviewContext serviceOverviewContext)
    
    private static def throwUnknown() {
        throw new IllegalStateException("Hierarchy of this service element is unknown and is not able to reveal its "
            + "connected service interfaces.")
    }
    
}
