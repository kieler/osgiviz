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
package de.cau.cs.kieler.osgiviz.ui

import de.cau.cs.kieler.klighd.IKlighdStartupHook
import de.cau.cs.kieler.osgiviz.OsgivizUtilityManager

/**
 * Starts with the IKlighdStartupHook.
 * Setup registering required OsgiViz utility extensions at the OsgivizUtilityManager.
 * 
 * @author ldi
 */
class OsgivizUiKlighdSetup implements IKlighdStartupHook {
	
	override execute(){
		OsgivizUtilityManager.getInstance()
			.registerFileHandler(new OpenBundleManifestEclipse)
	}
}
