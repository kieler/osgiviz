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
