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
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentOverviewContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceOverviewContext

/**
 * Puts the service components implementing this service interface next to this service interface and connects them with
 * an edge from the new service component's 'implementedServiceInterfaces' to this service interface's
 * 'implementingServiceComponents' port.
 *  
 * @author nre
 */
class RevealImplementingServiceComponentsAction extends AbstractRevealServiceComponentsAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealImplementingServiceComponentsAction.name
    
    override revealInInterfaceOverview(ServiceInterfaceContext serviceInterfaceContext,
        ServiceInterfaceOverviewContext serviceInterfaceOverviewContext) {
        val serviceInterface = serviceInterfaceContext.modelElement
        // ----- Put the service components in the context for the PLAIN view -----
        
        // The service components that are not already represented in the overview need to be put in first.
        serviceInterface.serviceComponent.forEach [ serviceComponent |
            var implementingServiceComponentContext = serviceInterfaceOverviewContext
                .implementingOrReferencingServiceComponentContexts.findFirst [
                    return it.modelElement === serviceComponent
                ]
            if (implementingServiceComponentContext === null) {
                implementingServiceComponentContext = new ServiceComponentContext(serviceComponent,
                    serviceInterfaceOverviewContext)
                serviceInterfaceOverviewContext.implementingOrReferencingServiceComponentContexts
                    .add(implementingServiceComponentContext)
            }
            ContextUtils.addImplementingServiceComponentEdgePlain(serviceInterfaceContext,
                implementingServiceComponentContext)
        ]
        
        // ----- Put the service components and the bundles in the context for the IN_BUNDLES view -----
        
        serviceInterface.serviceComponent.forEach [ serviceComponent |
            // Find the bundle context that should be containing a view on this service component.
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
            var implementingServiceComponentContext = serviceComponentOverviewContext.childContexts.findFirst [
                return it.modelElement === serviceComponent
            ] as IVisualizationContext<ServiceComponent>
            if (implementingServiceComponentContext === null) {
                throw new IllegalStateException("The bundle context does not contain all its service components as "
                    + "own contexts!")
            }
            ContextUtils.makeDetailed(serviceComponentOverviewContext, implementingServiceComponentContext)
            ContextUtils.addImplementingServiceComponentEdgeInBundle(serviceInterfaceContext,
                implementingServiceComponentContext as ServiceComponentContext)
        ]
    }
    
    override revealInIndependentBundle(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext) {
        val serviceInterface = serviceInterfaceContext.modelElement
        
        // Expand the contexts of the implementing components in the overview.
        serviceInterface.serviceComponent.forEach [ serviceComponent |
            // First, make it detailed if it is not already.
            val collapsedServiceComponentContext = serviceComponentOverviewContext.collapsedElements.findFirst [
                modelElement === serviceComponent
            ]
            if (collapsedServiceComponentContext !== null) {
                ContextUtils.makeDetailed(serviceComponentOverviewContext, collapsedServiceComponentContext)
            }
            // This is the context of the now detailed component.
            val serviceComponentContext = serviceComponentOverviewContext.detailedElements.findFirst [
                modelElement === serviceComponent
            ] as ServiceComponentContext
            // If the context is null, the component is not defined by this bundle and should therefore not be shown.
            if (serviceComponentContext !== null) {
                ContextUtils.addImplementingServiceComponentEdgePlain(serviceInterfaceContext, serviceComponentContext)
            }
        ]
    }
    
    override revealInProduct(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext, ActionContext actionContext) {
        val serviceInterface = serviceInterfaceContext.modelElement
        val filteredServiceComponents = serviceInterface.serviceComponent.filter [
            serviceComponentOverviewContext.modelElement.contains(it)
        ]
        
        filteredServiceComponents.forEach [ serviceComponent |
            // ----- Expand the service components in the context for the PLAIN view -----
            var implementingServiceComponentContextPlain = serviceComponentOverviewContext.childContexts.findFirst [
                modelElement === serviceComponent
            ] as IVisualizationContext<ServiceComponent>
            ContextUtils.makeDetailed(serviceComponentOverviewContext, implementingServiceComponentContextPlain)
            ContextUtils.addImplementingServiceComponentEdgePlain(serviceInterfaceContext,
                implementingServiceComponentContextPlain as ServiceComponentContext)
        
            // ----- Put the service components and the bundles in the context for the IN_BUNDLES view -----
        
            // Find the bundle context that should be containing a view on this service component.
            var referencedBundleContext = serviceComponentOverviewContext.referencedBundleContexts.findFirst [
                modelElement === serviceComponent.bundle
            ]
            // Create a new bundle context for that bundle if it is not yet in the view.
            if (referencedBundleContext === null) {
                referencedBundleContext = new BundleContext(serviceComponent.bundle, serviceComponentOverviewContext)
                serviceComponentOverviewContext.referencedBundleContexts.add(referencedBundleContext)
            }
            
            val innerServiceComponentOverviewContext = referencedBundleContext.serviceComponentOverviewContext
            if (!innerServiceComponentOverviewContext.expanded) {
                innerServiceComponentOverviewContext.expanded = true
                val nodes = actionContext.activeViewer.viewContext.getTargetElements(innerServiceComponentOverviewContext)
                // TODO: search the component node relevant in this context.
                // FIXME: The tracer is broken for this kind of synthesis. Only if that is fixed this manual expansion
                // will work.
                actionContext.activeViewer.toggleExpansion(nodes.head)
//                actionContext.KNode.setProperty(KlighdProperties.EXPAND, true)
            }
            var implementingServiceComponentContextInBundles = innerServiceComponentOverviewContext
                .childContexts.findFirst [
                    modelElement === serviceComponent
                ] as IVisualizationContext<ServiceComponent>
            if (implementingServiceComponentContextInBundles === null) {
                throw new IllegalStateException("The bundle context does not contain all its service components as "
                    + "own contexts!")
            }
            ContextUtils.makeDetailed(innerServiceComponentOverviewContext,
                implementingServiceComponentContextInBundles)
            ContextUtils.addImplementingServiceComponentEdgeInBundle(serviceInterfaceContext,
                implementingServiceComponentContextInBundles as ServiceComponentContext)
        ]
    }
    
}
