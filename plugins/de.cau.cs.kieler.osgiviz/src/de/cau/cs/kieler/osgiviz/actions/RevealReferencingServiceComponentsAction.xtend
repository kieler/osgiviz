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
 * Puts the service components referenced by this service interface next to this service interface and connects them 
 * with an edge from this service interface's 'referencingServiceInterfaces' port to the new service interface.
 * 
 * @author nre
 */
class RevealReferencingServiceComponentsAction extends AbstractRevealServiceComponentsAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealReferencingServiceComponentsAction.name
    
    override revealInInterfaceOverview(ServiceInterfaceContext serviceInterfaceContext,
        ServiceInterfaceOverviewContext serviceInterfaceOverviewContext) {
        val serviceInterface = serviceInterfaceContext.modelElement
        // ----- Put the service components in the context for the PLAIN view -----
        
        // The service components that are not already represented in the overview need to be put in first.
        serviceInterface.referencedBy.forEach [ reference |
            // Components are always the container of references in the EObject containment.
            val serviceComponent = reference.eContainer as ServiceComponent
            var referencingServiceComponentContext = serviceInterfaceOverviewContext
                .implementingOrReferencingServiceComponentContexts.findFirst [
                    return it.modelElement === serviceComponent
                ]
            if (referencingServiceComponentContext === null) {
                referencingServiceComponentContext = new ServiceComponentContext(serviceComponent,
                    serviceInterfaceOverviewContext)
                serviceInterfaceOverviewContext.implementingOrReferencingServiceComponentContexts
                    .add(referencingServiceComponentContext)
            }
            ContextUtils.addReferencedServiceInterfaceEdgePlain(referencingServiceComponentContext,
                serviceInterfaceContext, reference)
        ]
        
        // ----- Put the service components and the bundles in the context for the IN_BUNDLES view. -----
        
        serviceInterface.referencedBy.forEach [ reference |
            val serviceComponent = reference.eContainer as ServiceComponent
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
            var referencingServiceComponentContext = serviceComponentOverviewContext.childContexts.findFirst [
                return it.modelElement === serviceComponent
            ] as IVisualizationContext<ServiceComponent>
            if (referencingServiceComponentContext === null) {
                throw new IllegalStateException("The bundle context does not contain all its service components as "
                    + "own contexts!")
            }
            ContextUtils.makeDetailed(serviceComponentOverviewContext, referencingServiceComponentContext)
            ContextUtils.addReferencedServiceInterfaceEdgeInBundle(
                referencingServiceComponentContext as ServiceComponentContext, serviceInterfaceContext, reference)
        ]
    }
    
    override revealInIndependentBundle(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext) {
        val serviceInterface = serviceInterfaceContext.modelElement
        
        // Expand the contexts of the referencing components in the overview.
        serviceInterface.referencedBy.forEach [ reference |
            // Components are always the container of references in the EObject containment.
            val serviceComponent = reference.eContainer as ServiceComponent
            // Make it detailed if it is not already.
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
                ContextUtils.addReferencedServiceInterfaceEdgePlain(serviceComponentContext, serviceInterfaceContext,
                    reference)
            }
        ]
    }
    
    override revealInProduct(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentOverviewContext serviceComponentOverviewContext, ActionContext actionContext) {
        val serviceInterface = serviceInterfaceContext.modelElement
        val filteredReferences = serviceInterface.referencedBy.filter [
            // Only the references whose containing component are in the overview.
            serviceComponentOverviewContext.modelElement.contains(eContainer)
        ]
        
        filteredReferences.forEach [ reference |
            val serviceComponent = reference.eContainer as ServiceComponent
            // ----- Expand the service components in the context for the PLAIN view. -----
            var referencingServiceComponentContextPlain = serviceComponentOverviewContext.childContexts.findFirst [
                modelElement === serviceComponent
            ] as IVisualizationContext<ServiceComponent>
            ContextUtils.makeDetailed(serviceComponentOverviewContext, referencingServiceComponentContextPlain)
            ContextUtils.addReferencedServiceInterfaceEdgePlain(
                referencingServiceComponentContextPlain as ServiceComponentContext, serviceInterfaceContext, reference)
            
            // ----- Put the service components and the bundles in the context for the IN_BUNDLES view. -----
            
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
            
            var referencingServiceComponentContextInBundles = innerServiceComponentOverviewContext.childContexts
                .findFirst [
                    modelElement === serviceComponent
                ] as IVisualizationContext<ServiceComponent>
            if (referencingServiceComponentContextInBundles === null) {
                throw new IllegalStateException("The bundle context does not contain all its service components as "
                    + "own contexts!")
            }
            ContextUtils.makeDetailed(innerServiceComponentOverviewContext,
                referencingServiceComponentContextInBundles)
            ContextUtils.addReferencedServiceInterfaceEdgeInBundle(
                referencingServiceComponentContextInBundles as ServiceComponentContext, serviceInterfaceContext,
                reference)
        ]
    }
    
}
