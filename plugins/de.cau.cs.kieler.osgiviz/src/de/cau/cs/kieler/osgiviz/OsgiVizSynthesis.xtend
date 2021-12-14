/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.cau.cs.kieler.osgiviz

import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.osgiviz.osgivizmodel.Option
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
import de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl
import org.eclipse.elk.core.service.ILayoutConfigurationStore
import org.eclipse.elk.core.service.LayoutConnectorsService

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
        var OsgiViz visualizationContext = null
        
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
            
            // Set synthesis and layout options according to the stored options.
            setSynthesisOptions(model.getSynthesisOptions)
            setLayoutOptions(model.getLayoutOptions)
            
        }
        
        diagramSynthesisDelegate.transform(visualizationContext.getModelElement, usedContext)
    }
    
    /**
     * Configures the new synthesis options to be used during this synthesis.
     * 
     * @param newSynthesisOptions The new synthesis options to set.
     */
    protected def void setSynthesisOptions(Iterable<Option> newSynthesisOptions) {
        val allSynthesisOptions = usedContext.displayedSynthesisOptions
        for (storedOption : newSynthesisOptions) {
            val option = allSynthesisOptions.findFirst [ id.equals(storedOption.id) ]
            // Only configure options which are available.
            if (option !== null) {
                SynthesisUtils.configureSynthesisOption(option, storedOption.value, usedContext)
            }
        }
    }
    
    /**
     * Configures the new layout options to be used for layout runs on this model.
     * 
     * @param newLayoutOptions The new layout options to set.
     */
    protected def void setLayoutOptions(Iterable<Option> newLayoutOptions) {
        try {
            val Injector injector = LayoutConnectorsService.instance.getInjector(null, usedContext)
            val ILayoutConfigurationStore.Provider layoutConfigStoreProvider =
                injector.getInstance(ILayoutConfigurationStore.Provider)
            val ILayoutConfigurationStore layoutConfigStore =
                layoutConfigStoreProvider.get(usedContext.diagramWorkbenchPart, usedContext.viewModel)
            for (storedOptions : newLayoutOptions) {
                layoutConfigStore.setOptionValue(storedOptions.id, storedOptions.value)
            }
        } catch (Throwable t) {
            // Continue without loading the layout options, but log it on the console for now.
            println("Cannot load the layout options for this model:")
            t.printStackTrace
        }
    }
    
}
