package de.cau.cs.kieler.osgiviz

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.Class
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.util.OsgivizmodelUtil
import de.scheidtbachmann.osgimodel.PackageObject
import de.scheidtbachmann.osgimodel.Reference
import de.scheidtbachmann.osgimodel.ServiceComponent
import de.scheidtbachmann.osgimodel.ServiceInterface
import de.scheidtbachmann.osgimodel.util.ModelUtils

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Helper class for the {@link OsgiVizSynthesis} that re-initializes a {@link OsgiViz} loaded from a file for that the
 * connected {@link OsgiProject} has changed. The main helper method {@link #reInitialize(OsgiViz)} handles this
 * possible mismatch between the visualization context and its model by creating a new visualization context that
 * connects to everything still matched in the OsgiProject while omitting and not connecting parts that are removed from
 * the model.
 * 
 * @author nre
 */
class VisualizationReInitializer {
    
    /**
     * Re-initializes a new visualization context to be as close as possible to the given old visualization context
     * while respecting the data given in the model element of the visualization.
     * To be executed if a loaded visualization context is to be displayed for that the underlying OSGi model may have
     * updated and references in the visualization context therefore may not be correct anymore.
     * 
     * @param oldViz The loaded visualization context to be replicated as best as possible with its contained model.
     * @returns A new visualization context matching the old one.
     */
    static def OsgiViz reInitialize(OsgiViz oldViz) {
        val newViz = OsgivizmodelUtil.createOsgiViz(oldViz.modelElement)
        // If the children of the old context have been initialized, initialize the new context as well and check
        // all children.
        if (oldViz.childrenInitialized) {
            newViz.initializeChildVisualizationContexts
            // First, reinitialize all child contexts to be the same as before.
            reInitialize(oldViz.bundleCategoryOverviewContext, newViz.bundleCategoryOverviewContext)
            reInitialize(oldViz.bundleOverviewContext, newViz.bundleOverviewContext)
            reInitialize(oldViz.featureOverviewContext, newViz.featureOverviewContext)
            reInitialize(oldViz.productOverviewContext, newViz.productOverviewContext)
            reInitialize(oldViz.serviceOverviewContext, newViz.serviceOverviewContext)
            // Only after all child contexts are as before, reconnect them as before.
            reConnect(oldViz.bundleCategoryOverviewContext, newViz.bundleCategoryOverviewContext)
            reConnect(oldViz.bundleOverviewContext, newViz.bundleOverviewContext)
            reConnect(oldViz.featureOverviewContext, newViz.featureOverviewContext)
            reConnect(oldViz.productOverviewContext, newViz.productOverviewContext)
            reConnect(oldViz.serviceOverviewContext, newViz.serviceOverviewContext)
        }
        
        return newViz
    }
    
    /**
     * Dispatch method to Re-initialize a given {@code newContext} with the state of detailed, expanded and revealed
     * elements from the {@code oldContext}. Every method re-initializes the given context and all children recursively.
     */
    private static dispatch def void reInitialize(BundleCategoryOverviewContext oldContext,
        BundleCategoryOverviewContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        // Restore the state of every element from the old context that also exists in the new model.
        for (detailed : oldContext.detailedBundleCategoryContexts) {
            val category = detailed.modelElement
            val newBcc = newContext.collapsedBundleCategoryContexts.findFirst [ category === it.modelElement ]
            if (newBcc !== null) {
                newContext.makeDetailed(newBcc)
            }
        }
        // Restore the expanded state.
        newContext.expanded = oldContext.expanded
        
        // Re-initialize all child contexts.
        reInitializeOverviewChildContexts(newContext, oldContext)
    }
    
    private static dispatch def void reInitialize(BundleOverviewContext oldContext, BundleOverviewContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        // Restore the state of every element from the old context that also exists in the new model.
        // Restore all bundles shown.
        for (detailed : oldContext.detailedBundleContexts) {
            val bundle = detailed.modelElement
            val newBundleContext = newContext.collapsedBundleContexts.findFirst [ bundle === it.modelElement ]
            if (newBundleContext !== null) {
                newContext.makeDetailed(newBundleContext)
            }
        }
        // Restore all package objects.
        val osgiModel = ModelUtils.parentProject(newContext.bundles.head)
        for (packageObjectContexts : oldContext.usedPackageContexts) {
            val packageObject = packageObjectContexts.modelElement
            if (osgiModel.importedPackages.contains(packageObject)) {
                val packageContext = OsgivizmodelUtil.createPackageObjectContext(packageObject, newContext)
                newContext.usedPackageContexts.add(packageContext)
            }
        }
        // Restore the expanded state.
        newContext.expanded = oldContext.expanded
        
        // Re-initialize all child contexts.
        reInitializeOverviewChildContexts(newContext, oldContext)
    }
    
    private static dispatch def void reInitialize(ServiceOverviewContext oldContext,
        ServiceOverviewContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        // Restore all service components shown.
        for (detailed : oldContext.detailedServiceComponentContexts) {
            val component = detailed.modelElement
            val newComponentContext = newContext.collapsedServiceComponentContexts.findFirst [ component === it.modelElement ]
            if (newComponentContext !== null) {
                newContext.makeDetailed(newComponentContext)
            }
        }
        // Restore all service interfaces shown.
        for (detailed : oldContext.detailedServiceInterfaceContexts) {
            val interface = detailed.modelElement
            val newInterfaceContext = newContext.collapsedServiceInterfaceContexts.findFirst [ interface === it.modelElement ]
            if (newInterfaceContext !== null) {
                newContext.makeDetailed(newInterfaceContext)
            }
        }
        // Restore all classes shown.
        for (detailed : oldContext.detailedClassContexts) {
            val class = detailed.modelElement
            val newClassContext = newContext.collapsedClassContexts.findFirst [ class === it.modelElement ]
            if (newClassContext !== null) {
                newContext.makeDetailed(newClassContext)
            }
        }
        // Restore all referred bundles shown.
        for (detailed : oldContext.detailedReferencedBundleContexts) {
            val reference = detailed.modelElement
            val newBundleContext = newContext.collapsedReferencedBundleContexts.findFirst [ reference === it.modelElement ]
            if (newBundleContext !== null) {
                newContext.makeDetailed(newBundleContext)
            }
        }
        // Restore the expanded state.
        newContext.expanded = oldContext.expanded
        
        newContext.allowInBundleConnections = oldContext.allowInBundleConnections
        
        // Re-initialize all child contexts.
        reInitializeOverviewChildContexts(newContext, oldContext)
        
        //TODO: what about the 'classes' and 'classesWithInjections' fields?
    }
    
    private static dispatch def void reInitialize(FeatureOverviewContext oldContext, FeatureOverviewContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        
        // Restore the state of every element from the old context that also exists in the new model.
        // Restore all bundles shown.
        for (detailed : oldContext.detailedFeatureContexts) {
            val feature = detailed.modelElement
            val newFeatureContext = newContext.collapsedFeatureContexts.findFirst [ feature === it.modelElement ]
            if (newFeatureContext !== null) {
                newContext.makeDetailed(newFeatureContext)
            }
        }
        
        // Restore the expanded state.
        newContext.expanded = oldContext.expanded
        
        // Re-initialize all child contexts.
        reInitializeOverviewChildContexts(newContext, oldContext)
    }
    
    private static dispatch def void reInitialize(ProductOverviewContext oldContext, ProductOverviewContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        
        // Restore the state of every element from the old context that also exists in the new model.
        // Restore all bundles shown.
        for (detailed : oldContext.detailedProductContexts) {
            val product = detailed.modelElement
            val newProductContext = newContext.collapsedProductContexts.findFirst [ product === it.modelElement ]
            if (newProductContext !== null) {
                newContext.makeDetailed(newProductContext)
            }
        }
        
        // Restore the expanded state.
        newContext.expanded = oldContext.expanded
        
        // Re-initialize all child contexts.
        reInitializeOverviewChildContexts(newContext, oldContext)
    }
    
    private static def void reInitializeOverviewChildContexts(IOverviewVisualizationContext<?> newOverview,
        IOverviewVisualizationContext<?> oldOverview) {
        if (newOverview.childrenInitialized) {
            for (childContext : oldOverview.childContexts) {
                val childElement = childContext.modelElement
                val newChildContext = newOverview.childContexts.findFirst [ childElement === it.modelElement ]
                if (newChildContext !== null) {
                    reInitialize(childContext, newChildContext)
                }
            }
        }
    }
    
    private static dispatch def void reInitialize(BundleCategoryContext oldContext, BundleCategoryContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        if (newContext.childrenInitialized) {
            // Restore the contained bundle overview context.
            reInitialize(oldContext.bundleOverviewContext, newContext.bundleOverviewContext)
        }
    }
    
    private static dispatch def void reInitialize(BundleContext oldContext, BundleContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        if (newContext.childrenInitialized) {
            // Restore the contained service overview context.
            reInitialize(oldContext.serviceOverviewContext, newContext.serviceOverviewContext)
        }
    }
    
    private static dispatch def void reInitialize(PackageObjectContext oldContext, PackageObjectContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
    }
    
    private static dispatch def void reInitialize(ServiceComponentContext oldContext,
        ServiceComponentContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
    }
    
    private static dispatch def void reInitialize(ServiceInterfaceContext oldContext,
        ServiceInterfaceContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
    }
    
    private static dispatch def void reInitialize(FeatureContext oldContext,
        FeatureContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        if (newContext.childrenInitialized) {
            // Restore the contained bundle overview context.
            reInitialize(oldContext.bundleOverviewContext, newContext.bundleOverviewContext)
        }
    }
    
    private static dispatch def void reInitialize(ProductContext oldContext,
        ProductContext newContext) {
        reInitializeChildContexts(oldContext, newContext)
        if (newContext.childrenInitialized) {
            // Restore the contained service, bundle, and feature overview contexts.
            reInitialize(oldContext.serviceOverviewContext, newContext.serviceOverviewContext)
            reInitialize(oldContext.bundleOverviewContext, newContext.bundleOverviewContext)
            reInitialize(oldContext.featureOverviewContext, newContext.featureOverviewContext)
        }
    }
    
    private static dispatch def void reInitialize(Void oldContext, Void newContext) {
        // nothing to do if we get nothing.
    }
    
    private static def <M> void reInitializeChildContexts(IVisualizationContext<M> oldContext,
        IVisualizationContext<M> newContext) {
        if (oldContext.childrenInitialized && !newContext.childrenInitialized) {
            newContext.initializeChildVisualizationContexts
        }
    }
    
    /**
     * Dispatch method to Re-connect a given {@code newContext} with the connections from the {@code oldContext}. Every
     * method re-connects the given context and all children recursively.
     * Assumes, that the new contexts are already initializes as from the old context with just the connections missing.
     */
    private static dispatch def void reConnect(BundleCategoryOverviewContext oldContext,
        BundleCategoryOverviewContext newContext) {
        reConnectOverviewChildContexts(oldContext, newContext)
    }
    
    private static dispatch def void reConnect(ProductOverviewContext oldContext, ProductOverviewContext newContext) {
        reConnectOverviewChildContexts(oldContext, newContext)
    }
    private static dispatch def void reConnect(FeatureOverviewContext oldContext, FeatureOverviewContext newContext) {
        reConnectOverviewChildContexts(oldContext, newContext)
    }
    
    private static dispatch def void reConnect(BundleOverviewContext oldContext, BundleOverviewContext newContext) {
        // Restore the required bundle edges.
        for (oldEdge : oldContext.requiredBundleEdges) {
            // Check if the source and target of the connection still exist and if they are still in a requirement
            // relation.
            val requiring = oldEdge.key.modelElement
            val required = oldEdge.value.modelElement
            if (newContext.bundles.contains(requiring)
                && newContext.bundles.contains(required)
                && requiring.requiredBundles.contains(required)) {
                val requiringContext = newContext.childContexts.findFirst [ requiring === it.modelElement ] as BundleContext
                val requiredContext  = newContext.childContexts.findFirst [ required  === it.modelElement ] as BundleContext
                requiringContext.addRequiredBundleEdge(requiredContext)
            }
        }
        
        // Restore the used package edges.
        val osgiModel = ModelUtils.parentProject(newContext.bundles.head)
        for (oldEdge : oldContext.usedPackagesOfBundleEdges) {
            val source = oldEdge.sourceBundleContext.modelElement
//            val requiredPackages = oldEdge.usedPackages
            val product = oldEdge.product
            val target = oldEdge.targetBundleContext.modelElement
            if (newContext.bundles.contains(source)
                && newContext.bundles.contains(target)
                && osgiModel.products.contains(product)) {
                // The target bundle needs to at least export one package that the source bundle imports for this
                // connection to still be valid.
                val requiredPackages = <PackageObject>newArrayList
                for (imported : source.importedPackages) {
                    if (target.exportedPackages.findFirst [ ex | imported.uniqueId.equals(ex.uniqueId) ] !== null) {
                        requiredPackages.add(imported)
                    }
                }
                val sourceContext = newContext.childContexts.findFirst [ source === it.modelElement ] as BundleContext
                val targetContext = newContext.childContexts.findFirst [ target === it.modelElement ] as BundleContext
                sourceContext.addUsedPackagesEdge(requiredPackages, product, targetContext)
            }
        }
        for (oldEdge : oldContext.usedPackageEdges) {
            val source = oldEdge.key.modelElement
            val oldPackage = oldEdge.value.modelElement
            if (newContext.bundles.contains(source)) {
                val importedPackage = osgiModel.importedPackages.findFirst [ oldPackage.uniqueId === it.uniqueId ]
                if (importedPackage !== null) {
                    val sourceContext = newContext.childContexts.findFirst [ source === it.modelElement ] as BundleContext
                    var packageContext = newContext.usedPackageContexts.findFirst [ importedPackage === it.modelElement ]
                    if (packageContext === null) {
                        packageContext = OsgivizmodelUtil.createPackageObjectContext(importedPackage, newContext)
                        newContext.usedPackageContexts.add(packageContext)
                    }
                    sourceContext.addUsedPackageEdge(packageContext)
                }
            }
        }
        reConnectOverviewChildContexts(oldContext, newContext)
    }
    
    private static dispatch def void reConnect(ServiceOverviewContext oldContext, ServiceOverviewContext newContext) {
        // Restore the implemented interface edges.
        // plain variant
        for (oldEdge : oldContext.implementedInterfaceEdgesPlain) {
            // Check if the source and target of the connection still exist and if they are still in a implementation
            // relation.
            val ServiceComponent component = oldEdge.key.modelElement
            val ServiceInterface interface = oldEdge.value.modelElement
            if (newContext.serviceComponents.contains(component)
                && newContext.serviceInterfaces.contains(interface)
                && component.serviceInterfaces.contains(interface)) {
                val componentContext = newContext.childContexts.findFirst [ component === it.modelElement ] as ServiceComponentContext
                val interfaceContext  = newContext.childContexts.findFirst [ interface === it.modelElement ] as ServiceInterfaceContext
                interfaceContext.addImplementingServiceComponentEdgePlain(componentContext)
            }
        }
        // inBundles variant
        for (oldEdge : oldContext.implementedInterfaceEdgesInBundles) {
            // Check if the source and target of the connection still exist and if they are still in a implementation
            // relation.
            val ServiceComponent component = oldEdge.key.modelElement
            val ServiceInterface interface = oldEdge.value.modelElement
            if (newContext.serviceComponents.contains(component)
                && newContext.serviceInterfaces.contains(interface)
                && component.serviceInterfaces.contains(interface)) {
                var ServiceComponentContext componentContext = findServiceComponentContextInBundles(newContext, component)
                
                if (componentContext !== null) {
                    val interfaceContext  = newContext.childContexts.findFirst [ interface === it.modelElement ] as ServiceInterfaceContext
                    interfaceContext.addImplementingServiceComponentEdgeInBundle(componentContext)
                }
            }
        }
        // Restore the referenced interfaces edges.
        // plain variant
        for (oldEdge : oldContext.referencedInterfaceEdgesPlain) {
            // Check if the source and target of the connection still exist and if they are still in a reference
            // relation.
            val ServiceComponent component = oldEdge.serviceComponentContext.modelElement
            val ServiceInterface interface = oldEdge.serviceInterfaceContext.modelElement
            val Reference reference = component.reference.findFirst [ it.serviceInterface === interface ]
            if (reference !== null
                && newContext.serviceComponents.contains(component)
                && newContext.serviceInterfaces.contains(interface)) {
                val componentContext = newContext.childContexts.findFirst [ component === it.modelElement ] as ServiceComponentContext
                val interfaceContext  = newContext.childContexts.findFirst [ interface === it.modelElement ] as ServiceInterfaceContext
                componentContext.addReferencedServiceInterfaceEdgePlain(interfaceContext, reference)
            }
        }
        // inBundles variant
        for (oldEdge : oldContext.referencedInterfaceEdgesInBundles) {
            // Check if the source and target of the connection still exist and if they are still in a reference
            // relation.
            val ServiceComponent component = oldEdge.serviceComponentContext.modelElement
            val ServiceInterface interface = oldEdge.serviceInterfaceContext.modelElement
            val Reference reference = component.reference.findFirst [ it.serviceInterface === interface ]
            if (reference !== null
                && newContext.serviceComponents.contains(component)
                && newContext.serviceInterfaces.contains(interface)) {
                var ServiceComponentContext componentContext = findServiceComponentContextInBundles(newContext, component)
                val interfaceContext  = newContext.childContexts.findFirst [ interface === it.modelElement ] as ServiceInterfaceContext
                componentContext.addReferencedServiceInterfaceEdgeInBundle(interfaceContext, reference)
            }
        }
        // Restore the injected interface edges.
        // plain variant
        for (oldEdge : oldContext.injectedInterfaceEdgesPlain) {
            // Check if the source and target of the connection still exist and if they are still in a injection
            // relation.
            val Class class = oldEdge.key.modelElement
            val ServiceInterface interface = oldEdge.value.modelElement
            // TODO: 'classes' or 'classesWIthInjections'? Where is the difference?
            if (newContext.classesWithInjections.contains(class)
                && newContext.serviceInterfaces.contains(interface)
                && class.injectedInterfaces.contains(interface)) {
                val classContext = newContext.childContexts.findFirst [ class === it.modelElement ] as ClassContext
                val interfaceContext  = newContext.childContexts.findFirst [ interface === it.modelElement ] as ServiceInterfaceContext
                classContext.addInjectedServiceInterfaceEdgePlain(interfaceContext)
            }
        }
        // inBundles variant
        for (oldEdge : oldContext.injectedInterfaceEdgesInBundles) {
            // Check if the source and target of the connection still exist and if they are still in a injection
            // relation.
            val Class class = oldEdge.key.modelElement
            val ServiceInterface interface = oldEdge.value.modelElement
            // TODO: see above.
            if (newContext.classesWithInjections.contains(class)
                && newContext.serviceInterfaces.contains(interface)
                && class.injectedInterfaces.contains(interface)) {
                val classContext = findClassContextInBundles(newContext, class)
                val interfaceContext  = newContext.childContexts.findFirst [ interface === it.modelElement ] as ServiceInterfaceContext
                classContext.addInjectedServiceInterfaceEdgePlain(interfaceContext)
            }
        }
        reConnectOverviewChildContexts(oldContext, newContext)
    }
    
    private static def void reConnectOverviewChildContexts(IOverviewVisualizationContext<?> oldOverview,
        IOverviewVisualizationContext<?> newOverview) {
        // re-connect everything in the child contexts
        for (childContext : oldOverview.childContexts) {
            val element = childContext.modelElement
            val newChildContext = newOverview.childContexts.findFirst [ element === it.modelElement ]
            if (newChildContext !== null) {
                reConnect(childContext, newChildContext)
            }
        }
    }
    
    /**
     * Looks for the service component context for a component in the inBundles variant of viewing components.
     */
    private static def ServiceComponentContext findServiceComponentContextInBundles(ServiceOverviewContext overview,
        ServiceComponent component) {
        return findElemContextInBundles(overview, component) as ServiceComponentContext
    }
    
    /**
     * Looks for the class context for a class in the inBundles variant of viewing classes.
     */
    private static def ClassContext findClassContextInBundles(ServiceOverviewContext overview,
        Class theClass) {
        
        return findElemContextInBundles(overview, theClass) as ClassContext
    }
    
    /**
     * Looks for the class/component context for a class/component in the inBundles variant of viewing classes and
     * components.
     * 
     * @param overview The service overview context containing the bundle contexts that should contain the class/
     * component contexts.
     * @param elem The class/component to look for.
     * @returns The component/class context.
     */
    private static def <M> IVisualizationContext<M> findElemContextInBundles(ServiceOverviewContext overview,
        M elem) {
        return overview.childContexts.map [ bundleContext |
            if (bundleContext instanceof BundleContext) {
                return bundleContext.serviceOverviewContext.childContexts.findFirst [
                    elem === it.modelElement
                ]
            }
            return null
        ].findFirst [ it !== null ] as IVisualizationContext<M>
    }
    
    private static dispatch def void reConnect(BundleCategoryContext oldContext, BundleCategoryContext newContext) {
        reConnect(oldContext.bundleOverviewContext, newContext.bundleOverviewContext)
    }
    
    private static dispatch def void reConnect(BundleContext oldContext, BundleContext newContext) {
        reConnect(oldContext.serviceOverviewContext, newContext.serviceOverviewContext)
    }
    
    private static dispatch def void reConnect(FeatureContext oldContext, FeatureContext newContext) {
        reConnect(oldContext.bundleOverviewContext, newContext.bundleOverviewContext)
    }
    
    private static dispatch def void reConnect(ProductContext oldContext, ProductContext newContext) {
        reConnect(oldContext.featureOverviewContext, newContext.featureOverviewContext)
        reConnect(oldContext.bundleOverviewContext, newContext.bundleOverviewContext)
        reConnect(oldContext.serviceOverviewContext, newContext.serviceOverviewContext)
    }
    
    // The other cases that don't need to connect anything.
    private static dispatch def void reConnect(ServiceInterfaceContext oldContext, ServiceInterfaceContext newContext) {}
    private static dispatch def void reConnect(ServiceComponentContext oldContext, ServiceComponentContext newContext) {}
    private static dispatch def void reConnect(ClassContext oldContext, ClassContext newContext) {}
    private static dispatch def void reConnect(PackageObjectContext oldContext, PackageObjectContext newContext) {}
    private static dispatch def void reConnect(Void oldContext, Void newContext) {}
}