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

import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.scheidtbachmann.osgimodel.ServiceComponent

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Puts the service interfaces referenced by this service component next to this service component and connects them 
 * with an edge from this service component's 'referencedServiceComponents' port to the new service interface.
 * 
 * @author nre
 */
class RevealReferencedServiceInterfacesAction extends AbstractRevealServiceInterfacesAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealReferencedServiceInterfacesAction.name
    
    override protected void revealInServiceOverview(Object element, ServiceOverviewContext serviceOverviewContext) {
        val serviceComponent = element as ServiceComponent
        // The service interfaces that are yet collapsed need to be expanded first.
        serviceComponent.reference.forEach [ reference |
            val serviceInterface = reference.serviceInterface
            val collapsedServiceInterfaceContext = serviceOverviewContext.collapsedServiceInterfaceContexts.findFirst [
                return modelElement === serviceInterface
            ]
            if (collapsedServiceInterfaceContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceInterfaceContext)
            }
        ]
        
        // The service component needs to be expanded as well if not already.
        val collapsedServiceComponentContextPlain = serviceOverviewContext.collapsedServiceComponentContexts.findFirst [
            return it.modelElement === serviceComponent
        ]
        if (collapsedServiceComponentContextPlain !== null) {
            serviceOverviewContext.makeDetailed(collapsedServiceComponentContextPlain)
        }
        
        // ----- Find the service component in the context for the PLAIN view ----
        val serviceComponentContextPlain = serviceOverviewContext.detailedServiceComponentContexts.findFirst [
            return modelElement === serviceComponent
        ]
        
        // ----- Find the service component and the bundle in the context for the IN_BUNDLES view -----
        
        // Find the bundle context that should be containing the dual view on this service component.
        var referencedBundleContext = serviceOverviewContext.detailedReferencedBundleContexts.findFirst [
            return it.modelElement === serviceComponent.bundle
        ]
        if (referencedBundleContext === null) {
           referencedBundleContext = serviceOverviewContext.collapsedReferencedBundleContexts.findFirst [
               return it.modelElement === serviceComponent.bundle
           ]
           serviceOverviewContext.makeDetailed(referencedBundleContext)
        }
        val bundleServiceOverviewContext = referencedBundleContext.serviceOverviewContext
        bundleServiceOverviewContext.expanded = true
        
        val collapsedServiceComponentContextInBundle = bundleServiceOverviewContext.collapsedServiceComponentContexts.findFirst [
            return it.modelElement === serviceComponent
        ]
        bundleServiceOverviewContext.makeDetailed(collapsedServiceComponentContextInBundle)
        
        val serviceComponentContextInBundle = bundleServiceOverviewContext.detailedServiceComponentContexts.findFirst [
            return modelElement === serviceComponent
        ]
        
        // Add all connections for both views.
        serviceComponent.reference.forEach [ reference |
            val serviceInterface = reference.serviceInterface
            val referencedServiceInterfaceContext = serviceOverviewContext.detailedServiceInterfaceContexts.findFirst [
                return modelElement === serviceInterface
            ]
            serviceComponentContextPlain.addReferencedServiceInterfaceEdgePlain(referencedServiceInterfaceContext, reference)
            serviceComponentContextInBundle.addReferencedServiceInterfaceEdgeInBundle(referencedServiceInterfaceContext, reference)
        ]
    }
    
    override protected void revealInIndependentBundle(IVisualizationContext<?> elementContext,
        ServiceOverviewContext serviceOverviewContext) {
        val serviceComponentContext = elementContext as ServiceComponentContext
        val serviceComponent = serviceComponentContext.modelElement
        
        // Find the contexts of the referenced interfaces in the overview.
        serviceComponent.reference.forEach [ reference |
            val serviceInterface = reference.serviceInterface
            val collapsedServiceInterfaceContext = serviceOverviewContext.collapsedServiceInterfaceContexts.findFirst [
                modelElement === serviceInterface
            ]
            if (collapsedServiceInterfaceContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceInterfaceContext)
            }
            val serviceInterfaceContext = serviceOverviewContext.detailedServiceInterfaceContexts.findFirst [
                modelElement === serviceInterface
            ]
            // Add the edges for all referenced interfaces.
            serviceComponentContext.addReferencedServiceInterfaceEdgePlain(serviceInterfaceContext,
                reference)
        ]
    }
    
}
