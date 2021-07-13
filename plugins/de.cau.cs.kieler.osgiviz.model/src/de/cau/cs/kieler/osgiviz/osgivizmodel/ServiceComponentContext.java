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

import de.scheidtbachmann.osgimodel.ServiceComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Component Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link ServiceComponent}s.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownPlain <em>All Implemented Interfaces Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownInBundles <em>All Implemented Interfaces Shown In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownPlain <em>All Referenced Interfaces Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownInBundles <em>All Referenced Interfaces Shown In Bundles</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceComponentContext()
 * @model
 * @generated
 */
public interface ServiceComponentContext extends IVisualizationContext<ServiceComponent> {
	/**
	 * Returns the value of the '<em><b>All Implemented Interfaces Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service interfaces implemented by this service component are shown and connected to this.
	 * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Implemented Interfaces Shown Plain</em>' attribute.
	 * @see #setAllImplementedInterfacesShownPlain(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceComponentContext_AllImplementedInterfacesShownPlain()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllImplementedInterfacesShownPlain();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownPlain <em>All Implemented Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Implemented Interfaces Shown Plain</em>' attribute.
	 * @see #isAllImplementedInterfacesShownPlain()
	 * @generated
	 */
	void setAllImplementedInterfacesShownPlain(boolean value);

	/**
	 * Returns the value of the '<em><b>All Implemented Interfaces Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service interfaces implemented by this service component are shown and connected to this.
	 * This is for the inBundles variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Implemented Interfaces Shown In Bundles</em>' attribute.
	 * @see #setAllImplementedInterfacesShownInBundles(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceComponentContext_AllImplementedInterfacesShownInBundles()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllImplementedInterfacesShownInBundles();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownInBundles <em>All Implemented Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Implemented Interfaces Shown In Bundles</em>' attribute.
	 * @see #isAllImplementedInterfacesShownInBundles()
	 * @generated
	 */
	void setAllImplementedInterfacesShownInBundles(boolean value);

	/**
	 * Returns the value of the '<em><b>All Referenced Interfaces Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service interfaces referenced by this service component are shown and connected to this.
	 * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Referenced Interfaces Shown Plain</em>' attribute.
	 * @see #setAllReferencedInterfacesShownPlain(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceComponentContext_AllReferencedInterfacesShownPlain()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllReferencedInterfacesShownPlain();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownPlain <em>All Referenced Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Referenced Interfaces Shown Plain</em>' attribute.
	 * @see #isAllReferencedInterfacesShownPlain()
	 * @generated
	 */
	void setAllReferencedInterfacesShownPlain(boolean value);

	/**
	 * Returns the value of the '<em><b>All Referenced Interfaces Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service interfaces referenced by this service component are shown and connected to this.
	 * This is for the inBundles variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Referenced Interfaces Shown In Bundles</em>' attribute.
	 * @see #setAllReferencedInterfacesShownInBundles(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceComponentContext_AllReferencedInterfacesShownInBundles()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllReferencedInterfacesShownInBundles();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownInBundles <em>All Referenced Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Referenced Interfaces Shown In Bundles</em>' attribute.
	 * @see #isAllReferencedInterfacesShownInBundles()
	 * @generated
	 */
	void setAllReferencedInterfacesShownInBundles(boolean value);

} // ServiceComponentContext
