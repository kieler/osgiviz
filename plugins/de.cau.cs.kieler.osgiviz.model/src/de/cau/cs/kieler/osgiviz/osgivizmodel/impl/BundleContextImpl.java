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

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext;

import de.scheidtbachmann.osgimodel.Bundle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#isChildrenInitialized <em>Children Initialized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#getClassesWithInjections <em>Classes With Injections</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#isAllRequiredBundlesShown <em>All Required Bundles Shown</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#isAllRequiringBundlesShown <em>All Requiring Bundles Shown</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#isAllUsedPackagesShown <em>All Used Packages Shown</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl#getServiceOverviewContext <em>Service Overview Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleContextImpl extends MinimalEObjectImpl.Container implements BundleContext {
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
	protected Bundle modelElement;

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
	 * The cached value of the '{@link #getClassesWithInjections() <em>Classes With Injections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesWithInjections()
	 * @generated
	 * @ordered
	 */
	protected EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> classesWithInjections;

	/**
	 * The default value of the '{@link #isAllRequiredBundlesShown() <em>All Required Bundles Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllRequiredBundlesShown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_REQUIRED_BUNDLES_SHOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllRequiredBundlesShown() <em>All Required Bundles Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllRequiredBundlesShown()
	 * @generated
	 * @ordered
	 */
	protected boolean allRequiredBundlesShown = ALL_REQUIRED_BUNDLES_SHOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllRequiringBundlesShown() <em>All Requiring Bundles Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllRequiringBundlesShown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_REQUIRING_BUNDLES_SHOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllRequiringBundlesShown() <em>All Requiring Bundles Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllRequiringBundlesShown()
	 * @generated
	 * @ordered
	 */
	protected boolean allRequiringBundlesShown = ALL_REQUIRING_BUNDLES_SHOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllUsedPackagesShown() <em>All Used Packages Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllUsedPackagesShown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_USED_PACKAGES_SHOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllUsedPackagesShown() <em>All Used Packages Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllUsedPackagesShown()
	 * @generated
	 * @ordered
	 */
	protected boolean allUsedPackagesShown = ALL_USED_PACKAGES_SHOWN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceOverviewContext() <em>Service Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOverviewContext()
	 * @generated
	 * @ordered
	 */
	protected ServiceOverviewContext serviceOverviewContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.BUNDLE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.BUNDLE_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (Bundle)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.BUNDLE_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(Bundle newModelElement) {
		Bundle oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChildrenInitialized() {
		return childrenInitialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenInitialized(boolean newChildrenInitialized) {
		boolean oldChildrenInitialized = childrenInitialized;
		childrenInitialized = newChildrenInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CONTEXT__CHILDREN_INITIALIZED, oldChildrenInitialized, childrenInitialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> getClassesWithInjections() {
		if (classesWithInjections == null) {
			classesWithInjections = new EObjectContainmentEList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class>(de.cau.cs.kieler.osgiviz.osgivizmodel.Class.class, this, OsgivizmodelPackage.BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS);
		}
		return classesWithInjections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllRequiredBundlesShown() {
		return allRequiredBundlesShown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllRequiredBundlesShown(boolean newAllRequiredBundlesShown) {
		boolean oldAllRequiredBundlesShown = allRequiredBundlesShown;
		allRequiredBundlesShown = newAllRequiredBundlesShown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN, oldAllRequiredBundlesShown, allRequiredBundlesShown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllRequiringBundlesShown() {
		return allRequiringBundlesShown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllRequiringBundlesShown(boolean newAllRequiringBundlesShown) {
		boolean oldAllRequiringBundlesShown = allRequiringBundlesShown;
		allRequiringBundlesShown = newAllRequiringBundlesShown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN, oldAllRequiringBundlesShown, allRequiringBundlesShown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllUsedPackagesShown() {
		return allUsedPackagesShown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllUsedPackagesShown(boolean newAllUsedPackagesShown) {
		boolean oldAllUsedPackagesShown = allUsedPackagesShown;
		allUsedPackagesShown = newAllUsedPackagesShown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN, oldAllUsedPackagesShown, allUsedPackagesShown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOverviewContext getServiceOverviewContext() {
		if (serviceOverviewContext != null && serviceOverviewContext.eIsProxy()) {
			InternalEObject oldServiceOverviewContext = (InternalEObject)serviceOverviewContext;
			serviceOverviewContext = (ServiceOverviewContext)eResolveProxy(oldServiceOverviewContext);
			if (serviceOverviewContext != oldServiceOverviewContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT, oldServiceOverviewContext, serviceOverviewContext));
			}
		}
		return serviceOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOverviewContext basicGetServiceOverviewContext() {
		return serviceOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceOverviewContext(ServiceOverviewContext newServiceOverviewContext) {
		ServiceOverviewContext oldServiceOverviewContext = serviceOverviewContext;
		serviceOverviewContext = newServiceOverviewContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT, oldServiceOverviewContext, serviceOverviewContext));
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
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT:
				return basicSetParent(null, msgs);
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS:
				return ((InternalEList<?>)getClassesWithInjections()).basicRemove(otherEnd, msgs);
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
			case OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILDREN_INITIALIZED:
				return isChildrenInitialized();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS:
				return getClassesWithInjections();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN:
				return isAllRequiredBundlesShown();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN:
				return isAllRequiringBundlesShown();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN:
				return isAllUsedPackagesShown();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT:
				if (resolve) return getServiceOverviewContext();
				return basicGetServiceOverviewContext();
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
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__MODEL_ELEMENT:
				setModelElement((Bundle)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS:
				getClassesWithInjections().clear();
				getClassesWithInjections().addAll((Collection<? extends de.cau.cs.kieler.osgiviz.osgivizmodel.Class>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN:
				setAllRequiredBundlesShown((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN:
				setAllRequiringBundlesShown((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN:
				setAllUsedPackagesShown((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT:
				setServiceOverviewContext((ServiceOverviewContext)newValue);
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
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__MODEL_ELEMENT:
				setModelElement((Bundle)null);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized(CHILDREN_INITIALIZED_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS:
				getClassesWithInjections().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN:
				setAllRequiredBundlesShown(ALL_REQUIRED_BUNDLES_SHOWN_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN:
				setAllRequiringBundlesShown(ALL_REQUIRING_BUNDLES_SHOWN_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN:
				setAllUsedPackagesShown(ALL_USED_PACKAGES_SHOWN_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT:
				setServiceOverviewContext((ServiceOverviewContext)null);
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
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CHILDREN_INITIALIZED:
				return childrenInitialized != CHILDREN_INITIALIZED_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS:
				return classesWithInjections != null && !classesWithInjections.isEmpty();
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN:
				return allRequiredBundlesShown != ALL_REQUIRED_BUNDLES_SHOWN_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN:
				return allRequiringBundlesShown != ALL_REQUIRING_BUNDLES_SHOWN_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN:
				return allUsedPackagesShown != ALL_USED_PACKAGES_SHOWN_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT:
				return serviceOverviewContext != null;
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
		result.append(", allRequiredBundlesShown: ");
		result.append(allRequiredBundlesShown);
		result.append(", allRequiringBundlesShown: ");
		result.append(allRequiringBundlesShown);
		result.append(", allUsedPackagesShown: ");
		result.append(allUsedPackagesShown);
		result.append(')');
		return result.toString();
	}

} //BundleContextImpl
