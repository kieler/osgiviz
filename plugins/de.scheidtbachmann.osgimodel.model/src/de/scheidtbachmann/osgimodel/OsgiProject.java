/**
 * // ******************************************************************************
 * //
 * // Copyright (c) 2018 by
 * // Scheidt & Bachmann System Technik GmbH, 24145 Kiel
 * //
 * // This program and the accompanying materials are made available under the
 * // terms of the Eclipse Public License 2.0 which is available at
 * // http://www.eclipse.org/legal/epl-2.0.
 * // 
 * // SPDX-License-Identifier: EPL-2.0
 * //
 * // ******************************************************************************
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Osgi Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getNumberOfJavaFiles <em>Number Of Java Files</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getBundles <em>Bundles</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getFeatures <em>Features</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getServiceInterfaces <em>Service Interfaces</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getProducts <em>Products</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.OsgiProject#getBundleCategories <em>Bundle Categories</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject()
 * @model
 * @generated
 */
public interface OsgiProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_ProjectName()
	 * @model unique="false"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.OsgiProject#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Java Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Java Files</em>' attribute.
	 * @see #setNumberOfJavaFiles(int)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_NumberOfJavaFiles()
	 * @model unique="false"
	 * @generated
	 */
	int getNumberOfJavaFiles();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.OsgiProject#getNumberOfJavaFiles <em>Number Of Java Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Java Files</em>' attribute.
	 * @see #getNumberOfJavaFiles()
	 * @generated
	 */
	void setNumberOfJavaFiles(int value);

	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_Bundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bundle> getBundles();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Service Components</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Components</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_ServiceComponents()
	 * @model
	 * @generated
	 */
	EList<ServiceComponent> getServiceComponents();

	/**
	 * Returns the value of the '<em><b>Service Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Interfaces</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_ServiceInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceInterface> getServiceInterfaces();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.PackageObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_ImportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageObject> getImportedPackages();

	/**
	 * Returns the value of the '<em><b>Exported Packages</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.PackageObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Packages</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_ExportedPackages()
	 * @model
	 * @generated
	 */
	EList<PackageObject> getExportedPackages();

	/**
	 * Returns the value of the '<em><b>Bundle Categories</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.BundleCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Categories</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getOsgiProject_BundleCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<BundleCategory> getBundleCategories();

} // OsgiProject
