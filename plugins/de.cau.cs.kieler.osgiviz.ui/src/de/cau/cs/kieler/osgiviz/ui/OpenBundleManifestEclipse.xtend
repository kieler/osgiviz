package de.cau.cs.kieler.osgiviz.ui

import java.net.URI
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.ui.IWorkbench
import de.cau.cs.kieler.osgiviz.IOpenFileHandler

/**
 * Opens the manifest file related to the given bundle name from the Eclipse workspace.
 * 
 * @author ldi
 */
class OpenBundleManifestEclipse implements IOpenFileHandler{
	
	/**
	 * Opens the manifest file in Eclipse with the standard editor.
	 * Warning: Related bundle project needs to be open in the Eclipse workspace. Otherwise Eclipse won't be able to find the manifest file.
	 * 
	 * @param bundleName
	 * 		used to locate the related manifest file
	 */
	override void openFile(String bundleName){
		val IProject bundleProject = ResourcesPlugin.getWorkspace().getRoot().getProject(bundleName);
		if (bundleProject.exists() && bundleProject.isOpen) {
			val URI uri =  new URI("file://" + bundleProject.getDescription().getLocationURI().getPath() + "/META-INF/MANIFEST.MF")
			val IWorkbench workbench = PlatformUI.getWorkbench()
			val IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage()
			val String editorID = workbench.getEditorRegistry().getDefaultEditor("Manifest.MF").getId()
			try {
				IDE.openEditor(page, uri, editorID, true)
			} catch (PartInitException e) {
				// inform user
			}
		} else {
			// inform user: bundle project not open in eclipse
		}
	}
	
}