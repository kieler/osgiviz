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
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.scheidtbachmann.osgimodel.util.ModelUtils

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Puts the service components referenced by this service interface next to this service interface and connects them 
 * with an edge from this service interface's 'referencingServiceInterfaces' port to the new service component.
 * 
 * @author nre
 */
class RevealReferencingServiceComponentsAction extends AbstractRevealServiceComponentsAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealReferencingServiceComponentsAction.name
    
    override revealInServiceOverview(IVisualizationContext<?> elementContext,
        ServiceOverviewContext serviceOverviewContext) {
        val serviceInterfaceContext = elementContext as ServiceInterfaceContext
        val serviceInterface = serviceInterfaceContext.modelElement
        // ----- Find the service components in the context for the PLAIN view -----
        
        // The service components that are yet collapsed need to need to be expanded first.
        val filteredReferences = serviceInterface.referencedBy.filter [
            // Only the references whose containing component are in the overview.
            serviceOverviewContext.modelElements.contains(ModelUtils.serviceComponentOf(it))
        ]
        filteredReferences.forEach [ reference |
            val serviceComponent = ModelUtils.serviceComponentOf(reference)
            val collapsedServiceComponentContext = serviceOverviewContext.collapsedServiceComponentContexts.findFirst [
                return it.modelElement === serviceComponent
            ]
            if (collapsedServiceComponentContext !== null) {
                serviceOverviewContext.makeDetailed(collapsedServiceComponentContext)
            }
            val referencingServiceComponentContext = serviceOverviewContext.detailedServiceComponentContexts.findFirst [
                return it.modelElement === serviceComponent
            ]
            referencingServiceComponentContext.addReferencedServiceInterfaceEdgePlain(serviceInterfaceContext, reference)
        ]
        
        // ----- Put the service components and the bundles in the context for the IN_BUNDLES view. -----
        
        filteredReferences.forEach [ reference |
            val serviceComponent = ModelUtils.serviceComponentOf(reference)
            
            // Find the bundle context that should be containing the dual view on this service component.
            var referencedBundleContext = serviceOverviewContext.detailedReferencedBundleContexts.findFirst [
                return it.modelElement === serviceComponent.bundle
            ]
            if (referencedBundleContext === null) {
               referencedBundleContext = serviceOverviewContext.collapsedReferencedBundleContexts.findFirst [
                   return modelElement === serviceComponent.bundle
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
            serviceComponentContextInBundle.addReferencedServiceInterfaceEdgeInBundle(serviceInterfaceContext, reference)
        ]
    }
    
    override revealInIndependentBundle(IVisualizationContext<?> elementContext,
        ServiceOverviewContext serviceOverviewContext) {
        val serviceInterfaceContext = elementContext as ServiceInterfaceContext
        val serviceInterface = serviceInterfaceContext.modelElement
        
        // Expand the contexts of the referencing components in the overview.
        serviceInterface.referencedBy.forEach [ reference |
            val serviceComponent = ModelUtils.serviceComponentOf(reference)
            // Make it detailed if it is not already.
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
                serviceComponentContext.addReferencedServiceInterfaceEdgePlain(serviceInterfaceContext, reference)
            }
        ]
    }
    
//    override revealInProduct(ServiceInterfaceContext serviceInterfaceContext,
//        ServiceOverviewContext serviceComponentOverviewContext, ActionContext actionContext) {
//        val serviceInterface = serviceInterfaceContext.modelElement
//        val filteredReferences = serviceInterface.referencedBy.filter [
//            // Only the references whose containing component are in the overview.
//            serviceComponentOverviewContext.modelElements.contains(eContainer)
//        ]
//        
//        filteredReferences.forEach [ reference |
//            val serviceComponent = reference.eContainer as ServiceComponent
//            // ----- Expand the service components in the context for the PLAIN view. -----
//            var referencingServiceComponentContextPlain = serviceComponentOverviewContext.childContexts.findFirst [
//                modelElement === serviceComponent
//            ] as IVisualizationContext<ServiceComponent>
//            ContextUtils.makeDetailed(serviceComponentOverviewContext, referencingServiceComponentContextPlain)
//            ContextUtils.addReferencedServiceInterfaceEdgePlain(
//                referencingServiceComponentContextPlain as ServiceComponentContext, serviceInterfaceContext, reference)
//            
//            // ----- Put the service components and the bundles in the context for the IN_BUNDLES view. -----
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
//            
//            var referencingServiceComponentContextInBundles = innerServiceComponentOverviewContext.childContexts
//                .findFirst [
//                    modelElement === serviceComponent
//                ] as IVisualizationContext<ServiceComponent>
//            if (referencingServiceComponentContextInBundles === null) {
//                throw new IllegalStateException("The bundle context does not contain all its service components as "
//                    + "own contexts!")
//            }
//            ContextUtils.makeDetailed(innerServiceComponentOverviewContext,
//                referencingServiceComponentContextInBundles)
//            ContextUtils.addReferencedServiceInterfaceEdgeInBundle(
//                referencingServiceComponentContextInBundles as ServiceComponentContext, serviceInterfaceContext,
//                reference)
//        ]
//    }
    
}
