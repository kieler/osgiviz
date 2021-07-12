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
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.scheidtbachmann.osgimodel.OsgiProject
import de.scheidtbachmann.osgimodel.ServiceInterface
import de.scheidtbachmann.osgimodel.util.ModelUtils
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

/**
 * Sub-synthesis of {@link OsgiProject}s that handles expanded {@link ServiceInterface} views.
 * 
 * @author nre
 */
class ServiceInterfaceSynthesis extends AbstractSubSynthesis<ServiceInterfaceContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension KPortExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ServiceInterfaceContext sic) {
        val serviceInterface = sic.modelElement
        return #[
            sic.createNode() => [
                addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                associateWith(sic)
                data += createKIdentifier => [ it.id = sic.hashCode.toString ]
                
                // The port that shows the connection to the service components this service interface is implemented by
                // with actions to add them to the view.
                val components = serviceInterface.serviceComponent
                if (!components.empty) {
                    ports += createPort(sic, "implementingServiceComponents") => [
                        associateWith(sic)
                        // Identifier helps for connecting to this port later.
                        data += createKIdentifier => [ it.id = "implementingServiceComponents" ]
                        // Implementing components are always shown and expanded to the west against the drawing direction.
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                        
                        val boolean allImplementingComponentsShown = if (usedContext.getOptionValue(
                            SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES) as Boolean) {
                            sic.allImplementingComponentsShownInBundles
                        } else {
                            sic.allImplementingComponentsShownPlain
                        }
                        
                        addImplementingServiceComponentsPortRendering(components.size, allImplementingComponentsShown)
                        width = 16
                        height = 16
                    ]
                }
                
                // The port that shows the connection to the service components referencing this service interface with
                // actions to add them to the view.
                val referencingComponents = serviceInterface.referencedBy.map [
                    ModelUtils.serviceComponentOf(it)
                ]
                if (!referencingComponents.empty) {
                    ports += createPort(sic, "referencingServiceComponents") => [
                        associateWith(sic)
                        // Identifier helps for connecting to this port.
                        data += createKIdentifier => [ it.id = "referencingServiceComponents"]
                        // Referencing components are always shown and expanded to the east with the drawing direction.
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide::EAST)
                        
                        val boolean allReferencingComponentsShown = if (usedContext.getOptionValue(
                            SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES) as Boolean) {
                            sic.allReferencingComponentsShownInBundles
                        } else {
                            sic.allReferencingComponentsShownPlain
                        }
                        
                        addReferencingComponentsShownPortRendering(referencingComponents.size,
                            allReferencingComponentsShown)
                        width = 9.5f
                        height = 19
                    ]
                }
                
                // Add the rendering.
                val hasChildren = !children.empty
                addServiceInterfaceRendering(serviceInterface,
                    sic.parent instanceof ServiceOverviewContext, hasChildren, usedContext)
            ]
        ]
    }
    
}
