/**
 */
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;
import de.scheidtbachmann.osgimodel.PackageObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.PackageObjectImpl#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.PackageObjectImpl#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.PackageObjectImpl#getJavaDocPath <em>Java Doc Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageObjectImpl extends MinimalEObjectImpl.Container implements PackageObject {
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
	 * The cached value of the '{@link #getImplementedBy() <em>Implemented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> implementedBy;

	/**
	 * The default value of the '{@link #getJavaDocPath() <em>Java Doc Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaDocPath()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_DOC_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaDocPath() <em>Java Doc Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaDocPath()
	 * @generated
	 * @ordered
	 */
	protected String javaDocPath = JAVA_DOC_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.PACKAGE_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.PACKAGE_OBJECT__UNIQUE_ID, oldUniqueId, uniqueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bundle> getImplementedBy() {
		if (implementedBy == null) {
			implementedBy = new EObjectWithInverseResolvingEList.ManyInverse<Bundle>(Bundle.class, this, OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY, OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES);
		}
		return implementedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJavaDocPath() {
		return javaDocPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaDocPath(String newJavaDocPath) {
		String oldJavaDocPath = javaDocPath;
		javaDocPath = newJavaDocPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.PACKAGE_OBJECT__JAVA_DOC_PATH, oldJavaDocPath, javaDocPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedBy()).basicAdd(otherEnd, msgs);
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
			case OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY:
				return ((InternalEList<?>)getImplementedBy()).basicRemove(otherEnd, msgs);
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
			case OsgimodelPackage.PACKAGE_OBJECT__UNIQUE_ID:
				return getUniqueId();
			case OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY:
				return getImplementedBy();
			case OsgimodelPackage.PACKAGE_OBJECT__JAVA_DOC_PATH:
				return getJavaDocPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsgimodelPackage.PACKAGE_OBJECT__UNIQUE_ID:
				setUniqueId((String)newValue);
				return;
			case OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY:
				getImplementedBy().clear();
				getImplementedBy().addAll((Collection<? extends Bundle>)newValue);
				return;
			case OsgimodelPackage.PACKAGE_OBJECT__JAVA_DOC_PATH:
				setJavaDocPath((String)newValue);
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
			case OsgimodelPackage.PACKAGE_OBJECT__UNIQUE_ID:
				setUniqueId(UNIQUE_ID_EDEFAULT);
				return;
			case OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY:
				getImplementedBy().clear();
				return;
			case OsgimodelPackage.PACKAGE_OBJECT__JAVA_DOC_PATH:
				setJavaDocPath(JAVA_DOC_PATH_EDEFAULT);
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
			case OsgimodelPackage.PACKAGE_OBJECT__UNIQUE_ID:
				return UNIQUE_ID_EDEFAULT == null ? uniqueId != null : !UNIQUE_ID_EDEFAULT.equals(uniqueId);
			case OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY:
				return implementedBy != null && !implementedBy.isEmpty();
			case OsgimodelPackage.PACKAGE_OBJECT__JAVA_DOC_PATH:
				return JAVA_DOC_PATH_EDEFAULT == null ? javaDocPath != null : !JAVA_DOC_PATH_EDEFAULT.equals(javaDocPath);
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
		result.append(", javaDocPath: ");
		result.append(javaDocPath);
		result.append(')');
		return result.toString();
	}

} //PackageObjectImpl
