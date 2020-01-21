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

import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.modelExtension.Class
import de.cau.cs.kieler.osgiviz.modelExtension.ModelUtils
import de.scheidtbachmann.osgimodel.Bundle
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link Bundle}s.
 * 
 * @author nre
 */
class BundleContext implements IVisualizationContext<Bundle> {
    /**
     * Indicates if all required bundles and their connections are shown in this parent's context.
     */
    @Accessors
    boolean allRequiredBundlesShown
    
    /**
     * Indicates if all bundles that require this bundle and their connections are shown in this parent's context.
     */
    @Accessors
    boolean allRequiringBundlesShown
    
    /**
     * Indicated if all used packages resp. the bundles providing the packages and their connections are shown in this
     * parent's context.
     */
    @Accessors
    boolean allUsedPackagesShown
    
    /**
     * The bundle to get the data from when visualizing this context.
     */
    Bundle bundle
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<?> parent
    
    /**
     * The context for the service overview shown in detailed bundles.
     */
    @Accessors
    ServiceOverviewContext serviceOverviewContext
    
    private new() {}
    
    new(Bundle bundle, IOverviewVisualizationContext<?> parent) {
        this.parent = parent
        this.bundle = bundle
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return #[serviceOverviewContext]
    }
    
    override getModelElement() {
       return bundle
    }
    
    override IOverviewVisualizationContext<?> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<Bundle>
    }
    
    override initializeChildVisualizationContexts() {
        // The services in bundles should only be shown if there are any.
        if (!bundle.serviceComponents.empty || !bundle.eclipseInjections.empty) {
            // Determine if this bundle context should contain all service elements in the overview if it should exclude
            // the interfaces (if the bundle itself is shown in a service overview)
            val allServiceInterfaces = if (parent instanceof ServiceOverviewContext) {
                #[]
            }  else {
                SynthesisUtils.referencedInterfaces(bundle.serviceComponents, bundle.eclipseInjections).toList
            }
            
            val List<Class> classesWithInjections = ModelUtils.injectionClasses(bundle)
            serviceOverviewContext = new ServiceOverviewContext(bundle.serviceComponents, allServiceInterfaces,
                classesWithInjections, this, false)
            // Services in bundles in a service overview should be expanded initially.
            if (parentVisualizationContext instanceof ServiceOverviewContext) {
                serviceOverviewContext.expanded = true
            }
        }
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as BundleContext
        }
        
        val clone = new BundleContext
        if (serviceOverviewContext !== null) {
            clone.serviceOverviewContext = serviceOverviewContext.deepCopy(seenContexts)
                as ServiceOverviewContext
            clone.serviceOverviewContext.parentVisualizationContext = clone
        }
        
        clone.allRequiredBundlesShown = allRequiredBundlesShown
        clone.allRequiringBundlesShown = allRequiringBundlesShown
        clone.allUsedPackagesShown = allUsedPackagesShown
        clone.bundle = bundle
        clone.parent = null
        
        seenContexts.put(this, clone)
        return clone
    }
    
}
