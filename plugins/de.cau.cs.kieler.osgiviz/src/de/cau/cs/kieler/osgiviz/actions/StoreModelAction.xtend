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
package de.cau.cs.kieler.osgiviz.actions

import com.google.inject.Injector
import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelFactory
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.OsgimodelPackage
import java.text.SimpleDateFormat
import java.util.Collections
import java.util.Date
import org.eclipse.elk.core.data.LayoutMetaDataService
import org.eclipse.elk.core.service.ILayoutConfigurationStore
import org.eclipse.elk.core.service.LayoutConfigurationManager
import org.eclipse.elk.core.service.LayoutConnectorsService
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Persists the currently viewed {@link IVisualizationContext} and the model it belongs to to disk.
 * Uses the path relative to the execution of this model
 * "models/[projectName]-visualization-[yyyyMMddHHmmss].osgiviz".
 * The .osgiviz file can then be opened and viewed and will generate the exact view on the underlying .model file as
 * visualized when saved.
 * Note that the .model file needs to be located next to the .osgiviz file when opening.
 * 
 * @author nre
 */
class StoreModelAction implements IAction {
    /**
     * This action's ID.
     */
    public static val String ID = StoreModelAction.name
    
    override execute(ActionContext context) {
        // Get the currently viewed model from the context.
        val index = context.viewContext.getProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX)
        val contexts = context.viewContext.getProperty(OsgiSynthesisProperties.VISUALIZATION_CONTEXTS)
        val currentContext = contexts.get(index)

        // Also get the osgimodel referred by the osgiviz and store that as well.
        val OsgiViz rootContext = currentContext.rootVisualization
        val OsgiProject rootModel = rootContext?.modelElement
        
        // Take a copy of the context and model first to not mess up the current resource they might be stored in.
        val Copier copier = new Copier(true, true)
        val OsgiProject copiedModel = copier.copy(rootModel) as OsgiProject
        val OsgiViz copiedRoot = copier.copy(rootContext) as OsgiViz
        val copiedContext = if (currentContext === rootContext) {
                copiedRoot
            } else {
                copier.copy(currentContext) as IVisualizationContext<?>
            }
        copier.copyReferences
        
        // Persist the current state of KLighD's synthesis options in the model...
        // ...the synthesis options
        storeSynthesisOptions(copiedRoot, context.activeViewer.viewContext)
        // ...and the layout options
        storeLayoutOptions(copiedRoot, context.activeViewer.viewContext)
        
        // Store the model.
        
        val r = Resource.Factory.Registry.INSTANCE
        val extensionFactories = r.getExtensionToFactoryMap
        val osgivizFileEnding = "osgiviz"
        val modelFileEnding = "model"
        extensionFactories.put(osgivizFileEnding, new XMIResourceFactoryImpl)
        extensionFactories.put(modelFileEnding, new XMIResourceFactoryImpl)
        val resSet = new ResourceSetImpl
        resSet.packageRegistry.put(OsgivizmodelPackage.eNS_URI, OsgivizmodelPackage.eINSTANCE)
        resSet.packageRegistry.put(OsgimodelPackage.eNS_URI, OsgimodelPackage.eINSTANCE)
        
        val folder = "models/"
        val projectName = rootModel.projectName
        val timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date)
        val dotOsgivizFileEnding = "." + osgivizFileEnding
        val filePath = folder + projectName + "-visualization-" + timeStamp + dotOsgivizFileEnding
        
        val res = resSet.createResource(URI.createURI(filePath))
        res.getContents().add(copiedContext)
        
        // A resource to hold the original model to reference to while saving
        val dotModelFileEnding = "." + modelFileEnding
        val osgiModelRes = resSet.createResource(URI.createURI(projectName + dotModelFileEnding))
        osgiModelRes.getContents().add(copiedModel)

        // Save the content.
        res.save(Collections.EMPTY_MAP)
        System.out.println("File stored successfully in " + filePath)
        
        return ActionResult.createResult(false)
    }
    
    /**
     * Stores the currently used synthesis options in the visualization context.
     * 
     * @param visualizationContext The context to save the current options to.
     * @param viewContext The view context used to display the current diagram.
     */
    protected def void storeSynthesisOptions(OsgiViz visualizationContext, ViewContext viewContext) {
        val synthesisOptions = viewContext.displayedSynthesisOptions
        visualizationContext.synthesisOptions.clear
        for (option : synthesisOptions) {
            val storedOption = OsgivizmodelFactory.eINSTANCE.createOption => [
                id = option.id
                value = viewContext.getOptionValue(option).toString
            ]
            visualizationContext.synthesisOptions.add(storedOption)
        }
    }
    
    /**
     * Stores the currently used layout options in the visualization context.
     * 
     * @param visualizationContext The context to save the current options to.
     * @param viewContext The view context used to display the current diagram.
     */
    protected def void storeLayoutOptions(OsgiViz visualizationContext, ViewContext viewContext) {
        val layoutOptions = viewContext.displayedLayoutOptions
        visualizationContext.layoutOptions.clear
        // We need to obtain the LayoutConfigurationManager responsible for the view context to get
        // the current options.
        val Injector injector = LayoutConnectorsService.instance.getInjector(null, viewContext)
        val LayoutConfigurationManager layoutConfigManager = injector.getInstance(LayoutConfigurationManager)
        val ILayoutConfigurationStore.Provider layoutConfigStoreProvider =
            injector.getInstance(ILayoutConfigurationStore.Provider)
        for (option : layoutOptions) {
            val optionData = LayoutMetaDataService.instance.getOptionData(option.first.id)
            val layoutConfigStore =
                layoutConfigStoreProvider.get(viewContext.diagramWorkbenchPart, viewContext.viewModel)
            val optionValue = layoutConfigManager.getOptionValue(optionData, layoutConfigStore)
            val storedOption = OsgivizmodelFactory.eINSTANCE.createOption => [
                id = option.first.id
                value = optionValue.toString
            ]
            visualizationContext.layoutOptions.add(storedOption)
        }
    }
    
}