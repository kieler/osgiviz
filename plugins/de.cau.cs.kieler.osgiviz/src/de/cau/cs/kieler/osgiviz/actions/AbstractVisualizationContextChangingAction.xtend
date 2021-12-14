/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019 by
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
package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.Klighd
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import de.cau.cs.kieler.osgiviz.OsgiVizFileHandler
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
import org.eclipse.core.runtime.Status
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * An abstract action that allows to change the {@link IVisualizationContext} for a model so that the old one is still
 * remembered for undo/redo functionality.
 * An action implementing this class should not override the {@code execute} method, but only the
 * {@code changeVisualization} method to modify the visualization context that will be used during the next synthesis.
 * This action will cause KLighD to issue a new synthesis of the base model that will consider the new changed
 * visualization context.
 * 
 * @author nre
 */
abstract class AbstractVisualizationContextChangingAction implements IAction {
    
    final override execute(ActionContext context) {
        val visualizationContexts = context.viewContext.getProperty(OsgiSynthesisProperties.VISUALIZATION_CONTEXTS)
        val index = context.viewContext.getProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX).intValue
        
        val currentVisualizationContext = visualizationContexts.get(index)
        
        // Make a deep-copy of the current context and store it for the action to be the next canditate for the undo
        // function.
        
        // Copy the root context and the currently shown one from the same Copier to guarantee a completely copied
        // context with only the needed view on that.
        val Copier copier = new Copier
        val copiedVisualizationContext = copier.copy(currentVisualizationContext) as OsgiViz
        copier.copyReferences
        
        // Remove this visualization context and all after that, a redo after an action is not possible anymore.
        while (visualizationContexts.size > index) {
            visualizationContexts.remove(index)
        }
        // Put the copy at the old index.
        visualizationContexts.add(index, copiedVisualizationContext)
        
        // The visualization context of the element that this action is performed on.
        val modelVisualizationContext = context.getDomainElement(context.KNode) as IVisualizationContext<?>
        if (!currentVisualizationContext.isChildContextOrEqual(modelVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not currently in the " +
                "currently displayed visualization context:" + this.class
                + "\nSomething during the clone process by the undo action probably went wrong.")
        }
        
        // Change the visualization.
        try {
            changeVisualization(modelVisualizationContext, context)
            
            // Put the old context, that will be updated below at the at index + 1 and remember that new index as the
            // current index.
            visualizationContexts.add(index + 1, currentVisualizationContext)
            context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, index + 1)
            
            OsgiVizFileHandler.writeCurrentModelToFile(context.viewContext, true)
            
            return getActionResult(context)
        } catch (Exception e) {
            // Put an error model in the context and show that. // TODO.
//            val errorModel = new ErrorModel("The action failed to execute and threw an exception.", e)
//            visualizationContexts.add(index + 1, errorModel) // TODO: Vis context of that.
//            context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, index + 1)
            
            // Show the exception, but continue normally.
            Klighd.handle(new Status(Status.ERROR, "de.cau.cs.kieler.osgiviz",
                "Something went wrong while executing the " + this.class.canonicalName + " action.\n" + 
                "Please view the error log and send the stack trace and the way to " +
                "reproduce this error to the developer.", e));
            return getActionResult(context)
        }
    }
    
    /**
     * Modifies the visualization context towards a state that represents what this action should perform.
     * 
     * @param modelVisualizationContext The visualization context of the element that this action is performed on.
     */
    abstract def <M> void changeVisualization(
        IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext)
    
    /**
     * Returns a new {@link ActionResult} this action will return when executed. Should be overriden by individual
     * actions, if additional layout or animation settings need to be set.
     */
    protected def ActionResult getActionResult(ActionContext context) {
        return ActionResult.createResult(true).doSynthesis.doZoomToStay(
            KGraphUtil.getAbsolute(context.KGraphElement), context.KGraphElement)
    }
    
}
