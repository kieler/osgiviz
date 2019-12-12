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
package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import java.util.HashMap
import org.eclipse.core.runtime.Status
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.statushandlers.StatusManager

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
        
        // Make a deep-copy of the current context and store it as the action that can be undone next.
        // To copy the current context, copy from the parent root context ...
        var rootVisualizationContext = currentVisualizationContext
        while (rootVisualizationContext.parentVisualizationContext !== null) {
            rootVisualizationContext = rootVisualizationContext.parentVisualizationContext
        }
        val copiedContexts = new HashMap
        rootVisualizationContext.deepCopy(copiedContexts)
        
        // ... and take the copied reference from that.
        val copiedVisualizationContext = copiedContexts.get(currentVisualizationContext)
        // Remove this visualization context and all after that, a redo after an action is not possible anymore.
        while (visualizationContexts.size > index) {
            visualizationContexts.remove(index)
        }
        // Put the copy at the old index.
        visualizationContexts.add(index, copiedVisualizationContext)
        
        // The visualization context of the element that this action is performed on.
        val modelVisualizationContext = SynthesisUtils.getDomainElement(context) as IVisualizationContext<? extends EObject>
        if (!ContextUtils.isChildContextOrEqual(currentVisualizationContext, modelVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not currently in the " +
                "currently displayed visualization context:" + this.class
                + "\nSomething during the clone process by the undo action probably went wrong.")
        }
        
        // Change the visualization.
        try {
            var newContext = changeVisualization(modelVisualizationContext, context)
            if (newContext === null) {
                newContext = currentVisualizationContext
            }
            
            // Put the old context, that will be updated below at the at index + 1 and remember that new index as the
            // current index.
            visualizationContexts.add(index + 1, newContext)
            context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, index + 1)
            
            return getActionResult(context)
            
        } catch (Exception e) {
            // Put an error model in the context and show that. // TODO.
//            val errorModel = new ErrorModel("The action failed to execute and threw an exception.", e)
//            visualizationContexts.add(index + 1, errorModel) // TODO: Vis context of that.
//            context.viewContext.setProperty(OsgiSynthesisProperties.CURRENT_VISUALIZATION_CONTEXT_INDEX, index + 1)
            
            // Show the exception, but continue normally.
//            e.printStackTrace
            // TODO: remove this eclipse ui dependency once this is possible via a service.
            StatusManager.getManager().handle(new Status(Status.ERROR, "de.cau.cs.kieler.osgiviz",
                "Something went wrong while executing the " + this.class.canonicalName + " action.\n" + 
                "Please view the error log and send the stack trace and the way to " +
                "reproduce this error to the developer.", e), 
                StatusManager.SHOW.bitwiseOr(StatusManager.LOG));
            return getActionResult(context)
        }
    }
    
    /**
     * Modifies the visualization context towards a state that represents what this action should perform.
     * 
     * @param modelVisualizationContext The visualization context of the element that this action is performed on.
     * @return The new main visualization context that will be used for the next synthesis or {@code null} if the
     * visualization focus does not change.
     */
    public abstract def <M extends EObject> IVisualizationContext<?> changeVisualization(
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
