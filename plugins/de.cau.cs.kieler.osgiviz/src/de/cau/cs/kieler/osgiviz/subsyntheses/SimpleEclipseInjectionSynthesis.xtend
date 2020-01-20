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
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.EclipseInjectionContext
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of an eclipse injection that provides functionality to be expanded, when the
 * specific synthesis for eclipse injections is called.
 * 
 * @author nre
 */
class SimpleEclipseInjectionSynthesis extends AbstractSubSynthesis<EclipseInjectionContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(EclipseInjectionContext eic) {
        transform(eic, 0)
    }
    
    def transform(EclipseInjectionContext eic, int priority) {
        val eclipseInjection= eic.modelElement
        return #[
            eic.createNode() => [
                associateWith(eic)
                data += createKIdentifier => [ it.id = eic.hashCode.toString ]
                val label = SynthesisUtils.displayedString(eclipseInjection)
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addEclipseInjectionInOverviewRendering(eclipseInjection, label, usedContext)
            ]
        ]
    }
    
}
