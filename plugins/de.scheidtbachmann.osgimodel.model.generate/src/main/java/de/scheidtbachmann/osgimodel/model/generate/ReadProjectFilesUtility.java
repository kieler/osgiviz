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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.OsgiProject;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;

/**
 * This is a utility class for {@linkplain ReadProjectFiles} with methods for
 * reading and parsing files.
 *
 * @author dams
 *
 */

public class ReadProjectFilesUtility {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReadProjectFilesUtility.class);

	private static final int PAGE_NOT_FOUND = 404;
	private static final String ABOUT_HTML = "about.html"; //$NON-NLS-1$
	private static final String ABOUT_TXT = "about.txt"; //$NON-NLS-1$

	/**
	 * extracts info if an about.html or about.txt file is there, otherwise a
	 * generic text is generated.
	 *
	 * @param aboutPath the path to the about file
	 * @param context
	 * @return aboutInfo returns a String with content from the about file or
	 *         generic content text otherwise.
	 */
	static String extractAboutFile(final Path aboutPath, final String context) {
		String aboutInfo;
		switch (context) {
		case "bundle":
			aboutInfo = StaticVariables.ABOUT_INFO_BUNDLE;
			break;
		case "feature":
			aboutInfo = StaticVariables.ABOUT_INFO_FEATURE;
			break;
		case "product":
			aboutInfo = StaticVariables.ABOUT_INFO_PRODUCT;
			break;
		default:
			aboutInfo = "";
			break;
		}
		final File aboutDirectory = new File(aboutPath.toString());
		final File[] filesInDirectory = aboutDirectory.listFiles();
		if (filesInDirectory != null) {
			for (final File file : filesInDirectory) {
				if (ABOUT_HTML.equalsIgnoreCase(file.getName()) || ABOUT_TXT.equalsIgnoreCase(file.getName())) {
					try {
						aboutInfo = new String(Files.readAllBytes(file.toPath()));
					} catch (final IOException e) {
						LOGGER.error("There was an error with reading the html file.", e); //$NON-NLS-1$
					}
				}
			}
		}
		return aboutInfo;

	}

	/**
	 * Checks if an about.html or about.txt file is in a specific path.
	 *
	 * @param aboutPath the path to the about file
	 * @return true if about file exists, false otherwise
	 */
	static boolean hasAboutFile(final Path aboutPath) {

		final File aboutDirectory = new File(aboutPath.toString());
		final File[] filesInDirectory = aboutDirectory.listFiles();
		if (filesInDirectory != null) {
			for (final File file : filesInDirectory) {
				if (ABOUT_HTML.equalsIgnoreCase(file.getName()) || ABOUT_TXT.equalsIgnoreCase(file.getName())) {
					return true;
				}
			}
		}
		return false;

	}

	/**
	 * Checks if implementationClass is part of a given javadoc URL.
	 *
	 * @param javadocRoot         is the url to the javadoc index site.
	 * @param implementationClass is the class or package we search for
	 * @return the String to the javadoc site, if one exists, otherwise an empty
	 *         String
	 */
	static String getJavaDocPath(final URL javadocRoot, final String implementationClass) {
		if (javadocRoot == null) {
			return StaticVariables.EMPTY_STRING;
		}
		String javadocPath = StaticVariables.EMPTY_STRING;
		try {
			final URL testValidUrl = new URL(javadocRoot.toString().replace("index.html", "") //$NON-NLS-1$ //$NON-NLS-2$
					+ implementationClass.replace(".", "/") + ".html"); //$NON-NLS-1$

			final HttpURLConnection con = (HttpURLConnection) testValidUrl.openConnection();
			con.setRequestMethod("GET"); //$NON-NLS-1$
			con.connect();
			if (con.getResponseCode() != PAGE_NOT_FOUND) {
				javadocPath = testValidUrl.toString();
			}
		} catch (final IOException e) {
			LOGGER.error("There was an error with reading the javadoc URL.", e); //$NON-NLS-1$
		}
		return javadocPath;
	}

	/**
	 * Reads file content into a string.
	 *
	 * @param filePath
	 * @param logger
	 * @return returns a String with the file content of the input file.
	 */
	static String readFileToString(final String filePath) {
		String fileData = null;
		try {
			fileData = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (final IOException e) {
			LOGGER.error("There was an error with parsing the javafile to String.", e); //$NON-NLS-1$
		}

		return fileData;
	}

	/**
	 * This method takes a absolute filepath to a java file, which is part of a
	 * bundle and returns the belonging bundle.
	 *
	 * @param filePath the absolute filepath of the java file
	 * @return the belonging bundlename
	 */
	static String getBundleFromPath(final String filePath) {
		final String[] filePathContents = filePath.replace("\\", "/").split("/");
		for (int x = 0; x < filePathContents.length; x++) {
			if (x + 1 != filePathContents.length && filePathContents[x].equals("bundles")) {
				return filePathContents[x + 1];
			}
		}
		return "";
	}

	/**
	 * This method takes an interface name, and returns the belonging bundle.
	 *
	 */
	static Bundle getBundleFromInterface(String interfaceName, OsgiProject project) {
		return project.getBundles().stream()//
				.filter(bundleName -> interfaceName.startsWith(bundleName.getUniqueId()))//
				.max(Comparator.comparingInt(x -> x.getUniqueId().length()))
				.orElse(null);
	}
}
