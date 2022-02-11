/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2022 by
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

import de.cau.cs.kieler.klighd.KlighdDataManager
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import java.util.HashSet
import java.util.LinkedList
import java.util.Queue
import java.util.Set

/**
 * Recursive version of a reveal action, revealing all elements using the same connection type connected.
 * 
 * @param <C> The visualization context's class to click on and recursively reveal.
 * @param <R> The reveal action revealing all connections for a single source context, called recursively by this.
 */
abstract class RecursiveRevealAction<C extends IVisualizationContext<?>, R extends RevealAction<C>> extends AbstractVisualizationContextChangingAction {
    
    override changeVisualization(IVisualizationContext<?> modelVisualizationContext, ActionContext actionContext) {
        val revealAction = KlighdDataManager.instance.getActionById(revealActionClass.name) as R
        
        // Go through all visualization contexts via BFS to execute the reveal action on.
        // Queue containing all revealed contexts for that the action has not been executed yet.
        val Queue<C> toVisit = new LinkedList
        // All contexts already visited that should not be pushed into the queue anymore.
        val Set<C> visited = new HashSet
        toVisit.add(modelVisualizationContext as C)
        // 'visit' the start context as we start with that directly. 
        visited.add(modelVisualizationContext as C)
        
        while (!toVisit.empty) {
            val current = toVisit.remove
            revealAction.changeVisualization(current, actionContext)
            
            // Fetch the newly connected bundles from the action.
            val newlyConnected = revealAction.newlyConnectedContextsOfSameType
            
            // Add the not yet visited contexts to our queue and visited set for the next iteration.
            for (n : newlyConnected) {
                if (!visited.contains(n)) {
                    toVisit.add(n)
                    visited.add(n)
                }
            }
        }
    }
    
    /**
     * The reveal action that this action calls recursively. Duplicate of the type parameter, as Java cannot directly
     * read that during runtime.
     */
    abstract def Class<R> revealActionClass()
    
}