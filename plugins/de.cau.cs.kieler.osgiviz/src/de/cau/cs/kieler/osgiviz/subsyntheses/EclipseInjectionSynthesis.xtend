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
package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.OsgiSynthesisProperties
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionContext
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionOverviewContext
import de.scheidtbachmann.osgimodel.EclipseInjection
import de.scheidtbachmann.osgimodel.OsgiProject
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide

import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*

/**
 * Sub-synthesis of {@link OsgiProject}s that handles expanded {@link EclipseInjection} views.
 * 
 * @author nre
 */
class EclipseInjectionSynthesis extends AbstractSubSynthesis<EclipseInjectionContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension KPortExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(EclipseInjectionContext eic) {
        val eclipseInjection= eic.modelElement
        return #[
            eic.createNode() => [
                addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE)
                associateWith(eic)
                data += createKIdentifier => [ it.id = eic.hashCode.toString ]
                // The port that shows the connection to the service interfaces this injection implements with
                // actions to add them to the view.
                val interface = injectedInterface(eclipseInjection)
                if (interface !== null) {
                    // Port for connecting to injected service interface.
                    ports += createPort(eic, "injectedServiceInterface") => [
                        associateWith(eic)
                        // Identifier for connecting to this port.
                        data += createKIdentifier => [ it.id = "injectedServiceInterface" ]
                        // Injected interfaces are always shown and expanded to the west against the drawing
                        // direction.
                        addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                        
                        val boolean injectedInterfaceShown = switch (usedContext.getProperty(
                            OsgiSynthesisProperties.CURRENT_SERVICE_COMPONENT_VISUALIZATION_MODE)) {
                            case PLAIN: {
                                eic.injectedInterfaceShownPlain
                            }
                            case IN_BUNDLES: {
                                eic.injectedInterfaceShownInBundles
                            }
                        }
                        
                        addInjectedServiceInterfacePortRendering(injectedInterfaceShown)
                        width = 12
                        height = 12
                    ]
                }
                
                // Add the rendering.
                val hasChildren = !children.empty
                addEclipseInjectionRendering(eclipseInjection,
                    eic.parentVisualizationContext instanceof EclipseInjectionOverviewContext, hasChildren, usedContext)
            ]
        ]
    }
    
}
