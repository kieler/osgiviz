/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz.modelExtension

import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.ServiceInterface
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Data

/**
 * Represents java class files in an OSGi context and their relationship to injected services.
 */
@Data
class Class {
    
    /**
     * The bundle containing this class.
     */
    Bundle bundle
    
    /**
     * The file path to this class. 
     */
    String classPath
    
    ArrayList<ServiceInterface> injectedInterfaces
    
    new (Bundle bundle, String classPath) {
        this.bundle = bundle
        this.classPath = classPath
        injectedInterfaces = new ArrayList
    }
    
}