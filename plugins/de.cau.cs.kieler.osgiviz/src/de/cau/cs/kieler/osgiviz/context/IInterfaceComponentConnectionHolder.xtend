package de.cau.cs.kieler.osgiviz.context

import java.util.List

/**
 * Additional interface for visualization contexts that provides functionality for any overview context that holds
 * connections between service components and -interfaces.
 * 
 * @author nre
 */
interface IInterfaceComponentConnectionHolder {
    
    /**
     * All bundles defining the components of this overview.
     */
    def List<BundleContext> getReferencedBundleContexts()
    
    /**
     * All connections for the implemented service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant or also in any other variant, 
     * if in bundle connections are not allowed.
     * The pairs should be viewed that the first component implements the second interface.
     */
    def List<Pair<ServiceComponentContext, ServiceInterfaceContext>> getImplementedInterfaceEdgesPlain()
    
    /**
     * All connections for the implemented service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant if in bundle connections are
     * allowed.
     * The pairs should be viewed that the first component implements the second interface.
     */
    def List<Pair<ServiceComponentContext, ServiceInterfaceContext>> getImplementedInterfaceEdgesInBundles()
    
    /**
     * All connections for the referenced service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#PLAIN} variant or also in any other variant, 
     * if in bundle connections are not allowed.
     */
    def List<ReferencedInterfaceEdgeConnection> getReferencedInterfaceEdgesPlain()
    
    /**
     * All connections for the referenced service interfaces that should be drawn in the
     * {@link OsgiSynthesisProperties$ServiceComponentVisualizationMode#IN_BUNDLES} variant if in bundle connections are
     * allowed.
     */
    def List<ReferencedInterfaceEdgeConnection> getReferencedInterfaceEdgesInBundles()
    
}
