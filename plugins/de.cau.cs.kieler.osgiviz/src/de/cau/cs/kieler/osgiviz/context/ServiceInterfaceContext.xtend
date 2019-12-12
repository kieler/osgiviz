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

import de.scheidtbachmann.osgimodel.ServiceInterface
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link ServiceInterface}s.
 * 
 * @author nre
 */
class ServiceInterfaceContext implements IVisualizationContext<ServiceInterface> {
    
    /**
     * The service interface to get the data from when visualizing this context.
     */
    ServiceInterface serviceInterface
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<?> parent
    
    /**
     * Indicates whether all service components implementing this service interface are shown and connected to this.
     * This is for the {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant.
     */
    @Accessors
    boolean allImplementingComponentsShownPlain
    
    /**
     * Indicates whether all service components implementing this service interface are shown and connected to this.
     * This is for the {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant.
     */
    @Accessors
    boolean allImplementingComponentsShownInBundles
    
    /**
     * Indicates whether all service components referencing this service interface are shown and connected to this.
     * This is for the {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant.
     */
    @Accessors
    boolean allReferencingComponentsShownPlain
    
    /**
     * Indicates whether all service components referencing this service interface are shown and connected to this.
     * This is for the {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant.
     */
    @Accessors
    boolean allReferencingComponentsShownInBundles
    
    private new() {}
    
    new(ServiceInterface serviceInterface, IOverviewVisualizationContext<?> parent) {
        this.parent = parent
        this.serviceInterface = serviceInterface
    }
    
    override getChildContexts() {
        return #[]
    }
    
    override getModelElement() {
       return serviceInterface
    }
    
    override IOverviewVisualizationContext<?> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<ServiceInterface>
    }
    
    override initializeChildVisualizationContexts() {
        // Nothing to do yet.
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as ServiceInterfaceContext
        }
        
        val copy = new ServiceInterfaceContext
        copy.allImplementingComponentsShownPlain = allImplementingComponentsShownPlain
        copy.allImplementingComponentsShownInBundles = allImplementingComponentsShownInBundles
        copy.allReferencingComponentsShownPlain = allReferencingComponentsShownPlain
        copy.allReferencingComponentsShownInBundles = allReferencingComponentsShownInBundles
        copy.serviceInterface = serviceInterface
        copy.parent = null
        
        seenContexts.put(this, copy)
        return copy
    }
    
}
