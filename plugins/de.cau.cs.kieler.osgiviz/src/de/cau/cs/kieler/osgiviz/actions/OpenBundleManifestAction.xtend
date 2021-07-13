/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2021 by
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
import de.cau.cs.kieler.osgiviz.OsgivizUtilityManager
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.scheidtbachmann.osgimodel.Bundle

/**
 * Opens the manifest file related to the given bundle via the with OsgivizUtilityManager registered file handler.
 * 
 * @author ldi
 */
class OpenBundleManifestAction implements IAction {

    /**
     * This action's ID.
     */
    public static val String ID = OpenBundleManifestAction.name

    /**
     * @param context
     * 		an {@link ActionContext} which contains the required bundle name
     * @return always a false {@link ActionResult}, no changes on the diagram
     */
    override execute(ActionContext context) {
        val modelVisualizationContext = SynthesisUtils.getDomainElement(context) as IVisualizationContext<?>
        val modelElement = modelVisualizationContext.modelElement as Bundle
        val String bundleName = modelElement.uniqueId
        OsgivizUtilityManager.getInstance().openFile(bundleName)
        return ActionResult.createResult(false)
    }
}
