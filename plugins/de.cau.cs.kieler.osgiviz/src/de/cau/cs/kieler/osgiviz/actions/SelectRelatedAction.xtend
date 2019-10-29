package de.cau.cs.kieler.osgiviz.actions

import de.cau.cs.kieler.klighd.IAction
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.IVisualizationContext
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * Selects all elements incident to the clicked element and elements representing the same model element.
 * 
 * @author nre
 */
class SelectRelatedAction implements IAction {
    /**
     * This action's ID.
     */
    public static val String ID = SelectRelatedAction.name
    
    override execute(ActionContext context) {
        val viewer = context.activeViewer
        val elementsToSelect = new ArrayList<EObject>
        val clickedElement = context.KGraphElement
        elementsToSelect.add(clickedElement)
        
        // If the element is an edge, also select all incident nodes and labels.
        switch clickedElement {
            KEdge: {
                elementsToSelect.add(clickedElement.source)
                elementsToSelect.add(clickedElement.target)
                elementsToSelect.addAll(clickedElement.labels)
            }
            KNode: {
                // If the element is a node, also select all incident edges and their nodes.
                clickedElement.outgoingEdges.forEach [
                    elementsToSelect.add(it)
                    elementsToSelect.add(it.target)
                ]
                clickedElement.incomingEdges.forEach [
                    elementsToSelect.add(it)
                    elementsToSelect.add(it.source)
                ]
                
                // Also select all nodes representing the same element.
                var clickedModelElement = SynthesisUtils.getDomainElement(context, clickedElement)
                if (clickedModelElement instanceof IVisualizationContext<?>) {
                    clickedModelElement = clickedModelElement.modelElement
                }
                
                var rootKNode = clickedElement
                while (rootKNode.parent !== null) {
                    rootKNode = rootKNode.parent
                }
                val sameDomainElements = new ArrayList<KNode>
                sameDomainElement(rootKNode, clickedModelElement, sameDomainElements, context)
                elementsToSelect.addAll(sameDomainElements)
            }
            KLabel: {
                // If the element is an edge label, also select the edge.
                if (clickedElement.parent instanceof KEdge) {
                    elementsToSelect.add(clickedElement.parent)
                }
            }
        }
        
        viewer.resetSelectionToDiagramElements(elementsToSelect)
        return ActionResult.createResult(false)
    }
    
    /**
     * Recursively add all nodes representing the same domain element as the given one from the {@link KNode} into the
     * given return list.
     * 
     * @param node The root of the node tree from where to start looking for equal domain elements.
     * @param domainElement The domain model element to check against for equality.
     * @param returnList A modifiable list in that all nodes with the same domain element are put in.
     */
    private def void sameDomainElement(KNode node, Object domainElement, List<KNode> returnList,
        ActionContext context) {
        var nodeDomainElement = SynthesisUtils.getDomainElement(context, node)
        if (nodeDomainElement instanceof IVisualizationContext<?>) {
           nodeDomainElement = nodeDomainElement.modelElement 
        }
        if (nodeDomainElement === domainElement) {
            returnList.add(node)
        }
        for (childNode : node.children) {
            sameDomainElement(childNode, domainElement, returnList, context)
        }
    }
    
}
