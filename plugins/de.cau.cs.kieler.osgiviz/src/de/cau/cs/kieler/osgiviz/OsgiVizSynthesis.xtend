/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl

/**
 * Diagram synthesis for predefined visualization models.
 * 
 * @author nre
 */
@ViewSynthesisShared
class OsgiVizSynthesis extends AbstractDiagramSynthesis<OsgiVizImpl> {
    
    @Inject OsgiDiagramSynthesis diagramSynthesisDelegate
    
    override getInputDataType() {
        OsgiVizImpl
    }
    
    override getDisplayedActions() {
        diagramSynthesisDelegate.displayedActions
    }
    
    override getDisplayedLayoutOptions() {
        diagramSynthesisDelegate.displayedLayoutOptions
    }
       
    override getDisplayedSynthesisOptions() {
        diagramSynthesisDelegate.displayedSynthesisOptions
    }
    
    override transform(OsgiVizImpl model) {
        val visualizationContexts = usedContext.getProperty(OsgiSynthesisProperties.VISUALIZATION_CONTEXTS)
        var index = usedContext.getProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX)
        val rootVisualization = usedContext.getProperty(OsgiSynthesisProperties.MODEL_VISUALIZATION_CONTEXT)
        var IVisualizationContext<?> visualizationContext = null
        
        if (!visualizationContexts.empty && index !== null) {
            visualizationContext = visualizationContexts.get(index)
        }
        // If the visualization context is for another model than the model this method was called for or does not exist
        // yet, reset the contexts.
        if (visualizationContext === null || rootVisualization !== model) {
            visualizationContexts.removeIf [ true ]
            index = 0
            usedContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, index)
            
            // As we use a different model, the root OSGi model may differ from what is shown in the visualization
            // context. So create a new visualization context and initialize and connect it with everything the old model
            // had as well.
            visualizationContext = VisualizationReInitializer.reInitialize(model)
            visualizationContexts.add(visualizationContext)
            usedContext.setProperty(OsgiSynthesisProperties.MODEL_VISUALIZATION_CONTEXT, model)
        }
        
        diagramSynthesisDelegate.transform(visualizationContext.getModelElement, usedContext)
    }
    
}
