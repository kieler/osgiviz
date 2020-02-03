/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.scheidtbachmann.osgimodel.BundleCategory;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Category Overview Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#isChildrenInitialized <em>Children Initialized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#getCollapsedBundleCategoryContexts <em>Collapsed Bundle Category Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#getDetailedBundleCategoryContexts <em>Detailed Bundle Category Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#getBundleCategories <em>Bundle Categories</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#getUncategorized <em>Uncategorized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl#isDetailedUncategorized <em>Detailed Uncategorized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleCategoryOverviewContextImpl extends MinimalEObjectImpl.Container implements BundleCategoryOverviewContext {
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
	protected EList<BundleCategory> modelElement;

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
	 * The cached value of the '{@link #getCollapsedBundleCategoryContexts() <em>Collapsed Bundle Category Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedBundleCategoryContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleCategoryContext> collapsedBundleCategoryContexts;

	/**
	 * The cached value of the '{@link #getDetailedBundleCategoryContexts() <em>Detailed Bundle Category Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedBundleCategoryContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleCategoryContext> detailedBundleCategoryContexts;

	/**
	 * The cached value of the '{@link #getBundleCategories() <em>Bundle Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleCategory> bundleCategories;

	/**
	 * The cached value of the '{@link #getUncategorized() <em>Uncategorized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncategorized()
	 * @generated
	 * @ordered
	 */
	protected BundleCategoryContext uncategorized;

	/**
	 * The default value of the '{@link #isDetailedUncategorized() <em>Detailed Uncategorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetailedUncategorized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETAILED_UNCATEGORIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDetailedUncategorized() <em>Detailed Uncategorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetailedUncategorized()
	 * @generated
	 * @ordered
	 */
	protected boolean detailedUncategorized = DETAILED_UNCATEGORIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleCategoryOverviewContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.BUNDLE_CATEGORY_OVERVIEW_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BundleCategory> getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (EList<BundleCategory>)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleCategory> basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElement(EList<BundleCategory> newModelElement) {
		EList<BundleCategory> oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED, oldChildrenInitialized, childrenInitialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExpanded() {
		return expanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpanded(boolean newExpanded) {
		boolean oldExpanded = expanded;
		expanded = newExpanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__EXPANDED, oldExpanded, expanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleCategoryContext> getCollapsedBundleCategoryContexts() {
		if (collapsedBundleCategoryContexts == null) {
			collapsedBundleCategoryContexts = new EObjectResolvingEList<BundleCategoryContext>(BundleCategoryContext.class, this, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS);
		}
		return collapsedBundleCategoryContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleCategoryContext> getDetailedBundleCategoryContexts() {
		if (detailedBundleCategoryContexts == null) {
			detailedBundleCategoryContexts = new EObjectResolvingEList<BundleCategoryContext>(BundleCategoryContext.class, this, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS);
		}
		return detailedBundleCategoryContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleCategory> getBundleCategories() {
		if (bundleCategories == null) {
			bundleCategories = new EObjectResolvingEList<BundleCategory>(BundleCategory.class, this, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES);
		}
		return bundleCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleCategoryContext getUncategorized() {
		return uncategorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUncategorized(BundleCategoryContext newUncategorized, NotificationChain msgs) {
		BundleCategoryContext oldUncategorized = uncategorized;
		uncategorized = newUncategorized;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED, oldUncategorized, newUncategorized);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUncategorized(BundleCategoryContext newUncategorized) {
		if (newUncategorized != uncategorized) {
			NotificationChain msgs = null;
			if (uncategorized != null)
				msgs = ((InternalEObject)uncategorized).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED, null, msgs);
			if (newUncategorized != null)
				msgs = ((InternalEObject)newUncategorized).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED, null, msgs);
			msgs = basicSetUncategorized(newUncategorized, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED, newUncategorized, newUncategorized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDetailedUncategorized() {
		return detailedUncategorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailedUncategorized(boolean newDetailedUncategorized) {
		boolean oldDetailedUncategorized = detailedUncategorized;
		detailedUncategorized = newDetailedUncategorized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_UNCATEGORIZED, oldDetailedUncategorized, detailedUncategorized));
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
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT:
				return basicSetParent(null, msgs);
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED:
				return basicSetUncategorized(null, msgs);
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
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				return isChildrenInitialized();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__EXPANDED:
				return isExpanded();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS:
				return getCollapsedBundleCategoryContexts();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS:
				return getDetailedBundleCategoryContexts();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES:
				return getBundleCategories();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED:
				return getUncategorized();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_UNCATEGORIZED:
				return isDetailedUncategorized();
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
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<BundleCategory>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded((Boolean)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS:
				getCollapsedBundleCategoryContexts().clear();
				getCollapsedBundleCategoryContexts().addAll((Collection<? extends BundleCategoryContext>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS:
				getDetailedBundleCategoryContexts().clear();
				getDetailedBundleCategoryContexts().addAll((Collection<? extends BundleCategoryContext>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES:
				getBundleCategories().clear();
				getBundleCategories().addAll((Collection<? extends BundleCategory>)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED:
				setUncategorized((BundleCategoryContext)newValue);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_UNCATEGORIZED:
				setDetailedUncategorized((Boolean)newValue);
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
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<BundleCategory>)null);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized(CHILDREN_INITIALIZED_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS:
				getCollapsedBundleCategoryContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS:
				getDetailedBundleCategoryContexts().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES:
				getBundleCategories().clear();
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED:
				setUncategorized((BundleCategoryContext)null);
				return;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_UNCATEGORIZED:
				setDetailedUncategorized(DETAILED_UNCATEGORIZED_EDEFAULT);
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
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				return childrenInitialized != CHILDREN_INITIALIZED_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__EXPANDED:
				return expanded != EXPANDED_EDEFAULT;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS:
				return collapsedBundleCategoryContexts != null && !collapsedBundleCategoryContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS:
				return detailedBundleCategoryContexts != null && !detailedBundleCategoryContexts.isEmpty();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES:
				return bundleCategories != null && !bundleCategories.isEmpty();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED:
				return uncategorized != null;
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_UNCATEGORIZED:
				return detailedUncategorized != DETAILED_UNCATEGORIZED_EDEFAULT;
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
		result.append(", detailedUncategorized: ");
		result.append(detailedUncategorized);
		result.append(')');
		return result.toString();
	}

} //BundleCategoryOverviewContextImpl
