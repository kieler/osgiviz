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

import de.scheidtbachmann.osgimodel.EclipseInjection
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link EclipseInjection}s.
 * 
 * @author nre
 */
class EclipseInjectionContext implements IVisualizationContext<EclipseInjection> {
    
    /**
     * The eclipse injection to get the data from when visualizing this context.
     */
    EclipseInjection eclipseInjection
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<EclipseInjection> parent
    
    /**
     * Indicates whether the injected interface is shown and connected to this.
     * This is for the {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant.
     */
    @Accessors
    boolean injectedInterfaceShownPlain
    
    /**
     * Indicates whether the injected interface is shown and connected to this.
     * This is for the {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant.
     */
    @Accessors
    boolean injectedInterfaceShownInBundles
    
    private new() {}
    
    new(EclipseInjection eclipseInjection, IOverviewVisualizationContext<EclipseInjection> parent) {
        this.parent = parent
        this.eclipseInjection = eclipseInjection
    }
    
    override getChildContexts() {
        return #[]
    }
    
    override getModelElement() {
       return eclipseInjection
    }
    
    override IOverviewVisualizationContext<EclipseInjection> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<EclipseInjection>
    }
    
    override initializeChildVisualizationContexts() {
        // Nothing to do yet.
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as EclipseInjectionContext
        }
        
        val clone = new EclipseInjectionContext
        clone.eclipseInjection = eclipseInjection
        clone.parent = null
        
        seenContexts.put(this, clone)
        return clone
    }
    
}
