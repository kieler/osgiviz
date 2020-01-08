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
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.actions.ToggleServiceConnectionVisualization
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.EclipseInjection
import de.scheidtbachmann.osgimodel.ServiceComponent
import de.scheidtbachmann.osgimodel.ServiceInterface
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Context for the OSGi synthesis that contains information about service overviews.
 * Can contain all {@link ServiceInterface}s, {@link ServiceComponent}s and {@link EclipseInjection}s.
 * 
 * @author nre
 */
class ServiceOverviewContext extends IOverviewVisualizationContext<EObject> {
    
    /**
     * The service component contexts for all service components in their collapsed form.
     */
    @Accessors
    List<ServiceComponentContext> collapsedServiceComponentContexts
    
    /**
     * The service component contexts for all service components in their detailed form.
     */
    @Accessors
    List<ServiceComponentContext> detailedServiceComponentContexts
    
    /**
     * The service interface contexts for all service interfaces in their collapsed form.
     */
    @Accessors
    List<ServiceInterfaceContext> collapsedServiceInterfaceContexts
    
    /**
     * The service interface contexts for all service interfaces in their detailed form.
     */
    @Accessors
    List<ServiceInterfaceContext> detailedServiceInterfaceContexts
    
    /**
     * The eclipse injection contexts for all eclipse injections in their collapsed form.
     */
    @Accessors
    List<EclipseInjectionContext> collapsedEclipseInjectionContexts
    
    /**
     * The eclipse injection contexts for all eclipse injections in their detailed form.
     */
    @Accessors
    List<EclipseInjectionContext> detailedEclipseInjectionContexts
    
    /**
     * All bundles defining the components and injections of this overview, if in bundle connections are allowed, in 
     * their collapsed form.
     */
    @Accessors
    List<BundleContext> collapsedReferencedBundleContexts
    
    /**
     * All bundles defining the components and injections of this overview, if in bundle connections are allowed, in 
     * their detailed form.
     */
    @Accessors
    List<BundleContext> detailedReferencedBundleContexts
    
    /**
     * All connections for the implemented service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceConnectionVisualizationMode#PLAIN} variant or also in any other variant, 
     * if in bundle connections are not allowed.
     * The pairs should be viewed that the first component implements the second interface.
     */
    @Accessors
    List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesPlain
    
    /**
     * All connections for the implemented service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceConnectionVisualizationMode#IN_BUNDLES} variant if in bundle connections are
     * allowed.
     * The pairs should be viewed that the first component implements the second interface.
     */
    @Accessors
    List<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesInBundles
    
    /**
     * All connections for the referenced service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceConnectionVisualizationMode#PLAIN} variant or also in any other variant, 
     * if in bundle connections are not allowed.
     */
    @Accessors
    List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesPlain
    
    /**
     * All connections for the referenced service interface that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceConnectionVisualizationMode#IN_BUNDLES} variant if in bundle connections
     * are allowed.
     */
    @Accessors
    List<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesInBundles
    
    /**
     * All connections for the injected service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceConnectionVisualizationMode#PLAIN} variant if in bundle connections are
     * not allowed.
     * The pairs should be viewed that the first injection context is used to inject the second interface.
     */
    @Accessors
    List<Pair<EclipseInjectionContext, ServiceInterfaceContext>> injectedInterfaceEdgesPlain
    
    /**
     * All connections for the injected service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceConnectionVisualizationMode#IN_BUNDLES} variant if in bundle connections
     * are allowed.
     * The pairs should be viewed that the first injection context is used to inject the second interface.
     */
    @Accessors
    List<Pair<EclipseInjectionContext, ServiceInterfaceContext>> injectedInterfaceEdgesInBundles
    
    /**
     * The service components displayed in this context.
     */
    @Accessors
    List<ServiceComponent> serviceComponents
    
    /**
     * The service interfaces displayed in this context.
     */
    @Accessors
    List<ServiceInterface> serviceInterfaces
    
    /**
     * The eclipse injections displayed in this context.
     */
    @Accessors
    List<EclipseInjection> eclipseInjections
    
    /**
     * The parent visualization context.
     */
    IVisualizationContext<?> parent
    
    /**
     * boolean value storing the current value for the {@link IOverviewVisualizationContext#isExpanded} method.
     */
    boolean expanded
    
    /**
     * Flag to indicate whether this service overview should allow its elements to be shown in the bundles which define
     * the components and injections. If true, this overview can be toggled to show the elements directly flat or in
     * their bundles with the {@link ToggleServiceConnectionVisualization}.
     */
    @Accessors
    boolean allowInBundleConnections
    
    private new() {}
    
    /**
     * Creates a new instance.
     * 
     * @param serviceComponents The service components shown in this overview.
     * @param serviceInterfaces The service interfaces shown in this overview.
     * @param eclipseInjections The injections shown in this overview.
     * @param parent The parent context containing this context.
     * @param allowInBundleConnections Flag to indicate whether this service component overview should allow its
     * components to be shown in the bundles which define the components. If true, this overview can be toggled to show
     * the components directly flat or in their bundles with the {@link ToggleServiceComponentVisualization}.
     */
    new(List<ServiceComponent> serviceComponents, List<ServiceInterface> serviceInterfaces,
        List<EclipseInjection> eclipseInjections, IVisualizationContext<?> parent, boolean allowInBundleConnections) {
        this.parent = parent
        this.serviceComponents = serviceComponents
        this.serviceInterfaces = serviceInterfaces
        this.eclipseInjections = eclipseInjections
        this.allowInBundleConnections = allowInBundleConnections
        collapsedServiceComponentContexts = new LinkedList
        detailedServiceComponentContexts = new LinkedList
        collapsedServiceInterfaceContexts = new LinkedList
        detailedServiceInterfaceContexts = new LinkedList
        collapsedEclipseInjectionContexts = new LinkedList
        detailedEclipseInjectionContexts = new LinkedList
        implementedInterfaceEdgesPlain = new LinkedList
        referencedInterfaceEdgesPlain = new LinkedList
        injectedInterfaceEdgesPlain = new LinkedList
        if (allowInBundleConnections) {
            implementedInterfaceEdgesInBundles = new LinkedList
            referencedInterfaceEdgesInBundles = new LinkedList
            injectedInterfaceEdgesInBundles = new LinkedList
        }
        expanded = false
        initializeChildVisualizationContexts
    }
    
    override getChildContexts() {
        var children = detailedServiceComponentContexts + collapsedServiceComponentContexts
            + collapsedServiceInterfaceContexts + detailedServiceInterfaceContexts
            + collapsedEclipseInjectionContexts + detailedEclipseInjectionContexts
        if (collapsedReferencedBundleContexts !== null) {
            children = children + collapsedReferencedBundleContexts
        }
        if (detailedReferencedBundleContexts !== null) {
            children = children + detailedReferencedBundleContexts
        }
            
        return ImmutableList.copyOf(children)
    }
    
    override getModelElement() {
        return (serviceComponents + serviceInterfaces + eclipseInjections).toList
    }
    
    override getDetailedElements() {
        var Iterable<IVisualizationContext<? extends EObject>> detailedElements = detailedEclipseInjectionContexts 
            + detailedServiceComponentContexts + detailedServiceInterfaceContexts
        if (detailedReferencedBundleContexts !== null) {
           detailedElements = detailedElements + detailedReferencedBundleContexts 
        }
        return detailedElements.toList as List<? extends IVisualizationContext<EObject>>
    }
    
    override getCollapsedElements() {
        var Iterable<IVisualizationContext<? extends EObject>> collapsedElements = collapsedEclipseInjectionContexts
            + collapsedServiceComponentContexts + collapsedServiceInterfaceContexts
        if (collapsedReferencedBundleContexts !== null) {
            collapsedElements = collapsedElements + collapsedReferencedBundleContexts
        }
        return collapsedElements.toList as List<? extends IVisualizationContext<EObject>>
    }
    
    override makeDetailed(IVisualizationContext<? extends EObject> collapsedContext) {
        if (collapsedContext === null) {
            return
        }
        var List<? extends IVisualizationContext<EObject>> detailed
        var List<? extends IVisualizationContext<EObject>> collapsed
        switch (collapsedContext) {
            ServiceComponentContext: {
                detailed = detailedServiceComponentContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedServiceComponentContexts as List<? extends IVisualizationContext<EObject>>
            }
            ServiceInterfaceContext: {
                detailed = detailedServiceInterfaceContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedServiceInterfaceContexts as List<? extends IVisualizationContext<EObject>>
            }
            EclipseInjectionContext: {
                detailed = detailedEclipseInjectionContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedEclipseInjectionContexts as List<? extends IVisualizationContext<EObject>>
            }
            BundleContext: {
                detailed = detailedReferencedBundleContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedReferencedBundleContexts as List<? extends IVisualizationContext<EObject>>
            }
        }
        
        // Only execute this if the element is not already detailed.
        if (detailed.contains(collapsedContext)) {
            return
        }
        
        // This element was previously collapsed, so put it in the detailed list now and initialize its child
        // visualization contexts.
        collapsed.remove(collapsedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (detailed as List<IVisualizationContext<EObject>>).add(collapsedContext as IVisualizationContext<EObject>)
        collapsedContext.initializeChildVisualizationContexts
    }
    
    override collapse(IVisualizationContext<? extends EObject> detailedContext) {
        if (detailedContext === null) {
            return
        }
        var List<? extends IVisualizationContext<EObject>> detailed
        var List<? extends IVisualizationContext<EObject>> collapsed
        switch (detailedContext) {
            ServiceComponentContext: {
                detailed = detailedServiceComponentContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedServiceComponentContexts as List<? extends IVisualizationContext<EObject>>
            }
            ServiceInterfaceContext: {
                detailed = detailedServiceInterfaceContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedServiceInterfaceContexts as List<? extends IVisualizationContext<EObject>>
            }
            EclipseInjectionContext: {
                detailed = detailedEclipseInjectionContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedEclipseInjectionContexts as List<? extends IVisualizationContext<EObject>>
            }
            BundleContext: {
                detailed = detailedReferencedBundleContexts as List<? extends IVisualizationContext<EObject>>
                collapsed = collapsedReferencedBundleContexts as List<? extends IVisualizationContext<EObject>>
            }
        }
        
        // Only execute this if the element is not already collapsed
        if (collapsed.contains(detailedContext)) {
            return
        }
        
        // This element was previously detailed, so put it in the collapsed list now.
        detailed.remove(detailedContext)
        // Only this cast will allow to add the context. We know this adding is type-safe, as the collapsed- and
        // the detailed elements list are always of the same type. If they are not, the collapsed/detailed state
        // here would not make any sense.
        (collapsed as List<IVisualizationContext<EObject>>).add(detailedContext as IVisualizationContext<EObject>)
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
        
        serviceInterfaces.forEach [
            collapsedServiceInterfaceContexts += new ServiceInterfaceContext(it, this)
        ]
        
        eclipseInjections.forEach [
            collapsedEclipseInjectionContexts += new EclipseInjectionContext(it, this)
        ]
        
        if (allowInBundleConnections) {
            collapsedReferencedBundleContexts = new LinkedList
            detailedReferencedBundleContexts = new LinkedList
            val completedBundles = new LinkedList<Bundle>
            
            // Add a new context for each individual bundle these components or injections are contained in.
            serviceComponents.forEach [
                if (!completedBundles.contains(bundle)) {
                    detailedReferencedBundleContexts.add(new BundleContext(bundle, this))
                    completedBundles.add(bundle)
                }
            ]
            eclipseInjections.forEach [
                val bundle = SynthesisUtils.containedBundle(it)
                if (!completedBundles.contains(bundle)) {
                    detailedReferencedBundleContexts.add(new BundleContext(bundle, this))
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
            return alreadyCloned as ServiceOverviewContext
        }
        
        val copy = new ServiceOverviewContext
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
        
        copy.collapsedServiceInterfaceContexts = new LinkedList
        collapsedServiceInterfaceContexts.forEach [
            val newServiceInterfaceContext = deepCopy(seenContexts) as ServiceInterfaceContext
            newServiceInterfaceContext.parentVisualizationContext = copy
            copy.collapsedServiceInterfaceContexts.add(newServiceInterfaceContext)
        ]
        copy.detailedServiceInterfaceContexts = new LinkedList
        detailedServiceInterfaceContexts.forEach [
            val newServiceInterfaceContext = deepCopy(seenContexts) as ServiceInterfaceContext
            newServiceInterfaceContext.parentVisualizationContext = copy
            copy.detailedServiceInterfaceContexts.add(newServiceInterfaceContext)
        ]
        
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
        
        if (collapsedReferencedBundleContexts !== null) {
            copy.collapsedReferencedBundleContexts = new LinkedList
            collapsedReferencedBundleContexts.forEach [
                val newBundleContext = deepCopy(seenContexts) as BundleContext
                newBundleContext.parentVisualizationContext = copy
                copy.collapsedReferencedBundleContexts.add(newBundleContext)
            ]
        }
        if (detailedReferencedBundleContexts !== null) {
            copy.detailedReferencedBundleContexts = new LinkedList
            detailedReferencedBundleContexts.forEach [
                val newBundleContext = deepCopy(seenContexts) as BundleContext
                newBundleContext.parentVisualizationContext = copy
                copy.detailedReferencedBundleContexts.add(newBundleContext)
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
        copy.injectedInterfaceEdgesPlain = new LinkedList
        injectedInterfaceEdgesPlain.forEach [
            copy.injectedInterfaceEdgesPlain.add(key.deepCopy(seenContexts) as EclipseInjectionContext
                -> value.deepCopy(seenContexts) as ServiceInterfaceContext)
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
        if (injectedInterfaceEdgesInBundles !== null) {
            copy.injectedInterfaceEdgesInBundles = new LinkedList
            injectedInterfaceEdgesInBundles.forEach [
                copy.injectedInterfaceEdgesInBundles.add(key.deepCopy(seenContexts) as EclipseInjectionContext
                    -> value.deepCopy(seenContexts) as ServiceInterfaceContext)
            ]
        }
        
        copy.serviceComponents = serviceComponents.clone
        copy.serviceInterfaces = serviceInterfaces.clone
        copy.eclipseInjections = eclipseInjections.clone
        
        copy.expanded = isExpanded
        
        copy.allowInBundleConnections = allowInBundleConnections
        
        seenContexts.put(this, copy)
        return copy
    }
    
    override overviewText() {
        val parentContext = this.parentVisualizationContext
        switch (parentContext) {
            OsgiProjectContext: {
                "All services provided or used in this project."
            }
            ProductContext: {
                "All services provided or used in the product " + parentContext.modelElement.uniqueId + "."
            }
            FeatureContext: {
                "All services provided or used in the feature " + parentContext.modelElement.uniqueId + "."
            }
            BundleContext: {
                "All services provided or used by the bundle " + parentContext.modelElement.uniqueId + "."
            }
            default: {
                "No descriptive text for this service overview available yet."
            }
        }
    }
    
}
