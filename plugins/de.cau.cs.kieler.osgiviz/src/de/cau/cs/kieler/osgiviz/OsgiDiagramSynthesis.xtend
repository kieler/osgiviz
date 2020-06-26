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
package de.cau.cs.kieler.osgiviz

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.DisplayedActionData
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.osgiviz.actions.RedoAction
import de.cau.cs.kieler.osgiviz.actions.ResetViewAction
import de.cau.cs.kieler.osgiviz.actions.StoreModelAction
import de.cau.cs.kieler.osgiviz.actions.UndoAction
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.util.OsgivizmodelUtil
import de.cau.cs.kieler.osgiviz.subsyntheses.BundleCategoryOverviewSynthesis
import de.cau.cs.kieler.osgiviz.subsyntheses.BundleOverviewSynthesis
import de.cau.cs.kieler.osgiviz.subsyntheses.FeatureOverviewSynthesis
import de.cau.cs.kieler.osgiviz.subsyntheses.PackageObjectOverviewSynthesis
import de.cau.cs.kieler.osgiviz.subsyntheses.ProductOverviewSynthesis
import de.cau.cs.kieler.osgiviz.subsyntheses.ServiceOverviewSynthesis
import de.scheidtbachmann.osgimodel.OsgiProject
import java.util.LinkedHashSet
import org.eclipse.elk.alg.layered.options.CrossingMinimizationStrategy
import org.eclipse.elk.alg.layered.options.LayeredMetaDataProvider
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.BoxLayouterOptions
import org.eclipse.elk.core.util.BoxLayoutProvider.PackingMode

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Main diagram synthesis for {@link OsgiProject} models.
 * 
 * @author nre
 */
@ViewSynthesisShared
class OsgiDiagramSynthesis extends AbstractDiagramSynthesis<OsgiProject> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    
    @Inject BundleCategoryOverviewSynthesis bundleCategoryOverviewSynthesis
    @Inject BundleOverviewSynthesis bundleOverviewSynthesis
    @Inject FeatureOverviewSynthesis featureOverviewSynthesis
    @Inject PackageObjectOverviewSynthesis packageObjectOverviewSynthesis
    @Inject ProductOverviewSynthesis productOverviewSynthesis
    @Inject ServiceOverviewSynthesis serviceOverviewSynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override getInputDataType() {
        OsgiProject
    }
    
    override getDisplayedActions() {
        return #[
            DisplayedActionData.create(UndoAction.ID, "Undo",
                "Undoes the last action performed on the view model."),
            DisplayedActionData.create(RedoAction.ID, "Redo",
                "Redoes the last action that was undone on the view model."),
            DisplayedActionData.create(ResetViewAction.ID, "Reset View",
                "Resets the view to its default overview state."),
            DisplayedActionData.create(StoreModelAction.ID, "Store View Model",
                "Stores the current view configuration and model to disk.")
        ]
    }
    
    override getDisplayedLayoutOptions() {
        return ImmutableList::of(
            specifyLayoutOption(LayeredOptions::HIGH_DEGREE_NODES_TREATMENT, #[true, false]),
            specifyLayoutOption(LayeredMetaDataProvider::CROSSING_MINIMIZATION_STRATEGY,
                #[CrossingMinimizationStrategy.INTERACTIVE, CrossingMinimizationStrategy.LAYER_SWEEP])
        )
    }
       
    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet()
        
        // Add general options.
        options.addAll(SIMPLE_TEXT, SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES)
        
        // Add category options.
        options.addAll(FILTER_CATEGORY, TEXT_FILTER_CATEGORY, VIEW_FILTER_CATEGORY, PERFORMANCE)
        
        // Add all text filter options.
        options.addAll(FILTER_BY_BUNDLE_CATEGORY, FILTER_BY, FILTER_BUNDLE_CATEGORIES, FILTER_BUNDLES, FILTER_FEATURES,
            FILTER_PACKAGE_OBJECTS, FILTER_PRODUCTS, FILTER_SERVICE_COMPONENTS, FILTER_SERVICE_INTERFACES,
            FILTER_CLASSES)
        
        // Add all view filter options.
        options.addAll(SHOW_EXTERNAL, BUNDLE_SHOW_SERVICES, FILTER_CARDINALITY_LABEL, FILTER_DESCRIPTIONS,
            DESCRIPTION_LENGTH, SHORTEN_BY, INTERACTIVE_BUTTONS)
        
        // Add all performance options.
        options.addAll(SHOW_ICONS)
        
        return options.toList
    }
    
    override transform(OsgiProject model) {
        val modelNode = createNode.associateWith(model)
        
        // Create a view with the currently stored visualization context in mind. If there is no current context, create
        // a new one for the general OSGi model overview and store that for later use.
        val visualizationContexts = usedContext.getProperty(OsgiSynthesisProperties.VISUALIZATION_CONTEXTS)
        var index = usedContext.getProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX)
        var OsgiViz visualizationContext = null
        
        if (!visualizationContexts.empty && index !== null) {
            visualizationContext = visualizationContexts.get(index)
        }
        // If the visualization context is for another model than the model this method was called for or does not exist
        // yet, reset the contexts.
        if (visualizationContext === null || !visualizationContext.isRootModel(model)) {
            visualizationContexts.removeIf [ true ]
            index = 0
            usedContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, index)
            visualizationContext = OsgivizmodelUtil.createOsgiViz(model)
            visualizationContexts.add(visualizationContext)
        }

        // Make this variable final here for later usage in the lambda.
        val visContext = visualizationContext
        if (visContext.focus === null) {
            // This synthesis can be used.
            
            // The overview of the entire OSGi Project.
            modelNode.children += createNode => [
                associateWith(model)
                data += createKIdentifier => [ it.id = visContext.hashCode.toString ]
                SynthesisUtils.configureBoxLayout(it)
                setLayoutOption(BoxLayouterOptions.BOX_PACKING_MODE, PackingMode.GROUP_MIXED)
                addProjectRendering
                
                val overviewProductNodes = productOverviewSynthesis.transform(visContext.productOverviewContext)
                children += overviewProductNodes
                
                val overviewFeatureNodes = featureOverviewSynthesis.transform(visContext.featureOverviewContext)
                children += overviewFeatureNodes
                
                val overviewBundleNodes = bundleOverviewSynthesis.transform(visContext.bundleOverviewContext)
                children += overviewBundleNodes
                
                val overviewServiceNodes = serviceOverviewSynthesis.transform(visContext.serviceOverviewContext)
                children += overviewServiceNodes
                
//                val overviewImportedPackagesNodes = packageObjectOverviewSynthesis.transform(
//                    visContext.importedPackageOverviewContext)
//                children += overviewImportedPackagesNodes
                
                val overviewBundleCategoryNodes = bundleCategoryOverviewSynthesis.transform(
                    visContext.bundleCategoryOverviewContext)
                children += overviewBundleCategoryNodes
            ]
            
            return modelNode
            
        } else {
            // Delegate the view model generation to another subsynthesis that can show the requested visualization context.
            val children = transformSubModel(visualizationContext.focus)
            
            modelNode.children += children
            
            return modelNode
        }
    }
    
    private def transformSubModel(IVisualizationContext<?> context) {
        switch (context) {
            BundleCategoryOverviewContext: {
                return bundleCategoryOverviewSynthesis.transform(context)
            }
            BundleOverviewContext: {
                return bundleOverviewSynthesis.transform(context)
            }
            FeatureOverviewContext: {
                return featureOverviewSynthesis.transform(context)
            }
            PackageObjectOverviewContext: {
                return packageObjectOverviewSynthesis.transform(context)
            }
            ProductOverviewContext: {
                return productOverviewSynthesis.transform(context)
            }
            ServiceOverviewContext: {
                return serviceOverviewSynthesis.transform(context)
            }
            default: {
                throw new IllegalArgumentException("The context class has no known subsynthesis: " + context.class)
            }
        }
    }
    
}
