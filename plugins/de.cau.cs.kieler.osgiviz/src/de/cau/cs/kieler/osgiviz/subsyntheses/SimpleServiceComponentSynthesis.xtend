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
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a service component that provides functionality to be expanded, when the
 * specific synthesis for service components is called.
 * 
 * @author nre
 */
class SimpleServiceComponentSynthesis extends AbstractSubSynthesis<ServiceComponentContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ServiceComponentContext scc) {
        transform(scc, 0)
    }
    
    def transform(ServiceComponentContext scc, int priority) {
        val serviceComponent = scc.modelElement
        return #[
            scc.createNode() => [
                associateWith(scc)
                data += createKIdentifier => [ it.id = scc.hashCode.toString ]
                // The 'name' attribute of service components really are their ID.
                val label = SynthesisUtils.getId(serviceComponent.name, usedContext)
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addServiceComponentInOverviewRendering(serviceComponent, label, usedContext)
            ]
        ]
    }
    
}
