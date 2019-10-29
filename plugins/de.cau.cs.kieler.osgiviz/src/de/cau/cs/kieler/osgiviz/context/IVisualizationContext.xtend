package de.cau.cs.kieler.osgiviz.context

import java.util.List
import java.util.Map

/**
 * Interface for visualization contexts of the OSGi model synthesis. Each context may contain child contexts, where each
 * context will give the synthesis additional information in which state parts of the model should be generated in.
 * 
 * @param <M> The model element class this visualization context is for.
 * 
 * @author nre
 */
interface IVisualizationContext<M> {
    /**
     * All contexts that need to be into the view model as children.
     */
    def List<? extends IVisualizationContext<?>> getChildContexts()
    
    /**
     * The model element to get the data from for this context.
     */
    def M getModelElement()
    
    /**
     * The parent visualization context containing this context.
     */
    def IVisualizationContext<?> getParentVisualizationContext()
    
    /**
     * Set the parent visualization context containing this context.
     */
    def void setParentVisualizationContext(IVisualizationContext<?> parent)
    
    /**
     * Initializes all child contexts needed for this element, once it is displayed in a detailed fashion.
     */
    def void initializeChildVisualizationContexts()
    
    /**
     * Performs a deep copy of this visualization context. Only call this on the main visualization context at top level,
     * as it will not copy the 'parent' field and the parent of the object this method is called on will always be null.
     * Any class implementing this deepCopy method therefore has to manually set the new parent on any cloned child
     * visualization context.
     * Also, any direct references to classes from the osgi model itself are not cloned, they should always refer to the
     * original model.
     * 
     * @param seenContexts A map of all already seen and cloned contexts. If this map contains a context that should be
     * cloned as a key, the value is the already cloned context for that. If the map does not contain that, a new clone
     * should be created and added to the map.
     * After this method, all copied contexts have to be contained within this map.
     */
    def IVisualizationContext<M> deepCopy(Map<IVisualizationContext<?>, IVisualizationContext<?>> seenContexts)
}
