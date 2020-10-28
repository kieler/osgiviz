package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.scheidtbachmann.osgimodel.Bundle
import de.cau.cs.kieler.osgiviz.IOpenFileHandler

class NavigateToBundleAction implements IAction {

    /**
     * This action's ID.
     */
    public static val String ID = NavigateToBundleAction.name
	
	IOpenFileHandler openFileHandler
	
	override execute(ActionContext context) {
		val modelVisualizationContext = SynthesisUtils.getDomainElement(context) as IVisualizationContext<?>
		val modelElement = modelVisualizationContext.modelElement as Bundle
		val String bundleName = modelElement.uniqueId
		openFileHandler.openFile(bundleName)
	
		return ActionResult.createResult(false)
	}
}