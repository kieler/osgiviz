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

import com.google.common.collect.Iterables
import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.PackageObjectContext
import de.cau.cs.kieler.osgiviz.context.ProductContext
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.PackageObject
import de.scheidtbachmann.osgimodel.Product
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject

/**
 * Expands the bundles providing packages used by any bundle with and edge from the new bundle to this bundle's
 * 'requiredBundles' port.
 * 
 * @author nre
 */
class RevealUsedPackagesAction extends AbstractVisualizationContextChangingAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealUsedPackagesAction.name
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The BundleContext element for the element that was clicked on.
        val bundleContext = modelVisualizationContext as BundleContext
        
        // The bundle itself from the context.
        val bundle = bundleContext.modelElement
        
        // The bundle overview context this bundle is shown in.
        val bundleOverviewContext = bundleContext.parentVisualizationContext as BundleOverviewContext
        
        // The bundle contexts of all bundles inside this bundle overview, mapped by the bundle.
        val Map<Bundle, BundleContext> bundleContexts = new HashMap
        bundleOverviewContext.childContexts.filter(BundleContext).forEach [
            bundleContexts.put(it.modelElement, it)
        ]
        
        
        // Find out which bundle provides this package in which product.
        val osgiModel = actionContext.viewContext.inputModel as OsgiProject
        
        val overviewParentContext = bundleOverviewContext.parentVisualizationContext
        
        // Only show the connections for the product in the context, if there is any.
        var productParent = overviewParentContext
        while (productParent !== null && !(productParent instanceof ProductContext)) {
            productParent = productParent.parentVisualizationContext
        }
        
        val List<Product> products = if (productParent instanceof ProductContext) {
            #[productParent.modelElement]
        } else {
            osgiModel.products
        }
        
        // Find all bundle contexts that need to be connected.
        val importedPackages = bundle.importedPackages

        // Map that tells for each product which of its bundles provides which imported packages.
        val Map<Product, Map<BundleContext, List<PackageObject>>> providedPackagesForBundleForProduct = new HashMap
        val Map<BundleContext, List<PackageObject>> providedPackagesForBundleNoProduct = new HashMap
        
        // Split the imported packages by the ones imported from external packages and the ones provided by some
        // bundle within this project.
        // The external imported packages are all packages that are not found internally and removed from this list.
        val List<PackageObject> externalImportedPackages = new ArrayList(importedPackages)
        
        // Code for all internal packages
        // The relevant products are the products that contain the clicked bundle.
        val relevantProducts = products.filter [ product |
            return product.features.flatMap[ bundles ].toList.contains(bundle)
        ]
        relevantProducts.forEach[ product |
            val Map<BundleContext, List<PackageObject>> providedPackagesForBundle = new HashMap
            
            importedPackages.forEach [ importedPackage |
                // This loops all products for each imported package and looks for the bundle that provides it.
                val productBundles = product.features.flatMap[ bundles ].toList
                val bundleContainingPackage = productBundles.findFirst[ productBundle |
                    productBundle.exportedPackages.findFirst [ uniqueId.equals(importedPackage.uniqueId) ] !== null
                ]
                val bundleContainingPackageContext = bundleContexts.get(bundleContainingPackage)
                if (bundleContainingPackageContext !== null) {
                    // This package is provided by this bundle in this product.
                    if (!providedPackagesForBundle.containsKey(bundleContainingPackageContext)) {
                        providedPackagesForBundle.put(bundleContainingPackageContext, new ArrayList<PackageObject>)
                    }
                    val providedPackages = providedPackagesForBundle.get(bundleContainingPackageContext)
                    providedPackages.add(importedPackage)
                    // The package was found internally, so it does not need to be searched for from the outside anymore.
                    externalImportedPackages.remove(importedPackage)
                }
            ]
            providedPackagesForBundleForProduct.put(product, providedPackagesForBundle)
        ]
        
        // Code for all external packages
        externalImportedPackages.forEach [ importedPackage |
            val usedBundles = osgiModel.bundles
            val bundleContainingPackage = usedBundles.findFirst[ usedBundle |
                usedBundle.exportedPackages.findFirst [ uniqueId.equals(importedPackage.uniqueId) ] !== null
            ]
            val bundleContainingPackageContext = bundleContexts.get(bundleContainingPackage)
            if (bundleContainingPackageContext !== null) {
                // This package is provided by this bundle.
                if (!providedPackagesForBundleNoProduct.containsKey(bundleContainingPackageContext)) {
                    providedPackagesForBundleNoProduct.put(bundleContainingPackageContext, new ArrayList<PackageObject>)
                }
                val providedPackages = providedPackagesForBundleNoProduct.get(bundleContainingPackageContext)
                providedPackages.add(importedPackage)
            }
        ]
        externalImportedPackages.removeAll(providedPackagesForBundleNoProduct.values.flatten)
        
        // Make all necessary bundles detailed.
        val externalBundlesToReveal = providedPackagesForBundleNoProduct.keySet.toList
        val internalBundlesToReveal = providedPackagesForBundleForProduct.values.flatMap [ keySet ].toSet
        Iterables.concat(externalBundlesToReveal, internalBundlesToReveal).forEach [ bundleToMakeDetailedContext |
            if (bundleOverviewContext.collapsedElements.contains(bundleToMakeDetailedContext)) {
                bundleOverviewContext.makeDetailed(bundleToMakeDetailedContext)
            }
        ]
        
        // Put the new connections in the overview context.
        providedPackagesForBundleForProduct.forEach [ product, usedPackagesByBundle |
            usedPackagesByBundle.forEach [ usedPackageBundleContext, usedPackages |
                ContextUtils.addUsedPackagesEdge(bundleContext, usedPackages, product, usedPackageBundleContext)
            ]
        ]
        providedPackagesForBundleNoProduct.forEach [ usedPackageBundleContext, usedPackages |
            ContextUtils.addUsedPackagesEdge(bundleContext, usedPackages, null, usedPackageBundleContext)
        ]
        bundleContext.allUsedPackagesShown = true
        
        // Add the external packages and the connections to them.
        externalImportedPackages.forEach [ package |
            var packageContext = bundleOverviewContext.usedPackageContexts.findFirst [
                modelElement === package
            ]
            if (packageContext === null) {
                packageContext = new PackageObjectContext(package, bundleOverviewContext)
                bundleOverviewContext.usedPackageContexts.add(packageContext)
            }
            ContextUtils.addUsedPackageEdge(bundleContext, packageContext)
        ]
        
        return null
    }
}
