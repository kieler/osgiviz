/**
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2021 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link Class}es.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownPlain <em>All Injected Interfaces Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownInBundles <em>All Injected Interfaces Shown In Bundles</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getClassContext()
 * @model
 * @generated
 */
public interface ClassContext extends IVisualizationContext<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> {
	/**
	 * Returns the value of the '<em><b>All Injected Interfaces Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all injected interfaces are shown and connected to this.
	 * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Injected Interfaces Shown Plain</em>' attribute.
	 * @see #setAllInjectedInterfacesShownPlain(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getClassContext_AllInjectedInterfacesShownPlain()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllInjectedInterfacesShownPlain();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownPlain <em>All Injected Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Injected Interfaces Shown Plain</em>' attribute.
	 * @see #isAllInjectedInterfacesShownPlain()
	 * @generated
	 */
	void setAllInjectedInterfacesShownPlain(boolean value);

	/**
	 * Returns the value of the '<em><b>All Injected Interfaces Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all injected interfaces are shown and connected to this.
	 * This is for the inBundles variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Injected Interfaces Shown In Bundles</em>' attribute.
	 * @see #setAllInjectedInterfacesShownInBundles(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getClassContext_AllInjectedInterfacesShownInBundles()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllInjectedInterfacesShownInBundles();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownInBundles <em>All Injected Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Injected Interfaces Shown In Bundles</em>' attribute.
	 * @see #isAllInjectedInterfacesShownInBundles()
	 * @generated
	 */
	void setAllInjectedInterfacesShownInBundles(boolean value);

} // ClassContext
