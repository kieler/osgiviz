package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import org.eclipse.elk.core.options.CoreOptions

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Transformation of a simple view of a service interface that provides functionality to be expanded, when the
 * specific synthesis for service interfaces is called.
 * 
 * @author nre
 */
class SimpleServiceInterfaceSynthesis extends AbstractSubSynthesis<ServiceInterfaceContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension OsgiStyles
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(ServiceInterfaceContext sic) {
        transform(sic, 0)
    }
    
    def transform(ServiceInterfaceContext sic, int priority) {
        val serviceInterface = sic.modelElement
        return #[
            sic.createNode() => [
                associateWith(sic)
                data += createKIdentifier => [ it.id = sic.hashCode.toString ]
                // The 'name' attribute of service interfaces really are their ID.
                val label = SynthesisUtils.getId(serviceInterface.name, usedContext)
                setLayoutOption(CoreOptions::PRIORITY, priority)
                addServiceInterfaceInOverviewRendering(serviceInterface, label)
            ]
        ]
    }
    
}
