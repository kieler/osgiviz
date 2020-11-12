package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.scheidtbachmann.osgimodel.Bundle
import de.cau.cs.kieler.osgiviz.OsgivizUtilityManager
import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.IAction.ActionResult

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