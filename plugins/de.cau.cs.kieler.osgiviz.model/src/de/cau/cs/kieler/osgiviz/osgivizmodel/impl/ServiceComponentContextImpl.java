/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext;

import de.scheidtbachmann.osgimodel.ServiceComponent;
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
 * An implementation of the model object '<em><b>Service Component Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#isChildrenInitialized <em>Children Initialized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#isAllImplementedInterfacesShownPlain <em>All Implemented Interfaces Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#isAllImplementedInterfacesShownInBundles <em>All Implemented Interfaces Shown In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#isAllReferencedInterfacesShownPlain <em>All Referenced Interfaces Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl#isAllReferencedInterfacesShownInBundles <em>All Referenced Interfaces Shown In Bundles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceComponentContextImpl extends MinimalEObjectImpl.Container implements ServiceComponentContext {
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
	protected ServiceComponent modelElement;

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
	 * The default value of the '{@link #isAllImplementedInterfacesShownPlain() <em>All Implemented Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementedInterfacesShownPlain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllImplementedInterfacesShownPlain() <em>All Implemented Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementedInterfacesShownPlain()
	 * @generated
	 * @ordered
	 */
	protected boolean allImplementedInterfacesShownPlain = ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllImplementedInterfacesShownInBundles() <em>All Implemented Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementedInterfacesShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllImplementedInterfacesShownInBundles() <em>All Implemented Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllImplementedInterfacesShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected boolean allImplementedInterfacesShownInBundles = ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllReferencedInterfacesShownPlain() <em>All Referenced Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencedInterfacesShownPlain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_REFERENCED_INTERFACES_SHOWN_PLAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllReferencedInterfacesShownPlain() <em>All Referenced Interfaces Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencedInterfacesShownPlain()
	 * @generated
	 * @ordered
	 */
	protected boolean allReferencedInterfacesShownPlain = ALL_REFERENCED_INTERFACES_SHOWN_PLAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllReferencedInterfacesShownInBundles() <em>All Referenced Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencedInterfacesShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllReferencedInterfacesShownInBundles() <em>All Referenced Interfaces Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllReferencedInterfacesShownInBundles()
	 * @generated
	 * @ordered
	 */
	protected boolean allReferencedInterfacesShownInBundles = ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceComponentContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.SERVICE_COMPONENT_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceComponent getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (ServiceComponent)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponent basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElement(ServiceComponent newModelElement) {
		ServiceComponent oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILDREN_INITIALIZED, oldChildrenInitialized, childrenInitialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllImplementedInterfacesShownPlain() {
		return allImplementedInterfacesShownPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllImplementedInterfacesShownPlain(boolean newAllImplementedInterfacesShownPlain) {
		boolean oldAllImplementedInterfacesShownPlain = allImplementedInterfacesShownPlain;
		allImplementedInterfacesShownPlain = newAllImplementedInterfacesShownPlain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN, oldAllImplementedInterfacesShownPlain, allImplementedInterfacesShownPlain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllImplementedInterfacesShownInBundles() {
		return allImplementedInterfacesShownInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllImplementedInterfacesShownInBundles(boolean newAllImplementedInterfacesShownInBundles) {
		boolean oldAllImplementedInterfacesShownInBundles = allImplementedInterfacesShownInBundles;
		allImplementedInterfacesShownInBundles = newAllImplementedInterfacesShownInBundles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES, oldAllImplementedInterfacesShownInBundles, allImplementedInterfacesShownInBundles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllReferencedInterfacesShownPlain() {
		return allReferencedInterfacesShownPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllReferencedInterfacesShownPlain(boolean newAllReferencedInterfacesShownPlain) {
		boolean oldAllReferencedInterfacesShownPlain = allReferencedInterfacesShownPlain;
		allReferencedInterfacesShownPlain = newAllReferencedInterfacesShownPlain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN, oldAllReferencedInterfacesShownPlain, allReferencedInterfacesShownPlain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllReferencedInterfacesShownInBundles() {
		return allReferencedInterfacesShownInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllReferencedInterfacesShownInBundles(boolean newAllReferencedInterfacesShownInBundles) {
		boolean oldAllReferencedInterfacesShownInBundles = allReferencedInterfacesShownInBundles;
		allReferencedInterfacesShownInBundles = newAllReferencedInterfacesShownInBundles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES, oldAllReferencedInterfacesShownInBundles, allReferencedInterfacesShownInBundles));
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
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILDREN_INITIALIZED:
				return isChildrenInitialized();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN:
				return isAllImplementedInterfacesShownPlain();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES:
				return isAllImplementedInterfacesShownInBundles();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN:
				return isAllReferencedInterfacesShownPlain();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES:
				return isAllReferencedInterfacesShownInBundles();
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
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__MODEL_ELEMENT:
				setModelElement((ServiceComponent)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN:
				setAllImplementedInterfacesShownPlain((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES:
				setAllImplementedInterfacesShownInBundles((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN:
				setAllReferencedInterfacesShownPlain((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES:
				setAllReferencedInterfacesShownInBundles((Boolean)newValue);
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
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__MODEL_ELEMENT:
				setModelElement((ServiceComponent)null);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized(CHILDREN_INITIALIZED_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN:
				setAllImplementedInterfacesShownPlain(ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES:
				setAllImplementedInterfacesShownInBundles(ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN:
				setAllReferencedInterfacesShownPlain(ALL_REFERENCED_INTERFACES_SHOWN_PLAIN_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES:
				setAllReferencedInterfacesShownInBundles(ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT);
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
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__CHILDREN_INITIALIZED:
				return childrenInitialized != CHILDREN_INITIALIZED_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN:
				return allImplementedInterfacesShownPlain != ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES:
				return allImplementedInterfacesShownInBundles != ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN:
				return allReferencedInterfacesShownPlain != ALL_REFERENCED_INTERFACES_SHOWN_PLAIN_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES:
				return allReferencedInterfacesShownInBundles != ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES_EDEFAULT;
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
		result.append(", allImplementedInterfacesShownPlain: ");
		result.append(allImplementedInterfacesShownPlain);
		result.append(", allImplementedInterfacesShownInBundles: ");
		result.append(allImplementedInterfacesShownInBundles);
		result.append(", allReferencedInterfacesShownPlain: ");
		result.append(allReferencedInterfacesShownPlain);
		result.append(", allReferencedInterfacesShownInBundles: ");
		result.append(allReferencedInterfacesShownInBundles);
		result.append(')');
		return result.toString();
	}

} //ServiceComponentContextImpl
