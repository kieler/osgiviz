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
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a class that provides functionality to be expanded, when the
 * specific synthesis for classes is called.
 * 
 * @author nre
 */
class SimpleClassSynthesis extends AbstractSubSynthesis<ClassContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ClassContext cc) {
        transform(cc, 0)
    }
    
    def transform(ClassContext cc, int priority) {
        val theClass = cc.modelElement
        return #[
            cc.createNode() => [
                associateWith(cc)
                data += createKIdentifier => [ it.id = cc.hashCode.toString ]
                val label = SynthesisUtils.displayedString(theClass)
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addClassInOverviewRendering(theClass, label, usedContext)
            ]
        ]
    }
    
}
