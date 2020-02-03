/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
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
 * An implementation of the model object '<em><b>Class Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl#isChildrenInitialized <em>Children Initialized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl#isAllInjectedInterfacesShownPlain <em>All Injected Interfaces Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl#isAllInjectedInterfacesShownInBundles <em>All Injected Interfaces Shown In Bundles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassContextImpl extends MinimalEObjectImpl.Container implements ClassContext {
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
	protected de.cau.cs.kieler.osgiviz.osgivizmodel.Class modelElement;

	/**
	 * The default value of the '{@link #isChildrenInitialized() <em>Children Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChildrenInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHILDREN_INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChildrenInitialized() <em>Children Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChildrenInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean childrenInitialized = CHILDREN_INITIALIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllInjectedInterfacesShownPlain() <em>All Injected Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllInjectedInterfacesShownPlain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_INJECTED_INTERFACES_SHOWN_PLAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllInjectedInterfacesShownPlain() <em>All Injected Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllInjectedInterfacesShownPlain()
	 * @generated
	 * @ordered
	 */
	protected boolean allInjectedInterfacesShownPlain = ALL_INJECTED_INTERFACES_SHOWN_PLAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllInjectedInterfacesShownInBundles() <em>All Injected Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllInjectedInterfacesShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllInjectedInterfacesShownInBundles() <em>All Injected Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllInjectedInterfacesShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected boolean allInjectedInterfacesShownInBundles = ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.CLASS_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.CLASS_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.cau.cs.kieler.osgiviz.osgivizmodel.Class getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (de.cau.cs.kieler.osgiviz.osgivizmodel.Class)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.CLASS_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cau.cs.kieler.osgiviz.osgivizmodel.Class basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElement(de.cau.cs.kieler.osgiviz.osgivizmodel.Class newModelElement) {
		de.cau.cs.kieler.osgiviz.osgivizmodel.Class oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.CLASS_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.CLASS_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.CLASS_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.CLASS_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.CLASS_CONTEXT__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.CLASS_CONTEXT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChildrenInitialized() {
		return childrenInitialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildrenInitialized(boolean newChildrenInitialized) {
		boolean oldChildrenInitialized = childrenInitialized;
		childrenInitialized = newChildrenInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.CLASS_CONTEXT__CHILDREN_INITIALIZED, oldChildrenInitialized, childrenInitialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllInjectedInterfacesShownPlain() {
		return allInjectedInterfacesShownPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllInjectedInterfacesShownPlain(boolean newAllInjectedInterfacesShownPlain) {
		boolean oldAllInjectedInterfacesShownPlain = allInjectedInterfacesShownPlain;
		allInjectedInterfacesShownPlain = newAllInjectedInterfacesShownPlain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN, oldAllInjectedInterfacesShownPlain, allInjectedInterfacesShownPlain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllInjectedInterfacesShownInBundles() {
		return allInjectedInterfacesShownInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllInjectedInterfacesShownInBundles(boolean newAllInjectedInterfacesShownInBundles) {
		boolean oldAllInjectedInterfacesShownInBundles = allInjectedInterfacesShownInBundles;
		allInjectedInterfacesShownInBundles = newAllInjectedInterfacesShownInBundles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES, oldAllInjectedInterfacesShownInBundles, allInjectedInterfacesShownInBundles));
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
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.CLASS_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.CLASS_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.CLASS_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.CLASS_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.CLASS_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILDREN_INITIALIZED:
				return isChildrenInitialized();
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN:
				return isAllInjectedInterfacesShownPlain();
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES:
				return isAllInjectedInterfacesShownInBundles();
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
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__MODEL_ELEMENT:
				setModelElement((de.cau.cs.kieler.osgiviz.osgivizmodel.Class)newValue);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized((Boolean)newValue);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN:
				setAllInjectedInterfacesShownPlain((Boolean)newValue);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES:
				setAllInjectedInterfacesShownInBundles((Boolean)newValue);
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
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__MODEL_ELEMENT:
				setModelElement((de.cau.cs.kieler.osgiviz.osgivizmodel.Class)null);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized(CHILDREN_INITIALIZED_EDEFAULT);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN:
				setAllInjectedInterfacesShownPlain(ALL_INJECTED_INTERFACES_SHOWN_PLAIN_EDEFAULT);
				return;
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES:
				setAllInjectedInterfacesShownInBundles(ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT);
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
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.CLASS_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.CLASS_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.CLASS_CONTEXT__CHILDREN_INITIALIZED:
				return childrenInitialized != CHILDREN_INITIALIZED_EDEFAULT;
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN:
				return allInjectedInterfacesShownPlain != ALL_INJECTED_INTERFACES_SHOWN_PLAIN_EDEFAULT;
			case OsgivizmodelPackage.CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES:
				return allInjectedInterfacesShownInBundles != ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT;
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
		result.append(" (childrenInitialized: ");
		result.append(childrenInitialized);
		result.append(", allInjectedInterfacesShownPlain: ");
		result.append(allInjectedInterfacesShownPlain);
		result.append(", allInjectedInterfacesShownInBundles: ");
		result.append(allInjectedInterfacesShownInBundles);
		result.append(')');
		return result.toString();
	}

} //ClassContextImpl
