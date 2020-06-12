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

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.OsgimodelPackage
import java.text.SimpleDateFormat
import java.util.Collections
import java.util.Date
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
    
}