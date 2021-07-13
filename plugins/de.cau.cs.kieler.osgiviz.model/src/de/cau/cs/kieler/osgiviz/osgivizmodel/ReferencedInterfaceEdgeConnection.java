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

import de.scheidtbachmann.osgimodel.Reference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Interface Edge Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Helper data class that contains information about edges that should be visualized for referenced interface
 * associations. This class contains the source component context, the target interface context and the
 * {@link Reference} data.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceComponentContext <em>Service Component Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceInterfaceContext <em>Service Interface Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getReferencedInterfaceEdgeConnection()
 * @model
 * @generated
 */
public interface ReferencedInterfaceEdgeConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Component Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service component context of the target service component the edge should connect to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Component Context</em>' reference.
	 * @see #setServiceComponentContext(ServiceComponentContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getReferencedInterfaceEdgeConnection_ServiceComponentContext()
	 * @model
	 * @generated
	 */
	ServiceComponentContext getServiceComponentContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceComponentContext <em>Service Component Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Component Context</em>' reference.
	 * @see #getServiceComponentContext()
	 * @generated
	 */
	void setServiceComponentContext(ServiceComponentContext value);

	/**
	 * Returns the value of the '<em><b>Service Interface Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service interface context of the source service interface the edge should connect to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface Context</em>' reference.
	 * @see #setServiceInterfaceContext(ServiceInterfaceContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getReferencedInterfaceEdgeConnection_ServiceInterfaceContext()
	 * @model
	 * @generated
	 */
	ServiceInterfaceContext getServiceInterfaceContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceInterfaceContext <em>Service Interface Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interface Context</em>' reference.
	 * @see #getServiceInterfaceContext()
	 * @generated
	 */
	void setServiceInterfaceContext(ServiceInterfaceContext value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference containing more data about this edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Reference)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getReferencedInterfaceEdgeConnection_Reference()
	 * @model
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // ReferencedInterfaceEdgeConnection
