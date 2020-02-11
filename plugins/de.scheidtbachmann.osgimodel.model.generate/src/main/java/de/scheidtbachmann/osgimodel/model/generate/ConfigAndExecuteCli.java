/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.scheidtbachmann.osgimodel.model.generate;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import de.scheidtbachmann.osgimodel.OsgiProject;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

/**
 * This class is a command line tool that executes the generation of the OSGi model files.
 * The project parameters for this generation are configured via command line parameters.
 *
 * @author dams, nre
 */
@Command(name = "osgimodelgen")
public class ConfigAndExecuteCli implements Runnable {
	
	static final Logger LOGGER = LoggerFactory.getLogger(ConfigAndExecuteCli.class);

	/**
	 * The names of all projects, that should be documented.
	 */
	@Option(names = {"-N", "--names"}, paramLabel = "PROJECT-NAMES",
			description = "The names of all projects that should be documented.")
	private Map<String, String> projectNames = new HashMap<>();

	/**
	 * The paths to the folders of the projects, that should be documented.
	 */
	@Option(names = {"-P", "--paths"}, paramLabel = "PROJECT-PATHS",
			description = "The paths to the folders of the projects that should be documented.")
	private Map<String, File> projectPaths = new HashMap<>();

	/**
	 * If projects have a valid javaDoc URL, they can be passed.
	 */
	@Option(names = {"-J", "--javadocs"}, paramLabel = "PROJECT-JAVADOCS",
			description = "If projects have a valid javaDoc URL, they can be passed.")
	private Map<String, URL> projectJavadocUrls = new HashMap<>();

	/**
	 * The output path where the model is saved.
	 */
	@Option(names = {"-S", "-O", "--output"}, paramLabel = "OUTPUT",
			description = "The output path where the model is saved.")
	private String modelSaveFilePath;
	
	@Option(names = {"-h", "--help"}, usageHelp = true, description = "displays this help message.")
    protected boolean help;

	/**
	 * Executes the reading of project files and the creation of the documentation.
	 */
	public static void main(String[] args) {
		CommandLine cl = new CommandLine(new ConfigAndExecuteCli());
		System.exit(cl.execute(args));
	}
	
	@Override
	public void run() {
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
				LOGGER.debug("ProjectPath: " + projectPathEntry.getValue());
				LOGGER.debug("ProjectName: " + projectNames.get(projectKey));
			}

			// Modelfile path
			Optional<String> optionalModelSaveFilePath = Optional.empty();
			if (!modelSaveFilePath.equals("")) {
				optionalModelSaveFilePath = Optional.of(modelSaveFilePath);
				LOGGER.debug("Model Save Directory: " + modelSaveFilePath);
			}

			// Read the osgi Data
			final Map<String, OsgiProject> projectMap = new HashMap<String, OsgiProject>();
			for (final Entry<String, File> projectPathEntry : projectPaths.entrySet()) {
				LOGGER.info("Reading Project Data for " + projectNames.get(projectPathEntry.getKey()));
				final String projectKey = projectPathEntry.getKey();
				projectMap.put(projectKey, OsgiModelDataGenerator.generateData(projectPathEntry.getValue().toString(),
						projectNames.get(projectKey), projectJavadocUrls.get(projectKey), optionalModelSaveFilePath));
			}

			LOGGER.info("OSGi model generation has finished. The files can be found in " + modelSaveFilePath);
		}
	}
	
}
