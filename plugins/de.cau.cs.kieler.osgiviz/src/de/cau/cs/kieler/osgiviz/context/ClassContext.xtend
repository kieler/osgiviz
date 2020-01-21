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
import de.cau.cs.kieler.osgiviz.modelExtension.Class
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link Class}es.
 * 
 * @author nre
 */
class ClassContext implements IVisualizationContext<Class> {
    
    /**
     * The class to get the data from when visualizing this context.
     */
    Class theClass
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<?> parent
    
    /**
     * Indicates whether the injected interface is shown and connected to this.
     * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
     */
    @Accessors
    boolean injectedInterfaceShownPlain
    
    /**
     * Indicates whether the injected interface is shown and connected to this.
     * This is for the inBundles variant for the{@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
     */
    @Accessors
    boolean injectedInterfaceShownInBundles
    
    private new() {}
    
    new(Class theClass, IOverviewVisualizationContext<?> parent) {
        this.parent = parent
        this.theClass = theClass
    }
    
    override getChildContexts() {
        return #[]
    }
    
    override getModelElement() {
       return theClass
    }
    
    override IOverviewVisualizationContext<?> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<Class>
    }
    
    override initializeChildVisualizationContexts() {
        // Nothing to do yet.
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as ClassContext
        }
        
        val clone = new ClassContext
        clone.theClass = theClass
        clone.parent = null
        
        seenContexts.put(this, clone)
        return clone
    }
    
}
