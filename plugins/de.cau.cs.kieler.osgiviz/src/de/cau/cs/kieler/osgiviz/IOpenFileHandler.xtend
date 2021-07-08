/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2021 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz

/**
 * Handler for opening files referenced by artifacts in OSGiViz.
 * 
 * @author ldi
 */
interface IOpenFileHandler {
    
    /**
     * Opens a file representative for the artifact ID given.
     * 
     * @param artifactId The identifier of some artifact.
     */
	def void openFile (String artifactId)
}