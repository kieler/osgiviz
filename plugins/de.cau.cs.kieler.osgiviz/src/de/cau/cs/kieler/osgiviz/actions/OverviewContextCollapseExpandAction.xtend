package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import org.eclipse.emf.ecore.EObject

/**
 * An action that collapses or expands an overview by setting its {@link IOverviewVisualizationContext} that way.
 * 
 * @author nre
 */
class OverviewContextCollapseExpandAction extends AbstractVisualizationContextChangingAction {
    /**
     * This action's ID.
     */
    public static val String ID = OverviewContextCollapseExpandAction.name 
    
    override <M extends EObject> IVisualizationContext<?>
    changeVisualization(IVisualizationContext<M> modelVisualizationContext, ActionContext actionContext) {
        if (!(modelVisualizationContext instanceof IOverviewVisualizationContext)) {
            throw new IllegalArgumentException("This action can only be called on a IOverviewVisualizationContext. "
                + "Was called on " + modelVisualizationContext.class)
        }
        // Just invert the expanded state.
        val c = modelVisualizationContext as IOverviewVisualizationContext<M>
        c.expanded = !c.expanded
        
        // Also, toggle the expansion state in the viewer.
        actionContext.getActiveViewer().toggleExpansion(actionContext.getKNode());
        
        return null
    }
    
}
