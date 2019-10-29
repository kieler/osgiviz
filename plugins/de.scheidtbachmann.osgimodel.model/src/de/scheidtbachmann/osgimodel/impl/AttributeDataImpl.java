/**
 */
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.AttributeData;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.AttributeDataImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.AttributeDataImpl#getAttributeData <em>Attribute Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDataImpl extends MinimalEObjectImpl.Container implements AttributeData {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeData() <em>Attribute Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeData()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeData() <em>Attribute Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeData()
	 * @generated
	 * @ordered
	 */
	protected String attributeData = ATTRIBUTE_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.ATTRIBUTE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributeData() {
		return attributeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeData(String newAttributeData) {
		String oldAttributeData = attributeData;
		attributeData = newAttributeData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_DATA, oldAttributeData, attributeData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_NAME:
				return getAttributeName();
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_DATA:
				return getAttributeData();
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
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_DATA:
				setAttributeData((String)newValue);
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
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_DATA:
				setAttributeData(ATTRIBUTE_DATA_EDEFAULT);
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
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case OsgimodelPackage.ATTRIBUTE_DATA__ATTRIBUTE_DATA:
				return ATTRIBUTE_DATA_EDEFAULT == null ? attributeData != null : !ATTRIBUTE_DATA_EDEFAULT.equals(attributeData);
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
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", attributeData: ");
		result.append(attributeData);
		result.append(')');
		return result.toString();
	}

} //AttributeDataImpl
