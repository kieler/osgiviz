/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection;
import de.scheidtbachmann.osgimodel.PackageObject;
import de.scheidtbachmann.osgimodel.Product;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Used Packages Of Bundle Edge Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl#getSourceBundleContext <em>Source Bundle Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl#getUsedPackages <em>Used Packages</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl#getTargetBundleContext <em>Target Bundle Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsedPackagesOfBundleEdgeConnectionImpl extends MinimalEObjectImpl.Container implements UsedPackagesOfBundleEdgeConnection {
	/**
	 * The cached value of the '{@link #getSourceBundleContext() <em>Source Bundle Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceBundleContext()
	 * @generated
	 * @ordered
	 */
	protected BundleContext sourceBundleContext;

	/**
	 * The cached value of the '{@link #getUsedPackages() <em>Used Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageObject> usedPackages;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * The cached value of the '{@link #getTargetBundleContext() <em>Target Bundle Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBundleContext()
	 * @generated
	 * @ordered
	 */
	protected BundleContext targetBundleContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedPackagesOfBundleEdgeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleContext getSourceBundleContext() {
		if (sourceBundleContext != null && sourceBundleContext.eIsProxy()) {
			InternalEObject oldSourceBundleContext = (InternalEObject)sourceBundleContext;
			sourceBundleContext = (BundleContext)eResolveProxy(oldSourceBundleContext);
			if (sourceBundleContext != oldSourceBundleContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT, oldSourceBundleContext, sourceBundleContext));
			}
		}
		return sourceBundleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleContext basicGetSourceBundleContext() {
		return sourceBundleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceBundleContext(BundleContext newSourceBundleContext) {
		BundleContext oldSourceBundleContext = sourceBundleContext;
		sourceBundleContext = newSourceBundleContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT, oldSourceBundleContext, sourceBundleContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageObject> getUsedPackages() {
		if (usedPackages == null) {
			usedPackages = new EObjectResolvingEList<PackageObject>(PackageObject.class, this, OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES);
		}
		return usedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleContext getTargetBundleContext() {
		if (targetBundleContext != null && targetBundleContext.eIsProxy()) {
			InternalEObject oldTargetBundleContext = (InternalEObject)targetBundleContext;
			targetBundleContext = (BundleContext)eResolveProxy(oldTargetBundleContext);
			if (targetBundleContext != oldTargetBundleContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT, oldTargetBundleContext, targetBundleContext));
			}
		}
		return targetBundleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleContext basicGetTargetBundleContext() {
		return targetBundleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetBundleContext(BundleContext newTargetBundleContext) {
		BundleContext oldTargetBundleContext = targetBundleContext;
		targetBundleContext = newTargetBundleContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT, oldTargetBundleContext, targetBundleContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT:
				if (resolve) return getSourceBundleContext();
				return basicGetSourceBundleContext();
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES:
				return getUsedPackages();
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT:
				if (resolve) return getTargetBundleContext();
				return basicGetTargetBundleContext();
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
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT:
				setSourceBundleContext((BundleContext)newValue);
				return;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES:
				getUsedPackages().clear();
				getUsedPackages().addAll((Collection<? extends PackageObject>)newValue);
				return;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT:
				setProduct((Product)newValue);
				return;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT:
				setTargetBundleContext((BundleContext)newValue);
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
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT:
				setSourceBundleContext((BundleContext)null);
				return;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES:
				getUsedPackages().clear();
				return;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT:
				setProduct((Product)null);
				return;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT:
				setTargetBundleContext((BundleContext)null);
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
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT:
				return sourceBundleContext != null;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES:
				return usedPackages != null && !usedPackages.isEmpty();
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT:
				return product != null;
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT:
				return targetBundleContext != null;
		}
		return super.eIsSet(featureID);
	}

} //UsedPackagesOfBundleEdgeConnectionImpl
