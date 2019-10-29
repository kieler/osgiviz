package de.cau.cs.kieler.osgiviz

import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import java.util.LinkedList
import java.util.List
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * Class to provide easy access to properties stored for the syntheses of OSGi models.
 * 
 * @author nre
 */
class OsgiSynthesisProperties {
    /** 
     * Property pointing towards the list of saved {@link IVisualizationContext}s that are used to model the currently
     * displayed view and all previously used contexts for undo/redo functionality.
     * Currently does not store a delta between the contexts, but a hard copy of every state used since the beginning
     * default view.
     */
    public static final IProperty<List<IVisualizationContext<?>>> VISUALIZATION_CONTEXTS
        = new Property<List<IVisualizationContext<?>>>("osgimodel.visualizationContexts",
            new LinkedList<IVisualizationContext<?>>)
    
    /**
     * Property pointing towards which index points towards the currently used visualization context in the
     * {@link OsgiSynthesisProperties#VISUALIZATION_CONTEXTS} property that both are stored in the {@link ViewContext}
     * used to display the view model.
     * May be null if no visualization context has been set yet.
     */
    public static final IProperty<Integer> CURRENT_VISUALIZATION_CONTEXT_INDEX
        = new Property<Integer>("osgimodel.currentVisualizationContextIndex", null)
    
    /**
     * Property indicating whether service components should be synthesized shown in the bundles they are defined by
     * IN_BUNDLES or if they should be synthesized plain PLAIN.
     */
    public static final IProperty<ServiceComponentVisualizationMode> CURRENT_SERVICE_COMPONENT_VISUALIZATION_MODE
        = new Property<ServiceComponentVisualizationMode>("osgimodel.currentShowSCInBundlesMode",
            ServiceComponentVisualizationMode.PLAIN)
    
    /**
     * The different modes how service components are visualized.
     */
    enum ServiceComponentVisualizationMode {
        /**
         * Service components should be visualized on their own.
         */
        PLAIN,
        /**
         * Service components should be visualized with the bundle they are defined in surrounding it.
         */
        IN_BUNDLES
        
    }
    
}
