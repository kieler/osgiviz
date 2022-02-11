/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2020-2022 by
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
package de.cau.cs.kieler.osgiviz

import de.cau.cs.kieler.klighd.IKlighdStartupHook
import de.cau.cs.kieler.klighd.KlighdDataManager
import de.cau.cs.kieler.osgiviz.actions.ConnectAllAction
import de.cau.cs.kieler.osgiviz.actions.ContextCollapseExpandAction
import de.cau.cs.kieler.osgiviz.actions.ContextExpandAllAction
import de.cau.cs.kieler.osgiviz.actions.ContextRemoveAction
import de.cau.cs.kieler.osgiviz.actions.FocusAction
import de.cau.cs.kieler.osgiviz.actions.OpenBundleManifestAction
import de.cau.cs.kieler.osgiviz.actions.OverviewContextCollapseExpandAction
import de.cau.cs.kieler.osgiviz.actions.RedoAction
import de.cau.cs.kieler.osgiviz.actions.ResetViewAction
import de.cau.cs.kieler.osgiviz.actions.RevealImplementedServiceInterfacesAction
import de.cau.cs.kieler.osgiviz.actions.RevealImplementingServiceComponentsAction
import de.cau.cs.kieler.osgiviz.actions.RevealInjectedServiceInterfacesAction
import de.cau.cs.kieler.osgiviz.actions.RevealReferencedServiceInterfacesAction
import de.cau.cs.kieler.osgiviz.actions.RevealReferencingServiceComponentsAction
import de.cau.cs.kieler.osgiviz.actions.RevealRequiredBundlesAction
import de.cau.cs.kieler.osgiviz.actions.RevealUsedByBundlesAction
import de.cau.cs.kieler.osgiviz.actions.RevealUsedPackagesAction
import de.cau.cs.kieler.osgiviz.actions.SelectRelatedAction
import de.cau.cs.kieler.osgiviz.actions.ShowHideCollapsedAction
import de.cau.cs.kieler.osgiviz.actions.StoreModelAction
import de.cau.cs.kieler.osgiviz.actions.UndoAction

/**
 * Setup registering all KLighD extensions required to run this bundle.
 */
class OsgivizKlighdSetup implements IKlighdStartupHook {
    
    override execute() {
        KlighdDataManager.instance
            .registerAction(SelectRelatedAction.ID, new SelectRelatedAction)
            .registerAction(FocusAction.ID, new FocusAction)
            .registerAction(UndoAction.ID, new UndoAction)
            .registerAction(RedoAction.ID, new RedoAction)
            .registerAction(ResetViewAction.ID, new ResetViewAction)
            .registerAction(StoreModelAction.ID, new StoreModelAction)
            .registerAction(ContextCollapseExpandAction.ID, new ContextCollapseExpandAction)
            .registerAction(ContextExpandAllAction.ID, new ContextExpandAllAction)
            .registerAction(ContextRemoveAction.ID, new ContextRemoveAction)
            .registerAction(OverviewContextCollapseExpandAction.ID, new OverviewContextCollapseExpandAction)
            .registerAction(ConnectAllAction.ID, new ConnectAllAction)
            .registerAction(RevealRequiredBundlesAction.ID, new RevealRequiredBundlesAction)
            .registerAction(RevealRequiredBundlesAction.Recursive.ID, new RevealRequiredBundlesAction.Recursive)
            .registerAction(RevealUsedByBundlesAction.ID, new RevealUsedByBundlesAction)
            .registerAction(RevealUsedByBundlesAction.Recursive.ID, new RevealUsedByBundlesAction.Recursive)
            .registerAction(RevealUsedPackagesAction.ID, new RevealUsedPackagesAction)
            .registerAction(RevealImplementingServiceComponentsAction.ID, new RevealImplementingServiceComponentsAction)
            .registerAction(RevealImplementedServiceInterfacesAction.ID, new RevealImplementedServiceInterfacesAction)
            .registerAction(RevealReferencingServiceComponentsAction.ID, new RevealReferencingServiceComponentsAction)
            .registerAction(RevealReferencedServiceInterfacesAction.ID, new RevealReferencedServiceInterfacesAction)
            .registerAction(RevealInjectedServiceInterfacesAction.ID, new RevealInjectedServiceInterfacesAction)
            .registerAction(ShowHideCollapsedAction.ID, new ShowHideCollapsedAction)
            .registerAction(OpenBundleManifestAction.ID, new OpenBundleManifestAction)
            .registerDiagramSynthesisClass(OsgiDiagramSynthesis.name, OsgiDiagramSynthesis)
            .registerDiagramSynthesisClass(OsgiVizSynthesis.name, OsgiVizSynthesis)
    }
    
}
