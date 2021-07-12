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
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
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
