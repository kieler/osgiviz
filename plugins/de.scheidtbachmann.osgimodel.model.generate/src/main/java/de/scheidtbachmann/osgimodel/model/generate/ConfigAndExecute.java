// ******************************************************************************
//
// Copyright (c) 2018 by
// Scheidt & Bachmann System Technik GmbH, 24145 Kiel
//
// All rights reserved. The reproduction, distribution and utilisation of this document
// as well as the communication of its contents to others without explicit authorisation
// is prohibited. Offenders will be held liable for the payment of damages.
// All rights reserved in the event of the grant of a patent, utility model or design.
// (DIN ISO 16016:2007-12, Section 5.1)
//
// Alle Rechte vorbehalten. Weitergabe sowie Vervielfältigung dieses Dokuments,
// Verwertung und Mitteilung seines Inhalts sind verboten, soweit nicht ausdrücklich
// gestattet. Zuwiderhandlungen verpflichten zu Schadenersatz. Alle Rechte für den
// Fall der Patent-, Geschmacks- und Gebrauchsmustererteilung vorbehalten.
// (DIN ISO 16016:2007-12, Abschnitt 5.1)
//
// ******************************************************************************

package de.scheidtbachmann.osgimodel.model.generate;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;

import de.scheidtbachmann.osgimodel.OsgiProject;
import de.scheidtbachmann.osgimodel.model.generate.OsgiModelDataGenerator;
import de.scheidtbachmann.osgimodel.model.generate.ReadProjectFiles;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * This class is a MoJo that executes the generation of the OSGi model files.
 * The project parameters of this maven plugin are configured in the
 * implementing project pom file.
 *
 *
 * @author dams
 *
 */
@Mojo(name = "generate-documentation")
public class ConfigAndExecute extends AbstractMojo {

	private static final String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"; //$NON-NLS-1$

	/**
	 * The names of all projects, that should be documented.
	 */
	@Parameter
	private Map<String, String> projectNames;

	/**
	 * The paths to the folders of the projects, that should be documented.
	 */
	@Parameter
	private Map<String, File> projectPaths;

	/**
	 * If projects have a valid javaDoc URL, they can be passed.
	 */
	@Parameter(defaultValue = "")
	private Map<String, URL> projectJavadocUrls;

	/**
	 * If the model should be saved, a path must be given.
	 */
	@Parameter(defaultValue = "")
	private String modelSaveFilePath;

	/**
	 * Executes the reading of project files and the creation of the documentation.
	 */
	public void execute() throws MojoExecutionException, MojoFailureException {

		final Log mavenLogger = getLog();
		// fill leftout information of projectNames and projectJavadocUrls
		if (projectPaths != null) {
			for (final Entry<String, File> projectPathEntry : projectPaths.entrySet()) {
				final String projectKey = projectPathEntry.getKey();

				if (!projectNames.containsKey(projectKey) || projectNames.get(projectKey) == null) {
					projectNames.put(projectKey, projectKey);
				}
				if (!projectJavadocUrls.containsKey(projectKey) || projectJavadocUrls.get(projectKey) == null) {
					projectJavadocUrls.put(projectKey, null);
				}

				// for debugging
				mavenLogger.debug("ProjectPath: " + projectPathEntry.getValue());
				mavenLogger.debug("ProjectName: " + projectNames.get(projectKey));
			}

			// Modelfile path
			Optional<String> optionalModelSaveFilePath = Optional.empty();
			if (!modelSaveFilePath.equals("")) {
				optionalModelSaveFilePath = Optional.of(modelSaveFilePath);
				mavenLogger.debug("Model Save Directory: " + modelSaveFilePath);
			}

			// Read the osgi Data
			final Map<String, OsgiProject> projectMap = new HashMap<String, OsgiProject>();
			for (final Entry<String, File> projectPathEntry : projectPaths.entrySet()) {
				mavenLogger.info("Reading Project Data for " + projectNames.get(projectPathEntry.getKey()));
				final String projectKey = projectPathEntry.getKey();
				projectMap.put(projectKey, OsgiModelDataGenerator.generateData(projectPathEntry.getValue().toString(),
						projectNames.get(projectKey), projectJavadocUrls.get(projectKey), optionalModelSaveFilePath));
			}

			mavenLogger.info("OSGi model generation has finished. The files can be found in " + modelSaveFilePath);
		}
	}
}
