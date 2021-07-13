// ******************************************************************************
//
// Copyright (c) 2018 by
// Scheidt & Bachmann System Technik GmbH, 24145 Kiel
//
// This program and the accompanying materials are made available under the
// terms of the Eclipse Public License 2.0 which is available at
// http://www.eclipse.org/legal/epl-2.0.
// 
// SPDX-License-Identifier: EPL-2.0
//
// ******************************************************************************

package de.scheidtbachmann.osgimodel.model.generate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import de.scheidtbachmann.osgimodel.OsgiProject;

public class OsgiModelSaveAndLoadUtility {

	/**
	 * Takes an OSGi project and saves the data under modelSaveFilePath/fileName.
	 * 
	 * @param fileName the name for the file
	 * @param data OsgiProject to save
	 * @throws IOException
	 */
	public static void saveData(final String fileName, final OsgiProject data, String modelSaveFilePath) throws IOException {
		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		final Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl());

		final ResourceSet resSet = new ResourceSetImpl();
		modelSaveFilePath= modelSaveFilePath.replace("\\", "/");
		if (!modelSaveFilePath.endsWith("/")) {
			modelSaveFilePath+="/";
		}
		final Resource resource = resSet.createResource(URI.createURI("file:///"+modelSaveFilePath+fileName));
		resource.getContents().add(data);
		resource.save(Collections.EMPTY_MAP);
	}

	/**
	 * Loads an OSGi project from a file.
	 * 
	 * @param fileName The fileName to load.
	 * @return data The OsgiProject.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static OsgiProject loadData(final String fileName) throws FileNotFoundException, IOException {
		final XMIResourceImpl resource = new XMIResourceImpl();
		final File source = new File(fileName);
		resource.load(new FileInputStream(source), new HashMap<String, Object>());
		final OsgiProject data = (OsgiProject) resource.getContents().get(0);
		return data;
	}
}
