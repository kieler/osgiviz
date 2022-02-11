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

import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import java.util.List

/**
 * Abstract action to reveal and connect any new contexts. Requires an extending action to write a new list to the
 * {@link #newlyConnectedContexts} field with all contexts that got connected during its implementation of the
 * {@link #changeVisualization} method.
 * 
 * @author nre
 */
abstract class RevealAction<C extends IVisualizationContext<?>> extends AbstractVisualizationContextChangingAction {
    
    /**
     * All contexts that get connected. Only valid immediately after calling {@link #changeVisualization} on this action.
     */
    protected List<? extends IVisualizationContext<?>> newlyConnectedContexts
    
    /**
     * The context this reveal action can be applied to. Duplicate of the type parameter, as Java cannot directly
     * read that during runtime.
     */
    abstract def Class<C> applicableContext()
    
    /**
     * All contexts of the same type this action is defined for that get connected. Only valid immediately after calling
     * #changeVisualization on this action.
     */
    def Iterable<C> newlyConnectedContextsOfSameType() {
        return newlyConnectedContexts.filter(applicableContext)
    }
    
}
