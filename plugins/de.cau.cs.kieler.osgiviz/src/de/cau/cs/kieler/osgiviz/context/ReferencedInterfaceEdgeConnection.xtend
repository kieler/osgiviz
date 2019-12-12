/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2019 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz.context

import de.scheidtbachmann.osgimodel.Reference
import org.eclipse.xtend.lib.annotations.Data

/**
 * Helper data class that contains information about edges that should be visualized for referenced interface
 * associations. This class contains the source component context, the target interface context and the
 * {@link Reference} data.
 * 
 * @author nre
 */
@Data
class ReferencedInterfaceEdgeConnection {
    new(ServiceComponentContext serviceComponentContext, ServiceInterfaceContext serviceInterfaceContext,
        Reference reference) {
        this.serviceComponentContext = serviceComponentContext
        this.serviceInterfaceContext = serviceInterfaceContext
        this.reference = reference
    }
    
    /**
     * The service component context of the target service component the edge should connect to.
     */
    ServiceComponentContext serviceComponentContext
    
    /**
     * The service interface context of the source service interface the edge should connect to.
     */
    ServiceInterfaceContext serviceInterfaceContext
    
    /**
     * The reference containing more data about this edge.
     */
    Reference reference
}
