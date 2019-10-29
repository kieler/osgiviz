package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.context.ContextUtils
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import org.eclipse.emf.ecore.EObject

/**
 * Expands the required bundles of any bundle and connects the bundles with an edge from the new bundle's
 * 'usedByBundles' port to this bundle's 'requiredBundles' port. 
 * If all required bundles are already shown, this action reverses its functionality and removes all bundles again.
 * 
 * @author nre
 */
class RevealRequiredBundlesAction extends AbstractVisualizationContextChangingAction {
    
    /**
     * This action's ID.
     */
    public static val String ID = RevealRequiredBundlesAction.name
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        // The BundleContext element for the element that was clicked on.
        val bundleContext = modelVisualizationContext as BundleContext
        
        // The bundle itself from the context.
        val bundle = bundleContext.modelElement
        
        // The bundle overview context this bundle is shown in.
        val bundleOverviewContext = bundleContext.parentVisualizationContext as BundleOverviewContext
        
        // The required bundles that are currently not yet in their detailed view need to be put in that state first.
        val collapsedRequiredBundleContexts = bundleOverviewContext.collapsedElements.filter [
            bundle.requiredBundles.contains(it.modelElement)
        ].toList
        collapsedRequiredBundleContexts.forEach [
            ContextUtils.makeDetailed(bundleOverviewContext, it)
        ]
        
        // The bundle contexts in the overview that the requiredBundle connection can connect to.
        // Use the detailed bundle contexts only, as they are all made detailed above.
        val requiredBundleContexts = bundleOverviewContext.detailedElements.filter [
            bundle.requiredBundles.contains(it.modelElement)
        ].toList
        
        // If all bundles are already connected, remove them all. Otherwise, connect them all.
//        if (ContextUtils.allConnected(bundleContext, requiredBundleContexts, bundleOverviewContext, true)) {
//            requiredBundleContexts.forEach [ requiredBundleContext |
//                ContextUtils.removeRequiredBundleEdge(bundleContext, requiredBundleContext as BundleContext)
//            ]
//        } else {
            requiredBundleContexts.forEach [ requiredBundleContext |
                ContextUtils.addRequiredBundleEdge(bundleContext, requiredBundleContext as BundleContext)
            ]
//        }
        return null
    }
    
}
