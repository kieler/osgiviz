/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
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

import de.cau.cs.kieler.osgiviz.IOpenFileHandler
import java.util.List
import java.util.ArrayList

/**
 * Singleton for accessing file handlers registered with osgiviz.
 * 
 * @author ldi
 */
final class OsgivizUtilityManager {

    /** The singleton instance. */
    static OsgivizUtilityManager instance
    /** The registered file handlers. */
    List<IOpenFileHandler> fileHandlerList = new ArrayList()

    /**
     * A private constructor to prevent instantiation.
     */
    private new() {
    }

    /**
     * Returns the singleton instance.
     * 
     * @return the singleton.
     */
    def static OsgivizUtilityManager getInstance() {
        if (instance === null) instance = new OsgivizUtilityManager()
        return instance
    }

    /**
     * @param fileHandler an {@link IOpenFileHandler} object.
     * @return OsgivizUtilityManager singleton instance.
     */
    def OsgivizUtilityManager registerFileHandler(IOpenFileHandler fileHandler) {
        fileHandlerList.add(fileHandler)
        return this
    }

    /**
     * Opens the file related to the given bundle name with the file handler registered last.
     * 
     * @param bundleName used to identify the manifest file.
     */
    def openFile(String bundleName) {
        if (fileHandlerList.isEmpty()) return

        val IOpenFileHandler handler = fileHandlerList.get(fileHandlerList.size() - 1)
        handler.openFile(bundleName)
    }
}
