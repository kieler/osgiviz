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
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext;

import de.scheidtbachmann.osgimodel.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Interface Edge Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ReferencedInterfaceEdgeConnectionImpl#getServiceComponentContext <em>Service Component Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ReferencedInterfaceEdgeConnectionImpl#getServiceInterfaceContext <em>Service Interface Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ReferencedInterfaceEdgeConnectionImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencedInterfaceEdgeConnectionImpl extends MinimalEObjectImpl.Container implements ReferencedInterfaceEdgeConnection {
	/**
	 * The cached value of the '{@link #getServiceComponentContext() <em>Service Component Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceComponentContext()
	 * @generated
	 * @ordered
	 */
	protected ServiceComponentContext serviceComponentContext;

	/**
	 * The cached value of the '{@link #getServiceInterfaceContext() <em>Service Interface Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceContext()
	 * @generated
	 * @ordered
	 */
	protected ServiceInterfaceContext serviceInterfaceContext;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Reference reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedInterfaceEdgeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.REFERENCED_INTERFACE_EDGE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponentContext getServiceComponentContext() {
		if (serviceComponentContext != null && serviceComponentContext.eIsProxy()) {
			InternalEObject oldServiceComponentContext = (InternalEObject)serviceComponentContext;
			serviceComponentContext = (ServiceComponentContext)eResolveProxy(oldServiceComponentContext);
			if (serviceComponentContext != oldServiceComponentContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT, oldServiceComponentContext, serviceComponentContext));
			}
		}
		return serviceComponentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponentContext basicGetServiceComponentContext() {
		return serviceComponentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceComponentContext(ServiceComponentContext newServiceComponentContext) {
		ServiceComponentContext oldServiceComponentContext = serviceComponentContext;
		serviceComponentContext = newServiceComponentContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT, oldServiceComponentContext, serviceComponentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceContext getServiceInterfaceContext() {
		if (serviceInterfaceContext != null && serviceInterfaceContext.eIsProxy()) {
			InternalEObject oldServiceInterfaceContext = (InternalEObject)serviceInterfaceContext;
			serviceInterfaceContext = (ServiceInterfaceContext)eResolveProxy(oldServiceInterfaceContext);
			if (serviceInterfaceContext != oldServiceInterfaceContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT, oldServiceInterfaceContext, serviceInterfaceContext));
			}
		}
		return serviceInterfaceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceContext basicGetServiceInterfaceContext() {
		return serviceInterfaceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInterfaceContext(ServiceInterfaceContext newServiceInterfaceContext) {
		ServiceInterfaceContext oldServiceInterfaceContext = serviceInterfaceContext;
		serviceInterfaceContext = newServiceInterfaceContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT, oldServiceInterfaceContext, serviceInterfaceContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (Reference)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Reference newReference) {
		Reference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT:
				if (resolve) return getServiceComponentContext();
				return basicGetServiceComponentContext();
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT:
				if (resolve) return getServiceInterfaceContext();
				return basicGetServiceInterfaceContext();
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT:
				setServiceComponentContext((ServiceComponentContext)newValue);
				return;
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT:
				setServiceInterfaceContext((ServiceInterfaceContext)newValue);
				return;
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE:
				setReference((Reference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT:
				setServiceComponentContext((ServiceComponentContext)null);
				return;
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT:
				setServiceInterfaceContext((ServiceInterfaceContext)null);
				return;
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE:
				setReference((Reference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT:
				return serviceComponentContext != null;
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT:
				return serviceInterfaceContext != null;
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferencedInterfaceEdgeConnectionImpl
