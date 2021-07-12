/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
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

import de.cau.cs.kieler.klighd.Klighd
import de.cau.cs.kieler.osgiviz.IOpenFileHandler
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.ui.IEditorDescriptor
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.part.FileEditorInput

/**
 * Opens the manifest file related to the given bundle name from the Eclipse workspace.
 * 
 * @author ldi, nre
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
            val IFile file = bundleProject.getFile("META-INF/MANIFEST.MF")
            val IWorkbench workbench = PlatformUI.getWorkbench()
            val IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage()
            
            try {
                // Try and open the file with the Eclipse PDE manifest editor.
                page.openEditor(new FileEditorInput(file), "org.eclipse.pde.ui.manifestEditor");
            } catch (Throwable t) {
                // If the manifest editor did not work, try the default editor (which is not the manifest editor, reason
                // unknown.
                try {
                    val IEditorDescriptor desc = workbench.getEditorRegistry().getDefaultEditor(file.getName());
                    page.openEditor(new FileEditorInput(file), desc.getId());
                } catch (PartInitException e) {
                    Klighd.log(
                        new Status(IStatus.ERROR, "de.cau.cs.kieler.osgiviz.ui", "Could not open file: " + file.name, e));
                }
            }
        } else {
            Klighd.log(new Status(IStatus.INFO, "de.cau.cs.kieler.osgiviz.ui", "No project found with name: " + artifactId));
        }
    }

}
