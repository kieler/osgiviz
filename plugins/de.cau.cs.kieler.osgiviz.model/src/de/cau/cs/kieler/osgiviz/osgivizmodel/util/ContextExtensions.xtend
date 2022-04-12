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
package de.cau.cs.kieler.osgiviz.osgivizmodel.util

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
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.BundleCategory
import de.scheidtbachmann.osgimodel.Feature
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.PackageObject
import de.scheidtbachmann.osgimodel.Product
import de.scheidtbachmann.osgimodel.Reference
import de.scheidtbachmann.osgimodel.ServiceComponent
import de.scheidtbachmann.osgimodel.ServiceInterface
import java.util.List

import static extension org.eclipse.emf.common.util.ECollections.*

/**
 * Extension class that contains some static methods commonly used in the OSGi synthesis for modifying the visualization
 * context.
 * 
 * @author nre
 */
class ContextExtensions {
    
    static val ALREADY_INITIALIZED_ERROR_MSG = "This object was already initialized and cannot be initialized a " +
    "second time."
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static UsedPackagesOfBundleEdgeConnection initialize(UsedPackagesOfBundleEdgeConnection connection,
        BundleContext sourceBundleContext, List<PackageObject> usedPackages, Product product,
        BundleContext targetBundleContext) {
        if (connection.usedPackages.empty) {
            connection.usedPackages += usedPackages
        } else {
            throw new RuntimeException(ALREADY_INITIALIZED_ERROR_MSG)
        }
        connection.sourceBundleContext = sourceBundleContext
        connection.product = product
        connection.targetBundleContext = targetBundleContext
        
        return connection
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static ReferencedInterfaceEdgeConnection initialize(ReferencedInterfaceEdgeConnection connection,
        ServiceComponentContext serviceComponentContext, ServiceInterfaceContext serviceInterfaceContext,
        Reference reference) {
        connection.serviceComponentContext = serviceComponentContext
        connection.serviceInterfaceContext = serviceInterfaceContext
        connection.reference = reference
        
        return connection
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static Class initialize(Class theClass, Bundle bundle, String classPath) {
        theClass.bundle = bundle
        theClass.classPath = classPath
        
        return theClass
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static ProductContext initialize(ProductContext productContext, Product product,
        IOverviewVisualizationContext<Product> parent) {
        productContext.parent = parent
        productContext.modelElement = product
        
        return productContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static FeatureContext initialize(FeatureContext featureContext, Feature feature,
        IOverviewVisualizationContext<?> parent) {
        featureContext.parent = parent
        featureContext.modelElement = feature
        
        return featureContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static BundleContext initialize(BundleContext bundleContext, Bundle bundle,
        IOverviewVisualizationContext<?> parent) {
        bundleContext.parent = parent
        bundleContext.modelElement = bundle
        
        return bundleContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static BundleCategoryContext initialize(BundleCategoryContext bundleCategoryContext,
        BundleCategory bundleCategory, IOverviewVisualizationContext<?> parent) {
        bundleCategoryContext.parent = parent
        bundleCategoryContext.modelElement = bundleCategory
        
        return bundleCategoryContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static ClassContext initialize(ClassContext classContext, Class theClass,
        IOverviewVisualizationContext<?> parent) {
        classContext.parent = parent
        classContext.modelElement = theClass
        
        return classContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static ServiceComponentContext initialize(ServiceComponentContext serviceComponentContext,
        ServiceComponent serviceComponent, IOverviewVisualizationContext<?> parent) {
        serviceComponentContext.parent = parent
        serviceComponentContext.modelElement = serviceComponent
        
        return serviceComponentContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static ServiceInterfaceContext initialize(ServiceInterfaceContext serviceInterfaceContext,
        ServiceInterface serviceInterface, IOverviewVisualizationContext<?> parent) {
        serviceInterfaceContext.parent = parent
        serviceInterfaceContext.modelElement = serviceInterface
        
        return serviceInterfaceContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static PackageObjectContext initialize(PackageObjectContext packageObjectContext, PackageObject packageObject,
        IOverviewVisualizationContext<?> parent) {
        packageObjectContext.parent = parent
        packageObjectContext.modelElement = packageObject
        
        return packageObjectContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static ProductOverviewContext initialize(ProductOverviewContext overviewContext, List<Product> products,
        IVisualizationContext<?> parent) {
        if (overviewContext.products.empty) {
            overviewContext.products += products
        } else {
            throw new RuntimeException(ALREADY_INITIALIZED_ERROR_MSG)
        }
        overviewContext.parent = parent
        overviewContext.initializeChildVisualizationContexts
        
        return overviewContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static FeatureOverviewContext initialize(FeatureOverviewContext overviewContext, List<Feature> features,
        IVisualizationContext<?> parent) {
        if (overviewContext.features.empty) {
            overviewContext.features += features
        } else {
            throw new RuntimeException(ALREADY_INITIALIZED_ERROR_MSG)
        }
        overviewContext.parent = parent
        overviewContext.initializeChildVisualizationContexts
        
        return overviewContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static BundleOverviewContext initialize(BundleOverviewContext overviewContext, List<Bundle> bundles,
        IVisualizationContext<?> parent) {
        if (overviewContext.bundles.empty) {
            overviewContext.bundles += bundles
        } else {
            throw new RuntimeException(ALREADY_INITIALIZED_ERROR_MSG)
        }
        overviewContext.parent = parent
        overviewContext.initializeChildVisualizationContexts
        
        return overviewContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static BundleCategoryOverviewContext initialize(BundleCategoryOverviewContext overviewContext,
        List<BundleCategory> bundleCategories, List<Bundle> bundles, IVisualizationContext<?> parent) {
        if (overviewContext.bundleCategories.empty) {
            overviewContext.bundleCategories += bundleCategories
        } else {
            throw new RuntimeException(ALREADY_INITIALIZED_ERROR_MSG)
        }
        overviewContext.parent = parent
        
        // Put all uncategorized bundles in a list.
        
        val uncategorizedBs = newArrayList
        bundles.filter [
            return it.bundleCategory.empty
        ].forEach [
            uncategorizedBs.add(it)
        ]
        
        // Create and initialize a bundle category for the uncategorized bundles.
        
        val uncategorizedBCC = OsgivizmodelUtil.createBundleCategoryContext(null, overviewContext)
        uncategorizedBCC.bundleOverviewContext = OsgivizmodelUtil.createBundleOverviewContext(uncategorizedBs,
            uncategorizedBCC)
        uncategorizedBCC.childrenInitialized = true
        
        overviewContext.initializeChildVisualizationContexts
        overviewContext.collapsedBundleCategoryContexts += uncategorizedBCC
        
        return overviewContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static ServiceOverviewContext initialize(ServiceOverviewContext overview,
        List<ServiceComponent> serviceComponents, List<ServiceInterface> serviceInterfaces,
        List<Class> classesWithInjections, IVisualizationContext<?> parent, boolean allowInBundleConnections) {
        if (overview.serviceComponents.empty && overview.serviceInterfaces.empty && overview.classesWithInjections.empty) {
            overview.serviceComponents += serviceComponents
            overview.serviceInterfaces += serviceInterfaces
            overview.classesWithInjections += classesWithInjections
        } else {
            throw new RuntimeException(ALREADY_INITIALIZED_ERROR_MSG)
        }
        overview.allowInBundleConnections = allowInBundleConnections
        overview.parent = parent
        overview.initializeChildVisualizationContexts
        
        return overview
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static PackageObjectOverviewContext initialize(PackageObjectOverviewContext overviewContext,
        List<PackageObject> packageObjects, IVisualizationContext<?> parent) {
        if (overviewContext.packageObjects.empty) {
            overviewContext.packageObjects += packageObjects
        } else {
            throw new RuntimeException(ALREADY_INITIALIZED_ERROR_MSG)
        }
        overviewContext.parent = parent
        
        return overviewContext
    }
    
    /**
     * Initializes this context as if this was a constructor initializing the given parameters. Workaround as XCore does
     * not support individual class constructors with parameters in the generated factory.
     */
    def static OsgiViz initialize(OsgiViz viz, OsgiProject project, IVisualizationContext<?> parent) {
        viz.parent = parent
        viz.modelElement = project
        viz.initializeChildVisualizationContexts
        
        return viz
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(ProductContext productContext) {
        val allFeatures = productContext.modelElement.features
        productContext.featureOverviewContext = OsgivizmodelUtil.createFeatureOverviewContext(allFeatures,
            productContext)
        // Any bundle could be referenced in more than one feature, so make sure they are included only once.
        val allBundles = productContext.modelElement.features.flatMap [ bundles ].toSet.toEList
        productContext.bundleOverviewContext = OsgivizmodelUtil.createBundleOverviewContext(allBundles, productContext)
        
        val allServiceComponents = allBundles.flatMap [ serviceComponents ].toEList
        val allInjections = allBundles.flatMap [ eclipseInjections ].toList
        val allClasses = OsgivizmodelUtil.injectionClasses(allInjections).toEList
        val allServiceInterfaces = OsgivizmodelUtil.referencedInterfaces(allServiceComponents, allInjections).toEList
        
        productContext.serviceOverviewContext = OsgivizmodelUtil.createServiceOverviewContext(allServiceComponents,
            allServiceInterfaces, allClasses, productContext, true)
        productContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(FeatureContext featureContext) {
        featureContext.bundleOverviewContext = OsgivizmodelUtil.createBundleOverviewContext
            (featureContext.modelElement.bundles, featureContext)
        featureContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(BundleContext bundleContext) {
        // The services in bundles should only be shown if there are any.
        if (!bundleContext.modelElement.serviceComponents.empty || !bundleContext.modelElement.eclipseInjections.empty) {
            // Determine if this bundle context should contain all service elements in the overview if it should exclude
            // the interfaces (if the bundle itself is shown in a service overview)
            val allServiceInterfaces = if (bundleContext.parent instanceof ServiceOverviewContext) {
                emptyEList
            }  else {
                OsgivizmodelUtil.referencedInterfaces(bundleContext.modelElement.serviceComponents,
                    bundleContext.modelElement.eclipseInjections).toEList
            }
            
            bundleContext.classesWithInjections += OsgivizmodelUtil.injectionClasses(bundleContext.modelElement).toEList
            bundleContext.serviceOverviewContext = OsgivizmodelUtil.createServiceOverviewContext(
                bundleContext.modelElement.serviceComponents, allServiceInterfaces, bundleContext.classesWithInjections,
                bundleContext, false)
            // Services in bundles in a service overview should be expanded initially.
            if (bundleContext.parent instanceof ServiceOverviewContext) {
                bundleContext.serviceOverviewContext.expanded = true
            }
        }
        bundleContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(BundleCategoryContext bundleCategoryContext) {
        bundleCategoryContext.bundleOverviewContext = OsgivizmodelUtil.createBundleOverviewContext(
            bundleCategoryContext.modelElement.bundle, bundleCategoryContext)
        bundleCategoryContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(ServiceInterfaceContext serviceInterfaceContext) {
        // Nothing to do yet.
        serviceInterfaceContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(ServiceComponentContext serviceComponentContext) {
        // Nothing to do yet.
        serviceComponentContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(ClassContext classContext) {
        // Nothing to do yet.
        classContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(PackageObjectContext packageObjectContext) {
        // Nothing to do yet.
        packageObjectContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(ProductOverviewContext overviewContext) {
        overviewContext.products.forEach [
            overviewContext.collapsedProductContexts += OsgivizmodelUtil.createProductContext(it, overviewContext)
        ]
        overviewContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(FeatureOverviewContext overviewContext) {
        overviewContext.features.forEach [
            overviewContext.collapsedFeatureContexts += OsgivizmodelUtil.createFeatureContext(it, overviewContext)
        ]
        overviewContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(BundleOverviewContext overviewContext) {
        overviewContext.bundles.forEach [
            overviewContext.collapsedBundleContexts += OsgivizmodelUtil.createBundleContext(it, overviewContext)
        ]
        overviewContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(BundleCategoryOverviewContext overviewContext) {
        overviewContext.bundleCategories.forEach [
            overviewContext.collapsedBundleCategoryContexts += OsgivizmodelUtil.createBundleCategoryContext(it,
                overviewContext)
        ]
        overviewContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(ServiceOverviewContext overviewContext) {
        overviewContext.serviceComponents.forEach [
            overviewContext.collapsedServiceComponentContexts += OsgivizmodelUtil.createServiceComponentContext(it,
                overviewContext)
        ]
        
        overviewContext.serviceInterfaces.forEach [
            overviewContext.collapsedServiceInterfaceContexts += OsgivizmodelUtil.createServiceInterfaceContext(it,
                overviewContext)
        ]
        
        overviewContext.classesWithInjections.forEach [
            val theClass = OsgivizmodelUtil.createClassContext(it, overviewContext)
            overviewContext.classes += it
            overviewContext.collapsedClassContexts += theClass 
        ]
        
        if (overviewContext.allowInBundleConnections) {
            val completedBundles = <Bundle>newLinkedList
            
            // Add a new context for each individual bundle these components or classes are contained in.
            overviewContext.serviceComponents.forEach [
                if (!completedBundles.contains(bundle)) {
                    val newBundleContext = OsgivizmodelUtil.createBundleContext(bundle, overviewContext)
                    newBundleContext.initializeChildVisualizationContexts
                    overviewContext.detailedReferencedBundleContexts.add(newBundleContext)
                    completedBundles.add(bundle)
                }
            ]
            overviewContext.classesWithInjections.forEach [
                val bundle = it.bundle
                if (!completedBundles.contains(bundle)) {
                    val newBundleContext = OsgivizmodelUtil.createBundleContext(bundle, overviewContext)
                    newBundleContext.initializeChildVisualizationContexts
                    overviewContext.detailedReferencedBundleContexts.add(newBundleContext)
                    completedBundles.add(bundle)
                }
            ]
        }
        overviewContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(PackageObjectOverviewContext overviewContext) {
        overviewContext.packageObjects.forEach [
            overviewContext.collapsedPackageObjectContexts += OsgivizmodelUtil.createPackageObjectContext(it,
                overviewContext)
        ]
        overviewContext.childrenInitialized = true
    }
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def static dispatch void initializeChildVisualizationContexts(OsgiViz viz) {
        viz.productOverviewContext = OsgivizmodelUtil.createProductOverviewContext(viz.modelElement.products, viz)
        viz.productOverviewContext.expanded = true
        viz.bundleOverviewContext = OsgivizmodelUtil.createBundleOverviewContext(viz.modelElement.bundles, viz)
        val allInjections = viz.modelElement.bundles.flatMap [ eclipseInjections ].toList
        val allClasses = OsgivizmodelUtil.injectionClasses(allInjections).toEList
        val allComponents = viz.modelElement.bundles.flatMap [ serviceComponents ].toSet.toEList
        viz.serviceOverviewContext = OsgivizmodelUtil.createServiceOverviewContext(allComponents,
            viz.modelElement.serviceInterfaces, allClasses, viz, true)
        viz.featureOverviewContext = OsgivizmodelUtil.createFeatureOverviewContext(viz.modelElement.features, viz)
        viz.importedPackageOverviewContext = OsgivizmodelUtil.createPackageObjectOverviewContext(
            viz.modelElement.importedPackages, viz)
        viz.bundleCategoryOverviewContext = OsgivizmodelUtil.createBundleCategoryOverviewContext(
            viz.modelElement.bundleCategories, viz.modelElement.bundles, viz)
        viz.childrenInitialized = true
    }
    
    /**
     * A descriptive text about what is contained in this overview visualization.
     */
    def static dispatch String overviewText(ProductOverviewContext overviewContext) {
        switch (overviewContext.parent) {
            OsgiViz: {
                "All products contained in this project."
            }
            default: {
                "No descriptive text for this product overview available yet."
            }
        }
    }
    
    /**
     * A descriptive text about what is contained in this overview visualization.
     */
    def static dispatch String overviewText(FeatureOverviewContext overviewContext) {
        val parentContext = overviewContext.parent
        switch (parentContext) {
            OsgiViz: {
                "All features contained in this project."
            }
            ProductContext: {
                "All features contained in the product " + parentContext.modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this feature overview available yet."
            }
        }
    }
    
    /**
     * A descriptive text about what is contained in this overview visualization.
     */
    def static dispatch String overviewText(BundleOverviewContext overviewContext) {
        val parentContext = overviewContext.parent
        switch (parentContext) {
            OsgiViz: {
                "All bundles contained in or referenced in this project."
            }
            FeatureContext: {
                "All bundles contained in the feature " + parentContext.modelElement.uniqueId + "."
            }
            ProductContext: {
                "All bundles contained in the product " + parentContext.modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this bundle overview available yet."
            }
        }
    }
    
    /**
     * A descriptive text about what is contained in this overview visualization.
     */
    def static dispatch String overviewText(BundleCategoryOverviewContext overviewContext) {
        switch (overviewContext.parent) {
            OsgiViz: {
                "All bundle categories in this project."
            }
            default: {
                "No descriptive text for this bundle category overview available yet."
            }
        }
    }
    
     /**
     * A descriptive text about what is contained in this overview visualization.
     */
    def static dispatch String overviewText(ServiceOverviewContext overviewContext) {
        val parentContext = overviewContext.parent
        switch (parentContext) {
            OsgiViz: {
                "All services provided or used in this project."
            }
            ProductContext: {
                "All services provided or used in the product " + parentContext.modelElement.uniqueId + "."
            }
            FeatureContext: {
                "All services provided or used in the feature " + parentContext.modelElement.uniqueId + "."
            }
            BundleContext: {
                "All services provided or used by the bundle " + parentContext.modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this service overview available yet."
            }
        }
    }
    
    /**
     * A descriptive text about what is contained in this overview visualization.
     */
    def static dispatch String overviewText(PackageObjectOverviewContext overviewContext) {
        val parentContext = overviewContext.parent
        switch (parentContext) {
            OsgiViz: {
                "All package objects contained in or referenced in this project."
            }
            default: {
                "No descriptive text for this package object overview available yet."
            }
        }
    }
    
    /**
     * Returns true if {@code childContext} is a child visualization context contained in the {@code rootContext} or the
     * contexts are equal.
     * Uses the {@link IVisualizationContext#getParent()} to find out if it is contained.
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
            currentContext = currentContext.parent
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
    
    def dispatch static void removeEdges(ServiceOverviewContext overviewContext, ClassContext context) {
        // IN_BUNDLES variant:
        // There could be edges from this class context to the parent's parent's parent service overview context,
        // if it is in the correct hierarchy for that.
        val potentialBundleContext = overviewContext.parent
        if (potentialBundleContext instanceof BundleContext) {
            val potentialServiceConnectionHolder = potentialBundleContext.parent
            if (potentialServiceConnectionHolder instanceof ServiceOverviewContext) {
                // We are in the correct hierarchy, this overviewContext may contain edges to this class context.
                val injectedInterfaceEdges = potentialServiceConnectionHolder.injectedInterfaceEdgesInBundles.clone
                injectedInterfaceEdges.forEach [
                    if (it.key === context) {
                        potentialServiceConnectionHolder.injectedInterfaceEdgesInBundles.remove(it)
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
        val potentialBundleContext = overviewContext.parent
        if (potentialBundleContext instanceof BundleContext) {
            val potentialServiceConnectionHolder = potentialBundleContext.parent
            if (potentialServiceConnectionHolder instanceof ServiceOverviewContext) {
                // We are in the correct hierarchy, this overviewContext may contain edges to this SC context.
                val implementedInderfaceEdges = potentialServiceConnectionHolder.implementedInterfaceEdgesInBundles.clone
                implementedInderfaceEdges.forEach [
                    if (key === context) {
                        potentialServiceConnectionHolder.implementedInterfaceEdgesInBundles.remove(it)
                        key.allImplementedInterfacesShownInBundles = false
                        value.allImplementingComponentsShownInBundles = false
                    }
                ]
                val referencedInterfaceEdges = potentialServiceConnectionHolder.referencedInterfaceEdgesInBundles.clone
                referencedInterfaceEdges.forEach [
                    if (it.serviceComponentContext === context) {
                        potentialServiceConnectionHolder.referencedInterfaceEdgesInBundles.remove(it)
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
            if (context.serviceOverviewContext.detailedClassContexts.contains(key)) {
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
    
    def static dispatch void removeEdges(IOverviewVisualizationContext<?> ovc, String s) {
        // This method's purpose is just to tell Xtend that the second paramater's inherited class should be 'Object'
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
        val parentContext = requiringContext.parent as BundleOverviewContext
        if (requiredContext.parent !== parentContext) {
            throw new IllegalArgumentException("The requiring and the required context both have to have the same " +
                "parent context!")
        }
        // Only if this edge does not exist yet, add it to the list of required bundle edges.
        if (!parentContext.requiredBundleEdges.exists [ key === requiringContext && value === requiredContext ]) {
            parentContext.requiredBundleEdges += OsgivizmodelUtil.createPair(requiringContext, requiredContext)
            
            // Check for both the requiring bundle and the required bundle if all connections are now shown in the 
            // parent context. If they are, remember it in the corresponding bundle context.
            // Requiring context:
            if (requiringContext.modelElement.requiredBundles.forall [ requiredBundle |
                !parentContext.modelElements.contains(requiredBundle) ||
                parentContext.requiredBundleEdges.exists [ key === requiringContext && value.modelElement === requiredBundle ]
            ]) {
                requiringContext.allRequiredBundlesShown = true
            }
            // Required context:
            if (requiredContext.modelElement.usedByBundle.forall [ requiringBundle |
                !parentContext.modelElements.contains(requiringBundle) ||
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
        val parentContext = requiringContext.parent as BundleOverviewContext
        if (requiredContext.parent !== parentContext) {
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
        val parentContext = sourceBundleContext.parent as BundleOverviewContext
        if (targetBundleContext.parent !== parentContext) {
            throw new IllegalArgumentException("The source and target bundle contexts both have to have the same " +
                "parent context!")
        }
        // Only if this edge does not exist yet, add it to the list of used packages edges.
        if (!parentContext.usedPackagesOfBundleEdges.exists [
            it.sourceBundleContext === sourceBundleContext &&
            it.product === product &&
            it.targetBundleContext === targetBundleContext
        ]) {
            parentContext.usedPackagesOfBundleEdges += OsgivizmodelUtil.createUsedPackagesOfBundleEdgeConnection(
                sourceBundleContext, usedPackages.toEList, product, targetBundleContext)
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
        val parentContext = bundleContext.parent as BundleOverviewContext
        if (packageContext.parent !== parentContext) {
            throw new IllegalArgumentException("The bundle- and package contexts both have to have the same " +
                "parent context!")
        }
        // Only if this edge does not exist yet, add it to the list of used packages edges.
        if (!parentContext.usedPackageEdges.exists [
            key === bundleContext && value === packageContext
        ]) {
            parentContext.usedPackageEdges += OsgivizmodelUtil.createPair(bundleContext, packageContext)
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
    
    /**
     * Determines if the given bundle context is currently in no connection to any other element within this parent
     * context.
     * 
     * @param parent The parent context to check any connection in.
     * @param bundleContext The bundle context to check if it is connected
     * @return {@code} true, if there is no connection related to the {@code bundleContext} in this parent context.
     */
    def static /*dispatch*/ boolean hasNoConnections(BundleOverviewContext parent, BundleContext bundleContext) {
       if (parent.requiredBundleEdges.exists[ edge |
           edge.key === bundleContext ||
           edge.value === bundleContext
       ]) {
           return false
       }
       
       if (parent.usedPackagesOfBundleEdges.exists[ edge |
           edge.sourceBundleContext === bundleContext ||
           edge.targetBundleContext === bundleContext
       ]) {
           return false
       }
       
       if (parent.usedPackageEdges.exists [ edge |
           edge.key === bundleContext
       ]) {
           return false
       }
       return true
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
        val parentContext = serviceInterfaceContext.parent as ServiceOverviewContext
        if (serviceComponentContext.parent !== parentContext) {
            throw new IllegalArgumentException(DIFFERENT_PARENT_ERROR_MSG)
        }
        val implementedInterfaceEdgesPlain = parentContext.implementedInterfaceEdgesPlain
        
        // Only if this edge does not exist yet, add it to the list of implementing service component edges.
        if (!implementedInterfaceEdgesPlain.exists [
            key === serviceComponentContext && value === serviceInterfaceContext
        ]) {
            implementedInterfaceEdgesPlain += OsgivizmodelUtil.createPair(serviceComponentContext, serviceInterfaceContext)
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
        val parentContext = serviceInterfaceContext.parent as ServiceOverviewContext
        // The serviceComponent should be in the hierarchy as in:
        // SOCtx->BundleCtx->SOCtx->SCCtx
        if (serviceComponentContext.parent.parent.parent
            !== parentContext) {
            throw new IllegalArgumentException("The interface and the component contexts are not in the correct "
                + "context hierarchy!")
        }
        // Only if this edge does not exist yet, add it to the list of implementing service component edges.
        if (!parentContext.implementedInterfaceEdgesInBundles.exists [
            key === serviceComponentContext && value === serviceInterfaceContext
        ]) {
            parentContext.implementedInterfaceEdgesInBundles += OsgivizmodelUtil.createPair(serviceComponentContext, serviceInterfaceContext)
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
        val parentContext = serviceInterfaceContext.parent as ServiceOverviewContext
        if (serviceComponentContext.parent !== parentContext) {
            throw new IllegalArgumentException(DIFFERENT_PARENT_ERROR_MSG)
        }
        val referencedComponentEdgesPlain = parentContext.referencedInterfaceEdgesPlain
        
        // Only if this edge does not exist yet, add it to the list of referenced service component edges.
        if (!referencedComponentEdgesPlain.exists [
            it.serviceInterfaceContext === serviceInterfaceContext &&
            it.serviceComponentContext === serviceComponentContext &&
            it.reference === reference
        ]) {
            referencedComponentEdgesPlain += OsgivizmodelUtil.createReferencedInterfaceEdgeConnection(
                serviceComponentContext, serviceInterfaceContext, reference)
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
        val parentContext = serviceInterfaceContext.parent as ServiceOverviewContext
        // The serviceComponent should be in the hierarchy as in:
        // SOCtx->BundleCtx->SOCtx->SCCtx
        if (serviceComponentContext.parent.parent.parent
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
            parentContext.referencedInterfaceEdgesInBundles += OsgivizmodelUtil.createReferencedInterfaceEdgeConnection(
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
     * injected by the class represented by the {@code classContext}.
     * 
     * @param classContext The class context for the injection.
     * @param serviceInterfaceContext The service interface context that is injected.
     */
    def static void addInjectedServiceInterfaceEdgePlain(ClassContext classContext,
        ServiceInterfaceContext serviceInterfaceContext) {
        val parentContext = classContext.parent as ServiceOverviewContext
        if (serviceInterfaceContext.parent !== parentContext) {
            throw new IllegalArgumentException(DIFFERENT_PARENT_ERROR_MSG)
        }
        val injectedInterfaceEdges = parentContext.injectedInterfaceEdgesPlain
        
        // Only if this edge does not exist yet, add it to the list of referenced service component edges.
        if (!injectedInterfaceEdges.exists [
            key === classContext &&
            value === serviceInterfaceContext
        ]) {
            injectedInterfaceEdges += OsgivizmodelUtil.createPair(classContext, serviceInterfaceContext)
            // TODO: Check if all classes are connected and mark that in the context.
        }
    }
    
    /**
     * Adds an injected service interface edge to the parent ServiceOverviewContext of the two given contexts.
     * The direction of the edge indicates that the service interface of the {@code serviceInterfaceContext} is
     * injected by the class represented by the {@code classContext}.
     * 
     * @param classContext The class context for the injection. Is not directly contained in
     * a common parent service context, but in a hierarchy of a service and bundle context first.
     * @param serviceInterfaceContext The service interface context that is injected.
     */
    def static void addInjectedServiceInterfaceEdgeInBundle(ClassContext classContext,
        ServiceInterfaceContext serviceInterfaceContext) {
        val parentContext = serviceInterfaceContext.parent as ServiceOverviewContext
        // The class should be in the hierarchy as in:
        // SOCtx->BundleCtx->SOCtx->CCtx
        if (classContext.parent.parent.parent
            !== parentContext) {
            throw new IllegalArgumentException("The class and the interface contexts are not in the correct "
                + "context hierarchy!")
        }
        // Only if this edge does not exist yet, add it to the list of injected service interface edges.
        if (!parentContext.injectedInterfaceEdgesInBundles.exists [
            key === classContext && value === serviceInterfaceContext
        ]) {
            parentContext.injectedInterfaceEdgesInBundles += OsgivizmodelUtil.createPair(classContext, serviceInterfaceContext)
            // TODO: Check if all classes are connected and mark that in the context.
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
        val root = rootVisualization(context)
        
        if (root instanceof OsgiViz) {
            return root.modelElement === project
        } else {
            // If the parent hierarchy on the context does end in an OsgiViz, it was lost in some focus
            // action. But that also indicates that the root model has not changed and this context has to come from
            // that.
            return true
        }
    }
    
    /**
     * Returns the root context of the given visualization context.
     * 
     * @param context The visualization context to find the root for.
     * @return The root OsgiViz, or {@code null} if the root is not of that type.
     */
    def static OsgiViz rootVisualization(IVisualizationContext<?> context) {
        var IVisualizationContext<?> currentContext = context
        while (currentContext.parent !== null) {
            currentContext = currentContext.parent
        }
        
        if (currentContext instanceof OsgiViz) {
            return currentContext
        } else {
            return null
        }
    }
    
    /**
     * Makes the {@code collapsedContext} that is a collapsed visualization context within this overview context
     * so it is detailed and handles the initialization of the child visualization contexts of that now detailed
     * context.
     * 
     * @param overview The parent overview context that contains the collapsed context in its collapsedElements
     * field.
     * @param collapsedContext The context that is now a collapsed element in the parent overview and should be put in
     * the detailed elements as well as be initialized for its child contexts.
     */
    def static dispatch makeDetailed(IOverviewVisualizationContext<?> overview, IVisualizationContext<?> collapsedContext) {
        // Only execute this if the element is not already detailed.
        if (overview.detailedElements.contains(collapsedContext)) {
            return
        }
        
        // This element was previously collapsed, so put it in the detailed list now and initialize its child
        // visualization contexts.
        overview.collapsedElements.remove(collapsedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (overview.detailedElements as List<IVisualizationContext<?>>).add(collapsedContext)
        if (!collapsedContext.childrenInitialized) {
            collapsedContext.initializeChildVisualizationContexts
        }
    }
    def static dispatch makeDetailed(ServiceOverviewContext overview, IVisualizationContext<?> collapsedContext) {
        if (collapsedContext === null) {
            return
        }
        var List<? extends IVisualizationContext<Object>> detailed
        var List<? extends IVisualizationContext<Object>> collapsed
        switch (collapsedContext) {
            ServiceComponentContext: {
                detailed = overview.detailedServiceComponentContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedServiceComponentContexts as List<? extends IVisualizationContext<Object>>
            }
            ServiceInterfaceContext: {
                detailed = overview.detailedServiceInterfaceContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedServiceInterfaceContexts as List<? extends IVisualizationContext<Object>>
            }
            ClassContext: {
                detailed = overview.detailedClassContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedClassContexts as List<? extends IVisualizationContext<Object>>
            }
            BundleContext: {
                detailed = overview.detailedReferencedBundleContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedReferencedBundleContexts as List<? extends IVisualizationContext<Object>>
            }
        }
        
        // Only execute this if the element is not already detailed.
        if (detailed.contains(collapsedContext)) {
            return
        }
        
        // This element was previously collapsed, so put it in the detailed list now and initialize its child
        // visualization contexts.
        collapsed.remove(collapsedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (detailed as List<IVisualizationContext<?>>).add(collapsedContext)
        collapsedContext.initializeChildVisualizationContexts
    }
    
    /**
     * Collapses the {@code expandedContext} that is an expanded visualization context within this overview context
     * so it is collapsed after this method.
     * Also removes any edges connected to the now collapsed element.
     * 
     * @param overview The parent overview context that contains the expanded context in its detailedElements
     * field.
     * @param detailedContext The context that is now a detailed element in the parent overview and should be put in
     * the collapsed elements.
     */
    def static dispatch collapse(IOverviewVisualizationContext<?> overview, IVisualizationContext<?> detailedContext) {
        // Only execute this if the element is not already collapsed
        if (overview.collapsedElements.contains(detailedContext)) {
            return
        }
        
        // This element was previously detailed, so put it in the collapsed list now.
        overview.detailedElements.remove(detailedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (overview.collapsedElements as List<IVisualizationContext<?>>).add(detailedContext)
    }
    def static dispatch collapse(ServiceOverviewContext overview, IVisualizationContext<?> detailedContext) {
        if (detailedContext === null) {
            return
        }
        var List<? extends IVisualizationContext<Object>> detailed
        var List<? extends IVisualizationContext<Object>> collapsed
        switch (detailedContext) {
            ServiceComponentContext: {
                detailed = overview.detailedServiceComponentContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedServiceComponentContexts as List<? extends IVisualizationContext<Object>>
            }
            ServiceInterfaceContext: {
                detailed = overview.detailedServiceInterfaceContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedServiceInterfaceContexts as List<? extends IVisualizationContext<Object>>
            }
            ClassContext: {
                detailed = overview.detailedClassContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedClassContexts as List<? extends IVisualizationContext<Object>>
            }
            BundleContext: {
                detailed = overview.detailedReferencedBundleContexts as List<? extends IVisualizationContext<Object>>
                collapsed = overview.collapsedReferencedBundleContexts as List<? extends IVisualizationContext<Object>>
            }
        }
        
        // Only execute this if the element is not already collapsed
        if (collapsed.contains(detailedContext)) {
            return
        }
        
        // This element was previously detailed, so put it in the collapsed list now.
        detailed.remove(detailedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (collapsed as List<IVisualizationContext<?>>).add(detailedContext)
    }
    
    /**
     * The visualization contexts of the detailed elements.
     */
    def static dispatch List<BundleCategoryContext> getDetailedElements(BundleCategoryOverviewContext overviewContext) {
        return overviewContext.detailedBundleCategoryContexts
    }
    
    def static dispatch List<BundleContext> getDetailedElements(BundleOverviewContext overviewContext) {
        return overviewContext.detailedBundleContexts
    }
    
    def static dispatch List<FeatureContext> getDetailedElements(FeatureOverviewContext overviewContext) {
        return overviewContext.detailedFeatureContexts
    }
    
    def static dispatch List<PackageObjectContext> getDetailedElements(PackageObjectOverviewContext overviewContext) {
        return overviewContext.detailedPackageObjectContexts
    }
    
    def static dispatch List<ProductContext> getDetailedElements(ProductOverviewContext overviewContext) {
        return overviewContext.detailedProductContexts
    }
    
    def static dispatch List<? extends IVisualizationContext<?>> getDetailedElements(ServiceOverviewContext overviewContext) {
        var Iterable<IVisualizationContext<?>> detailedElements = overviewContext.detailedClassContexts 
            + overviewContext.detailedServiceComponentContexts + overviewContext.detailedServiceInterfaceContexts
        if (overviewContext.detailedReferencedBundleContexts !== null) {
           detailedElements = detailedElements + overviewContext.detailedReferencedBundleContexts 
        }
        return detailedElements.toList as List<? extends IVisualizationContext<?>>
    }
    
    /**
     * The visualization contexts of the collapsed elements.
     */
    def static dispatch List<BundleCategoryContext> getCollapsedElements(BundleCategoryOverviewContext overviewContext) {
        return overviewContext.collapsedBundleCategoryContexts
    }
    
    def static dispatch List<BundleContext> getCollapsedElements(BundleOverviewContext overviewContext) {
        return overviewContext.collapsedBundleContexts
    }
    
    def static dispatch List<FeatureContext> getCollapsedElements(FeatureOverviewContext overviewContext) {
        return overviewContext.collapsedFeatureContexts
    }
    
    def static dispatch List<PackageObjectContext> getCollapsedElements(PackageObjectOverviewContext overviewContext) {
        return overviewContext.collapsedPackageObjectContexts
    }
    
    def static dispatch List<ProductContext> getCollapsedElements(ProductOverviewContext overviewContext) {
        return overviewContext.collapsedProductContexts
    }

    def static dispatch List<? extends IVisualizationContext<?>> getCollapsedElements(ServiceOverviewContext overviewContext) {
        var Iterable<IVisualizationContext<? extends Object>> collapsedElements = overviewContext.collapsedClassContexts
            + overviewContext.collapsedServiceComponentContexts + overviewContext.collapsedServiceInterfaceContexts
        if (overviewContext.collapsedReferencedBundleContexts !== null) {
            collapsedElements = collapsedElements + overviewContext.collapsedReferencedBundleContexts
        }
        return collapsedElements.toList as List<? extends IVisualizationContext<?>>
    }
    
    /**
     * The elements of the model represented by this overview visualization.
     */
    def static dispatch List<BundleCategory> modelElements(BundleCategoryOverviewContext overviewContext) {
        return overviewContext.bundleCategories
    }
    
    def static dispatch List<Bundle> modelElements(BundleOverviewContext overviewContext) {
        return overviewContext.bundles
    }
    
    def static dispatch List<Feature> modelElements(FeatureOverviewContext overviewContext) {
        return overviewContext.features
    }
    
    def static dispatch List<PackageObject> modelElements(PackageObjectOverviewContext overviewContext) {
        return overviewContext.packageObjects
    }
    
    def static dispatch List<Product> modelElements(ProductOverviewContext overviewContext) {
        return overviewContext.products
    }
    
    def static dispatch List<?> modelElements(ServiceOverviewContext overviewContext) {
        return (overviewContext.serviceComponents + overviewContext.serviceInterfaces
            + overviewContext.classesWithInjections).toList
    }
    
}
