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

import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

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
    
    override <M> revealInServiceOverview(IVisualizationContext<M> elementContext,
        ServiceOverviewContext serviceOverviewContext) {
        val serviceInterfaceContext = elementContext as ServiceInterfaceContext
        val serviceInterface = serviceInterfaceContext.modelElement
        // ----- Put the service components in the context for the PLAIN view -----
        
        // The service components that are yet collapsed need to be expanded first.
        val filteredServiceComponents = serviceInterface.serviceComponent.filter [
            serviceOverviewContext.modelElements.contains(it)
        ]
        filteredServiceComponents.forEach [ serviceComponent |
            val collapsedServiceComponentContext = serviceOverviewContext.collapsedServiceComponentContexts.findFirst [
                return it.modelElement === serviceComponent
            ]
            if (collapsedServiceComponentContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceComponentContext)
            }
            val serviceComponentContextPlain = serviceOverviewContext.detailedServiceComponentContexts.findFirst [
                return it.modelElement === serviceComponent
            ]
            serviceInterfaceContext.addImplementingServiceComponentEdgePlain(serviceComponentContextPlain)
        ]
        
        // ----- Put the service components and the bundles in the context for the IN_BUNDLES view -----
        
        filteredServiceComponents.forEach [ serviceComponent |
            // Find the bundle context that should be containing a view on this service component.
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
                return it.modelElement === serviceComponent
            ]
            
            // Add the connection.
            serviceInterfaceContext.addImplementingServiceComponentEdgeInBundle(serviceComponentContextInBundle)
        ]
    }
    
    override <M> revealInIndependentBundle(IVisualizationContext<M> elementContext,
        ServiceOverviewContext serviceOverviewContext) {
        val serviceInterfaceContext = elementContext as ServiceInterfaceContext
        val serviceInterface = serviceInterfaceContext.modelElement
        
        // Expand the contexts of the implementing components in the overview.
        serviceInterface.serviceComponent.forEach [ serviceComponent |
            // First, make it detailed if it is not already.
            val collapsedServiceComponentContext = serviceOverviewContext.collapsedServiceComponentContexts.findFirst [
                modelElement === serviceComponent
            ]
            if (collapsedServiceComponentContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceComponentContext)
            }
            // This is the context of the now detailed component.
            val serviceComponentContext = serviceOverviewContext.detailedServiceComponentContexts.findFirst [
                modelElement === serviceComponent
            ]
            // If the context is null, the component is not defined by this bundle and should therefore not be shown.
            if (serviceComponentContext !== null) {
                serviceInterfaceContext.addImplementingServiceComponentEdgePlain(serviceComponentContext)
            }
        ]
    }
    
//    override revealInProduct(ServiceInterfaceContext serviceInterfaceContext,
//        ServiceOverviewContext serviceComponentOverviewContext, ActionContext actionContext) {
//        val serviceInterface = serviceInterfaceContext.modelElement
//        val filteredServiceComponents = serviceInterface.serviceComponent.filter [
//            serviceComponentOverviewContext.modelElements.contains(it)
//        ]
//        
//        filteredServiceComponents.forEach [ serviceComponent |
//            // ----- Expand the service components in the context for the PLAIN view -----
//            var implementingServiceComponentContextPlain = serviceComponentOverviewContext.childContexts.findFirst [
//                modelElement === serviceComponent
//            ] as IVisualizationContext<ServiceComponent>
//            ContextUtils.makeDetailed(serviceComponentOverviewContext, implementingServiceComponentContextPlain)
//            ContextUtils.addImplementingServiceComponentEdgePlain(serviceInterfaceContext,
//                implementingServiceComponentContextPlain as ServiceComponentContext)
//        
//            // ----- Put the service components and the bundles in the context for the IN_BUNDLES view -----
//        
//            // Find the bundle context that should be containing a view on this service component.
//            var referencedBundleContext = serviceComponentOverviewContext.referencedBundleContexts.findFirst [
//                modelElement === serviceComponent.bundle
//            ]
//            // Create a new bundle context for that bundle if it is not yet in the view.
//            if (referencedBundleContext === null) {
//                referencedBundleContext = new BundleContext(serviceComponent.bundle, serviceComponentOverviewContext)
//                serviceComponentOverviewContext.referencedBundleContexts.add(referencedBundleContext)
//            }
//            
//            val innerServiceComponentOverviewContext = referencedBundleContext.serviceComponentOverviewContext
//            if (!innerServiceComponentOverviewContext.expanded) {
//                innerServiceComponentOverviewContext.expanded = true
//                val nodes = actionContext.activeViewer.viewContext.getTargetElements(innerServiceComponentOverviewContext)
//                // TODO: search the component node relevant in this context.
//                // FIXME: The tracer is broken for this kind of synthesis. Only if that is fixed this manual expansion
//                // will work.
//                actionContext.activeViewer.toggleExpansion(nodes.head)
////                actionContext.KNode.setProperty(KlighdProperties.EXPAND, true)
//            }
//            var implementingServiceComponentContextInBundles = innerServiceComponentOverviewContext
//                .childContexts.findFirst [
//                    modelElement === serviceComponent
//                ] as IVisualizationContext<ServiceComponent>
//            if (implementingServiceComponentContextInBundles === null) {
//                throw new IllegalStateException("The bundle context does not contain all its service components as "
//                    + "own contexts!")
//            }
//            ContextUtils.makeDetailed(innerServiceComponentOverviewContext,
//                implementingServiceComponentContextInBundles)
//            ContextUtils.addImplementingServiceComponentEdgeInBundle(serviceInterfaceContext,
//                implementingServiceComponentContextInBundles as ServiceComponentContext)
//        ]
//    }
    
}
