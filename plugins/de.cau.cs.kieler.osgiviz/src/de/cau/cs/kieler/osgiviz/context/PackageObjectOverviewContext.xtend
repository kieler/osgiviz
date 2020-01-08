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

import com.google.common.collect.ImmutableList
import de.scheidtbachmann.osgimodel.PackageObject
import java.util.LinkedList
import java.util.List
import java.util.Map

/**
 * Context for the OSGi synthesis that contains information about {@link PackageObject} overviews.
 * 
 * @author nre
 */
class PackageObjectOverviewContext extends IOverviewVisualizationContext<PackageObject> {
    
    /**
     * The package object contexts for all package objects in their collapsed form.
     */
    List<PackageObjectContext> collapsedPackageObjectContexts
    
    /**
     * The package object contexts for all package objects in their detailed form.
     */
    List<PackageObjectContext> detailedPackageObjectContexts
    
    /**
     * The package objects displayed in this context.
     */
    List<PackageObject> packageObjects
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    private new() {}
    
    new(List<PackageObject> packageObjects, IVisualizationContext<?> parent) {
        this.parent = parent
        this.packageObjects = packageObjects
        collapsedPackageObjectContexts = new LinkedList
        detailedPackageObjectContexts = new LinkedList
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return ImmutableList.copyOf(detailedPackageObjectContexts + collapsedPackageObjectContexts)
    }
    
    override getModelElement() {
        return packageObjects
    }
    
    override getDetailedElements() {
        return detailedPackageObjectContexts
    }
    
    override getCollapsedElements() {
        return collapsedPackageObjectContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        packageObjects.forEach [
            collapsedPackageObjectContexts += new PackageObjectContext(it, this)
        ]
    }
    
    override isExpanded() {
        return expanded
    }
    
    override setExpanded(boolean newExpanded) {
        this.expanded = newExpanded
    }
    
    override deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts) {
        val alreadyCloned = seenContexts.get(this)
        if (alreadyCloned !== null) {
            return alreadyCloned as PackageObjectOverviewContext
        }
        
        val copy = new PackageObjectOverviewContext
        copy.collapsedPackageObjectContexts = new LinkedList
        collapsedPackageObjectContexts.forEach [
            val newPackageObjectContext = deepCopy(seenContexts) as PackageObjectContext
            newPackageObjectContext.parentVisualizationContext = copy
            copy.collapsedPackageObjectContexts.add(newPackageObjectContext)
        ]
        copy.detailedPackageObjectContexts = new LinkedList
        detailedPackageObjectContexts.forEach [
            val newPackageObjectContext = deepCopy(seenContexts) as PackageObjectContext
            newPackageObjectContext.parentVisualizationContext = copy
            copy.detailedPackageObjectContexts.add(newPackageObjectContext)
        ]
        
        copy.packageObjects = packageObjects.clone
        
        copy.expanded = isExpanded
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        val parentContext = this.parentVisualizationContext
        switch (parentContext) {
            OsgiProjectContext: {
                "All package objects contained in or referenced in this project."
            }
            default: {
                "No descriptive text for this package object overview available yet."
            }
        }
    }
    
}
