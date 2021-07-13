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

import de.scheidtbachmann.osgimodel.BasicOsgiObject;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Osgi Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl#getDescriptiveName <em>Descriptive Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BasicOsgiObjectImpl#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BasicOsgiObjectImpl extends IdentifiableImpl implements BasicOsgiObject {
	/**
	 * The default value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueId() <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueId()
	 * @generated
	 * @ordered
	 */
	protected String uniqueId = UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptiveName() <em>Descriptive Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptiveName()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTIVE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptiveName() <em>Descriptive Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptiveName()
	 * @generated
	 * @ordered
	 */
	protected String descriptiveName = DESCRIPTIVE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicOsgiObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.BASIC_OSGI_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueId(String newUniqueId) {
		String oldUniqueId = uniqueId;
		uniqueId = newUniqueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.BASIC_OSGI_OBJECT__UNIQUE_ID, oldUniqueId, uniqueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescriptiveName() {
		return descriptiveName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptiveName(String newDescriptiveName) {
		String oldDescriptiveName = descriptiveName;
		descriptiveName = newDescriptiveName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME, oldDescriptiveName, descriptiveName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.BASIC_OSGI_OBJECT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.BASIC_OSGI_OBJECT__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgimodelPackage.BASIC_OSGI_OBJECT__UNIQUE_ID:
				return getUniqueId();
			case OsgimodelPackage.BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME:
				return getDescriptiveName();
			case OsgimodelPackage.BASIC_OSGI_OBJECT__VERSION:
				return getVersion();
			case OsgimodelPackage.BASIC_OSGI_OBJECT__ABOUT:
				return getAbout();
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
			case OsgimodelPackage.BASIC_OSGI_OBJECT__UNIQUE_ID:
				setUniqueId((String)newValue);
				return;
			case OsgimodelPackage.BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME:
				setDescriptiveName((String)newValue);
				return;
			case OsgimodelPackage.BASIC_OSGI_OBJECT__VERSION:
				setVersion((String)newValue);
				return;
			case OsgimodelPackage.BASIC_OSGI_OBJECT__ABOUT:
				setAbout((String)newValue);
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
			case OsgimodelPackage.BASIC_OSGI_OBJECT__UNIQUE_ID:
				setUniqueId(UNIQUE_ID_EDEFAULT);
				return;
			case OsgimodelPackage.BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME:
				setDescriptiveName(DESCRIPTIVE_NAME_EDEFAULT);
				return;
			case OsgimodelPackage.BASIC_OSGI_OBJECT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case OsgimodelPackage.BASIC_OSGI_OBJECT__ABOUT:
				setAbout(ABOUT_EDEFAULT);
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
			case OsgimodelPackage.BASIC_OSGI_OBJECT__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueId != null : !UNIQUE_ID_EDEFAULT.equals(uniqueId);
			case OsgimodelPackage.BASIC_OSGI_OBJECT__DESCRIPTIVE_NAME:
				return DESCRIPTIVE_NAME_EDEFAULT == null ? descriptiveName != null : !DESCRIPTIVE_NAME_EDEFAULT.equals(descriptiveName);
			case OsgimodelPackage.BASIC_OSGI_OBJECT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case OsgimodelPackage.BASIC_OSGI_OBJECT__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
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
		result.append(" (uniqueId: ");
		result.append(uniqueId);
		result.append(", descriptiveName: ");
		result.append(descriptiveName);
		result.append(", version: ");
		result.append(version);
		result.append(", about: ");
		result.append(about);
		result.append(')');
		return result.toString();
	}

} //BasicOsgiObjectImpl
