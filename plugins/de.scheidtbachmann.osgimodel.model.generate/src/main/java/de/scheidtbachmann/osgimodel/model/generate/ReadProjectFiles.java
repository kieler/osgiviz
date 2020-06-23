// ******************************************************************************
//
// Copyright (c) 2018 by
// Scheidt & Bachmann System Technik GmbH, 24145 Kiel
//
// This code is provided under the terms of the Eclipse Public License (EPL).
// See the file epl-v10.html for the license text.
//
// ******************************************************************************

package de.scheidtbachmann.osgimodel.model.generate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclaration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.scheidtbachmann.osgimodel.AttributeData;
import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.BundleCategory;
import de.scheidtbachmann.osgimodel.EclipseInjection;
import de.scheidtbachmann.osgimodel.Feature;
import de.scheidtbachmann.osgimodel.OsgiProject;
import de.scheidtbachmann.osgimodel.OsgimodelFactory;
import de.scheidtbachmann.osgimodel.PackageObject;
import de.scheidtbachmann.osgimodel.Product;
import de.scheidtbachmann.osgimodel.Reference;
import de.scheidtbachmann.osgimodel.ServiceComponent;
import de.scheidtbachmann.osgimodel.ServiceInterface;

/**
 * This class reads all the data for osgi artifacts from the artifact files. It
 * searches the project folder for all osgi specific files. For the
 * documentation javadoc comments are parsed and about.html/about.txt files are
 * extracted.
 *
 * For bundles it reads the belonging MANIFEST.MF file and searches for an about
 * file. For features it reads the feature.xml file and searches for an about
 * file. For services it reads all the service 00 files and parses the javadoc
 * comment from the implementing class. For service interfaces it reads all
 * service interface references of the service components and parses the javadoc
 * from the service interface class. For products it searches for product files
 * and an about file.
 *
 * @author dams
 *
 */
public class ReadProjectFiles {

	private static final Logger LOGGER = LoggerFactory.getLogger(OsgiModelDataGenerator.class);

	final OsgiProject project = OsgimodelFactory.eINSTANCE.createOsgiProject();

	private URL javadocRoot;
	private final List<Path> filePaths = new ArrayList<Path>();
	private final List<String> javaFilePaths = new ArrayList<String>();
	private final Map<String, String> javadocComments = new HashMap<String, String>();
	private final List<EclipseInjection> e4Injections = new ArrayList<EclipseInjection>();
	// For statistics
	int numberOfJavaFiles;

	public ReadProjectFiles() {
		numberOfJavaFiles = 0;
	}

	/**
	 * Generates an OsgiProject object with Data for bundles, features, services and
	 * products.
	 *
	 * @param projectPath to extract osgi data from
	 * @return OsgiProject with all OSGI objects (bundles, features, services,
	 *         products, service interfaces)
	 */
	public OsgiProject generateData(final File projectPath, final String projectName) {
		return generateData(projectPath, projectName, null);
	}

	/**
	 * Generates the HashMaps with Data for bundles, features, services and
	 * products.
	 *
	 * @param projectPath to extract osgi data from
	 * @param url         is the root url to the javadoc of the project, if one
	 *                    exists else null
	 * @return OsgiProject with all OSGI objects (bundles, features, services,
	 *         products, service interfaces)
	 */
	public OsgiProject generateData(final File projectPath, final String projectName, final URL url) {

		javadocRoot = url;

		// Parsing of java files
		findJavaFiles(projectPath);
		parseFilesFromList();
		project.setNumberOfJavaFiles(numberOfJavaFiles);
		project.setProjectName(projectName);

		// Parsing of manifest data
		filePaths.clear();
		findFiles(StaticVariables.MANIFEST_FILE, projectPath);
		for (final Path manifestPath : filePaths) {
			extractBundleData(manifestPath);
		}

		// parsing of feature data
		filePaths.clear();
		findFiles(StaticVariables.FEATURE_FILE, projectPath);
		for (final Path featurePath : filePaths) {
			extractFeatureData(featurePath);
		}

		// parsing of service data
		final ServiceInterface interfaceMockup = OsgimodelFactory.eINSTANCE.createServiceInterface();
		project.getServiceInterfaces().add(interfaceMockup);
		String interfaceName = StaticVariables.NO_INTERFACE_OPTION;
		interfaceMockup.setName(interfaceName);
		interfaceMockup.setEcoreId(StaticVariables.SERVICE_INTERFACE_PREFIX + interfaceName);
		interfaceMockup.setAbout("Service Components with no implemented Interfaces");

		project.getServiceComponents().forEach(elem -> extractServiceData(elem));

		// parsing of product data
		filePaths.clear();
		findFiles(StaticVariables.PRODUCT_FILE, projectPath);
		for (final Path productPath : filePaths) {
			extractProductData(productPath);
		}

		// delete all e4Injections, that are not service interface Injections.
		for (final EclipseInjection e4Injection : e4Injections) {
			if (!project.getServiceInterfaces().stream()
					.anyMatch(elem -> elem.getName().endsWith(e4Injection.getInjectedInterface()))) {
				EcoreUtil.delete(e4Injection);
			}
		}

		return project;

	}

	/**
	 * Extracts all relevant properties of a bundle into a HashMap of bundles.
	 *
	 * @param manifestPath is the path to the prepared manifest file
	 */
	// CHECKSTYLE IGNORE check FOR NEXT 1 LINES
	private void extractBundleData(final Path manifestPath) {
		String symbolicName = StaticVariables.EMPTY_STRING;
		final Path manifestFolder = manifestPath.getParent();
		Path bundleRoot = null;
		if (manifestFolder != null) {
			bundleRoot = manifestFolder.getParent();
		}

		try (final InputStream is = new FileInputStream(manifestPath.toString())) {
			final Manifest manifest = new Manifest(is);
			final Attributes attributes = manifest.getMainAttributes();
			
			
			String aboutFile = StaticVariables.ABOUT_INFO;
			if (bundleRoot != null) {
				aboutFile = ReadProjectFilesUtility.extractAboutFile(bundleRoot, "bundle");
			}
			symbolicName = getAndRemove(attributes, StaticVariables.BUNDLE_SYMBOLIC_NAME);

			// check, if bundle is already existing
			final Bundle bundle = getOrCreateBundle(symbolicName);
			bundle.setIsExternal(false);
			String bundleName = getAndRemove(attributes, StaticVariables.BUNDLE_NAME_STRING);
			if (bundleName.equals("%pluginName")) {
					Properties manifestProperties = new Properties();
					manifestProperties.load(new FileInputStream(bundleRoot+"/plugin.properties"));
				bundleName= manifestProperties.getProperty("pluginName");
			}
			String vendorName = getAndRemove(attributes, StaticVariables.BUNDLE_VENDOR);
			if (vendorName.equals("%providerName")) {
				Properties manifestProperties = new Properties();
				manifestProperties.load(new FileInputStream(bundleRoot+"/plugin.properties"));
				vendorName= manifestProperties.getProperty("providerName");
			}
			final String version = getAndRemove(attributes, StaticVariables.BUNDLE_VERSION);
			final String bundleCategory = attributes.getValue(StaticVariables.BUNDLE_CATEGORY);

			if (bundleCategory != null) {
				for (final String category : bundleCategory.split(",")) {

					final Optional<BundleCategory> categoryObject = project.getBundleCategories()//
							.stream()//
							.filter(elem -> elem.getCategoryName().equals(category.trim())).findFirst();
					if (categoryObject.isPresent()) {
						categoryObject.get().getBundle().add(bundle);
					} else {
						final BundleCategory newCategory = OsgimodelFactory.eINSTANCE.createBundleCategory();
						String categoryName = category.trim();
						newCategory.setCategoryName(categoryName);
						newCategory.setEcoreId(StaticVariables.BUNDLE_CATEGORY_PREFIX + categoryName);
						newCategory.getBundle().add(bundle);
						project.getBundleCategories().add(newCategory);
					}
				}
			}

			bundle.setDescriptiveName(bundleName);
			if (attributes.containsKey(new Attributes.Name(StaticVariables.BUNDLE_DESCRIPTION))) {
				final String bundleDescription = getAndRemove(attributes, StaticVariables.BUNDLE_DESCRIPTION);
				if (ReadProjectFilesUtility.hasAboutFile(bundleRoot)) {
					bundle.setAbout("<b>From the Bundle-Description Tag: </b>" + bundleDescription
							+ "<br><br><b>From the About File: </b>" + aboutFile);
				} else {
					bundle.setAbout("<b>From the Bundle-Description Tag: </b>" + bundleDescription);
				}

			} else {
				bundle.setAbout(aboutFile);
			}
			bundle.setVendor(vendorName);
			bundle.setVersion(version);
			extractPackages(bundle, attributes);

			// check all required bundles and create them, if not existing
			for (final String requiredBundleName : getList(attributes, StaticVariables.REQUIRE_BUNDLE)) {
				final Bundle requiredBundle = getOrCreateBundle(requiredBundleName);
				bundle.getRequiredBundles().add(requiredBundle);
			}

			final List<String> serviceComponents = getList(attributes, StaticVariables.SERVICE_COMPONENT);

			if (serviceComponents.contains("OSGI-INF/*.xml")) {
				if (!new File(bundleRoot + "/OSGI-INF").exists()) { //$NON-NLS-1$
					LOGGER.info("The MANIFEST-INF folder and the OSGI-INF folder are not in the same path." //$NON-NLS-1$
							+ manifestPath.toString());
				}
				final File serviceComponentsFolder = new File(bundleRoot + "/OSGI-INF/");
				final File[] serviceComponentFiles = serviceComponentsFolder
						.listFiles((dir, name) -> name.toLowerCase().endsWith(".xml"));

				if (serviceComponentFiles != null) {
					for (final File serviceComponentFile : serviceComponentFiles) {

						final ServiceComponent serviceComponent = OsgimodelFactory.eINSTANCE.createServiceComponent();
						String componentName = serviceComponentFile.getName()
								.replace(".xml", StaticVariables.EMPTY_STRING);
						serviceComponent.setName(componentName);
						serviceComponent.setEcoreId(StaticVariables.SERVICE_COMPONENT_PREFIX + componentName);
						bundle.getServiceComponents().add(serviceComponent);
						project.getServiceComponents().add(serviceComponent);
						serviceComponent.setPath(FilenameUtils.separatorsToUnix(serviceComponentFile.getAbsolutePath()));
						final int i = 1;
					}
				}

			} else {
				for (final String service : serviceComponents) {
					// erstellen, bundle zuordnen in project referen
					// remove the .xml and OSGI-INF/ from service component
					final String serviceName = service.replace(".xml", StaticVariables.EMPTY_STRING).replace( //$NON-NLS-1$
							"OSGI-INF/", StaticVariables.EMPTY_STRING);
					final ServiceComponent serviceComponent = OsgimodelFactory.eINSTANCE.createServiceComponent();
					serviceComponent.setName(serviceName);
					serviceComponent.setEcoreId(StaticVariables.SERVICE_COMPONENT_PREFIX + serviceName);
					bundle.getServiceComponents().add(serviceComponent);
					project.getServiceComponents().add(serviceComponent);

					if (!new File(bundleRoot + "/OSGI-INF").exists()) { //$NON-NLS-1$
						LOGGER.info("The MANIFEST-INF folder and the OSGI-INF folder are not in the same path." //$NON-NLS-1$
								+ manifestPath.toString());
					}
					if (service.contains(StaticVariables.XML_FILE) && !service.contains("*.xml") //$NON-NLS-1$
							&& bundleRoot != null) {
						serviceComponent.setPath(FilenameUtils.separatorsToUnix(
								bundleRoot + service.replace("OSGI-INF/", "/OSGI-INF/"))); //$NON-NLS-1$ //$NON-NLS-2$
					}

				}
			}
			// Add all data that is still left
			for (final Entry<Object, Object> attribute : attributes.entrySet()) {
				final AttributeData moreData = OsgimodelFactory.eINSTANCE.createAttributeData();
				moreData.setAttributeName(attribute.getKey().toString());
				moreData.setAttributeData(attribute.getValue().toString());
				bundle.getMoreData().add(moreData);
			}

		} catch (

		final IOException e) {
			LOGGER.error("There was an error with reading the manifest file " + e); //$NON-NLS-1$
		}
	}

	/**
	 * returns a bundle if it already exists, else bundle is created
	 *
	 * @param uniqueId is the unique id of the bundle
	 * @return bundle Object
	 */
	private Bundle getOrCreateBundle(final String uniqueId) {
		final Optional<Bundle> bundleAlreadyPresent = project.getBundles()//
				.stream()//
				.filter(elem -> elem.getUniqueId().equals(uniqueId))//
				.findFirst();
		if (bundleAlreadyPresent.isPresent()) {
			return bundleAlreadyPresent.get();
		} else {
			final Bundle bundle = OsgimodelFactory.eINSTANCE.createBundle();
			bundle.setUniqueId(uniqueId);
			bundle.setEcoreId(StaticVariables.BUNDLE_PREFIX + uniqueId);
			// initialize all bundles as external
			bundle.setIsExternal(true);
			project.getBundles().add(bundle);
			return bundle;
		}
	}

	/**
	 * extracts information out of the feature xml file in featurepath, and adds it
	 * to the feature HashMap
	 *
	 * @param featurePath is the path to the feature.xml file
	 */
	private void extractFeatureData(final Path featurePath) {
		String aboutFile = StaticVariables.ABOUT_INFO;
		final Path featureRoot = featurePath.getParent();
		if (featureRoot != null) {
			aboutFile = ReadProjectFilesUtility.extractAboutFile(featureRoot, "feature");
		}
		final File xmlFile = featurePath.toFile();
		final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		try {
			dBuilder = dbFactory.newDocumentBuilder();
			final Document doc = dBuilder.parse(xmlFile);
			final NodeList pluginNodeList = doc.getElementsByTagName(StaticVariables.PLUGIN);

			final Feature feature = OsgimodelFactory.eINSTANCE.createFeature();
			project.getFeatures().add(feature);

			for (int x = 0, size = pluginNodeList.getLength(); x < size; x++) {
				final String plugin = pluginNodeList.item(x).getAttributes().getNamedItem(StaticVariables.ID)
						.getNodeValue();
				feature.getBundles().add(getOrCreateBundle(plugin));
			}
			String uniqueId = doc.getDocumentElement().getAttribute(StaticVariables.ID);
			feature.setUniqueId(uniqueId);
			feature.setEcoreId(StaticVariables.FEATURE_PREFIX + uniqueId);
			feature.setDescriptiveName(doc.getDocumentElement().getAttribute(StaticVariables.LABEL));
			feature.setAbout(aboutFile);
			feature.setVersion(doc.getDocumentElement().getAttribute(StaticVariables.VERSION));
			feature.setIsExternal(false);

		} catch (ParserConfigurationException | SAXException | IOException e) {
			LOGGER.error("There was an error with reading the feature.xml file " + e); //$NON-NLS-1$
		}

	}

	/**
	 * extracts information out of the service xml file in servicePath, and adds it
	 * to serviceData.
	 *
	 * @param servicePath is the path to the service xml file
	 */
	// CHECKSTYLEOFF NPathComplexity
	private void extractServiceData(final ServiceComponent serviceComponent) {
		try {
			final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			dBuilder = dbFactory.newDocumentBuilder();

			final File xmlFile = new File(serviceComponent.getPath());
			final Document doc = dBuilder.parse(xmlFile);
			final NodeList referenceList = doc.getElementsByTagName(StaticVariables.REFERENCE);
			final NodeList interfaceList = doc.getElementsByTagName(StaticVariables.PROVIDE);
			final NodeList implementationList = doc.getElementsByTagName(StaticVariables.IMPLEMENTATION);

			// final String serviceId =
			// doc.getDocumentElement().getAttribute(StaticVariables.NAME);
			final String implementationClass = implementationList.item(0).getAttributes()
					.getNamedItem(StaticVariables.CLASS).getNodeValue();
			final String javadocUri = ReadProjectFilesUtility.getJavaDocPath(javadocRoot, implementationClass);
			String about = StaticVariables.SERVICE_DEFAULT_ABOUT;
			final String implementationClassPath = findFilePath(implementationClass);
			if (javadocComments.containsKey(implementationClassPath)) {
				final String aboutString = javadocComments.get(implementationClassPath);
				about = aboutString.replace(StaticVariables.AUTHOR_JAVADOC, StaticVariables.AUTHOR_NEW)//
						.replace("*", "")// //$NON-NLS-1$ //$NON-NLS-2$
						.replace(".,", ".")// //$NON-NLS-1$ //$NON-NLS-2$
						.trim();
			}

			serviceComponent.setAbout(about);
			serviceComponent.setImplementationClass(implementationClass);
			serviceComponent.setJavaDocPath(javadocUri);
			
			//change absolute path to relative path
			String absoluteSCPathString = serviceComponent.getPath();
			String relativeSCPathString = FilenameUtils.separatorsToSystem(FilenameUtils//
					.separatorsToUnix(absoluteSCPathString).replaceAll(".+bundles/", ""));
			serviceComponent.setPath(relativeSCPathString);

			// read interface
			if (interfaceList.getLength() != 0) {
				for (int x = 0, size = interfaceList.getLength(); x < size; x++) {
					final String interfaceName = interfaceList.item(x).getAttributes()
							.getNamedItem(StaticVariables.INTERFACE).getNodeValue();

					final Optional<ServiceInterface> serviceInterfaceOptional = project.getServiceInterfaces()//
							.stream()//
							.filter(elem -> elem.getName().equals(interfaceName))//
							.findFirst();
					if (serviceInterfaceOptional.isPresent()) {
						serviceInterfaceOptional.get().getServiceComponent().add(serviceComponent);
					} else {
						Bundle interfaceBundle = ReadProjectFilesUtility.getBundleFromInterface(interfaceName, project);
						final ServiceInterface serviceInterface = OsgimodelFactory.eINSTANCE.createServiceInterface();
						serviceInterface.getServiceComponent().add(serviceComponent);
						serviceInterface.setName(interfaceName);
						serviceInterface.setEcoreId(StaticVariables.SERVICE_INTERFACE_PREFIX + interfaceName);
						if (interfaceBundle != null) {
							serviceInterface.setImplementedIn(interfaceBundle);
						}

						about = StaticVariables.SERVICE_INTERFACE_DEFAULT_ABOUT;
						final String interfaceClassPath = findFilePath(interfaceName);
						if (javadocComments.containsKey(interfaceClassPath)) {
							final String aboutString = javadocComments.get(interfaceClassPath);
							about = aboutString.replace("@author", "</br> Author: ")// //$NON-NLS-1$ //$NON-NLS-2$
									.replace("*", "")// //$NON-NLS-1$ //$NON-NLS-2$
									.replace(".,", ".")// //$NON-NLS-1$ //$NON-NLS-2$
									.trim();
						}

						serviceInterface.setAbout(about);
						project.getServiceInterfaces().add(serviceInterface);

					}
				}
			} else {
				// If service Component provides no interface
				serviceComponent.getServiceInterfaces()//
						.add(project.getServiceInterfaces()//
								.stream()//
								.filter(elem -> elem.getName().equals(StaticVariables.NO_INTERFACE_OPTION))//
								.findFirst()//
								.get());

			}

			// read references
			for (int x = 0, size = referenceList.getLength(); x < size; x++) {

				final String name = (referenceList.item(x).getAttributes()
						.getNamedItem(StaticVariables.REFERENCE_NAME) == null ? StaticVariables.NOT_SET
								: referenceList.item(x).getAttributes().getNamedItem(StaticVariables.REFERENCE_NAME)
										.getNodeValue());

				final String interfaceName = (referenceList.item(x).getAttributes()
						.getNamedItem(StaticVariables.REFERENCE_INTERFACE) == null ? StaticVariables.NOT_SET
								: referenceList.item(x).getAttributes()
										.getNamedItem(StaticVariables.REFERENCE_INTERFACE).getNodeValue());

				final String cardinality = (referenceList.item(x).getAttributes()
						.getNamedItem(StaticVariables.REFERENCE_CARDINALITY) == null ? StaticVariables.NOT_SET
								: referenceList.item(x).getAttributes()
										.getNamedItem(StaticVariables.REFERENCE_CARDINALITY).getNodeValue());

				final String policy = (referenceList.item(x).getAttributes()
						.getNamedItem(StaticVariables.REFERENCE_POLICY) == null ? StaticVariables.NOT_SET
								: referenceList.item(x).getAttributes().getNamedItem(StaticVariables.REFERENCE_POLICY)
										.getNodeValue());

				final String bind = (referenceList.item(x).getAttributes()
						.getNamedItem(StaticVariables.REFERENCE_BIND) == null ? StaticVariables.NOT_SET
								: referenceList.item(x).getAttributes().getNamedItem(StaticVariables.REFERENCE_BIND)
										.getNodeValue());

				final String unbind = (referenceList.item(x).getAttributes()
						.getNamedItem(StaticVariables.REFERENCE_UNBIND) == null ? StaticVariables.NOT_SET
								: referenceList.item(x).getAttributes().getNamedItem(StaticVariables.REFERENCE_UNBIND)
										.getNodeValue());

				final Reference reference = OsgimodelFactory.eINSTANCE.createReference();
				reference.setReferenceName(name);
				reference.setCardinality(cardinality);
				reference.setPolicy(policy);
				reference.setBind(bind);
				reference.setUnbind(unbind);

				// check if interface is already existing, else create it.
				final Optional<ServiceInterface> serviceInterfaceOptional = project.getServiceInterfaces()//
						.stream()//
						.filter(elem -> elem.getName().equals(interfaceName))//
						.findFirst();
				if (serviceInterfaceOptional.isPresent()) {
					reference.setServiceInterface(serviceInterfaceOptional.get());
				} else {
					final ServiceInterface serviceInterface = OsgimodelFactory.eINSTANCE.createServiceInterface();
					Bundle interfaceBundle = ReadProjectFilesUtility.getBundleFromInterface(interfaceName, project);
					serviceInterface.setName(interfaceName);
					serviceInterface.setEcoreId(StaticVariables.SERVICE_INTERFACE_PREFIX + interfaceName);
					if (interfaceBundle != null) {
						serviceInterface.setImplementedIn(interfaceBundle);
					}
					reference.setServiceInterface(serviceInterface);
					project.getServiceInterfaces().add(serviceInterface);
				}

				serviceComponent.getReference().add(reference);

			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			LOGGER.error("There was an error with reading the service xml file " + e); //$NON-NLS-1$
		}

	}

	// CHECKSTYLEON NPathComplexity
	/**
	 * extracts information out of the product file, and adds it to productData.
	 *
	 * @param productPath is the path to the product file
	 */
	private void extractProductData(final Path productPath) {
		String aboutFile = StaticVariables.ABOUT_INFO;
		final Path productRoot = productPath.getParent();
		if (productRoot != null) {
			aboutFile = ReadProjectFilesUtility.extractAboutFile(productRoot, "product");
		}

		final DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		try {
			dBuilder = dbFactory.newDocumentBuilder();
			final Document doc = dBuilder.parse(productPath.toString());

			final String descriptiveName = doc.getDocumentElement().getAttribute(StaticVariables.NAME);
			final String id = doc.getDocumentElement().getAttribute(StaticVariables.UNIQUE_ID);
			final String version = doc.getDocumentElement().getAttribute(StaticVariables.VERSION);

			final Product product = OsgimodelFactory.eINSTANCE.createProduct();
			product.setUniqueId(id);
			product.setEcoreId(StaticVariables.PRODUCT_PREFIX + id);
			product.setAbout(aboutFile);
			product.setDescriptiveName(descriptiveName);
			product.setVersion(version);
			project.getProducts().add(product);

			final NodeList featureNodeList = doc.getElementsByTagName(StaticVariables.FEATURE);
			for (int x = 0, size = featureNodeList.getLength(); x < size; x++) {
				final String featureName = featureNodeList.item(x).getAttributes().getNamedItem(StaticVariables.ID)
						.getNodeValue();

				final Optional<Feature> featureOptional = project.getFeatures()//
						.stream()//
						.filter(elem -> elem.getUniqueId().equals(featureName))//
						.findFirst();

				if (featureOptional.isPresent()) {
					product.getFeatures().add(featureOptional.get());
				} else {
					final Feature feature = OsgimodelFactory.eINSTANCE.createFeature();
					feature.setUniqueId(featureName);
					feature.setEcoreId(StaticVariables.FEATURE_PREFIX + featureName);
					feature.setIsExternal(true);
					project.getFeatures().add(feature);
					product.getFeatures().add(feature);
				}

			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			LOGGER.error("There was an error with reading the product xml file " + e); //$NON-NLS-1$
		}

	}

	/**
	 * Finds all files in a directory and all its subdirectories. Adds the path to
	 * the files to List <em>filePaths</em>
	 *
	 * @param name Filename you search for
	 * @param file Path you search in
	 *
	 */
	private void findFiles(final String name, final File file) {
		final File[] list = file.listFiles();

		if (list != null) {
			for (final File fil : list) {
				if (fil.isDirectory()) {
					// Ignore /target directories.
					if (!fil.getPath().endsWith(File.separator + "target")) {
						findFiles(name, fil);
					}
				} else if (fil.getName().endsWith(name)) {
					Path filePath = Paths.get(fil.getPath());
					filePaths.add(filePath);
				}
			}
		}
	}

	/**
	 * Finds all java files in a directory and all its subdirectories. Adds the path
	 * to the files to List <em>javaFilePaths</em>
	 *
	 * @param file Path you search in
	 *
	 */
	private void findJavaFiles(final File file) {
		final File[] list = file.listFiles();

		if (list != null) {
			for (final File fil : list) {
				if (fil.isDirectory()) {
					findJavaFiles(fil);
				} else if (fil.getName().endsWith(StaticVariables.JAVA_FILE)) {
					javaFilePaths.add(fil.toString());
					numberOfJavaFiles++;
				}
			}
		}
	}

	/**
	 * Finds the absolutePath to a filename from the project directory.
	 *
	 * @param name filename you need the path for
	 *
	 * @return the absolute file path
	 */
	private String findFilePath(final String name) {
		for (final String elem : javaFilePaths) {
			if (elem.endsWith(name.replace(".", File.separator) + ".java")) { //$NON-NLS-1$ //$NON-NLS-2$
				return new File(elem).getAbsolutePath();
			}
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Generates a list of {@link PackageObject} for a bundle. Packages can be
	 * exported or imported packages of a bundle
	 *
	 * @param bundle     is the bundle which exports/imports the packages
	 * @param attributes is the String of packages
	 * @param key        describes whether the packages are imported or exported
	 * @return
	 */
	private void extractPackages(final Bundle bundle, final Attributes attributes) {
		for (final String importOrExport : new String[] { StaticVariables.EXPORT_PACKAGE,
				StaticVariables.IMPORT_PACKAGE }) {

			final String packageIds = attributes.getValue(importOrExport);
			attributes.remove(new Attributes.Name(importOrExport));

			if (null == packageIds) {
				continue;
			}
			for (final String b : packageIds.replaceAll("\\s", "").replaceAll("\"(.*?)\"", "").split(",")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
				final String packageName = b.split(";")[0]; //$NON-NLS-1$

				final String javadocUri = ReadProjectFilesUtility.getJavaDocPath(javadocRoot,
						packageName + ".package-summary");

				if (importOrExport.equals(StaticVariables.EXPORT_PACKAGE)) {
					final PackageObject newExportedPackage = OsgimodelFactory.eINSTANCE.createPackageObject();
					newExportedPackage.setUniqueId(packageName);
//					newExportedPackage.setEcoreId(StaticVariables.PACKAGE_OBJECT_PREFIX + packageName);
					newExportedPackage.setJavaDocPath(javadocUri);
					bundle.getExportedPackages().add(newExportedPackage);
					project.getExportedPackages().add(newExportedPackage);

				}
				if (importOrExport.equals(StaticVariables.IMPORT_PACKAGE)) {
					final Optional<PackageObject> knownImportedPackage = project.getImportedPackages()//
							.stream()//
							.filter(elem -> elem.getUniqueId().equals(packageName))//
							.findFirst();
					if (knownImportedPackage.isPresent()) {
						knownImportedPackage.get().getImplementedBy().add(bundle);
					} else {
						final PackageObject newImportedPackage = OsgimodelFactory.eINSTANCE.createPackageObject();
						newImportedPackage.setUniqueId(packageName);
//						newImportedPackage.setEcoreId(StaticVariables.PACKAGE_OBJECT_PREFIX + packageName);
						newImportedPackage.setJavaDocPath(javadocUri);
						newImportedPackage.getImplementedBy().add(bundle);
						project.getImportedPackages().add(newImportedPackage);
					}
				}
			}
		}

	}

	/**
	 * Returns the value of the attribute "key" out of an attribute list and removes
	 * it from the list.
	 *
	 * @param attributes the list of attributes
	 * @param key        the attribute asked for
	 * @return the value of the attribute, if the attribute does not exist, return
	 *         is null.
	 */
	private static String getAndRemove(final Attributes attributes, final String key) {
		final String value = attributes.getValue(key);
		attributes.remove(new Attributes.Name(key));
		if (null == value) {
			return StaticVariables.NOT_SET;
		}

		return value.split(";")[0]; //$NON-NLS-1$
	}

	/**
	 * Returns the value (comma separated list) of the attribute "key" out of an
	 * attribute list and removes it from the list. Splits the comma separated
	 * String of Strings into a list of Strings.
	 *
	 * @param attributes
	 * @param key
	 * @return
	 */
	private static List<String> getList(final Attributes attributes, final String key) {
		final String list = attributes.getValue(key);
		attributes.remove(new Attributes.Name(key));
		final List<String> result = new ArrayList<String>();
		if (null == list) {
			return result;
		}
		for (final String b : list.replaceAll("\"(.*?)\"", "")// remove all characters between '"'
				.replaceAll("\\s", "")// remove all whitespaces
				.split(",")) { //$NON-NLS-1$
			result.add(b.split(";")[0]); //$NON-NLS-1$
		}
		return result;
	}

	/**
	 * org.eclipse.swt;bundle-version="[3.106.3,4.0.0)",
	 * org.eclipse.jface;bundle-version="[3.13.2,4.0.0)",
	 * org.eclipse.core.runtime;bundle-version="[3.13.0,4.0.0)"
	 */
	// parses all java files from a list
	private void parseFilesFromList() {

		File file = null;

		for (final String filePath : javaFilePaths) {
			file = new File(filePath);
			if (file.isFile()) {
				parseJavaFile(filePath, ReadProjectFilesUtility.readFileToString(filePath));
			}
		}
	}

	// use ASTParse to parse string of a java file
	private void parseJavaFile(final String fileName, final String fileContent) {
		final ASTParser parser = ASTParser.newParser(AST.JLS11);
		parser.setSource(fileContent.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);

		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);

		cu.accept(new ASTVisitor() {

			// reading all Annotations and searching for @Inject

			@Override
			public boolean visit(final MarkerAnnotation node) {

				final Name name = node.getTypeName();
				if (name.getFullyQualifiedName().equals("Inject")) { //$NON-NLS-1$
					final String bundleName = ReadProjectFilesUtility.getBundleFromPath(fileName);

					switch (node.getParent().getNodeType()) {
					case ASTNode.METHOD_DECLARATION:
						// find the type of the Parameters, that might get injected
						final MethodDeclaration methodNode = (MethodDeclaration) node.getParent();
						for (final Object parameter : methodNode.parameters()) {
							final VariableDeclaration variableDeclaration = (VariableDeclaration) parameter;

							final EclipseInjection eInjection = OsgimodelFactory.eINSTANCE.createEclipseInjection();
							eInjection.setInjectedInterface(variableDeclaration
									.getStructuralProperty(SingleVariableDeclaration.TYPE_PROPERTY).toString());
							eInjection.setUsedInClass(fileName);
							final Bundle bundle = getOrCreateBundle(bundleName);
							bundle.getEclipseInjections().add(eInjection);
							e4Injections.add(eInjection);

						}

						break;
					case ASTNode.FIELD_DECLARATION:
						// find the type of the Variable, that gets injected
						node.getParent().accept(new ASTVisitor() {
							@Override
							public boolean visit(final SimpleType type) {

								final EclipseInjection eInjection = OsgimodelFactory.eINSTANCE.createEclipseInjection();
								eInjection.setInjectedInterface(type.getName().toString());
								eInjection.setUsedInClass(fileName);
								final Bundle bundle = getOrCreateBundle(bundleName);
								bundle.getEclipseInjections().add(eInjection);
								e4Injections.add(eInjection);
								return true; // do not continue
							}
						});
						break;
					default:
						break;

					}

				}

				return false; // do not continue
			}

			// getting all javadoc class comments
			@Override
			public boolean visit(final Javadoc node) {
				if (node.getParent().getNodeType() == ASTNode.TYPE_DECLARATION) {
					final List<?> name = node.tags();
					javadocComments.put(fileName, name.toString());
				}

				return false; // do not continue
			}

		});

	}

}
