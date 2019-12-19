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
import de.scheidtbachmann.osgimodel.EclipseInjection
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link EclipseInjection} overviews.
 * 
 * @author nre
 */
class EclipseInjectionOverviewContext implements IOverviewVisualizationContext<EclipseInjection> {
    
    /**
     * The eclipse injection contexts for all eclipse injections in their collapsed form.
     */
    List<EclipseInjectionContext> collapsedEclipseInjectionContexts
    
    /**
     * The eclipse injection contexts for all eclipse injections in their detailed form.
     */
    List<EclipseInjectionContext> detailedEclipseInjectionContexts
    
    /**
     * All connections for the injected service interfaces that should be drawn.
     * The pairs should be viewed that the first injection context is used to inject the second interface.
     */
    @Accessors
    List<Pair<EclipseInjectionContext, ServiceInterfaceContext>> injectedInterfaceEdges
    
    /**
     * All service interfaces injected by some element in this overview that are added later by actions to this context.
     */
    @Accessors
    List<ServiceInterfaceContext> injectedInterfaces
    
    /**
     * The eclipse injections displayed in this context.
     */
    List<EclipseInjection> eclipseInjections
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    private new() {}
    
    new(List<EclipseInjection> eclipseInjections, IVisualizationContext<?> parent) {
        this.parent = parent
        this.eclipseInjections = eclipseInjections
        collapsedEclipseInjectionContexts = new LinkedList
        detailedEclipseInjectionContexts = new LinkedList
        injectedInterfaces = new LinkedList
        injectedInterfaceEdges = new LinkedList
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        return ImmutableList.copyOf(detailedEclipseInjectionContexts + collapsedEclipseInjectionContexts
            + injectedInterfaces)
    }
    
    override getModelElement() {
        return eclipseInjections
    }
    
    override getDetailedElements() {
        return detailedEclipseInjectionContexts
    }
    
    override getCollapsedElements() {
        return collapsedEclipseInjectionContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        eclipseInjections.forEach [
            collapsedEclipseInjectionContexts += new EclipseInjectionContext(it, this)
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
            return alreadyCloned as EclipseInjectionOverviewContext
        }
        
        val copy = new EclipseInjectionOverviewContext
        copy.collapsedEclipseInjectionContexts = new LinkedList
        collapsedEclipseInjectionContexts.forEach [
            val newEclipseInjectionContext = deepCopy(seenContexts) as EclipseInjectionContext
            newEclipseInjectionContext.parentVisualizationContext = copy
            copy.collapsedEclipseInjectionContexts.add(newEclipseInjectionContext)
        ]
        copy.detailedEclipseInjectionContexts = new LinkedList
        detailedEclipseInjectionContexts.forEach [
            val newEclipseInjectionContext = deepCopy(seenContexts) as EclipseInjectionContext
            newEclipseInjectionContext.parentVisualizationContext = copy
            copy.detailedEclipseInjectionContexts.add(newEclipseInjectionContext)
        ]
        copy.injectedInterfaces = new LinkedList
        injectedInterfaces.forEach [
            val newServiceInterfaceContext = deepCopy(seenContexts) as ServiceInterfaceContext
            newServiceInterfaceContext.parentVisualizationContext = copy
            copy.injectedInterfaces.add(newServiceInterfaceContext)
        ]
        copy.injectedInterfaceEdges = new LinkedList
        injectedInterfaceEdges.forEach [
            copy.injectedInterfaceEdges.add(key.deepCopy(seenContexts) as EclipseInjectionContext
                -> value.deepCopy(seenContexts) as ServiceInterfaceContext)
        ]
        
        copy.eclipseInjections = eclipseInjections.clone
        
        copy.expanded = isExpanded
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        switch (this.parentVisualizationContext) {
            BundleContext: {
                "All eclipse injections used in the bundle" + (this.parentVisualizationContext as BundleContext)
                    .modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this eclipse injection overview available yet."
            }
        }
    }
    
}
