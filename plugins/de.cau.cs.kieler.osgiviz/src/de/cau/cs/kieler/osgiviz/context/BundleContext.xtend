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
     * The context for the service component overview shown in detailed bundles.
     */
    @Accessors
    ServiceComponentOverviewContext serviceComponentOverviewContext
    
    /**
     * The context for the eclipse injection overview shown in detailed bundles.
     */
    @Accessors
    EclipseInjectionOverviewContext eclipseInjectionOverviewContext
    
    private new() {}
    
    new(Bundle bundle, IOverviewVisualizationContext<?> parent) {
        this.parent = parent
        this.bundle = bundle
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return #[serviceComponentOverviewContext, eclipseInjectionOverviewContext]
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
        // The service components in bundles should only be shown if there are any.
        if (!bundle.serviceComponents.empty) {
            serviceComponentOverviewContext = new ServiceComponentOverviewContext(bundle.serviceComponents, this, false)
            // Service components in bundles in a service component overview should be expanded initially.
            if (parentVisualizationContext instanceof ServiceComponentOverviewContext) {
                serviceComponentOverviewContext.expanded = true
            }
        }
        // Same for the eclipse injections
        if (!bundle.eclipseInjections.empty) {
            eclipseInjectionOverviewContext = new EclipseInjectionOverviewContext(bundle.eclipseInjections, this)
        }
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as BundleContext
        }
        
        val clone = new BundleContext
        if (serviceComponentOverviewContext !== null) {
            clone.serviceComponentOverviewContext = serviceComponentOverviewContext.deepCopy(seenContexts)
                as ServiceComponentOverviewContext
            clone.serviceComponentOverviewContext.parentVisualizationContext = clone
        }
        if (eclipseInjectionOverviewContext !== null) {
            clone.eclipseInjectionOverviewContext = eclipseInjectionOverviewContext.deepCopy(seenContexts)
                as EclipseInjectionOverviewContext
            clone.eclipseInjectionOverviewContext.parentVisualizationContext = clone
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
