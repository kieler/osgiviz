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
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.Pair;
import de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Overview Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#isChildrenInitialized <em>Children Initialized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#isShowCollapsedElements <em>Show Collapsed Elements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getRequiredBundleEdges <em>Required Bundle Edges</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getUsedPackagesOfBundleEdges <em>Used Packages Of Bundle Edges</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getUsedPackageEdges <em>Used Package Edges</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getCollapsedBundleContexts <em>Collapsed Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getDetailedBundleContexts <em>Detailed Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getUsedPackageContexts <em>Used Package Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl#getBundles <em>Bundles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleOverviewContextImpl extends MinimalEObjectImpl.Container implements BundleOverviewContext {
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
	protected EList<Bundle> modelElement;

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
	 * The default value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected boolean expanded = EXPANDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowCollapsedElements() <em>Show Collapsed Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCollapsedElements()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_COLLAPSED_ELEMENTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowCollapsedElements() <em>Show Collapsed Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCollapsedElements()
	 * @generated
	 * @ordered
	 */
	protected boolean showCollapsedElements = SHOW_COLLAPSED_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredBundleEdges() <em>Required Bundle Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundleEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair<BundleContext, BundleContext>> requiredBundleEdges;

	/**
	 * The cached value of the '{@link #getUsedPackagesOfBundleEdges() <em>Used Packages Of Bundle Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPackagesOfBundleEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<UsedPackagesOfBundleEdgeConnection> usedPackagesOfBundleEdges;

	/**
	 * The cached value of the '{@link #getUsedPackageEdges() <em>Used Package Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPackageEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair<BundleContext, PackageObjectContext>> usedPackageEdges;

	/**
	 * The cached value of the '{@link #getCollapsedBundleContexts() <em>Collapsed Bundle Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedBundleContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleContext> collapsedBundleContexts;

	/**
	 * The cached value of the '{@link #getDetailedBundleContexts() <em>Detailed Bundle Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedBundleContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleContext> detailedBundleContexts;

	/**
	 * The cached value of the '{@link #getUsedPackageContexts() <em>Used Package Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPackageContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageObjectContext> usedPackageContexts;

	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleOverviewContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.BUNDLE_OVERVIEW_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Bundle> getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (EList<Bundle>)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(EList<Bundle> newModelElement) {
		EList<Bundle> oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED, oldChildrenInitialized, childrenInitialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpanded() {
		return expanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpanded(boolean newExpanded) {
		boolean oldExpanded = expanded;
		expanded = newExpanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__EXPANDED, oldExpanded, expanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowCollapsedElements() {
		return showCollapsedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowCollapsedElements(boolean newShowCollapsedElements) {
		boolean oldShowCollapsedElements = showCollapsedElements;
		showCollapsedElements = newShowCollapsedElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__SHOW_COLLAPSED_ELEMENTS, oldShowCollapsedElements, showCollapsedElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pair<BundleContext, BundleContext>> getRequiredBundleEdges() {
		if (requiredBundleEdges == null) {
			requiredBundleEdges = new EObjectContainmentEList<Pair<BundleContext, BundleContext>>(Pair.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES);
		}
		return requiredBundleEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsedPackagesOfBundleEdgeConnection> getUsedPackagesOfBundleEdges() {
		if (usedPackagesOfBundleEdges == null) {
			usedPackagesOfBundleEdges = new EObjectContainmentEList<UsedPackagesOfBundleEdgeConnection>(UsedPackagesOfBundleEdgeConnection.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES);
		}
		return usedPackagesOfBundleEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pair<BundleContext, PackageObjectContext>> getUsedPackageEdges() {
		if (usedPackageEdges == null) {
			usedPackageEdges = new EObjectContainmentEList<Pair<BundleContext, PackageObjectContext>>(Pair.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES);
		}
		return usedPackageEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleContext> getCollapsedBundleContexts() {
		if (collapsedBundleContexts == null) {
			collapsedBundleContexts = new EObjectResolvingEList<BundleContext>(BundleContext.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS);
		}
		return collapsedBundleContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleContext> getDetailedBundleContexts() {
		if (detailedBundleContexts == null) {
			detailedBundleContexts = new EObjectResolvingEList<BundleContext>(BundleContext.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS);
		}
		return detailedBundleContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageObjectContext> getUsedPackageContexts() {
		if (usedPackageContexts == null) {
			usedPackageContexts = new EObjectResolvingEList<PackageObjectContext>(PackageObjectContext.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS);
		}
		return usedPackageContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectResolvingEList<Bundle>(Bundle.class, this, OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__BUNDLES);
		}
		return bundles;
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
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT:
				return basicSetParent(null, msgs);
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES:
				return ((InternalEList<?>)getRequiredBundleEdges()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES:
				return ((InternalEList<?>)getUsedPackagesOfBundleEdges()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES:
				return ((InternalEList<?>)getUsedPackageEdges()).basicRemove(otherEnd, msgs);
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
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				return isChildrenInitialized();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__EXPANDED:
				return isExpanded();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__SHOW_COLLAPSED_ELEMENTS:
				return isShowCollapsedElements();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES:
				return getRequiredBundleEdges();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES:
				return getUsedPackagesOfBundleEdges();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES:
				return getUsedPackageEdges();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS:
				return getCollapsedBundleContexts();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS:
				return getDetailedBundleContexts();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS:
				return getUsedPackageContexts();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__BUNDLES:
				return getBundles();
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
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<Bundle>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__SHOW_COLLAPSED_ELEMENTS:
				setShowCollapsedElements((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES:
				getRequiredBundleEdges().clear();
				getRequiredBundleEdges().addAll((Collection<? extends Pair<BundleContext, BundleContext>>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES:
				getUsedPackagesOfBundleEdges().clear();
				getUsedPackagesOfBundleEdges().addAll((Collection<? extends UsedPackagesOfBundleEdgeConnection>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES:
				getUsedPackageEdges().clear();
				getUsedPackageEdges().addAll((Collection<? extends Pair<BundleContext, PackageObjectContext>>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS:
				getCollapsedBundleContexts().clear();
				getCollapsedBundleContexts().addAll((Collection<? extends BundleContext>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS:
				getDetailedBundleContexts().clear();
				getDetailedBundleContexts().addAll((Collection<? extends BundleContext>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS:
				getUsedPackageContexts().clear();
				getUsedPackageContexts().addAll((Collection<? extends PackageObjectContext>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
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
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<Bundle>)null);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized(CHILDREN_INITIALIZED_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__SHOW_COLLAPSED_ELEMENTS:
				setShowCollapsedElements(SHOW_COLLAPSED_ELEMENTS_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES:
				getRequiredBundleEdges().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES:
				getUsedPackagesOfBundleEdges().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES:
				getUsedPackageEdges().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS:
				getCollapsedBundleContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS:
				getDetailedBundleContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS:
				getUsedPackageContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__BUNDLES:
				getBundles().clear();
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
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				return childrenInitialized != CHILDREN_INITIALIZED_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__EXPANDED:
				return expanded != EXPANDED_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__SHOW_COLLAPSED_ELEMENTS:
				return showCollapsedElements != SHOW_COLLAPSED_ELEMENTS_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES:
				return requiredBundleEdges != null && !requiredBundleEdges.isEmpty();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES:
				return usedPackagesOfBundleEdges != null && !usedPackagesOfBundleEdges.isEmpty();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES:
				return usedPackageEdges != null && !usedPackageEdges.isEmpty();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS:
				return collapsedBundleContexts != null && !collapsedBundleContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS:
				return detailedBundleContexts != null && !detailedBundleContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS:
				return usedPackageContexts != null && !usedPackageContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT__BUNDLES:
				return bundles != null && !bundles.isEmpty();
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
		result.append(", expanded: ");
		result.append(expanded);
		result.append(", showCollapsedElements: ");
		result.append(showCollapsedElements);
		result.append(')');
		return result.toString();
	}

} //BundleOverviewContextImpl
