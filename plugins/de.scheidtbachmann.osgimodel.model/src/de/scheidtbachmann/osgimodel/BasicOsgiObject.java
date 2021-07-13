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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Osgi Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getDescriptiveName <em>Descriptive Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getVersion <em>Version</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBasicOsgiObject()
 * @model abstract="true"
 * @generated
 */
public interface BasicOsgiObject extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Id</em>' attribute.
	 * @see #setUniqueId(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBasicOsgiObject_UniqueId()
	 * @model unique="false"
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * Returns the value of the '<em><b>Descriptive Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptive Name</em>' attribute.
	 * @see #setDescriptiveName(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBasicOsgiObject_DescriptiveName()
	 * @model unique="false"
	 * @generated
	 */
	String getDescriptiveName();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getDescriptiveName <em>Descriptive Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptive Name</em>' attribute.
	 * @see #getDescriptiveName()
	 * @generated
	 */
	void setDescriptiveName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBasicOsgiObject_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBasicOsgiObject_About()
	 * @model unique="false"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.BasicOsgiObject#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // BasicOsgiObject
