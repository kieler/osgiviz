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
package de.cau.cs.kieler.osgiviz.context

import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.PackageObject
import de.scheidtbachmann.osgimodel.Product
import de.scheidtbachmann.osgimodel.Reference
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * Util class that contains some static methods commonly used in the OSGi synthesis for modifying the visualization
 * context.
 * 
 * @author nre
 */
class ContextUtils {
    
    /**
     * Returns true if {@code childContext} is a child visualization context contained in the {@code rootContext} or the
     * contexts are equal.
     * Uses the {@link IVisualizationContext#getParentVisualizationContext()} to find out if it is contained.
     * 
     * @param rootContext The root context that may contain the child context.
     * @param childContext The child context that should be checked if it is contained in the rootContext.
     * @return If {@code rootContext} is a parent of {@code childContext}.
     */
    def static boolean isChildContextOrEqual(IVisualizationContext<?> rootContext, IVisualizationContext<?> childContext) {
        if (rootContext === childContext) {
            return true
        }
        var currentContext = childContext
        while(currentContext !== null) {
            if (currentContext === rootContext) {
                return true
            }
            currentContext = currentContext.parentVisualizationContext
        }
        return false
    }
    
    /**
     * Removes all edges incident to the context.
     * 
     * @param overviewContext The overview context containing the edge.
     * @param context The context of that all incoming or outgoing edges should be removed (not internal ones).
     */
    def dispatch static void removeEdges(BundleOverviewContext overviewContext, BundleContext context) {
        val requiredBundlesView = overviewContext.requiredBundleEdges.clone
        requiredBundlesView.forEach [
            if (key === context || value === context) {
                overviewContext.requiredBundleEdges.remove(it)
                key.allRequiredBundlesShown = false
                value.allRequiringBundlesShown = false
            }
        ]
        val usedPackagesOfBundleView = overviewContext.usedPackagesOfBundleEdges.clone
        usedPackagesOfBundleView.forEach [
            if (sourceBundleContext === context || targetBundleContext === context) {
                overviewContext.usedPackagesOfBundleEdges.remove(it)
                sourceBundleContext.allUsedPackagesShown = false
            }
        ]
        val usedPackagesView = overviewContext.usedPackageEdges.clone
        usedPackagesView.forEach [
            if (key === context) {
                overviewContext.usedPackageEdges.remove(it)
                key.allUsedPackagesShown = false
            }
        ]
    }
    
    def dispatch static void removeEdges(BundleOverviewContext overviewContext, PackageObjectContext context) {
        val usedPackagesView = overviewContext.usedPackageEdges.clone
        usedPackagesView.forEach [
            if (value === context) {
                overviewContext.usedPackageContexts.remove(it)
                key.allUsedPackagesShown = false
            }
        ]
    }
    
    def dispatch static void removeEdges(ProductOverviewContext overviewContext, ProductContext context) {
        // There are no edges in product overview contexts. So do nothing.
    }
    
    def dispatch static void removeEdges(BundleCategoryOverviewContext overviewContext, BundleCategoryContext context) {
        // There are no edges in bundle category overview contexts. So do nothing.
    }
    
    def dispatch static void removeEdges(FeatureOverviewContext overviewContext, FeatureContext context) {
        // There are no edges in feature overview contexts. So do nothing.
    }
    
    def dispatch static void removeEdges(PackageObjectOverviewContext overviewContext, PackageObjectContext context) {
        // There are no edges in package object overview contexts. So do nothing.
    }
    
    def dispatch static void removeEdges(ServiceOverviewContext overviewContext, EclipseInjectionContext context) {
        // IN_BUNDLES variant:
        // There could be edges from this EI context to the parent's parent's parent service overview context,
        // if it is in the correct hierarchy for that.
        val potentialBundleContext = overviewContext.parentVisualizationContext
        if (potentialBundleContext instanceof BundleContext) {
            val potentialServiceConnectionHolder = potentialBundleContext.parentVisualizationContext
            if (potentialServiceConnectionHolder instanceof ServiceOverviewContext) {
                // We are in the correct hierarchy, this overviewContext may contain edges to this EI context.
                val connectionHolder = potentialServiceConnectionHolder as ServiceOverviewContext
                val injectedInterfaceEdges = connectionHolder.injectedInterfaceEdgesInBundles.clone
                injectedInterfaceEdges.forEach [
                    if (it.key === context) {
                        connectionHolder.injectedInterfaceEdgesInBundles.remove(it)
                        // TODO: set all shown to false.
                    }
                ]
            }
        }
        
        // PLAIN variant:
        // There could also be edges within this overviewContext in a PLAIN fashion.
        val injectedInterfaceEdges = overviewContext.injectedInterfaceEdgesPlain.clone
        injectedInterfaceEdges.forEach [
            if (key === context) {
                overviewContext.injectedInterfaceEdgesPlain.remove(it)
                // TODO: set all shown to false.
            }
        ]
    }
    
    def dispatch static void removeEdges(ServiceOverviewContext overviewContext, ServiceComponentContext context) {
        // IN_BUNDLES variant:
        // There could be edges from this SC context to the parent's parent's parent service overview context,
        // if it is in the correct hierarchy for that.
        val potentialBundleContext = overviewContext.parentVisualizationContext
        if (potentialBundleContext instanceof BundleContext) {
            val potentialServiceConnectionHolder = potentialBundleContext.parentVisualizationContext
            if (potentialServiceConnectionHolder instanceof ServiceOverviewContext) {
                // We are in the correct hierarchy, this overviewContext may contain edges to this SC context.
                val connectionHolder = potentialServiceConnectionHolder as ServiceOverviewContext
                val implementedInderfaceEdges = connectionHolder.implementedInterfaceEdgesInBundles.clone
                implementedInderfaceEdges.forEach [
                    if (key === context) {
                        connectionHolder.implementedInterfaceEdgesInBundles.remove(it)
                        key.allImplementedInterfacesShownInBundles = false
                        value.allImplementingComponentsShownInBundles = false
                    }
                ]
                val referencedInterfaceEdges = connectionHolder.referencedInterfaceEdgesInBundles.clone
                referencedInterfaceEdges.forEach [
                    if (it.serviceComponentContext === context) {
                        connectionHolder.referencedInterfaceEdgesInBundles.remove(it)
                        it.serviceComponentContext.allReferencedInterfacesShownInBundles = false
                        it.serviceInterfaceContext.allReferencingComponentsShownInBundles = false
                    }
                ]
            }
        }
        
        // PLAIN variant:
        // There could also be edges within this overviewContext in a PLAIN fashion.
        val implementedInterfaceEdges = overviewContext.implementedInterfaceEdgesPlain.clone
        implementedInterfaceEdges.forEach [
            if (key === context) {
                overviewContext.implementedInterfaceEdgesPlain.remove(it)
                key.allImplementedInterfacesShownPlain = false
                value.allImplementingComponentsShownPlain = false
            }
        ]
        val referencedInterfaceEdges = overviewContext.referencedInterfaceEdgesPlain.clone
        referencedInterfaceEdges.forEach [
            if (it.serviceComponentContext === context) {
                overviewContext.referencedInterfaceEdgesPlain.remove(it)
                it.serviceComponentContext.allReferencedInterfacesShownPlain = false
                it.serviceInterfaceContext.allReferencingComponentsShownPlain = false
            }
        ]
    }
    
    def dispatch static void removeEdges(ServiceOverviewContext overviewContext, BundleContext context) {
        // This is only called in the IN_BUNDLES variant, as these edges in relation to service overview contexts are
        // not shown in the PLAIN variant.
        val implementedInterfaceEdges = overviewContext.implementedInterfaceEdgesInBundles.clone
        implementedInterfaceEdges.forEach [
            if (context.serviceOverviewContext.detailedServiceComponentContexts.contains(key)) {
                overviewContext.implementedInterfaceEdgesInBundles.remove(it)
                key.allImplementedInterfacesShownInBundles = false
                value.allImplementingComponentsShownInBundles = false
            }
        ]
        val referencedInterfaceEdges = overviewContext.referencedInterfaceEdgesInBundles.clone
        referencedInterfaceEdges.forEach [
            if (context.serviceOverviewContext.detailedServiceComponentContexts.contains(it.serviceComponentContext)) {
                overviewContext.referencedInterfaceEdgesInBundles.remove(it)
                it.serviceComponentContext.allReferencedInterfacesShownInBundles = false
                it.serviceInterfaceContext.allReferencingComponentsShownInBundles = false
            }
        ]
        val injectedInterfaceEdges = overviewContext.injectedInterfaceEdgesInBundles.clone
        injectedInterfaceEdges.forEach [
            if (context.serviceOverviewContext.detailedEclipseInjectionContexts.contains(key)) {
                overviewContext.injectedInterfaceEdgesInBundles.remove(it)
                // TODO: set all shown to false.
            }
        ]
    }
    
    def dispatch static void removeEdges(ServiceOverviewContext overviewContext, ServiceInterfaceContext context) {
        // PLAIN variant.
        val implementedInterfaceEdgesPlain = overviewContext.implementedInterfaceEdgesPlain.clone
        implementedInterfaceEdgesPlain.forEach [
            if (value === context) {
                overviewContext.implementedInterfaceEdgesPlain.remove(it)
                key.allImplementedInterfacesShownPlain = false
                value.allImplementingComponentsShownPlain = false
            }
        ]
        val referencedInterfaceEdgesPlain = overviewContext.referencedInterfaceEdgesPlain.clone
        referencedInterfaceEdgesPlain.forEach [
            if (it.serviceInterfaceContext === context) {
                overviewContext.referencedInterfaceEdgesPlain.remove(it)
                it.serviceComponentContext.allReferencedInterfacesShownPlain = false
                it.serviceInterfaceContext.allReferencingComponentsShownPlain = false
            }
        ]
        val injectedInterfaceEdgesPlain = overviewContext.injectedInterfaceEdgesPlain.clone
        injectedInterfaceEdgesPlain.forEach [
            if (it.value === context) {
                overviewContext.injectedInterfaceEdgesPlain.remove(it)
                // TODO: set all shown to false.
            }
        ]
        
        // IN_BUNDLES variant:
        val implementedInterfaceEdgesInBundles = overviewContext.implementedInterfaceEdgesInBundles?.clone
        implementedInterfaceEdgesInBundles?.forEach [
            if (value === context) {
                overviewContext.implementedInterfaceEdgesInBundles.remove(it)
                key.allImplementedInterfacesShownInBundles = false
                value.allImplementingComponentsShownInBundles = false
            }
        ]
        val referencedInterfaceEdgesInBundles = overviewContext.referencedInterfaceEdgesInBundles?.clone
        referencedInterfaceEdgesInBundles?.forEach [
            if (it.serviceInterfaceContext === context) {
                overviewContext.referencedInterfaceEdgesInBundles.remove(it)
                it.serviceComponentContext.allReferencedInterfacesShownInBundles = false
                it.serviceInterfaceContext.allReferencingComponentsShownInBundles = false
            }
        ]
        val injectedInterfaceEdgesInBundles = overviewContext.injectedInterfaceEdgesInBundles?.clone
        injectedInterfaceEdgesInBundles?.forEach [
            if (it.value === context) {
                overviewContext.injectedInterfaceEdgesInBundles.remove(it)
                // TODO: set all shown to false.
            }
        ]
    }
    
    /**
     * Adds a required bundle edge to the parent bundle overview context of the two given contexts.
     * The direction of the edge indicates that the bundle of the {@code requiringContext} requires the bundle of the
     * {@code requiredContext}.
     * [requiring] ---requires---> [required]
     * 
     * @param requiringContext The bundle context with the bundle requiring the other bundle.
     * @param requiredContext The bundle context with the bundle required by the other bundle.
     */
    def static void addRequiredBundleEdge(BundleContext requiringContext, BundleContext requiredContext) {
        val parentContext = requiringContext.parentVisualizationContext as BundleOverviewContext
        if (requiredContext.parentVisualizationContext !== parentContext) {
            throw new IllegalArgumentException("The requiring and the required context both have to have the same " +
                "parent context!")
        }
        // Only if this edge does not exist yet, add it to the list of required bundle edges.
        if (!parentContext.requiredBundleEdges.exists [ key === requiringContext && value === requiredContext ]) {
            parentContext.requiredBundleEdges += requiringContext -> requiredContext
            
            // Check for both the requiring bundle and the required bundle if all connections are now shown in the 
            // parent context. If they are, remember it in the corresponding bundle context.
            // Requiring context:
            if (requiringContext.modelElement.requiredBundles.forall [ requiredBundle |
                !parentContext.modelElement.contains(requiredBundle) ||
                parentContext.requiredBundleEdges.exists [ key === requiringContext && value.modelElement === requiredBundle ]
            ]) {
                requiringContext.allRequiredBundlesShown = true
            }
            // Required context:
            if (requiredContext.modelElement.usedByBundle.forall [ requiringBundle |
                !parentContext.modelElement.contains(requiringBundle) ||
                parentContext.requiredBundleEdges.exists [ key.modelElement === requiringBundle && value === requiredContext ]
            ]) {
                requiredContext.allRequiringBundlesShown = true
            }
        }
    }
    
    /**
     * Removes a required bundle edge of the parent bundle overview context of the two given contexts.
     * 
     * @param requiringContext The bundle context with the bundle requiring the other bundle.
     * @param requiredContext The bundle context with the bundle required by the other bundle.
     */
    def static removeRequiredBundleEdge(BundleContext requiringContext, BundleContext requiredContext) {
        val parentContext = requiringContext.parentVisualizationContext as BundleOverviewContext
        if (requiredContext.parentVisualizationContext !== parentContext) {
            throw new IllegalArgumentException("The requiring and the required context both have to have the same " +
                "parent context!")
        }
        parentContext.requiredBundleEdges.removeIf [ key === requiringContext && value === requiredContext ]
        
        // Mark for both the requiring bundle and the required bundle that not all connections are shown in the 
        // parent context anymore. Remember that in the corresponding bundle context.
        requiringContext.allRequiredBundlesShown = false
        requiredContext.allRequiringBundlesShown = false
    }
    
    /**
     * Adds a new edge to the parent bundle context of the source- and target bundle context that indicates which
     * packages are used by a bundle and by which bundle they are provided in the given product context.
     * 
     * @param sourceBundleContext The bundle context where the edge starts.
     * @param usedPackages The packages required by the source bundle and provided by the target bundle.
     * @param product The product in that this relation holds. May be null, if this is provided by no product.
     * @param targetBundleContext The bundle context where the edge ends.
     */
    def static void addUsedPackagesEdge(BundleContext sourceBundleContext, List<PackageObject> usedPackages,
        Product product, BundleContext targetBundleContext) {
        val parentContext = sourceBundleContext.parentVisualizationContext as BundleOverviewContext
        if (targetBundleContext.parentVisualizationContext !== parentContext) {
            throw new IllegalArgumentException("The source and target bundle contexts both have to have the same " +
                "parent context!")
        }
        // Only if this edge does not exist yet, add it to the list of used packages edges.
        if (!parentContext.usedPackagesOfBundleEdges.exists [
            it.sourceBundleContext === sourceBundleContext &&
            it.product === product &&
            it.targetBundleContext === targetBundleContext
        ]) {
            parentContext.usedPackagesOfBundleEdges += new UsedPackagesOfBundleEdgeConnection(sourceBundleContext,
                usedPackages, product, targetBundleContext)
        }
    }
    
    /**
     * Adds a new edge to the parent bundle context of the bundle- and package context that shows a used package
     * connection.
     * 
     * @param bundleContext The bundle context where the edge starts. It represents the bundle requiring the package.
     * @param packageContext The package context where the edge ends. It represents the package required by the bundle.
     */
    def static void addUsedPackageEdge(BundleContext bundleContext, PackageObjectContext packageContext) {
        val parentContext = bundleContext.parentVisualizationContext as BundleOverviewContext
        if (packageContext.parentVisualizationContext !== parentContext) {
            throw new IllegalArgumentException("The bundle- and package contexts both have to have the same " +
                "parent context!")
        }
        // Only if this edge does not exist yet, add it to the list of used packages edges.
        if (!parentContext.usedPackageEdges.exists [
            key === bundleContext && value === packageContext
        ]) {
            parentContext.usedPackageEdges += bundleContext -> packageContext
        }
    }
    
    /**
     * Determines whether all edges are displayed that could be connected to the clicked port.
     * 
     * @param clickedContext The context for that should be checked, if all element representations are connected to it.
     * @param possiblyConnectedContexts The list of elements that could be connected.
     * @param overviewContext The parent context in which the connection status should be checked.
     * @param isSource If the {@code clickedContext} should be checked if it is the source or the target in the
     * potential connection.
     */
    def static boolean allConnected(IVisualizationContext<Bundle> clickedContext, List<? extends IVisualizationContext<Bundle>> possiblyConnectedContexts,
        BundleOverviewContext overviewContext, boolean isSource) {
        val conntectedContexts = if (isSource) {
            overviewContext.requiredBundleEdges.filter [ requiredBundleEdge |
                requiredBundleEdge.key === clickedContext
            ].map[it.value].toList
        } else {
            overviewContext.requiredBundleEdges.filter [ requiredBundleEdge |
                requiredBundleEdge.value === clickedContext
            ].map[it.key].toList
        }
        
        return possiblyConnectedContexts.size === conntectedContexts.size &&
            possiblyConnectedContexts.containsAll(conntectedContexts)
    }
    
    final static String DIFFERENT_PARENT_ERROR_MSG = "The element contexts both have to have the same parent context!"
    
    /**
     * Adds a implementing service component edge to the parent service context of the two given contexts.
     * The direction of the edge indicates that the service interface of the {@code serviceInterfaceContext} is
     * implemented by the service component of the {@code serviceComponentContext}.
     * [component] ---implements---|> [interface]
     * 
     * @param serviceInterfaceContext The service interface context that gets implemented.
     * @param serviceComponentContext The service component context that is implementing.
     */
    def static void addImplementingServiceComponentEdgePlain(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentContext serviceComponentContext) {
        val parentContext = serviceInterfaceContext.parentVisualizationContext as ServiceOverviewContext
        if (serviceComponentContext.parentVisualizationContext !== parentContext) {
            throw new IllegalArgumentException(DIFFERENT_PARENT_ERROR_MSG)
        }
        val implementedInterfaceEdgesPlain = parentContext.implementedInterfaceEdgesPlain
        
        // Only if this edge does not exist yet, add it to the list of implementing service component edges.
        if (!implementedInterfaceEdgesPlain.exists [
            key === serviceComponentContext && value === serviceInterfaceContext
        ]) {
            implementedInterfaceEdgesPlain += serviceComponentContext -> serviceInterfaceContext
            // Check if all components are connected and mark that in the context.
            if (serviceInterfaceContext.modelElement.serviceComponent.forall [ implementingComponent |
                implementedInterfaceEdgesPlain.exists [
                    key.modelElement === implementingComponent && value == serviceInterfaceContext
                ]
            ]) {
                serviceInterfaceContext.allImplementingComponentsShownPlain = true
            }
            // Check if all interfaces are connected and mark that in the context.
            if (serviceComponentContext.modelElement.serviceInterfaces.forall [ implementedInterface |
                implementedInterfaceEdgesPlain.exists [
                    key === serviceComponentContext && value.modelElement === implementedInterface
                ]
            ]) {
                serviceComponentContext.allImplementedInterfacesShownPlain = true
            }
        }
    }
    
    /**
     * Adds a implementing service component edge to the parent ServiceOverviewContext of the two given contexts.
     * The direction of the edge indicates that the service interface of the {@code serviceInterfaceContext} is
     * implemented by the service component of the {@code serviceComponentContext}.
     * [component] ---implements---|> [interface]
     * 
     * @param serviceInterfaceContext The service interface context that gets implemented.
     * @param serviceComponentContext The service component context that is implementing. Is not directly contained in
     * a common parent service interface context, but in a hierarchy of a service component and bundle context first.
     */
    def static void addImplementingServiceComponentEdgeInBundle(ServiceInterfaceContext serviceInterfaceContext,
        ServiceComponentContext serviceComponentContext) {
        val parentContext = serviceInterfaceContext.parentVisualizationContext as ServiceOverviewContext
        // The serviceComponent should be in the hierarchy as in:
        // SOCtx->BundleCtx->SOCtx->SCCtx
        if (serviceComponentContext.parentVisualizationContext.parentVisualizationContext.parentVisualizationContext
            !== parentContext) {
            throw new IllegalArgumentException("The interface and the component contexts are not in the correct "
                + "context hierarchy!")
        }
        // Only if this edge does not exist yet, add it to the list of implementing service component edges.
        if (!parentContext.implementedInterfaceEdgesInBundles.exists [
            key === serviceComponentContext && value === serviceInterfaceContext
        ]) {
            parentContext.implementedInterfaceEdgesInBundles += serviceComponentContext -> serviceInterfaceContext
            // Check if all components are connected and mark that in the context.
            if (serviceInterfaceContext.modelElement.serviceComponent.forall [ implementingComponent |
                parentContext.implementedInterfaceEdgesInBundles.exists [
                    key.modelElement === implementingComponent && value == serviceInterfaceContext
                ]
            ]) {
                serviceInterfaceContext.allImplementingComponentsShownInBundles = true
            }
            // Check if all interfaces are connected and mark that in the context.
            if (serviceComponentContext.modelElement.serviceInterfaces.forall [ implementedInterface |
                parentContext.implementedInterfaceEdgesInBundles.exists [
                    key === serviceComponentContext && value.modelElement === implementedInterface
                ]
            ]) {
                serviceComponentContext.allImplementedInterfacesShownInBundles = true
            }
        }
    }
    
    /**
     * Adds a referenced service interface edge to the parent service context of the two given contexts.
     * The direction of the edge indicates that the service interface of the {@code serviceInterfaceContext} is
     * referenced by the service component of the {@code serviceComponentContext}.
     * 
     * @param serviceComponentContext The service component context that references.
     * @param serviceInterfaceContext The service interface context that is referenced.
     * @param reference The additional data for the reference.
     */
    def static void addReferencedServiceInterfaceEdgePlain(ServiceComponentContext serviceComponentContext,
        ServiceInterfaceContext serviceInterfaceContext, Reference reference) {
        val parentContext = serviceInterfaceContext.parentVisualizationContext as ServiceOverviewContext
        if (serviceComponentContext.parentVisualizationContext !== parentContext) {
            throw new IllegalArgumentException(DIFFERENT_PARENT_ERROR_MSG)
        }
        val referencedComponentEdgesPlain = parentContext.referencedInterfaceEdgesPlain
        
        // Only if this edge does not exist yet, add it to the list of referenced service component edges.
        if (!referencedComponentEdgesPlain.exists [
            it.serviceInterfaceContext === serviceInterfaceContext &&
            it.serviceComponentContext === serviceComponentContext &&
            it.reference === reference
        ]) {
            referencedComponentEdgesPlain += new ReferencedInterfaceEdgeConnection(serviceComponentContext,
                serviceInterfaceContext, reference)
            // Check if all interfaces are connected and mark that in the context.
            if (serviceComponentContext.modelElement.reference.forall [ theReference |
                referencedComponentEdgesPlain.exists [
                    it.serviceComponentContext === serviceComponentContext &&
                    it.serviceInterfaceContext.modelElement === theReference.serviceInterface &&
                    it.reference === theReference
                ]
            ]) {
                serviceComponentContext.allReferencedInterfacesShownPlain = true
            }
            // Check if all components are connected and mark that in the context.
            if (serviceInterfaceContext.modelElement.referencedBy.forall [ theReference |
                referencedComponentEdgesPlain.exists [
                    it.serviceComponentContext.modelElement === theReference.eContainer &&
                    it.serviceInterfaceContext === serviceInterfaceContext &&
                    it.reference === theReference
                ]
            ]) {
                serviceInterfaceContext.allReferencingComponentsShownPlain = true
            }
        }
    }
    
    /**
     * Adds a referenced service interface edge to the parent ServiceOverviewContext of the two given contexts.
     * The direction of the edge indicates that the service interface of the {@code serviceInterfaceContext} is
     * referenced by the service component of the {@code serviceComponentContext}.
     * 
     * @param serviceComponentContext The service component context that is referencing. Is not directly contained in
     * a common parent service interface context, but in a hierarchy of a service component and bundle context first.
     * @param serviceInterfaceContext The service interface context that is referenced.
     * @param refrence The additional data for the reference.
     */
    def static void addReferencedServiceInterfaceEdgeInBundle(ServiceComponentContext serviceComponentContext,
        ServiceInterfaceContext serviceInterfaceContext, Reference reference) {
        val parentContext = serviceInterfaceContext.parentVisualizationContext as ServiceOverviewContext
        // The serviceComponent should be in the hierarchy as in:
        // SOCtx->BundleCtx->SOCtx->SCCtx
        if (serviceComponentContext.parentVisualizationContext.parentVisualizationContext.parentVisualizationContext
            !== parentContext) {
            throw new IllegalArgumentException("The interface and the component contexts are not in the correct "
                + "context hierarchy!")
        }
        // Only if this edge does not exist yet, add it to the list of implementing service component edges.
        if (!parentContext.referencedInterfaceEdgesInBundles.exists [
            it.serviceComponentContext === serviceComponentContext &&
            it.serviceInterfaceContext === serviceInterfaceContext &&
            it.reference === reference
        ]) {
            parentContext.referencedInterfaceEdgesInBundles += new ReferencedInterfaceEdgeConnection(
                serviceComponentContext, serviceInterfaceContext, reference)
            // Check if all interfaces are connected and mark that in the context.
            if (serviceComponentContext.modelElement.reference.forall [ theReference |
                parentContext.referencedInterfaceEdgesInBundles.exists [
                    it.serviceComponentContext === serviceComponentContext &&
                    it.serviceInterfaceContext.modelElement === theReference.serviceInterface &&
                    it.reference === theReference
                ]
            ]) {
                serviceComponentContext.allReferencedInterfacesShownInBundles = true
            }
            // Check if all components are connected and mark that in the context.
            if (serviceInterfaceContext.modelElement.referencedBy.forall [ theReference |
                parentContext.referencedInterfaceEdgesInBundles.exists [
                    it.serviceComponentContext.modelElement === theReference.eContainer &&
                    it.serviceInterfaceContext === serviceInterfaceContext &&
                    it.reference === theReference
                ]
            ]) {
                serviceInterfaceContext.allReferencingComponentsShownInBundles = true
            }
        }
    }
    
    /**
     * Adds an injected service interface edge to the parent service overview context.
     * The direction of the edge indicates that the service interface of the {@code serviceInterfaceContext} is
     * injected by the class represented by the {@code eclipseInjectionContext}.
     * 
     * @param eclipseInjectionContext The eclipse injection context for the injection.
     * @param serviceInterfaceContext The service interface context that is injected.
     */
    def static void addInjectedServiceInterfaceEdgePlain(EclipseInjectionContext eclipseInjectionContext,
        ServiceInterfaceContext serviceInterfaceContext) {
        val parentContext = eclipseInjectionContext.parentVisualizationContext as ServiceOverviewContext
        if (serviceInterfaceContext.parentVisualizationContext !== parentContext) {
            throw new IllegalArgumentException(DIFFERENT_PARENT_ERROR_MSG)
        }
        val injectedInterfaceEdges = parentContext.injectedInterfaceEdgesPlain
        
        // Only if this edge does not exist yet, add it to the list of referenced service component edges.
        if (!injectedInterfaceEdges.exists [
            key === eclipseInjectionContext &&
            value === serviceInterfaceContext
        ]) {
            injectedInterfaceEdges += eclipseInjectionContext -> serviceInterfaceContext
            // TODO: Check if all injections are connected and mark that in the context.
        }
    }
    
    /**
     * Adds an injected service interface edge to the parent ServiceOverviewContext of the two given contexts.
     * The direction of the edge indicates that the service interface of the {@code serviceInterfaceContext} is
     * injected by the class represented by the {@code eclipseInjectionContext}.
     * 
     * @param eclipseInjectionContext The eclipse injection context for the injection. Is not directly contained in
     * a common parent service context, but in a hierarchy of a service and bundle context first.
     * @param serviceInterfaceContext The service interface context that is injected.
     */
    def static void addInjectedServiceInterfaceEdgeInBundle(EclipseInjectionContext eclipseInjectionContext,
        ServiceInterfaceContext serviceInterfaceContext) {
        val parentContext = serviceInterfaceContext.parentVisualizationContext as ServiceOverviewContext
        // The eclipseInjection should be in the hierarchy as in:
        // SOCtx->BundleCtx->SOCtx->EICtx
        if (eclipseInjectionContext.parentVisualizationContext.parentVisualizationContext.parentVisualizationContext
            !== parentContext) {
            throw new IllegalArgumentException("The injection and the interface contexts are not in the correct "
                + "context hierarchy!")
        }
        // Only if this edge does not exist yet, add it to the list of injectied service interface edges.
        if (!parentContext.injectedInterfaceEdgesInBundles.exists [
            key === eclipseInjectionContext && value === serviceInterfaceContext
        ]) {
            parentContext.injectedInterfaceEdgesInBundles += eclipseInjectionContext -> serviceInterfaceContext
            // TODO: Check if all injections are connected and mark that in the context.
        }
    }
    
    /**
     * Determines whether the {@code project} is the root model this {@code context} comes from.
     * 
     * @param context The visualization context in question.
     * @param project The potential root model.
     * @return If the context comes from the project.
     */
    def static boolean isRootModel(IVisualizationContext<?> context, OsgiProject project) {
        var IVisualizationContext<?> currentContext = context
        while(currentContext.parentVisualizationContext !== null) {
            currentContext = currentContext.parentVisualizationContext
        }
        
        if (currentContext instanceof OsgiProjectContext) {
            return currentContext.modelElement === project
        } else {
            // If the parent hierarchy on the context does end in an OsgiProjectContext, it was lost in some focus
            // action. But that also indicates that the root model has not changed and this context has to come from
            // that.
            return true
        }
    }
    
}
