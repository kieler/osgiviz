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

import de.scheidtbachmann.osgimodel.OsgiProject
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about the root project overview.
 * 
 * @author nre
 */
class OsgiProjectContext implements IVisualizationContext<OsgiProject> {
    
    /**
     * The context for the bundle overview.
     */
    @Accessors
    BundleOverviewContext bundleOverviewContext
    
    /**
     * The context for the product overview.
     */
    @Accessors
    ProductOverviewContext productOverviewContext
    
    /**
     * The context for the service overview.
     */
    @Accessors
    ServiceOverviewContext serviceOverviewContext
    
    /**
     * The context for the feature overview.
     */
    @Accessors
    FeatureOverviewContext featureOverviewContext
    
    /**
     * The context for the imported package overview.
     */
    @Accessors
    PackageObjectOverviewContext importedPackageOverviewContext
    
    /**
     * The context for the bundle category overview.
     */
    @Accessors
    BundleCategoryOverviewContext bundleCategoryOverviewContext
    
    /**
     * The OSGi project model to get the data from when visualizing this context.
     */
    OsgiProject project
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    private new() {}
    
    new(OsgiProject project, IVisualizationContext<?> parent) {
        this.parent = parent
        this.project = project
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return #[bundleOverviewContext, productOverviewContext, serviceOverviewContext, featureOverviewContext,
            importedPackageOverviewContext, bundleCategoryOverviewContext]
            as List<? extends IVisualizationContext<? extends EObject>>
    }
    
    override getModelElement() {
        return project
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        productOverviewContext = new ProductOverviewContext(project.products, this)
        productOverviewContext.expanded = true
        bundleOverviewContext = new BundleOverviewContext(project.bundles, this)
        val allInjections = project.bundles.flatMap [ eclipseInjections ].toList
        val allComponents = project.bundles.flatMap [ serviceComponents ].toSet.toList
        serviceOverviewContext = new ServiceOverviewContext(allComponents, project.serviceInterfaces, allInjections,
            this, true)
        featureOverviewContext = new FeatureOverviewContext(project.features, this)
        importedPackageOverviewContext = new PackageObjectOverviewContext(project.importedPackages, this)
        bundleCategoryOverviewContext = new BundleCategoryOverviewContext(project.bundleCategories, this)
    }
    
   override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as OsgiProjectContext
        }
        
        val copy = new OsgiProjectContext
        copy.bundleOverviewContext = bundleOverviewContext.deepCopy(seenContexts) as BundleOverviewContext
        copy.bundleOverviewContext.parentVisualizationContext = copy
        copy.productOverviewContext = productOverviewContext.deepCopy(seenContexts) as ProductOverviewContext
        copy.productOverviewContext.parentVisualizationContext = copy
        copy.serviceOverviewContext = serviceOverviewContext.deepCopy(seenContexts) as ServiceOverviewContext
        copy.serviceOverviewContext.parentVisualizationContext = copy
        copy.featureOverviewContext = featureOverviewContext.deepCopy(seenContexts) as FeatureOverviewContext
        copy.featureOverviewContext.parentVisualizationContext = copy
        copy.importedPackageOverviewContext = importedPackageOverviewContext.deepCopy(seenContexts)
            as PackageObjectOverviewContext
        copy.importedPackageOverviewContext.parentVisualizationContext = copy
        copy.bundleCategoryOverviewContext = bundleCategoryOverviewContext.deepCopy(seenContexts)
            as BundleCategoryOverviewContext
        copy.bundleCategoryOverviewContext.parentVisualizationContext = copy
        
        
        copy.project = project
        
        seenContexts.put(this, copy)
        return copy
    }
    
}
