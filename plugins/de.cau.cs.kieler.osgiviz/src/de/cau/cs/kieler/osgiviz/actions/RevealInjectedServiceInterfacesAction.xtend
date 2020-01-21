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

import de.cau.cs.kieler.osgiviz.context.ClassContext
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ServiceOverviewContext
import de.cau.cs.kieler.osgiviz.modelExtension.Class

/**
 * Puts the service interfaces injected by this class next to this class and connects it
 * with an edge from this class' 'injectedServiceInterface' port to the new service interfaces.
 * 
 * @author nre
 */
class RevealInjectedServiceInterfacesAction extends AbstractRevealServiceInterfacesAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealInjectedServiceInterfacesAction.name
    
    override protected void revealInServiceOverview(Object element, ServiceOverviewContext serviceOverviewContext) {
        val theClass = element as Class
        // The service interfaces that are yet collapsed need to be expanded first.
        val serviceInterfaces = theClass.injectedInterfaces
        serviceInterfaces.forEach [ serviceInterface |
            val collapsedServiceInterfaceContext = serviceOverviewContext.collapsedServiceInterfaceContexts.findFirst [
                return modelElement === serviceInterface
            ]
            if (collapsedServiceInterfaceContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceInterfaceContext)
            }
        ]
        
        
        // The class needs to be expanded as well if not already.
        val collapsedClassContextPlain =  serviceOverviewContext.collapsedClassContexts.findFirst [
            return modelElement.equals(theClass)
        ]
        if (collapsedClassContextPlain !== null) {
            serviceOverviewContext.makeDetailed(collapsedClassContextPlain)
        }
        
        // ----- Find the class in the context for the PLAIN view -----
        val classContextPlain = serviceOverviewContext.detailedClassContexts.findFirst [
            return modelElement.equals(theClass)
        ]
        
        // ----- Find the class and the bundle in the context for the IN_BUNDLES view -----
        
        // Find the bundle context that should be containing the dual view on this service component.
        val containedBundle = theClass.bundle
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
        
        val collapsedClassContextInBundle = bundleServiceOverviewContext.collapsedClassContexts.findFirst [
            return modelElement.equals(theClass)
        ]
        bundleServiceOverviewContext.makeDetailed(collapsedClassContextInBundle)
        
        val classContextInBundle = bundleServiceOverviewContext.detailedClassContexts.findFirst [
            return modelElement.equals(theClass)
        ]
        
        // Add the connections for both views.
        serviceInterfaces.forEach [ serviceInterface |
            val implementedServiceInterfaceContext = serviceOverviewContext.detailedServiceInterfaceContexts.findFirst [
                return modelElement === serviceInterface
            ]
            ContextUtils.addInjectedServiceInterfaceEdgePlain(classContextPlain, implementedServiceInterfaceContext)
            ContextUtils.addInjectedServiceInterfaceEdgeInBundle(classContextInBundle,
                implementedServiceInterfaceContext)
        ]
    }
    
    override protected <M> void revealInIndependentBundle(IVisualizationContext<M> elementContext,
        ServiceOverviewContext serviceOverviewContext) {
        val classContext = elementContext as ClassContext
        val theClass = classContext.modelElement
        
        // Find the contexts of the injected interfaces in the overview
        theClass.injectedInterfaces.forEach [ serviceInterface |
            val collapsedServiceInterfaceContext = serviceOverviewContext.collapsedServiceInterfaceContexts.findFirst [
                modelElement === serviceInterface
            ]
            if (collapsedServiceInterfaceContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceInterfaceContext)
            }
            val serviceInterfaceContext = serviceOverviewContext.detailedServiceInterfaceContexts.findFirst [
                modelElement === serviceInterface
            ]
            // Add the edges for all injected interfaces.
            ContextUtils.addInjectedServiceInterfaceEdgePlain(classContext, serviceInterfaceContext)
        ]
    }
    
}
