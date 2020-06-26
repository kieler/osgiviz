/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext;
import de.scheidtbachmann.osgimodel.OsgiProject;
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
 * An implementation of the model object '<em><b>Osgi Viz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#isChildrenInitialized <em>Children Initialized</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getBundleOverviewContext <em>Bundle Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getProductOverviewContext <em>Product Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getServiceOverviewContext <em>Service Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getFeatureOverviewContext <em>Feature Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getImportedPackageOverviewContext <em>Imported Package Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getBundleCategoryOverviewContext <em>Bundle Category Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl#getFocus <em>Focus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsgiVizImpl extends MinimalEObjectImpl.Container implements OsgiViz {
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
	protected OsgiProject modelElement;

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
	 * The cached value of the '{@link #getBundleOverviewContext() <em>Bundle Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleOverviewContext()
	 * @generated
	 * @ordered
	 */
	protected BundleOverviewContext bundleOverviewContext;

	/**
	 * The cached value of the '{@link #getProductOverviewContext() <em>Product Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOverviewContext()
	 * @generated
	 * @ordered
	 */
	protected ProductOverviewContext productOverviewContext;

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
	 * The cached value of the '{@link #getFeatureOverviewContext() <em>Feature Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOverviewContext()
	 * @generated
	 * @ordered
	 */
	protected FeatureOverviewContext featureOverviewContext;

	/**
	 * The cached value of the '{@link #getImportedPackageOverviewContext() <em>Imported Package Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackageOverviewContext()
	 * @generated
	 * @ordered
	 */
	protected PackageObjectOverviewContext importedPackageOverviewContext;

	/**
	 * The cached value of the '{@link #getBundleCategoryOverviewContext() <em>Bundle Category Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleCategoryOverviewContext()
	 * @generated
	 * @ordered
	 */
	protected BundleCategoryOverviewContext bundleCategoryOverviewContext;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected IVisualizationContext<?> focus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsgiVizImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.OSGI_VIZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.OSGI_VIZ__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsgiProject getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (OsgiProject)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgiProject basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElement(OsgiProject newModelElement) {
		OsgiProject oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.OSGI_VIZ__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.OSGI_VIZ__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.OSGI_VIZ__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.OSGI_VIZ__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__CHILDREN_INITIALIZED, oldChildrenInitialized, childrenInitialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleOverviewContext getBundleOverviewContext() {
		if (bundleOverviewContext != null && bundleOverviewContext.eIsProxy()) {
			InternalEObject oldBundleOverviewContext = (InternalEObject)bundleOverviewContext;
			bundleOverviewContext = (BundleOverviewContext)eResolveProxy(oldBundleOverviewContext);
			if (bundleOverviewContext != oldBundleOverviewContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT, oldBundleOverviewContext, bundleOverviewContext));
			}
		}
		return bundleOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleOverviewContext basicGetBundleOverviewContext() {
		return bundleOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundleOverviewContext(BundleOverviewContext newBundleOverviewContext) {
		BundleOverviewContext oldBundleOverviewContext = bundleOverviewContext;
		bundleOverviewContext = newBundleOverviewContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT, oldBundleOverviewContext, bundleOverviewContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOverviewContext getProductOverviewContext() {
		if (productOverviewContext != null && productOverviewContext.eIsProxy()) {
			InternalEObject oldProductOverviewContext = (InternalEObject)productOverviewContext;
			productOverviewContext = (ProductOverviewContext)eResolveProxy(oldProductOverviewContext);
			if (productOverviewContext != oldProductOverviewContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT, oldProductOverviewContext, productOverviewContext));
			}
		}
		return productOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOverviewContext basicGetProductOverviewContext() {
		return productOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductOverviewContext(ProductOverviewContext newProductOverviewContext) {
		ProductOverviewContext oldProductOverviewContext = productOverviewContext;
		productOverviewContext = newProductOverviewContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT, oldProductOverviewContext, productOverviewContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceOverviewContext getServiceOverviewContext() {
		if (serviceOverviewContext != null && serviceOverviewContext.eIsProxy()) {
			InternalEObject oldServiceOverviewContext = (InternalEObject)serviceOverviewContext;
			serviceOverviewContext = (ServiceOverviewContext)eResolveProxy(oldServiceOverviewContext);
			if (serviceOverviewContext != oldServiceOverviewContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT, oldServiceOverviewContext, serviceOverviewContext));
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
	@Override
	public void setServiceOverviewContext(ServiceOverviewContext newServiceOverviewContext) {
		ServiceOverviewContext oldServiceOverviewContext = serviceOverviewContext;
		serviceOverviewContext = newServiceOverviewContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT, oldServiceOverviewContext, serviceOverviewContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureOverviewContext getFeatureOverviewContext() {
		if (featureOverviewContext != null && featureOverviewContext.eIsProxy()) {
			InternalEObject oldFeatureOverviewContext = (InternalEObject)featureOverviewContext;
			featureOverviewContext = (FeatureOverviewContext)eResolveProxy(oldFeatureOverviewContext);
			if (featureOverviewContext != oldFeatureOverviewContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT, oldFeatureOverviewContext, featureOverviewContext));
			}
		}
		return featureOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOverviewContext basicGetFeatureOverviewContext() {
		return featureOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureOverviewContext(FeatureOverviewContext newFeatureOverviewContext) {
		FeatureOverviewContext oldFeatureOverviewContext = featureOverviewContext;
		featureOverviewContext = newFeatureOverviewContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT, oldFeatureOverviewContext, featureOverviewContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageObjectOverviewContext getImportedPackageOverviewContext() {
		if (importedPackageOverviewContext != null && importedPackageOverviewContext.eIsProxy()) {
			InternalEObject oldImportedPackageOverviewContext = (InternalEObject)importedPackageOverviewContext;
			importedPackageOverviewContext = (PackageObjectOverviewContext)eResolveProxy(oldImportedPackageOverviewContext);
			if (importedPackageOverviewContext != oldImportedPackageOverviewContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT, oldImportedPackageOverviewContext, importedPackageOverviewContext));
			}
		}
		return importedPackageOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageObjectOverviewContext basicGetImportedPackageOverviewContext() {
		return importedPackageOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedPackageOverviewContext(PackageObjectOverviewContext newImportedPackageOverviewContext) {
		PackageObjectOverviewContext oldImportedPackageOverviewContext = importedPackageOverviewContext;
		importedPackageOverviewContext = newImportedPackageOverviewContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT, oldImportedPackageOverviewContext, importedPackageOverviewContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleCategoryOverviewContext getBundleCategoryOverviewContext() {
		if (bundleCategoryOverviewContext != null && bundleCategoryOverviewContext.eIsProxy()) {
			InternalEObject oldBundleCategoryOverviewContext = (InternalEObject)bundleCategoryOverviewContext;
			bundleCategoryOverviewContext = (BundleCategoryOverviewContext)eResolveProxy(oldBundleCategoryOverviewContext);
			if (bundleCategoryOverviewContext != oldBundleCategoryOverviewContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT, oldBundleCategoryOverviewContext, bundleCategoryOverviewContext));
			}
		}
		return bundleCategoryOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleCategoryOverviewContext basicGetBundleCategoryOverviewContext() {
		return bundleCategoryOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundleCategoryOverviewContext(BundleCategoryOverviewContext newBundleCategoryOverviewContext) {
		BundleCategoryOverviewContext oldBundleCategoryOverviewContext = bundleCategoryOverviewContext;
		bundleCategoryOverviewContext = newBundleCategoryOverviewContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT, oldBundleCategoryOverviewContext, bundleCategoryOverviewContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getFocus() {
		if (focus != null && focus.eIsProxy()) {
			InternalEObject oldFocus = (InternalEObject)focus;
			focus = (IVisualizationContext<?>)eResolveProxy(oldFocus);
			if (focus != oldFocus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.OSGI_VIZ__FOCUS, oldFocus, focus));
			}
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFocus(IVisualizationContext<?> newFocus) {
		IVisualizationContext<?> oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.OSGI_VIZ__FOCUS, oldFocus, focus));
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
			case OsgivizmodelPackage.OSGI_VIZ__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.OSGI_VIZ__PARENT:
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
			case OsgivizmodelPackage.OSGI_VIZ__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.OSGI_VIZ__PARENT:
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
			case OsgivizmodelPackage.OSGI_VIZ__PARENT:
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
			case OsgivizmodelPackage.OSGI_VIZ__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.OSGI_VIZ__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.OSGI_VIZ__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.OSGI_VIZ__CHILDREN_INITIALIZED:
				return isChildrenInitialized();
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT:
				if (resolve) return getBundleOverviewContext();
				return basicGetBundleOverviewContext();
			case OsgivizmodelPackage.OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT:
				if (resolve) return getProductOverviewContext();
				return basicGetProductOverviewContext();
			case OsgivizmodelPackage.OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT:
				if (resolve) return getServiceOverviewContext();
				return basicGetServiceOverviewContext();
			case OsgivizmodelPackage.OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT:
				if (resolve) return getFeatureOverviewContext();
				return basicGetFeatureOverviewContext();
			case OsgivizmodelPackage.OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT:
				if (resolve) return getImportedPackageOverviewContext();
				return basicGetImportedPackageOverviewContext();
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT:
				if (resolve) return getBundleCategoryOverviewContext();
				return basicGetBundleCategoryOverviewContext();
			case OsgivizmodelPackage.OSGI_VIZ__FOCUS:
				if (resolve) return getFocus();
				return basicGetFocus();
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
			case OsgivizmodelPackage.OSGI_VIZ__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__MODEL_ELEMENT:
				setModelElement((OsgiProject)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__CHILDREN_INITIALIZED:
				setChildrenInitialized((Boolean)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT:
				setBundleOverviewContext((BundleOverviewContext)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT:
				setProductOverviewContext((ProductOverviewContext)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT:
				setServiceOverviewContext((ServiceOverviewContext)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT:
				setFeatureOverviewContext((FeatureOverviewContext)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT:
				setImportedPackageOverviewContext((PackageObjectOverviewContext)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT:
				setBundleCategoryOverviewContext((BundleCategoryOverviewContext)newValue);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__FOCUS:
				setFocus((IVisualizationContext<?>)newValue);
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
			case OsgivizmodelPackage.OSGI_VIZ__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.OSGI_VIZ__MODEL_ELEMENT:
				setModelElement((OsgiProject)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__CHILDREN_INITIALIZED:
				setChildrenInitialized(CHILDREN_INITIALIZED_EDEFAULT);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT:
				setBundleOverviewContext((BundleOverviewContext)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT:
				setProductOverviewContext((ProductOverviewContext)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT:
				setServiceOverviewContext((ServiceOverviewContext)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT:
				setFeatureOverviewContext((FeatureOverviewContext)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT:
				setImportedPackageOverviewContext((PackageObjectOverviewContext)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT:
				setBundleCategoryOverviewContext((BundleCategoryOverviewContext)null);
				return;
			case OsgivizmodelPackage.OSGI_VIZ__FOCUS:
				setFocus((IVisualizationContext<?>)null);
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
			case OsgivizmodelPackage.OSGI_VIZ__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.OSGI_VIZ__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.OSGI_VIZ__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.OSGI_VIZ__CHILDREN_INITIALIZED:
				return childrenInitialized != CHILDREN_INITIALIZED_EDEFAULT;
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT:
				return bundleOverviewContext != null;
			case OsgivizmodelPackage.OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT:
				return productOverviewContext != null;
			case OsgivizmodelPackage.OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT:
				return serviceOverviewContext != null;
			case OsgivizmodelPackage.OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT:
				return featureOverviewContext != null;
			case OsgivizmodelPackage.OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT:
				return importedPackageOverviewContext != null;
			case OsgivizmodelPackage.OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT:
				return bundleCategoryOverviewContext != null;
			case OsgivizmodelPackage.OSGI_VIZ__FOCUS:
				return focus != null;
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
		result.append(')');
		return result.toString();
	}

} //OsgiVizImpl
