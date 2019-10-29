/**
 */
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.AttributeData;
import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.BundleCategory;
import de.scheidtbachmann.osgimodel.EclipseInjection;
import de.scheidtbachmann.osgimodel.Feature;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;
import de.scheidtbachmann.osgimodel.PackageObject;
import de.scheidtbachmann.osgimodel.ServiceComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getRequiredBundles <em>Required Bundles</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getUsedByBundle <em>Used By Bundle</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getMoreData <em>More Data</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getEclipseInjections <em>Eclipse Injections</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.BundleImpl#getBundleCategory <em>Bundle Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleImpl extends BasicOsgiObjectImpl implements Bundle {
	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

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
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceComponents() <em>Service Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponent> serviceComponents;

	/**
	 * The cached value of the '{@link #getRequiredBundles() <em>Required Bundles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> requiredBundles;

	/**
	 * The cached value of the '{@link #getUsedByBundle() <em>Used By Bundle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByBundle()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> usedByBundle;

	/**
	 * The cached value of the '{@link #getImportedPackages() <em>Imported Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageObject> importedPackages;

	/**
	 * The cached value of the '{@link #getExportedPackages() <em>Exported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageObject> exportedPackages;

	/**
	 * The cached value of the '{@link #getMoreData() <em>More Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoreData()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeData> moreData;

	/**
	 * The cached value of the '{@link #getEclipseInjections() <em>Eclipse Injections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclipseInjections()
	 * @generated
	 * @ordered
	 */
	protected EList<EclipseInjection> eclipseInjections;

	/**
	 * The cached value of the '{@link #getBundleCategory() <em>Bundle Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleCategory> bundleCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.BUNDLE__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, OsgimodelPackage.BUNDLE__FEATURES, OsgimodelPackage.FEATURE__BUNDLES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.BUNDLE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceComponent> getServiceComponents() {
		if (serviceComponents == null) {
			serviceComponents = new EObjectContainmentWithInverseEList<ServiceComponent>(ServiceComponent.class, this, OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS, OsgimodelPackage.SERVICE_COMPONENT__BUNDLE);
		}
		return serviceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bundle> getRequiredBundles() {
		if (requiredBundles == null) {
			requiredBundles = new EObjectWithInverseResolvingEList.ManyInverse<Bundle>(Bundle.class, this, OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES, OsgimodelPackage.BUNDLE__USED_BY_BUNDLE);
		}
		return requiredBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bundle> getUsedByBundle() {
		if (usedByBundle == null) {
			usedByBundle = new EObjectWithInverseResolvingEList.ManyInverse<Bundle>(Bundle.class, this, OsgimodelPackage.BUNDLE__USED_BY_BUNDLE, OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES);
		}
		return usedByBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageObject> getImportedPackages() {
		if (importedPackages == null) {
			importedPackages = new EObjectWithInverseResolvingEList.ManyInverse<PackageObject>(PackageObject.class, this, OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES, OsgimodelPackage.PACKAGE_OBJECT__IMPLEMENTED_BY);
		}
		return importedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageObject> getExportedPackages() {
		if (exportedPackages == null) {
			exportedPackages = new EObjectContainmentEList<PackageObject>(PackageObject.class, this, OsgimodelPackage.BUNDLE__EXPORTED_PACKAGES);
		}
		return exportedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeData> getMoreData() {
		if (moreData == null) {
			moreData = new EObjectContainmentEList<AttributeData>(AttributeData.class, this, OsgimodelPackage.BUNDLE__MORE_DATA);
		}
		return moreData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EclipseInjection> getEclipseInjections() {
		if (eclipseInjections == null) {
			eclipseInjections = new EObjectContainmentEList<EclipseInjection>(EclipseInjection.class, this, OsgimodelPackage.BUNDLE__ECLIPSE_INJECTIONS);
		}
		return eclipseInjections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleCategory> getBundleCategory() {
		if (bundleCategory == null) {
			bundleCategory = new EObjectWithInverseResolvingEList.ManyInverse<BundleCategory>(BundleCategory.class, this, OsgimodelPackage.BUNDLE__BUNDLE_CATEGORY, OsgimodelPackage.BUNDLE_CATEGORY__BUNDLE);
		}
		return bundleCategory;
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
			case OsgimodelPackage.BUNDLE__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceComponents()).basicAdd(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredBundles()).basicAdd(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__USED_BY_BUNDLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedByBundle()).basicAdd(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImportedPackages()).basicAdd(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__BUNDLE_CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBundleCategory()).basicAdd(otherEnd, msgs);
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
			case OsgimodelPackage.BUNDLE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS:
				return ((InternalEList<?>)getServiceComponents()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES:
				return ((InternalEList<?>)getRequiredBundles()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__USED_BY_BUNDLE:
				return ((InternalEList<?>)getUsedByBundle()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES:
				return ((InternalEList<?>)getImportedPackages()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__EXPORTED_PACKAGES:
				return ((InternalEList<?>)getExportedPackages()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__MORE_DATA:
				return ((InternalEList<?>)getMoreData()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__ECLIPSE_INJECTIONS:
				return ((InternalEList<?>)getEclipseInjections()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.BUNDLE__BUNDLE_CATEGORY:
				return ((InternalEList<?>)getBundleCategory()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgimodelPackage.BUNDLE__IS_EXTERNAL:
				return isIsExternal();
			case OsgimodelPackage.BUNDLE__FEATURES:
				return getFeatures();
			case OsgimodelPackage.BUNDLE__VENDOR:
				return getVendor();
			case OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS:
				return getServiceComponents();
			case OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES:
				return getRequiredBundles();
			case OsgimodelPackage.BUNDLE__USED_BY_BUNDLE:
				return getUsedByBundle();
			case OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES:
				return getImportedPackages();
			case OsgimodelPackage.BUNDLE__EXPORTED_PACKAGES:
				return getExportedPackages();
			case OsgimodelPackage.BUNDLE__MORE_DATA:
				return getMoreData();
			case OsgimodelPackage.BUNDLE__ECLIPSE_INJECTIONS:
				return getEclipseInjections();
			case OsgimodelPackage.BUNDLE__BUNDLE_CATEGORY:
				return getBundleCategory();
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
			case OsgimodelPackage.BUNDLE__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case OsgimodelPackage.BUNDLE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__VENDOR:
				setVendor((String)newValue);
				return;
			case OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				getServiceComponents().addAll((Collection<? extends ServiceComponent>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				getRequiredBundles().addAll((Collection<? extends Bundle>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__USED_BY_BUNDLE:
				getUsedByBundle().clear();
				getUsedByBundle().addAll((Collection<? extends Bundle>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				getImportedPackages().addAll((Collection<? extends PackageObject>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				getExportedPackages().addAll((Collection<? extends PackageObject>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__MORE_DATA:
				getMoreData().clear();
				getMoreData().addAll((Collection<? extends AttributeData>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__ECLIPSE_INJECTIONS:
				getEclipseInjections().clear();
				getEclipseInjections().addAll((Collection<? extends EclipseInjection>)newValue);
				return;
			case OsgimodelPackage.BUNDLE__BUNDLE_CATEGORY:
				getBundleCategory().clear();
				getBundleCategory().addAll((Collection<? extends BundleCategory>)newValue);
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
			case OsgimodelPackage.BUNDLE__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case OsgimodelPackage.BUNDLE__FEATURES:
				getFeatures().clear();
				return;
			case OsgimodelPackage.BUNDLE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				return;
			case OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES:
				getRequiredBundles().clear();
				return;
			case OsgimodelPackage.BUNDLE__USED_BY_BUNDLE:
				getUsedByBundle().clear();
				return;
			case OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				return;
			case OsgimodelPackage.BUNDLE__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				return;
			case OsgimodelPackage.BUNDLE__MORE_DATA:
				getMoreData().clear();
				return;
			case OsgimodelPackage.BUNDLE__ECLIPSE_INJECTIONS:
				getEclipseInjections().clear();
				return;
			case OsgimodelPackage.BUNDLE__BUNDLE_CATEGORY:
				getBundleCategory().clear();
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
			case OsgimodelPackage.BUNDLE__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case OsgimodelPackage.BUNDLE__FEATURES:
				return features != null && !features.isEmpty();
			case OsgimodelPackage.BUNDLE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case OsgimodelPackage.BUNDLE__SERVICE_COMPONENTS:
				return serviceComponents != null && !serviceComponents.isEmpty();
			case OsgimodelPackage.BUNDLE__REQUIRED_BUNDLES:
				return requiredBundles != null && !requiredBundles.isEmpty();
			case OsgimodelPackage.BUNDLE__USED_BY_BUNDLE:
				return usedByBundle != null && !usedByBundle.isEmpty();
			case OsgimodelPackage.BUNDLE__IMPORTED_PACKAGES:
				return importedPackages != null && !importedPackages.isEmpty();
			case OsgimodelPackage.BUNDLE__EXPORTED_PACKAGES:
				return exportedPackages != null && !exportedPackages.isEmpty();
			case OsgimodelPackage.BUNDLE__MORE_DATA:
				return moreData != null && !moreData.isEmpty();
			case OsgimodelPackage.BUNDLE__ECLIPSE_INJECTIONS:
				return eclipseInjections != null && !eclipseInjections.isEmpty();
			case OsgimodelPackage.BUNDLE__BUNDLE_CATEGORY:
				return bundleCategory != null && !bundleCategory.isEmpty();
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
		result.append(" (isExternal: ");
		result.append(isExternal);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(')');
		return result.toString();
	}

} //BundleImpl
