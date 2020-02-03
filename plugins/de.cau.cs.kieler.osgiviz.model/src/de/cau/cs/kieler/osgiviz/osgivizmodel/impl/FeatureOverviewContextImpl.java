/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.scheidtbachmann.osgimodel.Feature;
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
 * An implementation of the model object '<em><b>Feature Overview Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#isChildrenInitialized <em>Children Initialized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#getCollapsedFeatureContexts <em>Collapsed Feature Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#getDetailedFeatureContexts <em>Detailed Feature Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureOverviewContextImpl extends MinimalEObjectImpl.Container implements FeatureOverviewContext {
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
	protected EList<Feature> modelElement;

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
	 * The cached value of the '{@link #getCollapsedFeatureContexts() <em>Collapsed Feature Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedFeatureContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureContext> collapsedFeatureContexts;

	/**
	 * The cached value of the '{@link #getDetailedFeatureContexts() <em>Detailed Feature Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedFeatureContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureContext> detailedFeatureContexts;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOverviewContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.FEATURE_OVERVIEW_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
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
	public EList<Feature> getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (EList<Feature>)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElement(EList<Feature> newModelElement) {
		EList<Feature> oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED, oldChildrenInitialized, childrenInitialized));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__EXPANDED, oldExpanded, expanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureContext> getCollapsedFeatureContexts() {
		if (collapsedFeatureContexts == null) {
			collapsedFeatureContexts = new EObjectResolvingEList<FeatureContext>(FeatureContext.class, this, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS);
		}
		return collapsedFeatureContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureContext> getDetailedFeatureContexts() {
		if (detailedFeatureContexts == null) {
			detailedFeatureContexts = new EObjectResolvingEList<FeatureContext>(FeatureContext.class, this, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS);
		}
		return detailedFeatureContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<Feature>(Feature.class, this, OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__FEATURES);
		}
		return features;
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
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT:
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
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				return isChildrenInitialized();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__EXPANDED:
				return isExpanded();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS:
				return getCollapsedFeatureContexts();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS:
				return getDetailedFeatureContexts();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__FEATURES:
				return getFeatures();
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
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<Feature>)newValue);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized((Boolean)newValue);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded((Boolean)newValue);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS:
				getCollapsedFeatureContexts().clear();
				getCollapsedFeatureContexts().addAll((Collection<? extends FeatureContext>)newValue);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS:
				getDetailedFeatureContexts().clear();
				getDetailedFeatureContexts().addAll((Collection<? extends FeatureContext>)newValue);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<Feature>)null);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				setChildrenInitialized(CHILDREN_INITIALIZED_EDEFAULT);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS:
				getCollapsedFeatureContexts().clear();
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS:
				getDetailedFeatureContexts().clear();
				return;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__FEATURES:
				getFeatures().clear();
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
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED:
				return childrenInitialized != CHILDREN_INITIALIZED_EDEFAULT;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__EXPANDED:
				return expanded != EXPANDED_EDEFAULT;
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS:
				return collapsedFeatureContexts != null && !collapsedFeatureContexts.isEmpty();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS:
				return detailedFeatureContexts != null && !detailedFeatureContexts.isEmpty();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT__FEATURES:
				return features != null && !features.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FeatureOverviewContextImpl
