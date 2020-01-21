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

import de.cau.cs.kieler.osgiviz.OsgiOptions
import de.scheidtbachmann.osgimodel.ServiceComponent
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link ServiceComponent}s.
 * 
 * @author nre
 */
class ServiceComponentContext implements IVisualizationContext<ServiceComponent> {
    
    /**
     * The service component to get the data from when visualizing this context.
     */
    ServiceComponent serviceComponent
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<?> parent
    
    /**
     * Indicates whether all service interfaces implemented by this service component are shown and connected to this.
     * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
     */
    @Accessors
    boolean allImplementedInterfacesShownPlain
    
    /**
     * Indicates whether all service interfaces implemented by this service component are shown and connected to this.
     * This is for the inBundles variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
     */
    @Accessors
    boolean allImplementedInterfacesShownInBundles
    
    /**
     * Indicates whether all service interfaces referenced by this service component are shown and connected to this.
     * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
     */
    @Accessors
    boolean allReferencedInterfacesShownPlain
    
    /**
     * Indicates whether all service interfaces referenced by this service component are shown and connected to this.
     * This is for the inBundles variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
     */
    @Accessors
    boolean allReferencedInterfacesShownInBundles
    
    private new() {}
    
    new(ServiceComponent serviceComponent, IOverviewVisualizationContext<?> parent) {
        this.parent = parent
        this.serviceComponent = serviceComponent
    }
    
    override getChildContexts() {
        return #[]
    }
    
    override getModelElement() {
       return serviceComponent
    }
    
    override IOverviewVisualizationContext<?> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<ServiceComponent>
    }
    
    override initializeChildVisualizationContexts() {
        // Nothing to do yet.
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as ServiceComponentContext
        }
        
        val copy = new ServiceComponentContext
        copy.allImplementedInterfacesShownPlain = allImplementedInterfacesShownPlain
        copy.allImplementedInterfacesShownInBundles = allImplementedInterfacesShownInBundles
        copy.allReferencedInterfacesShownPlain = allReferencedInterfacesShownPlain
        copy.allReferencedInterfacesShownInBundles = allReferencedInterfacesShownInBundles
        copy.serviceComponent = serviceComponent
        copy.parent = null
        
        seenContexts.put(this, copy)
        return copy
    }
    
}
