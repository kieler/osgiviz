/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.scheidtbachmann.osgimodel.OsgimodelFactory
 * @model kind="package"
 * @generated
 */
public interface OsgimodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osgimodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.scheidtbachmann.osgimodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "osgimodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsgimodelPackage eINSTANCE = de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl <em>Osgi Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getOsgiProject()
	 * @generated
	 */
	int OSGI_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__PROJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Number Of Java Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__NUMBER_OF_JAVA_FILES = 1;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__BUNDLES = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__FEATURES = 3;

	/**
	 * The feature id for the '<em><b>Service Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__SERVICE_COMPONENTS = 4;

	/**
	 * The feature id for the '<em><b>Service Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__SERVICE_INTERFACES = 5;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__PRODUCTS = 6;

	/**
	 * The feature id for the '<em><b>Imported Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__IMPORTED_PACKAGES = 7;

	/**
	 * The feature id for the '<em><b>Exported Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__EXPORTED_PACKAGES = 8;

	/**
	 * The feature id for the '<em><b>Bundle Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT__BUNDLE_CATEGORIES = 9;

	/**
	 * The number of structural features of the '<em>Osgi Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Osgi Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl <em>Basic Osgi Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getBasicOsgiObject()
	 * @generated
	 */
	int BASIC_OSGI_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OSGI_OBJECT__UNIQUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Descriptive Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OSGI_OBJECT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OSGI_OBJECT__ABOUT = 3;

	/**
	 * The number of structural features of the '<em>Basic Osgi Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OSGI_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Basic Osgi Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OSGI_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.ProductImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UNIQUE_ID = BASIC_OSGI_OBJECT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Descriptive Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTIVE_NAME = BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VERSION = BASIC_OSGI_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ABOUT = BASIC_OSGI_OBJECT__ABOUT;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = BASIC_OSGI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = BASIC_OSGI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = BASIC_OSGI_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.FeatureImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UNIQUE_ID = BASIC_OSGI_OBJECT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Descriptive Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTIVE_NAME = BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = BASIC_OSGI_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ABOUT = BASIC_OSGI_OBJECT__ABOUT;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_EXTERNAL = BASIC_OSGI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BUNDLES = BASIC_OSGI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = BASIC_OSGI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = BASIC_OSGI_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.BundleImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 4;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__UNIQUE_ID = BASIC_OSGI_OBJECT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Descriptive Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__DESCRIPTIVE_NAME = BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VERSION = BASIC_OSGI_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ABOUT = BASIC_OSGI_OBJECT__ABOUT;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__IS_EXTERNAL = BASIC_OSGI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__FEATURES = BASIC_OSGI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VENDOR = BASIC_OSGI_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__SERVICE_COMPONENTS = BASIC_OSGI_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__REQUIRED_BUNDLES = BASIC_OSGI_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Used By Bundle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__USED_BY_BUNDLE = BASIC_OSGI_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imported Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__IMPORTED_PACKAGES = BASIC_OSGI_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exported Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__EXPORTED_PACKAGES = BASIC_OSGI_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>More Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__MORE_DATA = BASIC_OSGI_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Eclipse Injections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ECLIPSE_INJECTIONS = BASIC_OSGI_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Bundle Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__BUNDLE_CATEGORY = BASIC_OSGI_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = BASIC_OSGI_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OPERATION_COUNT = BASIC_OSGI_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.PackageObjectImpl <em>Package Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.PackageObjectImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getPackageObject()
	 * @generated
	 */
	int PACKAGE_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT__UNIQUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Implemented By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT__IMPLEMENTED_BY = 1;

	/**
	 * The feature id for the '<em><b>Java Doc Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT__JAVA_DOC_PATH = 2;

	/**
	 * The number of structural features of the '<em>Package Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Package Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl <em>Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getServiceComponent()
	 * @generated
	 */
	int SERVICE_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__PATH = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__IMPLEMENTATION_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__BUNDLE = 4;

	/**
	 * The feature id for the '<em><b>Service Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__SERVICE_INTERFACES = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Java Doc Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__JAVA_DOC_PATH = 7;

	/**
	 * The number of structural features of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.ServiceInterfaceImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Service Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__SERVICE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__ABOUT = 2;

	/**
	 * The feature id for the '<em><b>Implemented In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__IMPLEMENTED_IN = 3;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__REFERENCED_BY = 4;

	/**
	 * The number of structural features of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.BundleCategoryImpl <em>Bundle Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.BundleCategoryImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getBundleCategory()
	 * @generated
	 */
	int BUNDLE_CATEGORY = 8;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY__CATEGORY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY__BUNDLE = 1;

	/**
	 * The number of structural features of the '<em>Bundle Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bundle Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.EclipseInjectionImpl <em>Eclipse Injection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.EclipseInjectionImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getEclipseInjection()
	 * @generated
	 */
	int ECLIPSE_INJECTION = 9;

	/**
	 * The feature id for the '<em><b>Injected Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_INJECTION__INJECTED_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Used In Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_INJECTION__USED_IN_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Eclipse Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_INJECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Eclipse Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPSE_INJECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.AttributeDataImpl <em>Attribute Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.AttributeDataImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getAttributeData()
	 * @generated
	 */
	int ATTRIBUTE_DATA = 10;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATA__ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATA__ATTRIBUTE_DATA = 1;

	/**
	 * The number of structural features of the '<em>Attribute Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.scheidtbachmann.osgimodel.impl.ReferenceImpl
	 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SERVICE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CARDINALITY = 2;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__POLICY = 3;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__BIND = 4;

	/**
	 * The feature id for the '<em><b>Unbind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UNBIND = 5;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.OsgiProject <em>Osgi Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osgi Project</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject
	 * @generated
	 */
	EClass getOsgiProject();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.OsgiProject#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getProjectName()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EAttribute getOsgiProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.OsgiProject#getNumberOfJavaFiles <em>Number Of Java Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Java Files</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getNumberOfJavaFiles()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EAttribute getOsgiProject_NumberOfJavaFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getBundles()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_Bundles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getFeatures()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_Features();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getServiceComponents <em>Service Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Components</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getServiceComponents()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_ServiceComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getServiceInterfaces <em>Service Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Interfaces</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getServiceInterfaces()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_ServiceInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getProducts()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getImportedPackages <em>Imported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Packages</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getImportedPackages()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_ImportedPackages();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exported Packages</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getExportedPackages()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_ExportedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.OsgiProject#getBundleCategories <em>Bundle Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle Categories</em>'.
	 * @see de.scheidtbachmann.osgimodel.OsgiProject#getBundleCategories()
	 * @see #getOsgiProject()
	 * @generated
	 */
	EReference getOsgiProject_BundleCategories();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject <em>Basic Osgi Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Osgi Object</em>'.
	 * @see de.scheidtbachmann.osgimodel.BasicOsgiObject
	 * @generated
	 */
	EClass getBasicOsgiObject();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see de.scheidtbachmann.osgimodel.BasicOsgiObject#getUniqueId()
	 * @see #getBasicOsgiObject()
	 * @generated
	 */
	EAttribute getBasicOsgiObject_UniqueId();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getDescriptiveName <em>Descriptive Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptive Name</em>'.
	 * @see de.scheidtbachmann.osgimodel.BasicOsgiObject#getDescriptiveName()
	 * @see #getBasicOsgiObject()
	 * @generated
	 */
	EAttribute getBasicOsgiObject_DescriptiveName();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.scheidtbachmann.osgimodel.BasicOsgiObject#getVersion()
	 * @see #getBasicOsgiObject()
	 * @generated
	 */
	EAttribute getBasicOsgiObject_Version();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.scheidtbachmann.osgimodel.BasicOsgiObject#getAbout()
	 * @see #getBasicOsgiObject()
	 * @generated
	 */
	EAttribute getBasicOsgiObject_About();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see de.scheidtbachmann.osgimodel.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see de.scheidtbachmann.osgimodel.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see de.scheidtbachmann.osgimodel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Feature#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see de.scheidtbachmann.osgimodel.Feature#isIsExternal()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsExternal();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.Feature#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bundles</em>'.
	 * @see de.scheidtbachmann.osgimodel.Feature#getBundles()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Bundles();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Bundle#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#isIsExternal()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_IsExternal();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getFeatures()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_Features();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Bundle#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getVendor()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Vendor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getServiceComponents <em>Service Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Components</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getServiceComponents()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ServiceComponents();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getRequiredBundles <em>Required Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Bundles</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getRequiredBundles()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_RequiredBundles();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getUsedByBundle <em>Used By Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By Bundle</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getUsedByBundle()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_UsedByBundle();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getImportedPackages <em>Imported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Packages</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getImportedPackages()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ImportedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getExportedPackages <em>Exported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exported Packages</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getExportedPackages()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_ExportedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getMoreData <em>More Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>More Data</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getMoreData()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_MoreData();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getEclipseInjections <em>Eclipse Injections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eclipse Injections</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getEclipseInjections()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_EclipseInjections();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.Bundle#getBundleCategory <em>Bundle Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bundle Category</em>'.
	 * @see de.scheidtbachmann.osgimodel.Bundle#getBundleCategory()
	 * @see #getBundle()
	 * @generated
	 */
	EReference getBundle_BundleCategory();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.PackageObject <em>Package Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Object</em>'.
	 * @see de.scheidtbachmann.osgimodel.PackageObject
	 * @generated
	 */
	EClass getPackageObject();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.PackageObject#getUniqueId <em>Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Id</em>'.
	 * @see de.scheidtbachmann.osgimodel.PackageObject#getUniqueId()
	 * @see #getPackageObject()
	 * @generated
	 */
	EAttribute getPackageObject_UniqueId();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.PackageObject#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implemented By</em>'.
	 * @see de.scheidtbachmann.osgimodel.PackageObject#getImplementedBy()
	 * @see #getPackageObject()
	 * @generated
	 */
	EReference getPackageObject_ImplementedBy();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.PackageObject#getJavaDocPath <em>Java Doc Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Doc Path</em>'.
	 * @see de.scheidtbachmann.osgimodel.PackageObject#getJavaDocPath()
	 * @see #getPackageObject()
	 * @generated
	 */
	EAttribute getPackageObject_JavaDocPath();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Component</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent
	 * @generated
	 */
	EClass getServiceComponent();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getName()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getPath()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getAbout()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_About();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getImplementationClass()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_ImplementationClass();

	/**
	 * Returns the meta object for the container reference '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bundle</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getBundle()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_Bundle();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getServiceInterfaces <em>Service Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Interfaces</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getServiceInterfaces()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_ServiceInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getReference()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_Reference();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getJavaDocPath <em>Java Doc Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Doc Path</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getJavaDocPath()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EAttribute getServiceComponent_JavaDocPath();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface
	 * @generated
	 */
	EClass getServiceInterface();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Component</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface#getServiceComponent()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_ServiceComponent();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface#getName()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getAbout <em>About</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface#getAbout()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_About();

	/**
	 * Returns the meta object for the reference '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getImplementedIn <em>Implemented In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implemented In</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface#getImplementedIn()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_ImplementedIn();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface#getReferencedBy()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_ReferencedBy();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.BundleCategory <em>Bundle Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Category</em>'.
	 * @see de.scheidtbachmann.osgimodel.BundleCategory
	 * @generated
	 */
	EClass getBundleCategory();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.BundleCategory#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see de.scheidtbachmann.osgimodel.BundleCategory#getCategoryName()
	 * @see #getBundleCategory()
	 * @generated
	 */
	EAttribute getBundleCategory_CategoryName();

	/**
	 * Returns the meta object for the reference list '{@link de.scheidtbachmann.osgimodel.BundleCategory#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bundle</em>'.
	 * @see de.scheidtbachmann.osgimodel.BundleCategory#getBundle()
	 * @see #getBundleCategory()
	 * @generated
	 */
	EReference getBundleCategory_Bundle();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.EclipseInjection <em>Eclipse Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eclipse Injection</em>'.
	 * @see de.scheidtbachmann.osgimodel.EclipseInjection
	 * @generated
	 */
	EClass getEclipseInjection();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.EclipseInjection#getInjectedInterface <em>Injected Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Injected Interface</em>'.
	 * @see de.scheidtbachmann.osgimodel.EclipseInjection#getInjectedInterface()
	 * @see #getEclipseInjection()
	 * @generated
	 */
	EAttribute getEclipseInjection_InjectedInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.EclipseInjection#getUsedInClass <em>Used In Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used In Class</em>'.
	 * @see de.scheidtbachmann.osgimodel.EclipseInjection#getUsedInClass()
	 * @see #getEclipseInjection()
	 * @generated
	 */
	EAttribute getEclipseInjection_UsedInClass();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.AttributeData <em>Attribute Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Data</em>'.
	 * @see de.scheidtbachmann.osgimodel.AttributeData
	 * @generated
	 */
	EClass getAttributeData();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.AttributeData#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see de.scheidtbachmann.osgimodel.AttributeData#getAttributeName()
	 * @see #getAttributeData()
	 * @generated
	 */
	EAttribute getAttributeData_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.AttributeData#getAttributeData <em>Attribute Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Data</em>'.
	 * @see de.scheidtbachmann.osgimodel.AttributeData#getAttributeData()
	 * @see #getAttributeData()
	 * @generated
	 */
	EAttribute getAttributeData_AttributeData();

	/**
	 * Returns the meta object for class '{@link de.scheidtbachmann.osgimodel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see de.scheidtbachmann.osgimodel.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Reference#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see de.scheidtbachmann.osgimodel.Reference#getReferenceName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_ReferenceName();

	/**
	 * Returns the meta object for the reference '{@link de.scheidtbachmann.osgimodel.Reference#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Interface</em>'.
	 * @see de.scheidtbachmann.osgimodel.Reference#getServiceInterface()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Reference#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see de.scheidtbachmann.osgimodel.Reference#getCardinality()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Reference#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see de.scheidtbachmann.osgimodel.Reference#getPolicy()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Policy();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Reference#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bind</em>'.
	 * @see de.scheidtbachmann.osgimodel.Reference#getBind()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Bind();

	/**
	 * Returns the meta object for the attribute '{@link de.scheidtbachmann.osgimodel.Reference#getUnbind <em>Unbind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbind</em>'.
	 * @see de.scheidtbachmann.osgimodel.Reference#getUnbind()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Unbind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsgimodelFactory getOsgimodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl <em>Osgi Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getOsgiProject()
		 * @generated
		 */
		EClass OSGI_PROJECT = eINSTANCE.getOsgiProject();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSGI_PROJECT__PROJECT_NAME = eINSTANCE.getOsgiProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Number Of Java Files</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSGI_PROJECT__NUMBER_OF_JAVA_FILES = eINSTANCE.getOsgiProject_NumberOfJavaFiles();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__BUNDLES = eINSTANCE.getOsgiProject_Bundles();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__FEATURES = eINSTANCE.getOsgiProject_Features();

		/**
		 * The meta object literal for the '<em><b>Service Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__SERVICE_COMPONENTS = eINSTANCE.getOsgiProject_ServiceComponents();

		/**
		 * The meta object literal for the '<em><b>Service Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__SERVICE_INTERFACES = eINSTANCE.getOsgiProject_ServiceInterfaces();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__PRODUCTS = eINSTANCE.getOsgiProject_Products();

		/**
		 * The meta object literal for the '<em><b>Imported Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__IMPORTED_PACKAGES = eINSTANCE.getOsgiProject_ImportedPackages();

		/**
		 * The meta object literal for the '<em><b>Exported Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__EXPORTED_PACKAGES = eINSTANCE.getOsgiProject_ExportedPackages();

		/**
		 * The meta object literal for the '<em><b>Bundle Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_PROJECT__BUNDLE_CATEGORIES = eINSTANCE.getOsgiProject_BundleCategories();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl <em>Basic Osgi Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getBasicOsgiObject()
		 * @generated
		 */
		EClass BASIC_OSGI_OBJECT = eINSTANCE.getBasicOsgiObject();

		/**
		 * The meta object literal for the '<em><b>Unique Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_OSGI_OBJECT__UNIQUE_ID = eINSTANCE.getBasicOsgiObject_UniqueId();

		/**
		 * The meta object literal for the '<em><b>Descriptive Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME = eINSTANCE.getBasicOsgiObject_DescriptiveName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_OSGI_OBJECT__VERSION = eINSTANCE.getBasicOsgiObject_Version();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_OSGI_OBJECT__ABOUT = eINSTANCE.getBasicOsgiObject_About();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.ProductImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.FeatureImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_EXTERNAL = eINSTANCE.getFeature_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BUNDLES = eINSTANCE.getFeature_Bundles();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.BundleImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__IS_EXTERNAL = eINSTANCE.getBundle_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__FEATURES = eINSTANCE.getBundle_Features();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__VENDOR = eINSTANCE.getBundle_Vendor();

		/**
		 * The meta object literal for the '<em><b>Service Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__SERVICE_COMPONENTS = eINSTANCE.getBundle_ServiceComponents();

		/**
		 * The meta object literal for the '<em><b>Required Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__REQUIRED_BUNDLES = eINSTANCE.getBundle_RequiredBundles();

		/**
		 * The meta object literal for the '<em><b>Used By Bundle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__USED_BY_BUNDLE = eINSTANCE.getBundle_UsedByBundle();

		/**
		 * The meta object literal for the '<em><b>Imported Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__IMPORTED_PACKAGES = eINSTANCE.getBundle_ImportedPackages();

		/**
		 * The meta object literal for the '<em><b>Exported Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__EXPORTED_PACKAGES = eINSTANCE.getBundle_ExportedPackages();

		/**
		 * The meta object literal for the '<em><b>More Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__MORE_DATA = eINSTANCE.getBundle_MoreData();

		/**
		 * The meta object literal for the '<em><b>Eclipse Injections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__ECLIPSE_INJECTIONS = eINSTANCE.getBundle_EclipseInjections();

		/**
		 * The meta object literal for the '<em><b>Bundle Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE__BUNDLE_CATEGORY = eINSTANCE.getBundle_BundleCategory();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.PackageObjectImpl <em>Package Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.PackageObjectImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getPackageObject()
		 * @generated
		 */
		EClass PACKAGE_OBJECT = eINSTANCE.getPackageObject();

		/**
		 * The meta object literal for the '<em><b>Unique Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_OBJECT__UNIQUE_ID = eINSTANCE.getPackageObject_UniqueId();

		/**
		 * The meta object literal for the '<em><b>Implemented By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OBJECT__IMPLEMENTED_BY = eINSTANCE.getPackageObject_ImplementedBy();

		/**
		 * The meta object literal for the '<em><b>Java Doc Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_OBJECT__JAVA_DOC_PATH = eINSTANCE.getPackageObject_JavaDocPath();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl <em>Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getServiceComponent()
		 * @generated
		 */
		EClass SERVICE_COMPONENT = eINSTANCE.getServiceComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__NAME = eINSTANCE.getServiceComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__PATH = eINSTANCE.getServiceComponent_Path();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__ABOUT = eINSTANCE.getServiceComponent_About();

		/**
		 * The meta object literal for the '<em><b>Implementation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__IMPLEMENTATION_CLASS = eINSTANCE.getServiceComponent_ImplementationClass();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__BUNDLE = eINSTANCE.getServiceComponent_Bundle();

		/**
		 * The meta object literal for the '<em><b>Service Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__SERVICE_INTERFACES = eINSTANCE.getServiceComponent_ServiceInterfaces();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__REFERENCE = eINSTANCE.getServiceComponent_Reference();

		/**
		 * The meta object literal for the '<em><b>Java Doc Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT__JAVA_DOC_PATH = eINSTANCE.getServiceComponent_JavaDocPath();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.ServiceInterfaceImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getServiceInterface()
		 * @generated
		 */
		EClass SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Service Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__SERVICE_COMPONENT = eINSTANCE.getServiceInterface_ServiceComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__NAME = eINSTANCE.getServiceInterface_Name();

		/**
		 * The meta object literal for the '<em><b>About</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__ABOUT = eINSTANCE.getServiceInterface_About();

		/**
		 * The meta object literal for the '<em><b>Implemented In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__IMPLEMENTED_IN = eINSTANCE.getServiceInterface_ImplementedIn();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__REFERENCED_BY = eINSTANCE.getServiceInterface_ReferencedBy();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.BundleCategoryImpl <em>Bundle Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.BundleCategoryImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getBundleCategory()
		 * @generated
		 */
		EClass BUNDLE_CATEGORY = eINSTANCE.getBundleCategory();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CATEGORY__CATEGORY_NAME = eINSTANCE.getBundleCategory_CategoryName();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CATEGORY__BUNDLE = eINSTANCE.getBundleCategory_Bundle();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.EclipseInjectionImpl <em>Eclipse Injection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.EclipseInjectionImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getEclipseInjection()
		 * @generated
		 */
		EClass ECLIPSE_INJECTION = eINSTANCE.getEclipseInjection();

		/**
		 * The meta object literal for the '<em><b>Injected Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_INJECTION__INJECTED_INTERFACE = eINSTANCE.getEclipseInjection_InjectedInterface();

		/**
		 * The meta object literal for the '<em><b>Used In Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPSE_INJECTION__USED_IN_CLASS = eINSTANCE.getEclipseInjection_UsedInClass();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.AttributeDataImpl <em>Attribute Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.AttributeDataImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getAttributeData()
		 * @generated
		 */
		EClass ATTRIBUTE_DATA = eINSTANCE.getAttributeData();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DATA__ATTRIBUTE_NAME = eINSTANCE.getAttributeData_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Attribute Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DATA__ATTRIBUTE_DATA = eINSTANCE.getAttributeData_AttributeData();

		/**
		 * The meta object literal for the '{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.scheidtbachmann.osgimodel.impl.ReferenceImpl
		 * @see de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REFERENCE_NAME = eINSTANCE.getReference_ReferenceName();

		/**
		 * The meta object literal for the '<em><b>Service Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SERVICE_INTERFACE = eINSTANCE.getReference_ServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__CARDINALITY = eINSTANCE.getReference_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__POLICY = eINSTANCE.getReference_Policy();

		/**
		 * The meta object literal for the '<em><b>Bind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__BIND = eINSTANCE.getReference_Bind();

		/**
		 * The meta object literal for the '<em><b>Unbind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__UNBIND = eINSTANCE.getReference_Unbind();

	}

} //OsgimodelPackage
