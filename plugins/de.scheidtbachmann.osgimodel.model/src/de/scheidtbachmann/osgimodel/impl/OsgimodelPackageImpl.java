/**
 */
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.AttributeData;
import de.scheidtbachmann.osgimodel.BasicOsgiObject;
import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.BundleCategory;
import de.scheidtbachmann.osgimodel.EclipseInjection;
import de.scheidtbachmann.osgimodel.Feature;
import de.scheidtbachmann.osgimodel.Identifiable;
import de.scheidtbachmann.osgimodel.OsgiProject;
import de.scheidtbachmann.osgimodel.OsgimodelFactory;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;
import de.scheidtbachmann.osgimodel.PackageObject;
import de.scheidtbachmann.osgimodel.Product;
import de.scheidtbachmann.osgimodel.Reference;
import de.scheidtbachmann.osgimodel.ServiceComponent;
import de.scheidtbachmann.osgimodel.ServiceInterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsgimodelPackageImpl extends EPackageImpl implements OsgimodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osgiProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicOsgiObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclipseInjectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OsgimodelPackageImpl() {
		super(eNS_URI, OsgimodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OsgimodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OsgimodelPackage init() {
		if (isInited) return (OsgimodelPackage)EPackage.Registry.INSTANCE.getEPackage(OsgimodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOsgimodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OsgimodelPackageImpl theOsgimodelPackage = registeredOsgimodelPackage instanceof OsgimodelPackageImpl ? (OsgimodelPackageImpl)registeredOsgimodelPackage : new OsgimodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOsgimodelPackage.createPackageContents();

		// Initialize created meta-data
		theOsgimodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOsgimodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsgimodelPackage.eNS_URI, theOsgimodelPackage);
		return theOsgimodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsgiProject() {
		return osgiProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsgiProject_ProjectName() {
		return (EAttribute)osgiProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsgiProject_NumberOfJavaFiles() {
		return (EAttribute)osgiProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_Bundles() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_Features() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_ServiceComponents() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_ServiceInterfaces() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_Products() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_ImportedPackages() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_ExportedPackages() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiProject_BundleCategories() {
		return (EReference)osgiProjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiable_EcoreId() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicOsgiObject() {
		return basicOsgiObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicOsgiObject_UniqueId() {
		return (EAttribute)basicOsgiObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicOsgiObject_DescriptiveName() {
		return (EAttribute)basicOsgiObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicOsgiObject_Version() {
		return (EAttribute)basicOsgiObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicOsgiObject_About() {
		return (EAttribute)basicOsgiObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Features() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsExternal() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Bundles() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundle_IsExternal() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_Features() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundle_Vendor() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_ServiceComponents() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_RequiredBundles() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_UsedByBundle() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_ImportedPackages() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_ExportedPackages() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_MoreData() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_EclipseInjections() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundle_BundleCategory() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageObject() {
		return packageObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageObject_UniqueId() {
		return (EAttribute)packageObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageObject_ImplementedBy() {
		return (EReference)packageObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackageObject_JavaDocPath() {
		return (EAttribute)packageObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceComponent() {
		return serviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponent_Name() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponent_Path() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponent_About() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponent_ImplementationClass() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceComponent_Bundle() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceComponent_ServiceInterfaces() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceComponent_Reference() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponent_JavaDocPath() {
		return (EAttribute)serviceComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInterface_ServiceComponent() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterface_Name() {
		return (EAttribute)serviceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterface_About() {
		return (EAttribute)serviceInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInterface_ImplementedIn() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInterface_ReferencedBy() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleCategory() {
		return bundleCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundleCategory_CategoryName() {
		return (EAttribute)bundleCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleCategory_Bundle() {
		return (EReference)bundleCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEclipseInjection() {
		return eclipseInjectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEclipseInjection_InjectedInterface() {
		return (EAttribute)eclipseInjectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEclipseInjection_UsedInClass() {
		return (EAttribute)eclipseInjectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeData() {
		return attributeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeData_AttributeName() {
		return (EAttribute)attributeDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeData_AttributeData() {
		return (EAttribute)attributeDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_ReferenceName() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_ServiceInterface() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Cardinality() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Policy() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Bind() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Unbind() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsgimodelFactory getOsgimodelFactory() {
		return (OsgimodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		osgiProjectEClass = createEClass(OSGI_PROJECT);
		createEAttribute(osgiProjectEClass, OSGI_PROJECT__PROJECT_NAME);
		createEAttribute(osgiProjectEClass, OSGI_PROJECT__NUMBER_OF_JAVA_FILES);
		createEReference(osgiProjectEClass, OSGI_PROJECT__BUNDLES);
		createEReference(osgiProjectEClass, OSGI_PROJECT__FEATURES);
		createEReference(osgiProjectEClass, OSGI_PROJECT__SERVICE_COMPONENTS);
		createEReference(osgiProjectEClass, OSGI_PROJECT__SERVICE_INTERFACES);
		createEReference(osgiProjectEClass, OSGI_PROJECT__PRODUCTS);
		createEReference(osgiProjectEClass, OSGI_PROJECT__IMPORTED_PACKAGES);
		createEReference(osgiProjectEClass, OSGI_PROJECT__EXPORTED_PACKAGES);
		createEReference(osgiProjectEClass, OSGI_PROJECT__BUNDLE_CATEGORIES);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ECORE_ID);

		basicOsgiObjectEClass = createEClass(BASIC_OSGI_OBJECT);
		createEAttribute(basicOsgiObjectEClass, BASIC_OSGI_OBJECT__UNIQUE_ID);
		createEAttribute(basicOsgiObjectEClass, BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME);
		createEAttribute(basicOsgiObjectEClass, BASIC_OSGI_OBJECT__VERSION);
		createEAttribute(basicOsgiObjectEClass, BASIC_OSGI_OBJECT__ABOUT);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__FEATURES);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__IS_EXTERNAL);
		createEReference(featureEClass, FEATURE__BUNDLES);

		bundleEClass = createEClass(BUNDLE);
		createEAttribute(bundleEClass, BUNDLE__IS_EXTERNAL);
		createEReference(bundleEClass, BUNDLE__FEATURES);
		createEAttribute(bundleEClass, BUNDLE__VENDOR);
		createEReference(bundleEClass, BUNDLE__SERVICE_COMPONENTS);
		createEReference(bundleEClass, BUNDLE__REQUIRED_BUNDLES);
		createEReference(bundleEClass, BUNDLE__USED_BY_BUNDLE);
		createEReference(bundleEClass, BUNDLE__IMPORTED_PACKAGES);
		createEReference(bundleEClass, BUNDLE__EXPORTED_PACKAGES);
		createEReference(bundleEClass, BUNDLE__MORE_DATA);
		createEReference(bundleEClass, BUNDLE__ECLIPSE_INJECTIONS);
		createEReference(bundleEClass, BUNDLE__BUNDLE_CATEGORY);

		packageObjectEClass = createEClass(PACKAGE_OBJECT);
		createEAttribute(packageObjectEClass, PACKAGE_OBJECT__UNIQUE_ID);
		createEReference(packageObjectEClass, PACKAGE_OBJECT__IMPLEMENTED_BY);
		createEAttribute(packageObjectEClass, PACKAGE_OBJECT__JAVA_DOC_PATH);

		serviceComponentEClass = createEClass(SERVICE_COMPONENT);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__NAME);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__PATH);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__ABOUT);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__IMPLEMENTATION_CLASS);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__BUNDLE);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__SERVICE_INTERFACES);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__REFERENCE);
		createEAttribute(serviceComponentEClass, SERVICE_COMPONENT__JAVA_DOC_PATH);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__NAME);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__ABOUT);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__IMPLEMENTED_IN);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__SERVICE_COMPONENT);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__REFERENCED_BY);

		bundleCategoryEClass = createEClass(BUNDLE_CATEGORY);
		createEAttribute(bundleCategoryEClass, BUNDLE_CATEGORY__CATEGORY_NAME);
		createEReference(bundleCategoryEClass, BUNDLE_CATEGORY__BUNDLE);

		eclipseInjectionEClass = createEClass(ECLIPSE_INJECTION);
		createEAttribute(eclipseInjectionEClass, ECLIPSE_INJECTION__INJECTED_INTERFACE);
		createEAttribute(eclipseInjectionEClass, ECLIPSE_INJECTION__USED_IN_CLASS);

		attributeDataEClass = createEClass(ATTRIBUTE_DATA);
		createEAttribute(attributeDataEClass, ATTRIBUTE_DATA__ATTRIBUTE_NAME);
		createEAttribute(attributeDataEClass, ATTRIBUTE_DATA__ATTRIBUTE_DATA);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__REFERENCE_NAME);
		createEReference(referenceEClass, REFERENCE__SERVICE_INTERFACE);
		createEAttribute(referenceEClass, REFERENCE__CARDINALITY);
		createEAttribute(referenceEClass, REFERENCE__POLICY);
		createEAttribute(referenceEClass, REFERENCE__BIND);
		createEAttribute(referenceEClass, REFERENCE__UNBIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		basicOsgiObjectEClass.getESuperTypes().add(this.getIdentifiable());
		productEClass.getESuperTypes().add(this.getBasicOsgiObject());
		featureEClass.getESuperTypes().add(this.getBasicOsgiObject());
		bundleEClass.getESuperTypes().add(this.getBasicOsgiObject());
		serviceComponentEClass.getESuperTypes().add(this.getIdentifiable());
		serviceInterfaceEClass.getESuperTypes().add(this.getIdentifiable());
		bundleCategoryEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(osgiProjectEClass, OsgiProject.class, "OsgiProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsgiProject_ProjectName(), theEcorePackage.getEString(), "projectName", null, 0, 1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsgiProject_NumberOfJavaFiles(), theEcorePackage.getEInt(), "numberOfJavaFiles", null, 0, 1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_Bundles(), this.getBundle(), null, "bundles", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_Features(), this.getFeature(), null, "features", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_ServiceComponents(), this.getServiceComponent(), null, "serviceComponents", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_ServiceInterfaces(), this.getServiceInterface(), null, "serviceInterfaces", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_Products(), this.getProduct(), null, "products", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_ImportedPackages(), this.getPackageObject(), null, "importedPackages", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_ExportedPackages(), this.getPackageObject(), null, "exportedPackages", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiProject_BundleCategories(), this.getBundleCategory(), null, "bundleCategories", null, 0, -1, OsgiProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_EcoreId(), theEcorePackage.getEString(), "ecoreId", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicOsgiObjectEClass, BasicOsgiObject.class, "BasicOsgiObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicOsgiObject_UniqueId(), theEcorePackage.getEString(), "uniqueId", null, 0, 1, BasicOsgiObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicOsgiObject_DescriptiveName(), theEcorePackage.getEString(), "descriptiveName", null, 0, 1, BasicOsgiObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicOsgiObject_Version(), theEcorePackage.getEString(), "version", null, 0, 1, BasicOsgiObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicOsgiObject_About(), theEcorePackage.getEString(), "about", null, 0, 1, BasicOsgiObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Features(), this.getFeature(), null, "features", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_IsExternal(), theEcorePackage.getEBoolean(), "isExternal", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Bundles(), this.getBundle(), this.getBundle_Features(), "bundles", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundle_IsExternal(), theEcorePackage.getEBoolean(), "isExternal", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Features(), this.getFeature(), this.getFeature_Bundles(), "features", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundle_Vendor(), theEcorePackage.getEString(), "vendor", null, 0, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_ServiceComponents(), this.getServiceComponent(), this.getServiceComponent_Bundle(), "serviceComponents", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_RequiredBundles(), this.getBundle(), this.getBundle_UsedByBundle(), "requiredBundles", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_UsedByBundle(), this.getBundle(), this.getBundle_RequiredBundles(), "usedByBundle", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_ImportedPackages(), this.getPackageObject(), this.getPackageObject_ImplementedBy(), "importedPackages", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_ExportedPackages(), this.getPackageObject(), null, "exportedPackages", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_MoreData(), this.getAttributeData(), null, "moreData", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_EclipseInjections(), this.getEclipseInjection(), null, "eclipseInjections", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_BundleCategory(), this.getBundleCategory(), this.getBundleCategory_Bundle(), "bundleCategory", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageObjectEClass, PackageObject.class, "PackageObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageObject_UniqueId(), theEcorePackage.getEString(), "uniqueId", null, 0, 1, PackageObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageObject_ImplementedBy(), this.getBundle(), this.getBundle_ImportedPackages(), "implementedBy", null, 0, -1, PackageObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageObject_JavaDocPath(), theEcorePackage.getEString(), "javaDocPath", null, 0, 1, PackageObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceComponentEClass, ServiceComponent.class, "ServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceComponent_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponent_Path(), theEcorePackage.getEString(), "path", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponent_About(), theEcorePackage.getEString(), "about", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponent_ImplementationClass(), theEcorePackage.getEString(), "implementationClass", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceComponent_Bundle(), this.getBundle(), this.getBundle_ServiceComponents(), "bundle", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceComponent_ServiceInterfaces(), this.getServiceInterface(), this.getServiceInterface_ServiceComponent(), "serviceInterfaces", null, 0, -1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceComponent_Reference(), this.getReference(), null, "reference", null, 0, -1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponent_JavaDocPath(), theEcorePackage.getEString(), "javaDocPath", "", 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterface_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterface_About(), theEcorePackage.getEString(), "about", null, 0, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInterface_ImplementedIn(), this.getBundle(), null, "implementedIn", null, 0, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInterface_ServiceComponent(), this.getServiceComponent(), this.getServiceComponent_ServiceInterfaces(), "serviceComponent", null, 0, -1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInterface_ReferencedBy(), this.getReference(), this.getReference_ServiceInterface(), "referencedBy", null, 0, -1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleCategoryEClass, BundleCategory.class, "BundleCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleCategory_CategoryName(), theEcorePackage.getEString(), "categoryName", null, 0, 1, BundleCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleCategory_Bundle(), this.getBundle(), this.getBundle_BundleCategory(), "bundle", null, 0, -1, BundleCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eclipseInjectionEClass, EclipseInjection.class, "EclipseInjection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEclipseInjection_InjectedInterface(), theEcorePackage.getEString(), "injectedInterface", null, 0, 1, EclipseInjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipseInjection_UsedInClass(), theEcorePackage.getEString(), "usedInClass", null, 0, 1, EclipseInjection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDataEClass, AttributeData.class, "AttributeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeData_AttributeName(), theEcorePackage.getEString(), "attributeName", null, 0, 1, AttributeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeData_AttributeData(), theEcorePackage.getEString(), "attributeData", null, 0, 1, AttributeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_ReferenceName(), theEcorePackage.getEString(), "referenceName", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_ServiceInterface(), this.getServiceInterface(), this.getServiceInterface_ReferencedBy(), "serviceInterface", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Cardinality(), theEcorePackage.getEString(), "cardinality", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Policy(), theEcorePackage.getEString(), "policy", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Bind(), theEcorePackage.getEString(), "bind", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Unbind(), theEcorePackage.getEString(), "unbind", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OsgimodelPackageImpl
