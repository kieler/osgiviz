/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019,2021 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz

import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
import de.scheidtbachmann.osgimodel.OsgiProject
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
     * Property pointing towards the list of saved {@link OsgiViz}s that are used to model the currently
     * displayed view and all previously used contexts for undo/redo functionality.
     * Currently does not store a delta between the contexts, but a hard copy of every state used since the beginning
     * default view.
     */
    public static final IProperty<List<OsgiViz>> VISUALIZATION_CONTEXTS
        = new Property<List<OsgiViz>>("osgimodel.visualizationContexts",
            new LinkedList<OsgiViz>)
    
    /**
     * Property pointing towards which index points towards the currently used visualization context in the
     * {@link OsgiSynthesisProperties#VISUALIZATION_CONTEXTS} property that both are stored in the {@link ViewContext}
     * used to display the view model.
     * May be null if no visualization context has been set yet.
     */
    public static final IProperty<Integer> CURRENT_VISUALIZATION_CONTEXT_INDEX
        = new Property<Integer>("osgimodel.currentVisualizationContextIndex", null)
    
    /**
     * The root model visualization context for the OsgiVizSynthesis to figure out the change of file against the usual
     * change of the visualization model.
     * May be null if the model visualization context has not been set yet for the view context.
     */
    public static final IProperty<OsgiViz> MODEL_VISUALIZATION_CONTEXT
        = new Property<OsgiViz>("osgimodel.modelVisualizationContext", null)
    
    /**
     * The current model for that a visualization from a temp file was loaded.
     */
    public static final IProperty<OsgiProject> TEMP_MODEL = new Property<OsgiProject>("osgimodel.tempModel", null)
    
}
