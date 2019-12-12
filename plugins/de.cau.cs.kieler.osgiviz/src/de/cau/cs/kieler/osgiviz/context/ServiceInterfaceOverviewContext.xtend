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
import de.scheidtbachmann.osgimodel.ServiceInterface
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link ServiceInterface} overviews.
 * 
 * Both, the implementing components and the bundles with other contexts of the same components are stored and kept
 * updated in instances of this class, where during the synthesis only one of both variants should be used to visualize,
 * based on the property {@link OsgiSynthesisProperties#CURRENT_SERVICE_COMPONENT_VISUALIZATION_MODE} stored on the
 * model.
 * The same is true for the implementedInterfaceEdges, which are stored and modified for the plain and the in_bundles
 * variant of the view independently.
 * 
 * @author nre
 */
class ServiceInterfaceOverviewContext implements IOverviewVisualizationContext<ServiceInterface>,
    IInterfaceComponentConnectionHolder {
    
    /**
     * All service interfaces that should be drawn in their detailed form.
     */
    List<ServiceInterfaceContext> detailedServiceInterfaceContexts
    
    /**
     * All service interfaces that should be drawn in their collapsed, non-detailed form.
     */
    List<ServiceInterfaceContext> collapsedServiceInterfaceContexts
    
    /**
     * All service components implementing or referencing some service interface in this overview that are added later
     * by actions to this context.
     */
    @Accessors
    List<ServiceComponentContext> implementingOrReferencingServiceComponentContexts
    
    /**
     * All referenced bundles shown that reference some interface of this overview.
     */
    @Accessors
    List<BundleContext> referencedBundleContexts
    
    /**
     * All connections for the implementing service components that should be drawn in the 
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant.
     * The pairs should be viewed that the first component implements the second interface.
     */
    @Accessors
    List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesPlain
    
    /**
     * All connections for the implementing service components that should be drawn in the 
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant.
     * The pairs should be viewed that the first component implements the second interface.
     */
    @Accessors
    List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesInBundles
    
    /**
     * All connections for the referenced service interfaces that should be drawn in the 
     * {@link OsgiSynthesisProperties.ServiceComponentVisualizationMode#PLAIN} variant.
     */
    @Accessors
    List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesPlain
    
    /**
     * All connections for the referenced service interfaces that should be drawn in the 
     * {@link OsgiSynthesisProperties.ServiceComponentVisualizationMode#IN_BUNDLES} variant.
     */
    @Accessors
    List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesInBundles
    
    /**
     * The service interfaces shown in this overview.
     */
    List<ServiceInterface> serviceInterfaces
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    private new() {}
    
    new(List<ServiceInterface> serviceInterfaces, IVisualizationContext<?> parent) {
        this.parent = parent
        this.serviceInterfaces = serviceInterfaces
        detailedServiceInterfaceContexts = new LinkedList
        collapsedServiceInterfaceContexts = new LinkedList
        implementingOrReferencingServiceComponentContexts = new LinkedList
        referencedBundleContexts = new LinkedList
        implementedInterfaceEdgesPlain = new LinkedList
        implementedInterfaceEdgesInBundles = new LinkedList
        referencedInterfaceEdgesPlain = new LinkedList
        referencedInterfaceEdgesInBundles = new LinkedList
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        var children = detailedServiceInterfaceContexts + collapsedServiceInterfaceContexts +
            implementingOrReferencingServiceComponentContexts
        if (referencedBundleContexts !== null) {
            children = children + referencedBundleContexts
        }
        return ImmutableList.copyOf(children)
    }
    
    override getModelElement() {
        return serviceInterfaces
    }
    
    override getDetailedElements() {
        return detailedServiceInterfaceContexts
    }
    
    override getCollapsedElements() {
        return collapsedServiceInterfaceContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        serviceInterfaces.forEach[
            collapsedServiceInterfaceContexts += new ServiceInterfaceContext(it, this)
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
            return alreadyCloned as ServiceInterfaceOverviewContext
        }
        
        val copy = new ServiceInterfaceOverviewContext
        
        copy.detailedServiceInterfaceContexts = new LinkedList
        detailedServiceInterfaceContexts.forEach[
            val newServiceInterfaceContext = deepCopy(seenContexts) as ServiceInterfaceContext
            newServiceInterfaceContext.parentVisualizationContext = copy
            copy.detailedServiceInterfaceContexts.add(newServiceInterfaceContext)
        ]
        copy.collapsedServiceInterfaceContexts = new LinkedList
        collapsedServiceInterfaceContexts.forEach [
            val newServiceInterfaceContext = deepCopy(seenContexts) as ServiceInterfaceContext
            newServiceInterfaceContext.parentVisualizationContext = copy
            copy.collapsedServiceInterfaceContexts.add(newServiceInterfaceContext)
        ]
        copy.implementingOrReferencingServiceComponentContexts = new LinkedList
        implementingOrReferencingServiceComponentContexts.forEach [
            val newServiceComponentContext = deepCopy(seenContexts) as ServiceComponentContext
            newServiceComponentContext.parentVisualizationContext = copy
            copy.implementingOrReferencingServiceComponentContexts.add(newServiceComponentContext)
        ]
        copy.referencedBundleContexts = new LinkedList
        referencedBundleContexts.forEach [
            val newBundleContext = deepCopy(seenContexts) as BundleContext
            newBundleContext.parentVisualizationContext = copy
            copy.referencedBundleContexts.add(newBundleContext)
        ]
        copy.implementedInterfaceEdgesPlain = new LinkedList
        implementedInterfaceEdgesPlain.forEach [
            copy.implementedInterfaceEdgesPlain.add(key.deepCopy(seenContexts) as ServiceComponentContext
                -> value.deepCopy(seenContexts) as ServiceInterfaceContext)
        ]
        copy.implementedInterfaceEdgesInBundles = new LinkedList
        implementedInterfaceEdgesInBundles.forEach [
            copy.implementedInterfaceEdgesInBundles.add(key.deepCopy(seenContexts) as ServiceComponentContext
                -> value.deepCopy(seenContexts) as ServiceInterfaceContext)
        ]
        copy.referencedInterfaceEdgesPlain = new LinkedList
        referencedInterfaceEdgesPlain.forEach [
            copy.referencedInterfaceEdgesPlain.add(new ReferencedInterfaceEdgeConnection(
                serviceComponentContext.deepCopy(seenContexts) as ServiceComponentContext,
                serviceInterfaceContext.deepCopy(seenContexts) as ServiceInterfaceContext, reference))
        ]
        copy.referencedInterfaceEdgesInBundles = new LinkedList
        referencedInterfaceEdgesInBundles.forEach [
            copy.referencedInterfaceEdgesInBundles.add(new ReferencedInterfaceEdgeConnection(
                serviceComponentContext.deepCopy(seenContexts) as ServiceComponentContext,
                serviceInterfaceContext.deepCopy(seenContexts) as ServiceInterfaceContext, reference))
        ]
        
        copy.serviceInterfaces = serviceInterfaces.clone
        
        copy.expanded = isExpanded
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        val parentContext = this.parentVisualizationContext
        switch (parentContext) {
            OsgiProjectContext: {
                "All service interfaces used and defined in this project."
            }
            default: {
                "No descriptive text for this service interface overview available yet."
            }
        }
    }
    
}
