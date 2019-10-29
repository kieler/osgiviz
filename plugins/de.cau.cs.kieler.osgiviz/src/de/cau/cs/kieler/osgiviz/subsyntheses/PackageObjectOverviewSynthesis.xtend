package de.cau.cs.kieler.osgiviz.subsyntheses

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.PackageObjectContext
import de.cau.cs.kieler.osgiviz.context.PackageObjectOverviewContext
import java.util.EnumSet
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.SizeConstraint

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.SynthesisUtils.*

/**
 * Transformation as an overview of all package objects in the given list of package objects.
 * 
 * @author nre
 */
class PackageObjectOverviewSynthesis extends AbstractSubSynthesis<PackageObjectOverviewContext, KNode> {
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension OsgiStyles
    @Inject PackageObjectSynthesis packageObjectSynthesis
    @Inject SimplePackageObjectSynthesis simplePackageObjectSynthesis
    
    extension KGraphFactory = KGraphFactory.eINSTANCE
    
    override transform(PackageObjectOverviewContext packageObjectOverviewContext) {
        return #[
            createNode => [
                associateWith(packageObjectOverviewContext)
                data += createKIdentifier => [ it.id = packageObjectOverviewContext.hashCode.toString ]
                if (packageObjectOverviewContext.expanded) {
                    initiallyExpand
                } else {
                    initiallyCollapse
                }
                setLayoutOption(it, CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                setLayoutOption(it, CoreOptions::DIRECTION, Direction.DOWN)
                setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                addOverviewRendering("Package Objects", packageObjectOverviewContext.overviewText)
                
                // remove the padding of the invisible container.
                addLayoutParam(CoreOptions.PADDING, new ElkPadding(0, 0, 0, 0))
                
                // Add all simple package object renderings in a first subgraph (top)
                val collapsedOverviewNode = transformCollapsedPackageObjectsOverview(packageObjectOverviewContext)
                children += collapsedOverviewNode
                
                // Add all detailed package object renderings and their connections in a second subgraph (bottom)
                val detailedOverviewNode = transformDetailedPackageObjectsOverview(packageObjectOverviewContext)
                children += detailedOverviewNode
                
                // Put an invisible edge between the collapsed and detailed overviews to guarantee the simple renderings
                // are above the detailed ones.
                collapsedOverviewNode.outgoingEdges += createEdge => [
                    addPolyline => [
                        invisible = true
                    ]
                    target = detailedOverviewNode
                ]
            ]
        ]
    }
    
    /**
     * The top part of the package object overview rendering containing all collapsed package object renderings in a box
     * layout.
     * 
     * @param packageObjectOverviewContext The overview context for all package objects in this subsynthesis.
     */
    private def KNode transformCollapsedPackageObjectsOverview(
        PackageObjectOverviewContext packageObjectOverviewContext) {
        val filteredCollapsedPackageObjectContexts = SynthesisUtils.filteredElementContexts(
            packageObjectOverviewContext.collapsedElements, usedContext)
        createNode => [
            associateWith(packageObjectOverviewContext)
            configureBoxLayout
            addInvisibleContainerRendering
            tooltip = packageObjectOverviewContext.overviewText
            
            filteredCollapsedPackageObjectContexts.sortBy [
                modelElement.uniqueId
            ].forEach [ collapsedPackageObjectContext, index |
                children += simplePackageObjectSynthesis.transform(
                    collapsedPackageObjectContext as PackageObjectContext, -index)
            ]
        ]
    }
    
    /**
     * The bottom part of the package object overview rendering containing all detailed package object renderings and
     * their connections in a layered layout.
     * 
     * @param packageObjectOverviewContext The overview context for all package objects in this subsynthesis.
     */
    private def KNode transformDetailedPackageObjectsOverview(
        PackageObjectOverviewContext packageObjectOverviewContext) {
        val filteredDetailedPackageObjectContexts = SynthesisUtils.filteredElementContexts(
            packageObjectOverviewContext.detailedElements, usedContext)
        createNode => [
            associateWith(packageObjectOverviewContext)
            configureOverviewLayout
            addInvisibleContainerRendering
            tooltip = packageObjectOverviewContext.overviewText
            
            children += filteredDetailedPackageObjectContexts.flatMap [
                return packageObjectSynthesis.transform(it as PackageObjectContext)
            ]
        ]
    }
    
}
