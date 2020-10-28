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

class EclipseFileHandler implements IOpenFileHandler{
	
	override void openFile(String fileName){
		val IProject bundleProject = ResourcesPlugin.getWorkspace().getRoot().getProject(fileName);
		val IWorkbench workbench = PlatformUI.getWorkbench()
		if (bundleProject.exists() && bundleProject.isOpen) {
			val URI uri =  new URI("file://" + bundleProject.getDescription().getLocationURI().getPath() + "/META-INF/MANIFEST.MF")
			val IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage()
		//	val IEditorDescriptor[] editors = PlatformUI.getWorkbench().getEditorRegistry().getEditors(filename)
			val String editorID = workbench.getEditorRegistry().getDefaultEditor("Manifest.MF").getId()
			try {
				IDE.openEditor(page, uri, editorID, true)
			} catch (PartInitException e) {
				
			}
		} else {
			// inform user: bundle project not open
		}
	}
}