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

import de.scheidtbachmann.osgimodel.PackageObject
import java.util.Map

/**
 * Context for the OSGi synthesis that contains information about {@link PackageObject}s.
 * 
 * @author nre
 */
class PackageObjectContext implements IVisualizationContext<PackageObject> {
    
    /**
     * The package object to get the data from when visualizing this context.
     */
    PackageObject packageObject
    
    /**
     * The parent visualization context.
     */
    IOverviewVisualizationContext<?> parent
    
    private new() {}
    
    new(PackageObject packageObject, IOverviewVisualizationContext<?> parent) {
        this.parent = parent
        this.packageObject = packageObject
    }
    
    override getChildContexts() {
        return #[]
    }
    
    override getModelElement() {
       return packageObject
    }
    
    override IOverviewVisualizationContext<?> getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent as IOverviewVisualizationContext<PackageObject>
    }
    
    override initializeChildVisualizationContexts() {
        // Nothing to do yet.
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as PackageObjectContext
        }
        
        val clone = new PackageObjectContext
        clone.packageObject = packageObject
        clone.parent = null
        
        seenContexts.put(this, clone)
        return clone
    }
    
}
