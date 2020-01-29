/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext;

import de.scheidtbachmann.osgimodel.ServiceInterface;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl#isAllImplementingComponentsShownPlain <em>All Implementing Components Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl#isAllImplementingComponentsShownInBundles <em>All Implementing Components Shown In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl#isAllReferencingComponentsShownPlain <em>All Referencing Components Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl#isAllReferencingComponentsShownInBundles <em>All Referencing Components Shown In Bundles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceInterfaceContextImpl extends MinimalEObjectImpl.Container implements ServiceInterfaceContext {
	/**
	 * The cached value of the '{@link #getChildContexts() <em>Child Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<IVisualizationContext<?>> childContexts;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected ServiceInterface modelElement;

	/**
	 * The default value of the '{@link #isAllImplementingComponentsShownPlain() <em>All Implementing Components Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementingComponentsShownPlain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllImplementingComponentsShownPlain() <em>All Implementing Components Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementingComponentsShownPlain()
	 * @generated
	 * @ordered
	 */
	protected boolean allImplementingComponentsShownPlain = ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllImplementingComponentsShownInBundles() <em>All Implementing Components Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementingComponentsShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllImplementingComponentsShownInBundles() <em>All Implementing Components Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementingComponentsShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected boolean allImplementingComponentsShownInBundles = ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllReferencingComponentsShownPlain() <em>All Referencing Components Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencingComponentsShownPlain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllReferencingComponentsShownPlain() <em>All Referencing Components Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencingComponentsShownPlain()
	 * @generated
	 * @ordered
	 */
	protected boolean allReferencingComponentsShownPlain = ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllReferencingComponentsShownInBundles() <em>All Referencing Components Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencingComponentsShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllReferencingComponentsShownInBundles() <em>All Referencing Components Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencingComponentsShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected boolean allReferencingComponentsShownInBundles = ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.SERVICE_INTERFACE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInterface getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (ServiceInterface)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElement(ServiceInterface newModelElement) {
		ServiceInterface oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__CHILD_CONTEXTS, IVisualizationContext.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllImplementingComponentsShownPlain() {
		return allImplementingComponentsShownPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllImplementingComponentsShownPlain(boolean newAllImplementingComponentsShownPlain) {
		boolean oldAllImplementingComponentsShownPlain = allImplementingComponentsShownPlain;
		allImplementingComponentsShownPlain = newAllImplementingComponentsShownPlain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN, oldAllImplementingComponentsShownPlain, allImplementingComponentsShownPlain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllImplementingComponentsShownInBundles() {
		return allImplementingComponentsShownInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllImplementingComponentsShownInBundles(boolean newAllImplementingComponentsShownInBundles) {
		boolean oldAllImplementingComponentsShownInBundles = allImplementingComponentsShownInBundles;
		allImplementingComponentsShownInBundles = newAllImplementingComponentsShownInBundles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES, oldAllImplementingComponentsShownInBundles, allImplementingComponentsShownInBundles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllReferencingComponentsShownPlain() {
		return allReferencingComponentsShownPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllReferencingComponentsShownPlain(boolean newAllReferencingComponentsShownPlain) {
		boolean oldAllReferencingComponentsShownPlain = allReferencingComponentsShownPlain;
		allReferencingComponentsShownPlain = newAllReferencingComponentsShownPlain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN, oldAllReferencingComponentsShownPlain, allReferencingComponentsShownPlain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllReferencingComponentsShownInBundles() {
		return allReferencingComponentsShownInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllReferencingComponentsShownInBundles(boolean newAllReferencingComponentsShownInBundles) {
		boolean oldAllReferencingComponentsShownInBundles = allReferencingComponentsShownInBundles;
		allReferencingComponentsShownInBundles = newAllReferencingComponentsShownInBundles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES, oldAllReferencingComponentsShownInBundles, allReferencingComponentsShownInBundles));
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
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IVisualizationContext<?>)otherEnd, msgs);
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
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT:
				return basicSetParent(null, msgs);
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
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT:
				return eInternalContainer().eInverseRemove(this, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__CHILD_CONTEXTS, IVisualizationContext.class, msgs);
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
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN:
				return isAllImplementingComponentsShownPlain();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES:
				return isAllImplementingComponentsShownInBundles();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN:
				return isAllReferencingComponentsShownPlain();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES:
				return isAllReferencingComponentsShownInBundles();
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
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__MODEL_ELEMENT:
				setModelElement((ServiceInterface)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN:
				setAllImplementingComponentsShownPlain((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES:
				setAllImplementingComponentsShownInBundles((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN:
				setAllReferencingComponentsShownPlain((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES:
				setAllReferencingComponentsShownInBundles((Boolean)newValue);
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
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__MODEL_ELEMENT:
				setModelElement((ServiceInterface)null);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN:
				setAllImplementingComponentsShownPlain(ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES:
				setAllImplementingComponentsShownInBundles(ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN:
				setAllReferencingComponentsShownPlain(ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES:
				setAllReferencingComponentsShownInBundles(ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT);
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
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN:
				return allImplementingComponentsShownPlain != ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES:
				return allImplementingComponentsShownInBundles != ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN:
				return allReferencingComponentsShownPlain != ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES:
				return allReferencingComponentsShownInBundles != ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES_EDEFAULT;
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
		result.append(" (allImplementingComponentsShownPlain: ");
		result.append(allImplementingComponentsShownPlain);
		result.append(", allImplementingComponentsShownInBundles: ");
		result.append(allImplementingComponentsShownInBundles);
		result.append(", allReferencingComponentsShownPlain: ");
		result.append(allReferencingComponentsShownPlain);
		result.append(", allReferencingComponentsShownInBundles: ");
		result.append(allReferencingComponentsShownInBundles);
		result.append(')');
		return result.toString();
	}

} //ServiceInterfaceContextImpl
