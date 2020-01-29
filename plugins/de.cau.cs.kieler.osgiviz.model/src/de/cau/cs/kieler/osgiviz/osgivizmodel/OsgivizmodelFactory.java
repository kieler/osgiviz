/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage
 * @generated
 */
public interface OsgivizmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsgivizmodelFactory eINSTANCE = de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pair</em>'.
	 * @generated
	 */
	<K, V> Pair<K, V> createPair();

	/**
	 * Returns a new object of class '<em>Product Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Context</em>'.
	 * @generated
	 */
	ProductContext createProductContext();

	/**
	 * Returns a new object of class '<em>Feature Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Context</em>'.
	 * @generated
	 */
	FeatureContext createFeatureContext();

	/**
	 * Returns a new object of class '<em>Bundle Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Context</em>'.
	 * @generated
	 */
	BundleContext createBundleContext();

	/**
	 * Returns a new object of class '<em>Bundle Category Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Category Context</em>'.
	 * @generated
	 */
	BundleCategoryContext createBundleCategoryContext();

	/**
	 * Returns a new object of class '<em>Class Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Context</em>'.
	 * @generated
	 */
	ClassContext createClassContext();

	/**
	 * Returns a new object of class '<em>Service Component Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Component Context</em>'.
	 * @generated
	 */
	ServiceComponentContext createServiceComponentContext();

	/**
	 * Returns a new object of class '<em>Service Interface Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Interface Context</em>'.
	 * @generated
	 */
	ServiceInterfaceContext createServiceInterfaceContext();

	/**
	 * Returns a new object of class '<em>Package Object Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Object Context</em>'.
	 * @generated
	 */
	PackageObjectContext createPackageObjectContext();

	/**
	 * Returns a new object of class '<em>Used Packages Of Bundle Edge Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Used Packages Of Bundle Edge Connection</em>'.
	 * @generated
	 */
	UsedPackagesOfBundleEdgeConnection createUsedPackagesOfBundleEdgeConnection();

	/**
	 * Returns a new object of class '<em>Product Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Overview Context</em>'.
	 * @generated
	 */
	ProductOverviewContext createProductOverviewContext();

	/**
	 * Returns a new object of class '<em>Feature Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Overview Context</em>'.
	 * @generated
	 */
	FeatureOverviewContext createFeatureOverviewContext();

	/**
	 * Returns a new object of class '<em>Bundle Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Overview Context</em>'.
	 * @generated
	 */
	BundleOverviewContext createBundleOverviewContext();

	/**
	 * Returns a new object of class '<em>Bundle Category Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Category Overview Context</em>'.
	 * @generated
	 */
	BundleCategoryOverviewContext createBundleCategoryOverviewContext();

	/**
	 * Returns a new object of class '<em>Referenced Interface Edge Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Interface Edge Connection</em>'.
	 * @generated
	 */
	ReferencedInterfaceEdgeConnection createReferencedInterfaceEdgeConnection();

	/**
	 * Returns a new object of class '<em>Service Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Overview Context</em>'.
	 * @generated
	 */
	ServiceOverviewContext createServiceOverviewContext();

	/**
	 * Returns a new object of class '<em>Package Object Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Object Overview Context</em>'.
	 * @generated
	 */
	PackageObjectOverviewContext createPackageObjectOverviewContext();

	/**
	 * Returns a new object of class '<em>Osgi Viz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osgi Viz</em>'.
	 * @generated
	 */
	OsgiViz createOsgiViz();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OsgivizmodelPackage getOsgivizmodelPackage();

} //OsgivizmodelFactory
