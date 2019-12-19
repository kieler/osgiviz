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
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.osgiviz.OsgiOptions
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.context.BundleContext
import de.cau.cs.kieler.osgiviz.context.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.context.IOverviewVisualizationContext
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.OsgiProject
import java.util.EnumSet
import org.eclipse.elk.core.options.BoxLayouterOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.core.util.BoxLayoutProvider.PackingMode

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * Sub-synthesis of {@link OsgiProject}s that handles expanded {@link Bundle} views.
 * 
 * @author nre
 */
class BundleSynthesis extends AbstractSubSynthesis<BundleContext, KNode> {
    @Inject extension KNodeExtensions
    @Inject extension KPortExtensions
    @Inject extension OsgiStyles
    @Inject ServiceComponentOverviewSynthesis serviceComponentOverviewSynthesis
    @Inject EclipseInjectionOverviewSynthesis eclipseInjectionOverviewSynthesis
    extension KGraphFactory = KGraphFactory.eINSTANCE
        
    override transform(BundleContext bc) {
        val bundle = bc.modelElement
        return #[
            bc.createNode() => [
                addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
                associateWith(bc)
                data += createKIdentifier => [ it.id = bc.hashCode.toString ]
                
                // Only show any connection ports if this bundle is shown in a bundle overview.
                if (bc.parentVisualizationContext instanceof BundleOverviewContext) {
                    // The ports that show the connection to the usedBy / required bundles with actions to add them to
                    // the view.
                    val filteredUsedByBundles = SynthesisUtils.filteredElements(bundle.usedByBundle,
                        bc.parentVisualizationContext as IOverviewVisualizationContext<Bundle>, usedContext)
                    if (!filteredUsedByBundles.empty) {
                        ports += createPort(bc, "usedByBundles") => [
                            associateWith(bc)
                            // Identifier helps for connecting to this port later.
                            data += createKIdentifier => [ it.id = "usedByBundles" ]
                            // Used by bundles are always shown and expanded to the west against the drawing direction.
                            addLayoutParam(CoreOptions::PORT_SIDE, PortSide::WEST)
                            addUsedByBundlesPortRendering(filteredUsedByBundles.size, bc.allRequiringBundlesShown)
                            width = 12
                            height = 12
                        ]
                    }
                    val filteredRequiredBundles = SynthesisUtils.filteredElements(bundle.requiredBundles,
                        bc.parentVisualizationContext as IOverviewVisualizationContext<Bundle>, usedContext)
                    if (!filteredRequiredBundles.empty) {
                        ports += createPort(bc, "requiredBundles") => [
                            associateWith(bc)
                            data += createKIdentifier => [ it.id = "requiredBundles" ]
                            // Required bundles are always shown and expanded to the east with the drawing direction.
                            addLayoutParam(CoreOptions::PORT_SIDE, PortSide::EAST)
                            addLayoutParam(CoreOptions::PORT_INDEX, 0)
                            addRequiredBundlesPortRendering(filteredRequiredBundles.size, bc.allRequiredBundlesShown)
                            width = 12
                            height = 12
                        ]
                    }
                    // Port for connection of imported packages.
                    val importedPackages = bundle.importedPackages
                    if (!importedPackages.empty) {
                        ports += createPort(bc, "importedPackages") => [
                            associateWith(bc)
                            data += createKIdentifier => [ it.id = "importedPackages" ]
                            // Bundles supporting used packages are always shown and expanded to the east with the drawing direction.
                            addLayoutParam(CoreOptions::PORT_SIDE, PortSide::EAST)
                            addLayoutParam(CoreOptions::PORT_INDEX, 1)
                            addUsedPackagesPortRendering(bc.allUsedPackagesShown)
                            width = 12
                            height = 12
                        ]
                    }
                }
                
                // Show a service component overview of all service components provided by this bundle.
                // Only show this, if the option for it says so and if the context is available.
                if (usedContext.getOptionValue(OsgiOptions.BUNDLE_SHOW_SERVICE_COMPONENTS) === true
                    && bc.serviceComponentOverviewContext !== null) {
                    setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                    // Commented out due to null pointer in ELK caused by a possible hierarchic edge going over this box layout
//                    SynthesisUtils.configureBoxLayout(it)
//                    setLayoutOption(BoxLayouterOptions.BOX_PACKING_MODE, PackingMode.GROUP_MIXED)
                    val componentOverviewNodes = serviceComponentOverviewSynthesis.transform(
                        bc.serviceComponentOverviewContext)
                    children += componentOverviewNodes
                }
                
                // Show an overview of all Eclipse Injections of this bundle.
                if (bc.eclipseInjectionOverviewContext !== null) {
                    setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
                    val injectionOverviewNodes = eclipseInjectionOverviewSynthesis.transform(
                        bc.eclipseInjectionOverviewContext)
                    children += injectionOverviewNodes
                }
                
                // Add the rendering.
                val hasChildren = !children.empty
                addBundleRendering(bundle, bc.parentVisualizationContext instanceof BundleOverviewContext, hasChildren,
                    usedContext)
            ]
        ]
    }
    
}
