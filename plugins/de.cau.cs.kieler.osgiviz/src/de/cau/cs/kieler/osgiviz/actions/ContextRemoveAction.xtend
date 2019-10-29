package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IInterfaceComponentConnectionHolder
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import de.cau.cs.kieler.osgiviz.context.PackageObjectContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentContext
import de.cau.cs.kieler.osgiviz.context.ServiceComponentOverviewContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceContext
import de.cau.cs.kieler.osgiviz.context.ServiceInterfaceOverviewContext
import org.eclipse.emf.ecore.EObject

/**
 * An action that removes an element's context from an {@link IOverviewVisualizationContext}.
 * 
 * @author nre
 */
class ContextRemoveAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = ContextRemoveAction.name
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // This action will always be performed on a child visualization context of a IOverviewVisualizationContext.
        val overviewVisContext = modelVisualizationContext.parentVisualizationContext
        if (!(overviewVisContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalStateException("This action is performed on an element that is not inside an overview " +
                "visualization!")
        }
        val ovc = overviewVisContext as IOverviewVisualizationContext<M>
        
        switch modelVisualizationContext {
            ServiceComponentContext case ovc instanceof ServiceInterfaceOverviewContext: {
                (ovc as ServiceInterfaceOverviewContext).implementingOrReferencingServiceComponentContexts
                    .remove(modelVisualizationContext)
            }
            BundleContext case ovc instanceof IInterfaceComponentConnectionHolder: {
                (ovc as IInterfaceComponentConnectionHolder).referencedBundleContexts.remove(modelVisualizationContext)
            }
            ServiceInterfaceContext case ovc instanceof ServiceComponentOverviewContext: {
                (ovc as ServiceComponentOverviewContext).implementedOrReferencedServiceInterfaceContexts
                    .remove(modelVisualizationContext)
            }
            PackageObjectContext case ovc instanceof BundleOverviewContext: {
                (ovc as BundleOverviewContext).usedPackageContexts.remove(modelVisualizationContext)
            }
            default: {
                throw new IllegalArgumentException("ContextRemoveAction does not support removing "
                    + modelVisualizationContext.class + " from " + ovc.class + " yet.")
            }
        }
        ContextUtils.removeEdges(ovc, modelVisualizationContext)
        
        return null
    }
    
}
