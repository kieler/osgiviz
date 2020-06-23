/**
 */
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;
import de.scheidtbachmann.osgimodel.Reference;
import de.scheidtbachmann.osgimodel.ServiceComponent;
import de.scheidtbachmann.osgimodel.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getAbout <em>About</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getServiceInterfaces <em>Service Interfaces</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.ServiceComponentImpl#getJavaDocPath <em>Java Doc Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceComponentImpl extends IdentifiableImpl implements ServiceComponent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	 * The default value of the '{@link #getImplementationClass() <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationClass() <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected String implementationClass = IMPLEMENTATION_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceInterfaces() <em>Service Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> serviceInterfaces;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The default value of the '{@link #getJavaDocPath() <em>Java Doc Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaDocPath()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_DOC_PATH_EDEFAULT = "";

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
	protected ServiceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.SERVICE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.SERVICE_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.SERVICE_COMPONENT__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.SERVICE_COMPONENT__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationClass() {
		return implementationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationClass(String newImplementationClass) {
		String oldImplementationClass = implementationClass;
		implementationClass = newImplementationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.SERVICE_COMPONENT__IMPLEMENTATION_CLASS, oldImplementationClass, implementationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bundle getBundle() {
		if (eContainerFeatureID() != OsgimodelPackage.SERVICE_COMPONENT__BUNDLE) return null;
		return (Bundle)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle basicGetBundle() {
		if (eContainerFeatureID() != OsgimodelPackage.SERVICE_COMPONENT__BUNDLE) return null;
		return (Bundle)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundle(Bundle newBundle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBundle, OsgimodelPackage.SERVICE_COMPONENT__BUNDLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundle(Bundle newBundle) {
		if (newBundle != eInternalContainer() || (eContainerFeatureID() != OsgimodelPackage.SERVICE_COMPONENT__BUNDLE && newBundle != null)) {
			if (EcoreUtil.isAncestor(this, newBundle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBundle != null)
				msgs = ((InternalEObject)newBundle).eInverseAdd(this, OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS, Bundle.class, msgs);
			msgs = basicSetBundle(newBundle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.SERVICE_COMPONENT__BUNDLE, newBundle, newBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInterface> getServiceInterfaces() {
		if (serviceInterfaces == null) {
			serviceInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<ServiceInterface>(ServiceInterface.class, this, OsgimodelPackage.SERVICE_COMPONENT__SERVICE_INTERFACES, OsgimodelPackage.SERVICE_INTERFACE__SERVICE_COMPONENT);
		}
		return serviceInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, OsgimodelPackage.SERVICE_COMPONENT__REFERENCE);
		}
		return reference;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.SERVICE_COMPONENT__JAVA_DOC_PATH, oldJavaDocPath, javaDocPath));
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
			case OsgimodelPackage.SERVICE_COMPONENT__BUNDLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBundle((Bundle)otherEnd, msgs);
			case OsgimodelPackage.SERVICE_COMPONENT__SERVICE_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceInterfaces()).basicAdd(otherEnd, msgs);
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
			case OsgimodelPackage.SERVICE_COMPONENT__BUNDLE:
				return basicSetBundle(null, msgs);
			case OsgimodelPackage.SERVICE_COMPONENT__SERVICE_INTERFACES:
				return ((InternalEList<?>)getServiceInterfaces()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.SERVICE_COMPONENT__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OsgimodelPackage.SERVICE_COMPONENT__BUNDLE:
				return eInternalContainer().eInverseRemove(this, OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS, Bundle.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgimodelPackage.SERVICE_COMPONENT__NAME:
				return getName();
			case OsgimodelPackage.SERVICE_COMPONENT__PATH:
				return getPath();
			case OsgimodelPackage.SERVICE_COMPONENT__ABOUT:
				return getAbout();
			case OsgimodelPackage.SERVICE_COMPONENT__IMPLEMENTATION_CLASS:
				return getImplementationClass();
			case OsgimodelPackage.SERVICE_COMPONENT__BUNDLE:
				if (resolve) return getBundle();
				return basicGetBundle();
			case OsgimodelPackage.SERVICE_COMPONENT__SERVICE_INTERFACES:
				return getServiceInterfaces();
			case OsgimodelPackage.SERVICE_COMPONENT__REFERENCE:
				return getReference();
			case OsgimodelPackage.SERVICE_COMPONENT__JAVA_DOC_PATH:
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
			case OsgimodelPackage.SERVICE_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__PATH:
				setPath((String)newValue);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__ABOUT:
				setAbout((String)newValue);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__IMPLEMENTATION_CLASS:
				setImplementationClass((String)newValue);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__SERVICE_INTERFACES:
				getServiceInterfaces().clear();
				getServiceInterfaces().addAll((Collection<? extends ServiceInterface>)newValue);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends Reference>)newValue);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__JAVA_DOC_PATH:
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
			case OsgimodelPackage.SERVICE_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__IMPLEMENTATION_CLASS:
				setImplementationClass(IMPLEMENTATION_CLASS_EDEFAULT);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__BUNDLE:
				setBundle((Bundle)null);
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__SERVICE_INTERFACES:
				getServiceInterfaces().clear();
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__REFERENCE:
				getReference().clear();
				return;
			case OsgimodelPackage.SERVICE_COMPONENT__JAVA_DOC_PATH:
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
			case OsgimodelPackage.SERVICE_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OsgimodelPackage.SERVICE_COMPONENT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case OsgimodelPackage.SERVICE_COMPONENT__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case OsgimodelPackage.SERVICE_COMPONENT__IMPLEMENTATION_CLASS:
				return IMPLEMENTATION_CLASS_EDEFAULT == null ? implementationClass != null : !IMPLEMENTATION_CLASS_EDEFAULT.equals(implementationClass);
			case OsgimodelPackage.SERVICE_COMPONENT__BUNDLE:
				return basicGetBundle() != null;
			case OsgimodelPackage.SERVICE_COMPONENT__SERVICE_INTERFACES:
				return serviceInterfaces != null && !serviceInterfaces.isEmpty();
			case OsgimodelPackage.SERVICE_COMPONENT__REFERENCE:
				return reference != null && !reference.isEmpty();
			case OsgimodelPackage.SERVICE_COMPONENT__JAVA_DOC_PATH:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", about: ");
		result.append(about);
		result.append(", implementationClass: ");
		result.append(implementationClass);
		result.append(", javaDocPath: ");
		result.append(javaDocPath);
		result.append(')');
		return result.toString();
	}

} //ServiceComponentImpl
