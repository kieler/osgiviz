/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.util;

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
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelFactory
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.Pair
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.BundleCategory
import de.scheidtbachmann.osgimodel.EclipseInjection
import de.scheidtbachmann.osgimodel.Feature
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.PackageObject
import de.scheidtbachmann.osgimodel.Product
import de.scheidtbachmann.osgimodel.Reference
import de.scheidtbachmann.osgimodel.ServiceComponent
import de.scheidtbachmann.osgimodel.ServiceInterface
import de.scheidtbachmann.osgimodel.util.ModelUtils
import java.util.HashMap
import java.util.HashSet
import java.util.List
import org.eclipse.emf.common.util.EList

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*
import static extension org.eclipse.emf.common.util.ECollections.*

/**
 * Utility methods to operate on Osgiviz models.
 * 
 * @author nre
 */
final class OsgivizmodelUtil {
    
    /** The factory to create osgiviz model element instances */
    static val OsgivizmodelFactory FACTORY = OsgivizmodelFactory.eINSTANCE
    
    /** Utility classes are not meant to be instantiated. */
    private new() {
        throw new IllegalAccessError
    }
    
    /**
     * Creates an initialized edge connection for used packages of bundles.
     * 
     * @param sourceBundleContext The bundle context the edge should start at, i.e. the context for the bundle that
     * requires packages.
     * @param usedPackages The packages imported and shown by this connection.
     * @param product The product in which this package import takes place.
     * @param targetBundleContext The bundle context the edge should end at, i.e. the context for the bundle that
     * offers the required packages.
     * @return The edge connection bundled together in a class.
     */
    static def UsedPackagesOfBundleEdgeConnection createUsedPackagesOfBundleEdgeConnection(
        BundleContext sourceBundleContext, EList<PackageObject> usedPackages, Product product,
        BundleContext targetBundleContext) {
        return FACTORY.createUsedPackagesOfBundleEdgeConnection
            .initialize(sourceBundleContext, usedPackages, product, targetBundleContext)
    }
    
    /**
     * Creates an initialized edge connection for referenced interfaces of service components.
     * 
     * @param serviceComponentContext The service component context the edge should start at, i.e the context for the
     * service component that requires referenced interfaces.
     * @param serviceInterfaceContext The service interface context the edge should end at, i.e. the context for the
     * service interface that is required/referenced by the service component.
     * @param reference The data for the reference from the osgi model.
     * @return The edge connection bundled together in a class.
     */
    static def ReferencedInterfaceEdgeConnection createReferencedInterfaceEdgeConnection(
        ServiceComponentContext serviceComponentContext, ServiceInterfaceContext serviceInterfaceContext,
        Reference reference) {
        return FACTORY.createReferencedInterfaceEdgeConnection
            .initialize(serviceComponentContext, serviceInterfaceContext, reference)
    }
    
    /**
     * Creates an initialized class.
     * 
     * @param bundle The bundle the class is contained in.
     * @param classPath The classPath where to find this class.
     * @return The initialized class.
     */
    static def Class createClass(Bundle bundle, String classPath) {
        return FACTORY.createClass.initialize(bundle, classPath)
    }
    
    /**
     * Creates an initialized product context.
     * 
     * @param product The product this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def ProductContext createProductContext(Product product,
        IOverviewVisualizationContext<Product> parent) {
        return FACTORY.createProductContext.initialize(product, parent)
    }
    
    /**
     * Creates an initialized feature context.
     * 
     * @param feature The feature this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def FeatureContext createFeatureContext(Feature feature,
        IOverviewVisualizationContext<Feature> parent) {
        return FACTORY.createFeatureContext.initialize(feature, parent)
    }
    
    /**
     * Creates an initialized bundle context.
     * 
     * @param bundle The bundle this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def BundleContext createBundleContext(Bundle bundle,
        IOverviewVisualizationContext<?> parent) {
        return FACTORY.createBundleContext.initialize(bundle, parent)
    }
    
    /**
     * Creates an initialized bundle category context.
     * 
     * @param bundleCategory The bundle category this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def BundleCategoryContext createBundleCategoryContext(BundleCategory bundleCategory,
        IOverviewVisualizationContext<BundleCategory> parent) {
        return FACTORY.createBundleCategoryContext.initialize(bundleCategory, parent)
    }
    
    /**
     * Creates an initialized class context.
     * 
     * @param theClass The class this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def ClassContext createClassContext(Class theClass,
        IOverviewVisualizationContext<?> parent) {
        return FACTORY.createClassContext.initialize(theClass, parent)
    }
    
    /**
     * Creates an initialized service component context.
     * 
     * @param serviceComponent The service component this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def ServiceComponentContext createServiceComponentContext(ServiceComponent serviceComponent,
        IOverviewVisualizationContext<?> parent) {
        return FACTORY.createServiceComponentContext.initialize(serviceComponent, parent)
    }
    
    /**
     * Creates an initialized service interface context.
     * 
     * @param serviceInterface The service interface this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def ServiceInterfaceContext createServiceInterfaceContext(ServiceInterface serviceInterface,
        IOverviewVisualizationContext<?> parent) {
        return FACTORY.createServiceInterfaceContext.initialize(serviceInterface, parent)
    }
    
    /**
     * Creates an initialized package object context.
     * 
     * @param packageObject The package object this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def PackageObjectContext createPackageObjectContext(PackageObject packageObject,
        IOverviewVisualizationContext<?> parent) {
        return FACTORY.createPackageObjectContext.initialize(packageObject, parent)
    }
    
    /**
     * Creates an initialized product overview context.
     * 
     * @param products The products this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def ProductOverviewContext createProductOverviewContext(List<Product> products,
        IVisualizationContext<?> parent) {
        return FACTORY.createProductOverviewContext.initialize(products, parent)
    }
    
    /**
     * Creates an initialized feature overview context.
     * 
     * @param features The features this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def FeatureOverviewContext createFeatureOverviewContext(List<Feature> features,
        IVisualizationContext<?> parent) {
        return FACTORY.createFeatureOverviewContext.initialize(features, parent)
    }
    
    /**
     * Creates an initialized bundle overview context.
     * 
     * @param bundles The bundles this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def BundleOverviewContext createBundleOverviewContext(List<Bundle> bundles,
        IVisualizationContext<?> parent) {
        return FACTORY.createBundleOverviewContext.initialize(bundles, parent)
    }
    
    /**
     * Creates an initialized bundle category overview context.
     * 
     * @param bundleCategories The bundle categories this visualization is for.
     * @param bundles All bundles that are relevant in this context.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def BundleCategoryOverviewContext createBundleCategoryOverviewContext(List<BundleCategory> bundleCategories,
        List<Bundle> bundles, IVisualizationContext<?> parent) {
        return FACTORY.createBundleCategoryOverviewContext.initialize(bundleCategories, bundles, parent)
    }
    
    /**
     * Creates an initialized service overview context.
     * 
     * @param serviceComponents The service components for this visualization.
     * @param serviceInterfaces The service interfaces for this visualization.
     * @param classesWithInjections The classes that inject service interfaces for this visualization.
     * @param parent The visualization context this element should be added to.
     * @param allowInBundleConnections Configures this overview to allow or disallow showing service components and
     * classes in the bundles they are defined in.
     * @return The initialized visualization context.
     */
    static def ServiceOverviewContext createServiceOverviewContext( List<ServiceComponent> serviceComponents,
        List<ServiceInterface> serviceInterfaces, List<Class> classesWithInjections, IVisualizationContext<?> parent,
        boolean allowInBundleConnections) {
        return FACTORY.createServiceOverviewContext
            .initialize(serviceComponents, serviceInterfaces, classesWithInjections, parent, allowInBundleConnections)
    }
    
    /**
     * Creates an initialized package object overview context.
     * 
     * @param package object The package objects this visualization is for.
     * @param parent The visualization context this element should be added to.
     * @return The initialized visualization context.
     */
    static def PackageObjectOverviewContext createPackageObjectOverviewContext(List<PackageObject> packageObjects,
        IVisualizationContext<?> parent) {
        return FACTORY.createPackageObjectOverviewContext.initialize(packageObjects, parent)
    }

    /**
     * Creates an initialized visualization context.
     * 
     * @param project The project this visualization is for.
     * @return The initialized visualization context.
     */
    static def OsgiViz createOsgiViz(OsgiProject project) {
    	return FACTORY.createOsgiViz.initialize(project, null)
    }
    
    /**
     * Create a Pair with the given key and value.
     * 
     * @param <K> The key's class.
     * @param <V> The value's class.
     * @param key The key or the first value of the pair.
     * @param value The value or the second value of the pair.
     * @return The initialized pair.
     */
    static def <K, V> Pair<K, V> createPair(K key, V value) {
    	val Pair<K, V> pair = FACTORY.createPair
    	pair.key = key
    	pair.value = value
    	
    	return pair
    }
    
    /**
     * Returns all service interfaces referenced by the given service components and eclipse injections.
     * 
     * @param components The service components that implement and require interfaces.
     * @param injections The eclipse injections that inject an interface
     */
    static def HashSet<ServiceInterface> referencedInterfaces(Iterable<ServiceComponent> components,
        Iterable<EclipseInjection> injections) {
        val HashSet<ServiceInterface> serviceInterfaces = newHashSet
        components.forEach [
        	it.serviceInterfaces.forEach [
        		serviceInterfaces.add(it)
        	]
        	it.reference.forEach [
        		serviceInterfaces.add(it.serviceInterface)
        	]
        ]
        
        injections.forEach [
        	serviceInterfaces.add(ModelUtils.injectedInterface(it))
        ]
        
        return serviceInterfaces
    }
    
    /**
     * Creates a list of unique classes that are represented by the eclipse injections of the given bundle.
     * 
     * @param bundle The Bundle used to  search for classes with eclipse injections.
     * @return The classes representing the injections.
     */
    static def List<Class> injectionClasses(Bundle bundle) {
        return injectionClasses(bundle.eclipseInjections)
    }
    
    /**
     * Creates a list of unique classes that represent the given eclipse injections.
     * 
     * @param eis The Eclipse Injections that define the classes.
     * @return The classes representing the injections.
     */
    static def List<Class> injectionClasses(Iterable<EclipseInjection> eis) {
        val HashMap<String, Class> classes = newHashMap
        for (EclipseInjection ei : eis) {
            val String classPath = ei.usedInClass
            var Class theClass = classes.get(classPath)
            if (theClass === null) {
                theClass = createClass(ModelUtils.containedBundle(ei), classPath)
                classes.put(classPath, theClass)
            }
            theClass.injectedInterfaces.add(ModelUtils.injectedInterface(ei))
        }
        return classes.values.toEList
    }

}
