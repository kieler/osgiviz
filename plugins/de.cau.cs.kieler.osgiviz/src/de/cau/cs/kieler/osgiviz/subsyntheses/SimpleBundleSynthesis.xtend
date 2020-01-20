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
import de.cau.cs.kieler.osgiviz.OsgiOptions.SimpleTextType
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.BundleContext
import org.eclipse.elk.core.options.CoreOptions

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a bundle that provides functionality to be expanded, when the specific 
 * synthesis for bundles is called.
 * 
 * @author nre
 */
class SimpleBundleSynthesis extends AbstractSubSynthesis<BundleContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(BundleContext bc) {
        transform(bc, 0)
    }
    
    def transform(BundleContext bc, int priority) {
        val bundle = bc.modelElement
        return #[
            bc.createNode() => [
                associateWith(bc)
                data += createKIdentifier => [ it.id = bc.hashCode.toString ]
                val label = switch usedContext.getOptionValue(SIMPLE_TEXT) {
                    case SimpleTextType.Id: {
                        SynthesisUtils.getId(bundle.uniqueId, usedContext)
                    }
                    case SimpleTextType.Name: {
                        bundle.descriptiveName
                    }
                } ?: ""
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addBundleInOverviewRendering(bundle, label, usedContext)
            ]
        ]
    }
    
}
