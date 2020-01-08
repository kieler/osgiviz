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

import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceOverviewContext
import de.scheidtbachmann.osgimodel.EclipseInjection
import org.eclipse.emf.ecore.EObject

/**
 * Puts the service interface injected by this eclipse injection next to this injection and connects it
 * with an edge from this injection's 'injectedServiceInterface' port to the new service interface.
 * 
 * @author nre
 */
class RevealInjectedServiceInterfaceAction extends AbstractRevealServiceInterfacesAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealInjectedServiceInterfaceAction.name
    
    override protected void revealInServiceOverview(EObject element, ServiceOverviewContext serviceOverviewContext) {
        val eclipseInjection = element as EclipseInjection
        // The service interface that is yet collapsed needs to be expanded first.
        val serviceInterface = SynthesisUtils.injectedInterface(eclipseInjection)
        val collapsedServiceInterfaceContext = serviceOverviewContext.collapsedServiceInterfaceContexts.findFirst [
            return modelElement === serviceInterface
        ]
        if (collapsedServiceInterfaceContext !== null) {
            serviceOverviewContext.makeDetailed(collapsedServiceInterfaceContext)
        }
        
        // The injection needs to be expanded as well if not already.
        val collapsedInjectionContextPlain =  serviceOverviewContext.collapsedEclipseInjectionContexts.findFirst [
            return modelElement === eclipseInjection
        ]
        if (collapsedInjectionContextPlain !== null) {
            serviceOverviewContext.makeDetailed(collapsedInjectionContextPlain)
        }
        
        // ----- Find the injection in the context for the PLAIN view -----
        val injectionContextPlain = serviceOverviewContext.detailedEclipseInjectionContexts.findFirst [
            return modelElement === eclipseInjection
        ]
        
        // ----- Find the injection and the bundle in the context for the IN_BUNDLES view -----
        
        // Find the bundle context that should be containing the dual view on this service component.
        val containedBundle = SynthesisUtils.containedBundle(eclipseInjection)
        var referencedBundleContext = serviceOverviewContext.detailedReferencedBundleContexts.findFirst [
            return modelElement === containedBundle
        ]
        if (referencedBundleContext === null) {
           referencedBundleContext = serviceOverviewContext.collapsedReferencedBundleContexts.findFirst [
               return modelElement === containedBundle
           ]
           serviceOverviewContext.makeDetailed(referencedBundleContext)
        }
        val bundleServiceOverviewContext = referencedBundleContext.serviceOverviewContext
        bundleServiceOverviewContext.expanded = true
        
        val collapsedInjectionContextInBundle = bundleServiceOverviewContext.collapsedEclipseInjectionContexts.findFirst [
            return modelElement === eclipseInjection
        ]
        bundleServiceOverviewContext.makeDetailed(collapsedInjectionContextInBundle)
        
        val injectionContextInBundle = bundleServiceOverviewContext.detailedEclipseInjectionContexts.findFirst [
            return modelElement === eclipseInjection
        ]
        
        // Add the connections for both views.
        val implementedServiceInterfaceContext = serviceOverviewContext.detailedServiceInterfaceContexts.findFirst [
            return modelElement === serviceInterface
        ]
        ContextUtils.addInjectedServiceInterfaceEdgePlain(injectionContextPlain, implementedServiceInterfaceContext)
        ContextUtils.addInjectedServiceInterfaceEdgeInBundle(injectionContextInBundle, implementedServiceInterfaceContext)
    }
    
    override protected <M extends EObject> void revealInIndependentBundle(IVisualizationContext<M> elementContext,
        ServiceOverviewContext serviceOverviewContext) {
        val serviceComponentContext = elementContext as ServiceComponentContext
        val serviceComponent = serviceComponentContext.modelElement
        
        // Find the contexts of the implemented interfaces in the overview
        serviceComponent.serviceInterfaces.forEach [ serviceInterface |
            val collapsedServiceInterfaceContext = serviceOverviewContext.collapsedServiceInterfaceContexts.findFirst [
                modelElement === serviceInterface
            ]
            if (collapsedServiceInterfaceContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceInterfaceContext)
            }
            val serviceInterfaceContext = serviceOverviewContext.detailedServiceInterfaceContexts.findFirst [
                modelElement === serviceInterface
            ]
            // Add the edges for all implemented interfaces.
            ContextUtils.addImplementingServiceComponentEdgePlain(serviceInterfaceContext, serviceComponentContext)
        ]
    }
    
}
