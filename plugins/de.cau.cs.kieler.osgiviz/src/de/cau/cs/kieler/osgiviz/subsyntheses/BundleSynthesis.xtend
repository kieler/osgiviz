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
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractSubSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.osgiviz.OsgiOptions
import de.cau.cs.kieler.osgiviz.OsgiStyles
import de.cau.cs.kieler.osgiviz.SynthesisUtils
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.OsgiProject
import java.util.EnumSet
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint

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
    @Inject ServiceOverviewSynthesis serviceOverviewSynthesis
    extension KGraphFactory = KGraphFactory.eINSTANCE
        
    override transform(BundleContext bc) {
        val bundle = bc.modelElement
        val node = bc.createNode()
        val proxy = bc.createNode("proxy")
        node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_ORDER)
        node.associateWith(bc)
        proxy.associateWith(bc)
        node.data += createKIdentifier => [ it.id = bc.hashCode.toString ]
        proxy.data += createKIdentifier => [ it.id = bc.hashCode.toString + "-proxy"]
        
        // Only show any connection ports if this bundle is shown in a bundle overview.
        if (bc.parent instanceof BundleOverviewContext) {
            // The ports that show the connection to the usedBy / required bundles with actions to add them to
            // the view.
            val filteredUsedByBundles = SynthesisUtils.filteredElements(bundle.usedByBundle,
                bc.parent as IOverviewVisualizationContext<Bundle>, usedContext)
            if (!filteredUsedByBundles.empty) {
                node.ports += createPort(bc, "usedByBundles") => [
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
                bc.parent as IOverviewVisualizationContext<Bundle>, usedContext)
            if (!filteredRequiredBundles.empty) {
                node.ports += createPort(bc, "requiredBundles") => [
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
                node.ports += createPort(bc, "importedPackages") => [
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
        if (usedContext.getOptionValue(OsgiOptions.BUNDLE_SHOW_SERVICES) === true
            && bc.serviceOverviewContext !== null) {
            node.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
            // Commented out due to null pointer in ELK caused by a possible hierarchic edge going over this box layout
//                    SynthesisUtils.configureBoxLayout(it)
//                    setLayoutOption(BoxLayouterOptions.BOX_PACKING_MODE, PackingMode.GROUP_MIXED)
            val componentOverviewNodes = serviceOverviewSynthesis.transform(bc.serviceOverviewContext)
            node.children += componentOverviewNodes
        }
        
        // Add the rendering.
        val hasChildren = !node.children.empty
        val boolean inOverview = bc.parent instanceof BundleOverviewContext
                              || bc.parent instanceof ServiceOverviewContext
        node.addBundleRendering(bundle, inOverview, hasChildren, usedContext, false)
        proxy.addBundleRendering(bundle, inOverview, hasChildren, usedContext, true)
        
        node.setProperty(KlighdProperties.PROXY_VIEW_RENDER_NODE_AS_PROXY, true)
        // FIXME: Do we need to create a proxy node if we only need its data?
        node.setProperty(KlighdProperties.PROXY_VIEW_PROXY_RENDERING, proxy.data)
        
        return #[node]
    }
    
}
