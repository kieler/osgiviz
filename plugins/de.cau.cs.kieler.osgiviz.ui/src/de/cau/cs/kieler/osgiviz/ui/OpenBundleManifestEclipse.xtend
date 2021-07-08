/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2021 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz.ui

import de.cau.cs.kieler.osgiviz.IOpenFileHandler
import java.net.URI
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.IDE
import de.cau.cs.kieler.klighd.Klighd
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.IStatus

/**
 * Opens the manifest file related to the given bundle name from the Eclipse workspace.
 * 
 * @author ldi
 */
class OpenBundleManifestEclipse implements IOpenFileHandler {

    /**
     * Opens the manifest file in Eclipse with the standard editor.
     * Warning: Related bundle project needs to be open in the Eclipse workspace. Otherwise Eclipse won't be able to find the manifest file.
     * 
     * @param bundleName
     * 		used to locate the related manifest file
     */
    override void openFile(String artifactId) {
        val IProject bundleProject = ResourcesPlugin.getWorkspace().getRoot().getProject(artifactId);
        if (bundleProject.exists() && bundleProject.isOpen) {
            val URI uri = new URI("file://" + bundleProject.getDescription().getLocationURI().getPath() +
                "/META-INF/MANIFEST.MF")
            val IWorkbench workbench = PlatformUI.getWorkbench()
            val IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage()
            // TODO: this does not use the manifest editor, but the default text editor.
            val String editorID = workbench.getEditorRegistry().getDefaultEditor("MANIFEST.MF").getId()
            try {
                // TODO: this editor does not allow tracing back to its source file, it just opens.
                IDE.openEditor(page, uri, editorID, true)
            } catch (PartInitException e) {
                Klighd.log(new Status(IStatus.ERROR, "de.cau.cs.kieler.osgiviz.ui", "Could not open file: " + uri, e));
            }
        } else {
            Klighd.log(new Status(IStatus.INFO, "de.cau.cs.kieler.osgiviz.ui", "No project found with name: " + artifactId));
        }
    }

}
