package de.cau.cs.kieler.osgiviz.ui

import de.cau.cs.kieler.klighd.IKlighdStartupHook
import de.cau.cs.kieler.osgiviz.OsgivizUtilityManager

/**
 * Starts with the IKlighdStartupHook.
 * Setup registering required Osgiviz utility extensions at the OsgivizUtilityManager.
 */
class OsgivizUiKlighdSetup implements IKlighdStartupHook {
	
	override execute(){
		OsgivizUtilityManager.getInstance()
			.registerFileHandler(new OpenBundleManifestEclipse)
	}
}