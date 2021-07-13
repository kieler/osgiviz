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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.EclipseInjection#getInjectedInterface <em>Injected Interface</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.EclipseInjection#getUsedInClass <em>Used In Class</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getEclipseInjection()
 * @model
 * @generated
 */
public interface EclipseInjection extends EObject {
	/**
	 * Returns the value of the '<em><b>Injected Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injected Interface</em>' attribute.
	 * @see #setInjectedInterface(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getEclipseInjection_InjectedInterface()
	 * @model unique="false"
	 * @generated
	 */
	String getInjectedInterface();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.EclipseInjection#getInjectedInterface <em>Injected Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injected Interface</em>' attribute.
	 * @see #getInjectedInterface()
	 * @generated
	 */
	void setInjectedInterface(String value);

	/**
	 * Returns the value of the '<em><b>Used In Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used In Class</em>' attribute.
	 * @see #setUsedInClass(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getEclipseInjection_UsedInClass()
	 * @model unique="false"
	 * @generated
	 */
	String getUsedInClass();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.EclipseInjection#getUsedInClass <em>Used In Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used In Class</em>' attribute.
	 * @see #getUsedInClass()
	 * @generated
	 */
	void setUsedInClass(String value);

} // EclipseInjection
