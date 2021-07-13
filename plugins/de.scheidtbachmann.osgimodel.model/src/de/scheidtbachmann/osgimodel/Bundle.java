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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getFeatures <em>Features</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getUsedByBundle <em>Used By Bundle</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getMoreData <em>More Data</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getEclipseInjections <em>Eclipse Injections</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Bundle#getBundleCategory <em>Bundle Category</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle()
 * @model
 * @generated
 */
public interface Bundle extends BasicOsgiObject {
	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_IsExternal()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Bundle#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Feature}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Feature#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_Features()
	 * @see de.scheidtbachmann.osgimodel.Feature#getBundles
	 * @model opposite="bundles"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_Vendor()
	 * @model unique="false"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Bundle#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Service Components</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceComponent}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Components</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_ServiceComponents()
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getBundle
	 * @model opposite="bundle" containment="true"
	 * @generated
	 */
	EList<ServiceComponent> getServiceComponents();

	/**
	 * Returns the value of the '<em><b>Required Bundles</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Bundle#getUsedByBundle <em>Used By Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Bundles</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_RequiredBundles()
	 * @see de.scheidtbachmann.osgimodel.Bundle#getUsedByBundle
	 * @model opposite="usedByBundle"
	 * @generated
	 */
	EList<Bundle> getRequiredBundles();

	/**
	 * Returns the value of the '<em><b>Used By Bundle</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Bundle#getRequiredBundles <em>Required Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By Bundle</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_UsedByBundle()
	 * @see de.scheidtbachmann.osgimodel.Bundle#getRequiredBundles
	 * @model opposite="requiredBundles"
	 * @generated
	 */
	EList<Bundle> getUsedByBundle();

	/**
	 * Returns the value of the '<em><b>Imported Packages</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.PackageObject}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.PackageObject#getImplementedBy <em>Implemented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Packages</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_ImportedPackages()
	 * @see de.scheidtbachmann.osgimodel.PackageObject#getImplementedBy
	 * @model opposite="implementedBy"
	 * @generated
	 */
	EList<PackageObject> getImportedPackages();

	/**
	 * Returns the value of the '<em><b>Exported Packages</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.PackageObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Packages</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_ExportedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageObject> getExportedPackages();

	/**
	 * Returns the value of the '<em><b>More Data</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.AttributeData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>More Data</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_MoreData()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeData> getMoreData();

	/**
	 * Returns the value of the '<em><b>Eclipse Injections</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.EclipseInjection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclipse Injections</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_EclipseInjections()
	 * @model containment="true"
	 * @generated
	 */
	EList<EclipseInjection> getEclipseInjections();

	/**
	 * Returns the value of the '<em><b>Bundle Category</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.BundleCategory}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.BundleCategory#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Category</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundle_BundleCategory()
	 * @see de.scheidtbachmann.osgimodel.BundleCategory#getBundle
	 * @model opposite="bundle"
	 * @generated
	 */
	EList<BundleCategory> getBundleCategory();

} // Bundle
