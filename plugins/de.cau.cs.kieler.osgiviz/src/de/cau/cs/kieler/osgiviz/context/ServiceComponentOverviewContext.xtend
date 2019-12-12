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
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.ServiceComponent
import de.cau.cs.kieler.osgiviz.actions.ToggleServiceComponentVisualization
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about {@link ServiceComponent} overviews.
 * 
 * @author nre
 */
class ServiceComponentOverviewContext implements IOverviewVisualizationContext<ServiceComponent>,
    IInterfaceComponentConnectionHolder {
    
    /**
     * The service component contexts for all service components in their collapsed form.
     */
    List<ServiceComponentContext> collapsedServiceComponentContexts
    
    /**
     * The service component contexts for all service components in their detailed form.
     */
    List<ServiceComponentContext> detailedServiceComponentContexts
    
    /**
     * All service interfaces implemented or referenced by some service component in this overview that are added later
     * by actions to this context.
     */
    @Accessors
    List<ServiceInterfaceContext> implementedOrReferencedServiceInterfaceContexts
    
    /**
     * All bundles defining the components of this overview, if in bundle connections are allowed.
     */
    @Accessors
    List<BundleContext> referencedBundleContexts
    
    /**
     * All connections for the implemented service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant or also in any other variant, 
     * if in bundle connections are not allowed.
     * The pairs should be viewed that the first component implements the second interface.
     */
    @Accessors
    List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesPlain
    
    /**
     * All connections for the implemented service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant if in bundle connections are
     * allowed.
     * The pairs should be viewed that the first component implements the second interface.
     */
    @Accessors
    List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesInBundles
    
    /**
     * All connections for the referenced service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant or also in any other variant, 
     * if in bundle connections are not allowed.
     */
    @Accessors
    List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesPlain
    
    /**
     * All connections for the referenced service interface that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant if in bundle connections are
     * allowed.
     */
    @Accessors
    List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesInBundles
    
    /**
     * The service components displayed in this context.
     */
    List<ServiceComponent> serviceComponents
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    /**
     * Flag to indicate whether this service component overview should allow its components to be shown in the bundles
     * which define the components. If true, this overview can be toggled to show the components directly flat or in
     * their bundles with the {@link ToggleServiceComponentVisualization}.
     */
    @Accessors
    boolean allowInBundleConnections
    
    private new() {}
    
    /**
     * Creates a new instance.
     * 
     * @param serviceComponents The ServiceComponents shown in this overview.
     * @param parent The parent context containing this context.
     * @param allowInBundleConnections Flag to indicate whether this service component overview should allow its
     * components to be shown in the bundles which define the components. If true, this overview can be toggled to show
     * the components directly flat or in their bundles with the {@link ToggleServiceComponentVisualization}.
     */
    new(List<ServiceComponent> serviceComponents, IVisualizationContext<?> parent, boolean allowInBundleConnections) {
        this.parent = parent
        this.serviceComponents = serviceComponents
        this.allowInBundleConnections = allowInBundleConnections
        collapsedServiceComponentContexts = new LinkedList
        detailedServiceComponentContexts = new LinkedList
        implementedOrReferencedServiceInterfaceContexts = new LinkedList
        implementedInterfaceEdgesPlain = new LinkedList
        referencedInterfaceEdgesPlain = new LinkedList
        if (allowInBundleConnections) {
            implementedInterfaceEdgesInBundles = new LinkedList
            referencedInterfaceEdgesInBundles = new LinkedList
        }
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        var children = detailedServiceComponentContexts + collapsedServiceComponentContexts
            + implementedOrReferencedServiceInterfaceContexts
        if (referencedBundleContexts !== null) {
            children = children + referencedBundleContexts
        }
            
        return ImmutableList.copyOf(children)
    }
    
    override getModelElement() {
        return serviceComponents
    }
    
    override getDetailedElements() {
        return detailedServiceComponentContexts
    }
    
    override getCollapsedElements() {
        return collapsedServiceComponentContexts
    }
    
    override getParentVisualizationContext() {
        return parent
    }
    
    override setParentVisualizationContext(IVisualizationContext<?> parent) {
        this.parent = parent
    }
    
    override initializeChildVisualizationContexts() {
        serviceComponents.forEach [
            collapsedServiceComponentContexts += new ServiceComponentContext(it, this)
        ]
        
        if (allowInBundleConnections) {
            referencedBundleContexts = new LinkedList
            // Add a new context for each individual bundle these components are contained in.
            val completedBundles = new LinkedList<Bundle>
            serviceComponents.forEach [
                if (!completedBundles.contains(bundle)) {
                    referencedBundleContexts.add(new BundleContext(bundle, this))
                    completedBundles.add(bundle)
                }
            ]
        }
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
            return alreadyCloned as ServiceComponentOverviewContext
        }
        
        val copy = new ServiceComponentOverviewContext
        copy.collapsedServiceComponentContexts = new LinkedList
        collapsedServiceComponentContexts.forEach [
            val newServiceComponentContext = deepCopy(seenContexts) as ServiceComponentContext
            newServiceComponentContext.parentVisualizationContext = copy
            copy.collapsedServiceComponentContexts.add(newServiceComponentContext)
        ]
        copy.detailedServiceComponentContexts = new LinkedList
        detailedServiceComponentContexts.forEach [
            val newServiceComponentContext = deepCopy(seenContexts) as ServiceComponentContext
            newServiceComponentContext.parentVisualizationContext = copy
            copy.detailedServiceComponentContexts.add(newServiceComponentContext)
        ]
        copy.implementedOrReferencedServiceInterfaceContexts = new LinkedList
        implementedOrReferencedServiceInterfaceContexts.forEach [
            val newServiceInterfaceContext = deepCopy(seenContexts) as ServiceInterfaceContext
            newServiceInterfaceContext.parentVisualizationContext = copy
            copy.implementedOrReferencedServiceInterfaceContexts.add(newServiceInterfaceContext)
        ]
        if (referencedBundleContexts !== null) {
            copy.referencedBundleContexts = new LinkedList
            referencedBundleContexts.forEach [
                val newBundleContext = deepCopy(seenContexts) as BundleContext
                newBundleContext.parentVisualizationContext = copy
                copy.referencedBundleContexts.add(newBundleContext)
            ]
        }
        copy.implementedInterfaceEdgesPlain = new LinkedList
        implementedInterfaceEdgesPlain.forEach [
            copy.implementedInterfaceEdgesPlain.add(key.deepCopy(seenContexts) as ServiceComponentContext
                -> value.deepCopy(seenContexts) as ServiceInterfaceContext)
        ]
        copy.referencedInterfaceEdgesPlain = new LinkedList
        referencedInterfaceEdgesPlain.forEach [
            copy.referencedInterfaceEdgesPlain.add(new ReferencedInterfaceEdgeConnection(
                serviceComponentContext.deepCopy(seenContexts) as ServiceComponentContext,
                serviceInterfaceContext.deepCopy(seenContexts) as ServiceInterfaceContext, reference))
        ]
        
        if (implementedInterfaceEdgesInBundles !== null) {
            copy.implementedInterfaceEdgesInBundles = new LinkedList
            implementedInterfaceEdgesInBundles.forEach [
                copy.implementedInterfaceEdgesInBundles.add(key.deepCopy(seenContexts) as ServiceComponentContext
                    -> value.deepCopy(seenContexts) as ServiceInterfaceContext)
            ]
        }
        
        if (referencedInterfaceEdgesInBundles !== null) {
            copy.referencedInterfaceEdgesInBundles = new LinkedList
            referencedInterfaceEdgesInBundles.forEach [
                copy.referencedInterfaceEdgesInBundles.add(new ReferencedInterfaceEdgeConnection(
                    serviceComponentContext.deepCopy(seenContexts) as ServiceComponentContext,
                    serviceInterfaceContext.deepCopy(seenContexts) as ServiceInterfaceContext, reference))
            ]
        }
        
        copy.serviceComponents = serviceComponents.clone
        
        copy.expanded = isExpanded
        
        copy.allowInBundleConnections = allowInBundleConnections
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        val parentContext = this.parentVisualizationContext
        switch (parentContext) {
            ProductContext: {
                "All service components contained in the product " + parentContext.modelElement.uniqueId + "."
            }
            BundleContext: {
                "All service components provided by the bundle " + parentContext.modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this service component overview available yet."
            }
        }
    }
    
}
