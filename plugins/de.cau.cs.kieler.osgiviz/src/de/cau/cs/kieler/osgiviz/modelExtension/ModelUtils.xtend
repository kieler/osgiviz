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
import de.scheidtbachmann.osgimodel.EclipseInjection
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.Reference
import de.scheidtbachmann.osgimodel.ServiceComponent
import de.scheidtbachmann.osgimodel.ServiceInterface
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * Handy methods for handling with OSGi model elements.
 */
final class ModelUtils {
    
    /**
     * Returns the injected interface of the given injection.
     * 
     * @param ei The EclipseInjection.
     * @return The injected interface.
     */
    def static ServiceInterface injectedInterface(EclipseInjection ei) {
        // Look for the osgiProject container.
        var EObject current = ei
        while (!(current instanceof OsgiProject)) {
            current = current.eContainer
        }
        val OsgiProject osgiProject = current as OsgiProject
        
        // Look in the project's interfaces and match the searched for interface.
        val interface = osgiProject.serviceInterfaces.findFirst [
            it.name.endsWith(ei.injectedInterface)
        ]
        
        return interface
    }
    
    /**
     * Returns the bundle this injection is contained in.
     * 
     * @param ei The EclipseInjection.
     * @return The bundle container.
     */
    def static Bundle containedBundle(EclipseInjection ei) {
        return ei.eContainer as Bundle
    }
    
    /**
     * Returns the service component this reference is used by.
     * 
     * @param reference The Reference.
     * @return The component using the reference.
     */
    def static ServiceComponent serviceComponentOf(Reference reference) {
        return reference.eContainer as ServiceComponent
    }
    
    /**
     * Creates a list of unique classes that are represented by the eclipse injections of the given bundle.
     * 
     * @param bundle The Bundle used to  search for classes with eclipse injections.
     * @return The classes representing the injections.
     */
    def static List<Class> injectionClasses(Bundle bundle) {
        return injectionClasses(bundle.eclipseInjections)
    }
    
    /**
     * Creates a list of unique classes that represent the given eclipse injections.
     * 
     * @param eis The Eclipse Injections that define the classes.
     * @return The classes representing the injections.
     */
    def static List<Class> injectionClasses(Iterable<EclipseInjection> eis) {
        val HashMap<String, Class> classes = newHashMap
        for (ei : eis) {
            val classPath = ei.usedInClass
            var class = classes.get(classPath)
            if (class === null) {
                class = new Class(containedBundle(ei), classPath)
                classes.put(classPath, class)
            }
            class.injectedInterfaces.add(injectedInterface(ei))
        }
        
        return classes.values.toList
    }
    
}