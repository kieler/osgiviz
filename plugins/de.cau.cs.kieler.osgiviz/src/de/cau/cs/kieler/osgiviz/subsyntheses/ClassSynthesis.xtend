/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019 by
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
package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.osgivizmodel.Class
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.scheidtbachmann.osgimodel.OsgiProject
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

/**
 * Sub-synthesis of {@link OsgiProject}s that handles expanded {@link Class} views.
 * 
 * @author nre
 */
class ClassSynthesis extends AbstractSubSynthesis<ClassContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension KPortExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ClassContext cc) {
        val theClass = cc.modelElement
        return #[
            cc.createNode() => [
                addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                associateWith(cc)
                data += createKIdentifier => [ it.id = cc.hashCode.toString ]
                // The port that shows the connection to the service interfaces this class injects with
                // actions to add them to the view.
                val interfaces = theClass.injectedInterfaces
                if (!interfaces.empty) {
                    // Port for connecting to injected service interface.
                    ports += createPort(cc, "injectedServiceInterfaces") => [
                        associateWith(cc)
                        // Identifier for connecting to this port.
                        data += createKIdentifier => [ it.id = "injectedServiceInterfaces" ]
                        // Injected interfaces are always shown and expanded to the west against the drawing
                        // direction.
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                        
                        val boolean injectedInterfacesShown = if (usedContext.getOptionValue(
                            SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES) as Boolean) {
                            cc.allInjectedInterfacesShownInBundles
                        } else {
                            cc.allInjectedInterfacesShownPlain
                        }
                        
                        addInjectedServiceInterfacePortRendering(injectedInterfacesShown)
                        width = 12
                        height = 12
                    ]
                }
                
                // Add the rendering.
                val hasChildren = !children.empty
                addClassRendering(theClass, cc.parent instanceof ServiceOverviewContext,
                    hasChildren, usedContext)
            ]
        ]
    }
    
}
