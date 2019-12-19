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

import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentOverviewContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionContext
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionOverviewContext
import de.cau.cs.kieler.osgiviz.SynthesisUtils

/**
 * Puts the service interface injected by this eclipse injection next to this injection and connects it
 * with an edge from this injection's 'injectedServiceInterface' port to the new service interface.
 * 
 * @author nre
 */
class RevealInjectedServiceInterfaceAction extends AbstractVisualizationContextChangingAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealInjectedServiceInterfaceAction.name
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The EclipseInjectionContext element for the element that was clicked on.
        val eclipseInjectionContext = modelVisualizationContext as EclipseInjectionContext
        
        // The overview context this eclipse injection is shown in.
        val overviewContext = eclipseInjectionContext.parentVisualizationContext
            as EclipseInjectionOverviewContext
        
        // Component in an independent bundle context. Only available as a plain view.
        reveal(eclipseInjectionContext, overviewContext)
        
        return null
    }
    
    /**
     * Reveal the connected service interfaces in a eclipse injection overview context.
     * 
     * @param eclipseInjectionContext The context representing the eclipse injection that the connection is for.
     * @param eclipseInjectionOverviewContext The EI overview context this action is issued in.
     */
    def protected void reveal(EclipseInjectionContext eclipseInjectionContext,
        EclipseInjectionOverviewContext eclipseInjectionOverviewContext) {
        val eclipseInjection = eclipseInjectionContext.modelElement
        
        // Find/put the contexts of the referenced interfaces in the overview.
        val serviceInterface = SynthesisUtils.injectedInterface(eclipseInjection)
        var serviceInterfaceContext = eclipseInjectionOverviewContext
            .injectedInterfaces.findFirst [
            modelElement === serviceInterface
        ]
        // Create a new context if it is not yet in the view.
        if (serviceInterfaceContext === null) {
            serviceInterfaceContext = new ServiceInterfaceContext(serviceInterface, eclipseInjectionOverviewContext)
            eclipseInjectionOverviewContext.injectedInterfaces.add(serviceInterfaceContext)
        }
        // Add the edges for the injected interface.
        ContextUtils.addInjectedServiceInterfaceEdge(eclipseInjectionContext, serviceInterfaceContext)
        
    }
    
}
