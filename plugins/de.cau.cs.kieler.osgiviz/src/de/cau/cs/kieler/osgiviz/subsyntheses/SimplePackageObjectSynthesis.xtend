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
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a packages that provides functionality to be expanded, when the specific
 * synthesis for packages is called.
 * 
 * @author nre
 */
class SimplePackageObjectSynthesis extends AbstractSubSynthesis<PackageObjectContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(PackageObjectContext poc) {
        transform(poc, 0)
    }
    
    def transform(PackageObjectContext poc, int priority) {
        val packageObject = poc.modelElement
        return #[
            poc.createNode() => [
                associateWith(poc)
                data += createKIdentifier => [ it.id = poc.hashCode.toString ]
                val label = packageObject.uniqueId
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addGenericRendering(SynthesisUtils.getId(label, usedContext)) // TODO: add a package object specific rendering.
            ]
        ]
    }
    
}
