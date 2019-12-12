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
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentOverviewContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceOverviewContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext

/**
 * Puts the service interfaces implemented by this service component next to this service component and connects them 
 * with an edge from this service component's 'implementedServiceInterfaces' port to the new service interface's
 * 'implementingServiceComponents' port.
 * 
 * @author nre
 */
class RevealImplementedServiceInterfacesAction extends AbstractRevealServiceInterfacesAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealImplementedServiceInterfacesAction.name
    
    override protected void revealInInterfaceOverview(ServiceComponent serviceComponent, 
        ServiceInterfaceOverviewContext serviceInterfaceOverviewContext) {
        // The service interfaces that are yet collapsed need to be expanded first.
        serviceComponent.serviceInterfaces.forEach [ serviceInterface |
            var implementedServiceInterfaceContext = serviceInterfaceOverviewContext.collapsedElements.findFirst [
                return modelElement === serviceInterface
            ]
            if (implementedServiceInterfaceContext !== null) {
                ContextUtils.makeDetailed(serviceInterfaceOverviewContext, implementedServiceInterfaceContext)
            }
        ]
        
        // ----- Find/put the service component in the context for the PLAIN view -----
        var serviceComponentContextPlain = serviceInterfaceOverviewContext
            .implementingOrReferencingServiceComponentContexts.findFirst [ return it.modelElement === serviceComponent ]
        if (serviceComponentContextPlain === null) {
            serviceComponentContextPlain = new ServiceComponentContext(serviceComponent,
                serviceInterfaceOverviewContext)
            serviceInterfaceOverviewContext.implementingOrReferencingServiceComponentContexts
                .add(serviceComponentContextPlain)
        }
        // Make this variable final.
        val serviceComponentContextPlain_ = serviceComponentContextPlain
        
        // ----- Find/put the service component and the bundle in the context for the IN_BUNDLES view -----
        
        // Find the bundle context that should be containing the dual view on this service component.
        var referencedBundleContext = serviceInterfaceOverviewContext.referencedBundleContexts.findFirst [
            return it.modelElement === serviceComponent.bundle
        ]
        // Create a new bundle context for that bundle if it is not yet in the view.
        if (referencedBundleContext === null) {
            referencedBundleContext = new BundleContext(serviceComponent.bundle, serviceInterfaceOverviewContext)
            serviceInterfaceOverviewContext.referencedBundleContexts.add(referencedBundleContext)
        }
        val serviceComponentOverviewContext = referencedBundleContext.serviceComponentOverviewContext
        serviceComponentOverviewContext.expanded = true
        
        val serviceComponentContextInBundle = serviceComponentOverviewContext.childContexts.findFirst [
            return it.modelElement === serviceComponent
        ] as ServiceComponentContext
        ContextUtils.makeDetailed(serviceComponentOverviewContext, serviceComponentContextInBundle)
        
        // Add all connections for both views.
        serviceComponent.serviceInterfaces.forEach [ serviceInterface |
            val implementedServiceInterfaceContext = serviceInterfaceOverviewContext.detailedElements.findFirst [
                return modelElement === serviceInterface
            ] as ServiceInterfaceContext
            ContextUtils.addImplementingServiceComponentEdgePlain(implementedServiceInterfaceContext,
                serviceComponentContextPlain_)
            ContextUtils.addImplementingServiceComponentEdgeInBundle(implementedServiceInterfaceContext,
                serviceComponentContextInBundle)
        ]
    }
    
    override protected void revealInIndependentBundle(ServiceComponentContext serviceComponentContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext) {
        val serviceComponent = serviceComponentContext.modelElement
        
        // Find/put the contexts of the implemented interfaces in the overview
        serviceComponent.serviceInterfaces.forEach [ serviceInterface |
            var serviceInterfaceContext = serviceComponentOverviewContext
                .implementedOrReferencedServiceInterfaceContexts.findFirst [
                modelElement === serviceInterface
            ]
            // Create a new context if it is not yet in the view
            if (serviceInterfaceContext === null) {
                serviceInterfaceContext = new ServiceInterfaceContext(serviceInterface, serviceComponentOverviewContext)
                serviceComponentOverviewContext.implementedOrReferencedServiceInterfaceContexts
                    .add(serviceInterfaceContext)
            }
            // Add the edges for all implemented interfaces.
            ContextUtils.addImplementingServiceComponentEdgePlain(serviceInterfaceContext, serviceComponentContext)
        ]
    }
    
    override protected void revealInProduct(ServiceComponent serviceComponent, 
        ServiceComponentOverviewContext serviceComponentOverviewContext) {
        // The service interfaces that are not in the view need to be added first.
        serviceComponent.serviceInterfaces.forEach [ serviceInterface |
            var implementedServiceInterfaceContext = serviceComponentOverviewContext
                .implementedOrReferencedServiceInterfaceContexts.findFirst [
                return modelElement === serviceInterface
            ]
            if (implementedServiceInterfaceContext === null) {
                serviceComponentOverviewContext.implementedOrReferencedServiceInterfaceContexts.add(
                    new ServiceInterfaceContext(serviceInterface, serviceComponentOverviewContext))
            }
        ]
        
        // ----- Find the service component in the context for the PLAIN view and expand it if necessary. -----
        val serviceComponentContextPlain = serviceComponentOverviewContext.childContexts
            .findFirst [ return modelElement === serviceComponent ] as IVisualizationContext<ServiceComponent>
        ContextUtils.makeDetailed(serviceComponentOverviewContext, serviceComponentContextPlain)
        
        // ----- Find/put the service component and the bundle in the context for the IN_BUNDLES view. -----
        
        // Find the bundle context that should be containing the dual view on this service component.
        var referencedBundleContext = serviceComponentOverviewContext.referencedBundleContexts.findFirst [
            return it.modelElement === serviceComponent.bundle
        ]
        // Create a new bundle context for that bundle if it is not yet in the view.
        if (referencedBundleContext === null) {
            referencedBundleContext = new BundleContext(serviceComponent.bundle, serviceComponentOverviewContext)
            serviceComponentOverviewContext.referencedBundleContexts.add(referencedBundleContext)
        }
        val innerServiceComponentOverviewContext = referencedBundleContext.serviceComponentOverviewContext
        innerServiceComponentOverviewContext.expanded = true
        
        val serviceComponentContextInBundle = innerServiceComponentOverviewContext.childContexts.findFirst [
            return it.modelElement === serviceComponent
        ] as ServiceComponentContext
        ContextUtils.makeDetailed(innerServiceComponentOverviewContext, serviceComponentContextInBundle)
        
        // Add all connections for both views.
        serviceComponent.serviceInterfaces.forEach [ serviceInterface |
            val implementedServiceInterfaceContext = serviceComponentOverviewContext
                .implementedOrReferencedServiceInterfaceContexts.findFirst [
                return modelElement === serviceInterface
            ] as ServiceInterfaceContext
            ContextUtils.addImplementingServiceComponentEdgePlain(implementedServiceInterfaceContext,
                serviceComponentContextPlain as ServiceComponentContext)
            ContextUtils.addImplementingServiceComponentEdgeInBundle(implementedServiceInterfaceContext,
                serviceComponentContextInBundle)
        ]
    }
    
}
