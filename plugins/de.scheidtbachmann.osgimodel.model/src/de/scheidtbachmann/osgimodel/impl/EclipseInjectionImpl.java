/**
 */
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.EclipseInjection;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.EclipseInjectionImpl#getInjectedInterface <em>Injected Interface</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.EclipseInjectionImpl#getUsedInClass <em>Used In Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclipseInjectionImpl extends MinimalEObjectImpl.Container implements EclipseInjection {
	/**
	 * The default value of the '{@link #getInjectedInterface() <em>Injected Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectedInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String INJECTED_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInjectedInterface() <em>Injected Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectedInterface()
	 * @generated
	 * @ordered
	 */
	protected String injectedInterface = INJECTED_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedInClass() <em>Used In Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInClass()
	 * @generated
	 * @ordered
	 */
	protected static final String USED_IN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedInClass() <em>Used In Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInClass()
	 * @generated
	 * @ordered
	 */
	protected String usedInClass = USED_IN_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseInjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.ECLIPSE_INJECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInjectedInterface() {
		return injectedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInjectedInterface(String newInjectedInterface) {
		String oldInjectedInterface = injectedInterface;
		injectedInterface = newInjectedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.ECLIPSE_INJECTION__INJECTED_INTERFACE, oldInjectedInterface, injectedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsedInClass() {
		return usedInClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedInClass(String newUsedInClass) {
		String oldUsedInClass = usedInClass;
		usedInClass = newUsedInClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.ECLIPSE_INJECTION__USED_IN_CLASS, oldUsedInClass, usedInClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgimodelPackage.ECLIPSE_INJECTION__INJECTED_INTERFACE:
				return getInjectedInterface();
			case OsgimodelPackage.ECLIPSE_INJECTION__USED_IN_CLASS:
				return getUsedInClass();
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
			case OsgimodelPackage.ECLIPSE_INJECTION__INJECTED_INTERFACE:
				setInjectedInterface((String)newValue);
				return;
			case OsgimodelPackage.ECLIPSE_INJECTION__USED_IN_CLASS:
				setUsedInClass((String)newValue);
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
			case OsgimodelPackage.ECLIPSE_INJECTION__INJECTED_INTERFACE:
				setInjectedInterface(INJECTED_INTERFACE_EDEFAULT);
				return;
			case OsgimodelPackage.ECLIPSE_INJECTION__USED_IN_CLASS:
				setUsedInClass(USED_IN_CLASS_EDEFAULT);
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
			case OsgimodelPackage.ECLIPSE_INJECTION__INJECTED_INTERFACE:
				return INJECTED_INTERFACE_EDEFAULT == null ? injectedInterface != null : !INJECTED_INTERFACE_EDEFAULT.equals(injectedInterface);
			case OsgimodelPackage.ECLIPSE_INJECTION__USED_IN_CLASS:
				return USED_IN_CLASS_EDEFAULT == null ? usedInClass != null : !USED_IN_CLASS_EDEFAULT.equals(usedInClass);
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
		result.append(" (injectedInterface: ");
		result.append(injectedInterface);
		result.append(", usedInClass: ");
		result.append(usedInClass);
		result.append(')');
		return result.toString();
	}

} //EclipseInjectionImpl
