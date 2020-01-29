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
package de.scheidtbachmann.osgimodel.util;

import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.EclipseInjection;
import de.scheidtbachmann.osgimodel.OsgiProject;
import de.scheidtbachmann.osgimodel.Reference;
import de.scheidtbachmann.osgimodel.ServiceComponent;
import de.scheidtbachmann.osgimodel.ServiceInterface;
import org.eclipse.emf.ecore.EObject;

/**
 * Handy methods for handling with OSGi model elements.
 */
public final class ModelUtils {
    
    /**
     * Returns the injected interface of the given injection.
     * 
     * @param ei The EclipseInjection.
     * @return The injected interface.
     */
    public static ServiceInterface injectedInterface(EclipseInjection ei) {
        // Look for the osgiProject container.
        EObject current = ei;
        while (!(current instanceof OsgiProject)) {
            current = current.eContainer();
        }
        final OsgiProject osgiProject = (OsgiProject) current;
        
        // Look in the project's interfaces and match the searched for interface.
        for (ServiceInterface theInterface: osgiProject.getServiceInterfaces()) {
            if (theInterface.getName().endsWith(ei.getInjectedInterface())) {
            	return theInterface;
            }
        }
        
        return null;
    }
    
    /**
     * Returns the bundle this injection is contained in.
     * 
     * @param ei The EclipseInjection.
     * @return The bundle container.
     */
    public static Bundle containedBundle(EclipseInjection ei) {
        return (Bundle) ei.eContainer();
    }
    
    /**
     * Returns the service component this reference is used by.
     * 
     * @param reference The Reference.
     * @return The component using the reference.
     */
    public static ServiceComponent serviceComponentOf(Reference reference) {
        return (ServiceComponent) reference.eContainer();
    }
    
}