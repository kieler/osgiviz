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
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.OsgimodelPackage;
import de.scheidtbachmann.osgimodel.Reference;
import de.scheidtbachmann.osgimodel.ServiceInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ReferenceImpl#getUnbind <em>Unbind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceInterface() <em>Service Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected ServiceInterface serviceInterface;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected String cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected String policy = POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected static final String BIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected String bind = BIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnbind() <em>Unbind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbind()
	 * @generated
	 * @ordered
	 */
	protected static final String UNBIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnbind() <em>Unbind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbind()
	 * @generated
	 * @ordered
	 */
	protected String unbind = UNBIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.REFERENCE__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInterface getServiceInterface() {
		if (serviceInterface != null && serviceInterface.eIsProxy()) {
			InternalEObject oldServiceInterface = (InternalEObject)serviceInterface;
			serviceInterface = (ServiceInterface)eResolveProxy(oldServiceInterface);
			if (serviceInterface != oldServiceInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgimodelPackage.REFERENCE__SERVICE_INTERFACE, oldServiceInterface, serviceInterface));
			}
		}
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface basicGetServiceInterface() {
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceInterface(ServiceInterface newServiceInterface, NotificationChain msgs) {
		ServiceInterface oldServiceInterface = serviceInterface;
		serviceInterface = newServiceInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OsgimodelPackage.REFERENCE__SERVICE_INTERFACE, oldServiceInterface, newServiceInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceInterface(ServiceInterface newServiceInterface) {
		if (newServiceInterface != serviceInterface) {
			NotificationChain msgs = null;
			if (serviceInterface != null)
				msgs = ((InternalEObject)serviceInterface).eInverseRemove(this, OsgimodelPackage.SERVICE_INTERFACE__REFERENCED_BY, ServiceInterface.class, msgs);
			if (newServiceInterface != null)
				msgs = ((InternalEObject)newServiceInterface).eInverseAdd(this, OsgimodelPackage.SERVICE_INTERFACE__REFERENCED_BY, ServiceInterface.class, msgs);
			msgs = basicSetServiceInterface(newServiceInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.REFERENCE__SERVICE_INTERFACE, newServiceInterface, newServiceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(String newCardinality) {
		String oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.REFERENCE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicy(String newPolicy) {
		String oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.REFERENCE__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBind() {
		return bind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBind(String newBind) {
		String oldBind = bind;
		bind = newBind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.REFERENCE__BIND, oldBind, bind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnbind() {
		return unbind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnbind(String newUnbind) {
		String oldUnbind = unbind;
		unbind = newUnbind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.REFERENCE__UNBIND, oldUnbind, unbind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsgimodelPackage.REFERENCE__SERVICE_INTERFACE:
				if (serviceInterface != null)
					msgs = ((InternalEObject)serviceInterface).eInverseRemove(this, OsgimodelPackage.SERVICE_INTERFACE__REFERENCED_BY, ServiceInterface.class, msgs);
				return basicSetServiceInterface((ServiceInterface)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsgimodelPackage.REFERENCE__SERVICE_INTERFACE:
				return basicSetServiceInterface(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgimodelPackage.REFERENCE__REFERENCE_NAME:
				return getReferenceName();
			case OsgimodelPackage.REFERENCE__SERVICE_INTERFACE:
				if (resolve) return getServiceInterface();
				return basicGetServiceInterface();
			case OsgimodelPackage.REFERENCE__CARDINALITY:
				return getCardinality();
			case OsgimodelPackage.REFERENCE__POLICY:
				return getPolicy();
			case OsgimodelPackage.REFERENCE__BIND:
				return getBind();
			case OsgimodelPackage.REFERENCE__UNBIND:
				return getUnbind();
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
			case OsgimodelPackage.REFERENCE__REFERENCE_NAME:
				setReferenceName((String)newValue);
				return;
			case OsgimodelPackage.REFERENCE__SERVICE_INTERFACE:
				setServiceInterface((ServiceInterface)newValue);
				return;
			case OsgimodelPackage.REFERENCE__CARDINALITY:
				setCardinality((String)newValue);
				return;
			case OsgimodelPackage.REFERENCE__POLICY:
				setPolicy((String)newValue);
				return;
			case OsgimodelPackage.REFERENCE__BIND:
				setBind((String)newValue);
				return;
			case OsgimodelPackage.REFERENCE__UNBIND:
				setUnbind((String)newValue);
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
			case OsgimodelPackage.REFERENCE__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
				return;
			case OsgimodelPackage.REFERENCE__SERVICE_INTERFACE:
				setServiceInterface((ServiceInterface)null);
				return;
			case OsgimodelPackage.REFERENCE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case OsgimodelPackage.REFERENCE__POLICY:
				setPolicy(POLICY_EDEFAULT);
				return;
			case OsgimodelPackage.REFERENCE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case OsgimodelPackage.REFERENCE__UNBIND:
				setUnbind(UNBIND_EDEFAULT);
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
			case OsgimodelPackage.REFERENCE__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
			case OsgimodelPackage.REFERENCE__SERVICE_INTERFACE:
				return serviceInterface != null;
			case OsgimodelPackage.REFERENCE__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case OsgimodelPackage.REFERENCE__POLICY:
				return POLICY_EDEFAULT == null ? policy != null : !POLICY_EDEFAULT.equals(policy);
			case OsgimodelPackage.REFERENCE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case OsgimodelPackage.REFERENCE__UNBIND:
				return UNBIND_EDEFAULT == null ? unbind != null : !UNBIND_EDEFAULT.equals(unbind);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (referenceName: ");
		result.append(referenceName);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", policy: ");
		result.append(policy);
		result.append(", bind: ");
		result.append(bind);
		result.append(", unbind: ");
		result.append(unbind);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
