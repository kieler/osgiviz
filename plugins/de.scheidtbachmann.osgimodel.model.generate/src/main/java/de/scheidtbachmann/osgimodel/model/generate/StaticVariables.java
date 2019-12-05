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

/**
 * This is a utility class with static final Strings this project uses.
 *
 * @author dams
 *
 */
@SuppressWarnings("nls")
public class StaticVariables {
    static final String AUTHOR_JAVADOC = "@author";
	static final String AUTHOR_NEW = "</br> Author:";
    static final String BUNDLE_NAME_STRING = "Bundle-Name";
    static final String BUNDLE_SYMBOLIC_NAME = "Bundle-SymbolicName";
    static final String BUNDLE_VENDOR = "Bundle-Vendor";
    static final String BUNDLE_VERSION = "Bundle-Version";
    static final String BUNDLE_DESCRIPTION = "Bundle-Description";
    static final String BUNDLE_CATEGORY = "Bundle-Category";
    static final String CLASS = "class";
    static final String EMPTY_STRING = "";
    static final String EXPORT_PACKAGE = "Export-Package";
    static final String FEATURE = "feature";
    static final String FEATURE_FILE = "feature.xml";
    static final String ID = "id";
    static final String IMPLEMENTATION = "implementation";
    static final String IMPORT_PACKAGE = "Import-Package";
    static final String INTERFACE = "interface";
    static final String JAVA_FILE = ".java";
    static final String LABEL = "label";
    static final String MANIFEST_FILE = "MANIFEST.MF";
    static final String NAME = "name";
    static final String NO_INTERFACE_OPTION = "noInterface";
    static final String NOT_SET = "notSet";
    static final String PLUGIN = "plugin";
    static final String PRODUCT_FILE = ".product";
    static final String PROVIDE = "provide";
    static final String REFERENCE = "reference";
    static final String REFERENCE_BIND = "bind";
    static final String REFERENCE_CARDINALITY = "cardinality";
    static final String REFERENCE_INTERFACE = "interface";
    static final String REFERENCE_NAME = "name";
    static final String REFERENCE_POLICY = "policy";
    static final String REFERENCE_UNBIND = "unbind";
    static final String REQUIRE_BUNDLE = "Require-Bundle";
    static final String SERVICE_COMPONENT = "Service-Component";
    static final String SERVICE_DEFAULT_ABOUT = "This service has no description. "
            + "You can add a description in the javadoc class description of the implementing class.";
    static final String SERVICE_INTERFACE_DEFAULT_ABOUT = "This service interface has no description. "
            + "You can add a description  in the javadoc class description of the interface class.";
    static final String UNIQUE_ID = "uid";
    static final String VERSION = "version";
    static final String XML_FILE = ".xml";
    static final String ABOUT_INFO =
            "<p>There is no description, you can add a description if you put an <b>\"about.html\"</b> or an "
                    + "<b>\"about.txt\"</b> file in the bundle/feature/product folder</p>";
    static final String ABOUT_INFO_BUNDLE =
            "<p>There is no description, you can add a description either by filling in the "
                    + "<b>\"Bundle-Description\"</b> in the bundle manifest file,"
                    + "</br> or by putting an <b>\"about.html\"</b> or an "
                    + "<b>\"about.txt\"</b> file in the bundle folder</p>";
    static final String ABOUT_INFO_FEATURE =
            "<p>There is no description, you can add a description if you put an <b>\"about.html\"</b> or an "
                    + "<b>\"about.txt\"</b> file in the feature folder</p>";
    static final String ABOUT_INFO_PRODUCT =
            "<p>There is no description, you can add a description if you put an <b>\"about.html\"</b> or an "
                    + "<b>\"about.txt\"</b> file in the product folder</p>";
    static final String INCLUDES = "includes";

}
