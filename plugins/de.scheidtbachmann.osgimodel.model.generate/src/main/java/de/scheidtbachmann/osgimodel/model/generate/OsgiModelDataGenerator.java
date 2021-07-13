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
import java.io.IOException;
import java.net.URL;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.scheidtbachmann.osgimodel.OsgiProject;

/**
 * @author dams
 *
 */
public final class OsgiModelDataGenerator {

	static final Logger LOGGER = LoggerFactory.getLogger(OsgiModelDataGenerator.class);

	
	/**
	 * Generates OSGi project data from a given project path. The generated Model
	 * will be returned and also saved in a file.
	 * 
	 * @param projectFilePath The path to the project root folder
	 * @param projectName     Descriptive name of the project
	 * @param save    if true, model file will be saved under target/projectName.model
	 * @return The generated OSGI project data.
	 */
	public static OsgiProject generateData(final String projectFilePath, final String projectName, Optional<String> modelSaveFilePath) {

		final OsgiProject project = generateData(projectFilePath, projectName, null, modelSaveFilePath);

		return project;
	}
	
	/**
	 * Generates OSGi project data from a given project path. The generated Model
	 * will be returned and also saved in a file.
	 * 
	 * @param projectFilePath The path to the project root folder
	 * @param projectName     Descriptive name of the project
	 * @param url         is the root url to the javadoc of the project, if one
	 *                    exists else null
	 * @param save    if true, model file will be saved under target/projectName.model
	 * @return The generated OSGI project data.
	 */
	public static OsgiProject generateData(final String projectFilePath, final String projectName, final URL url, Optional<String> modelSaveFilePath) {

		final ReadProjectFiles reader = new ReadProjectFiles();
		LOGGER.info("Generating data for " + projectName);
		final OsgiProject project = reader.generateData(new File(projectFilePath), projectName, url);
		
		if (modelSaveFilePath.isPresent()) {

			LOGGER.info("Saving data for " + projectName);
			final String fileName = projectName + ".model";
			try {
				OsgiModelSaveAndLoadUtility.saveData(fileName, project, modelSaveFilePath.get());
			} catch (final IOException e) {
				LOGGER.error("There was a Problem while saving.", e);
				e.printStackTrace();
			}
		}
		LOGGER.info("Finished");

		return project;
	}

}
