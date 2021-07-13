/**
 * // ******************************************************************************
 * //
 * // Copyright (c) 2018 by
 * // Scheidt & Bachmann System Technik GmbH, 24145 Kiel
 * //
 * // This program and the accompanying materials are made available under the
 * // terms of the Eclipse Public License 2.0 which is available at
 * // http://www.eclipse.org/legal/epl-2.0.
 * // 
 * // SPDX-License-Identifier: EPL-2.0
 * //
 * // ******************************************************************************
 */
package de.scheidtbachmann.osgimodel.impl;

import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.BundleCategory;
import de.scheidtbachmann.osgimodel.Feature;
import de.scheidtbachmann.osgimodel.OsgiProject;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;
import de.scheidtbachmann.osgimodel.PackageObject;
import de.scheidtbachmann.osgimodel.Product;
import de.scheidtbachmann.osgimodel.ServiceComponent;
import de.scheidtbachmann.osgimodel.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Osgi Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getNumberOfJavaFiles <em>Number Of Java Files</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getBundles <em>Bundles</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getServiceInterfaces <em>Service Interfaces</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getImportedPackages <em>Imported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getExportedPackages <em>Exported Packages</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.impl.OsgiProjectImpl#getBundleCategories <em>Bundle Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsgiProjectImpl extends MinimalEObjectImpl.Container implements OsgiProject {
	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfJavaFiles() <em>Number Of Java Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfJavaFiles()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_JAVA_FILES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfJavaFiles() <em>Number Of Java Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfJavaFiles()
	 * @generated
	 * @ordered
	 */
	protected int numberOfJavaFiles = NUMBER_OF_JAVA_FILES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getServiceComponents() <em>Service Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponent> serviceComponents;

	/**
	 * The cached value of the '{@link #getServiceInterfaces() <em>Service Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> serviceInterfaces;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getImportedPackages() <em>Imported Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageObject> importedPackages;

	/**
	 * The cached value of the '{@link #getExportedPackages() <em>Exported Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageObject> exportedPackages;

	/**
	 * The cached value of the '{@link #getBundleCategories() <em>Bundle Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleCategory> bundleCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsgiProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgimodelPackage.Literals.OSGI_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.OSGI_PROJECT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfJavaFiles() {
		return numberOfJavaFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfJavaFiles(int newNumberOfJavaFiles) {
		int oldNumberOfJavaFiles = numberOfJavaFiles;
		numberOfJavaFiles = newNumberOfJavaFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgimodelPackage.OSGI_PROJECT__NUMBER_OF_JAVA_FILES, oldNumberOfJavaFiles, numberOfJavaFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectContainmentEList<Bundle>(Bundle.class, this, OsgimodelPackage.OSGI_PROJECT__BUNDLES);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, OsgimodelPackage.OSGI_PROJECT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceComponent> getServiceComponents() {
		if (serviceComponents == null) {
			serviceComponents = new EObjectResolvingEList<ServiceComponent>(ServiceComponent.class, this, OsgimodelPackage.OSGI_PROJECT__SERVICE_COMPONENTS);
		}
		return serviceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInterface> getServiceInterfaces() {
		if (serviceInterfaces == null) {
			serviceInterfaces = new EObjectContainmentEList<ServiceInterface>(ServiceInterface.class, this, OsgimodelPackage.OSGI_PROJECT__SERVICE_INTERFACES);
		}
		return serviceInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, OsgimodelPackage.OSGI_PROJECT__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageObject> getImportedPackages() {
		if (importedPackages == null) {
			importedPackages = new EObjectContainmentEList<PackageObject>(PackageObject.class, this, OsgimodelPackage.OSGI_PROJECT__IMPORTED_PACKAGES);
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
			exportedPackages = new EObjectResolvingEList<PackageObject>(PackageObject.class, this, OsgimodelPackage.OSGI_PROJECT__EXPORTED_PACKAGES);
		}
		return exportedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleCategory> getBundleCategories() {
		if (bundleCategories == null) {
			bundleCategories = new EObjectContainmentEList<BundleCategory>(BundleCategory.class, this, OsgimodelPackage.OSGI_PROJECT__BUNDLE_CATEGORIES);
		}
		return bundleCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsgimodelPackage.OSGI_PROJECT__BUNDLES:
				return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.OSGI_PROJECT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_INTERFACES:
				return ((InternalEList<?>)getServiceInterfaces()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.OSGI_PROJECT__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.OSGI_PROJECT__IMPORTED_PACKAGES:
				return ((InternalEList<?>)getImportedPackages()).basicRemove(otherEnd, msgs);
			case OsgimodelPackage.OSGI_PROJECT__BUNDLE_CATEGORIES:
				return ((InternalEList<?>)getBundleCategories()).basicRemove(otherEnd, msgs);
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
			case OsgimodelPackage.OSGI_PROJECT__PROJECT_NAME:
				return getProjectName();
			case OsgimodelPackage.OSGI_PROJECT__NUMBER_OF_JAVA_FILES:
				return getNumberOfJavaFiles();
			case OsgimodelPackage.OSGI_PROJECT__BUNDLES:
				return getBundles();
			case OsgimodelPackage.OSGI_PROJECT__FEATURES:
				return getFeatures();
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_COMPONENTS:
				return getServiceComponents();
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_INTERFACES:
				return getServiceInterfaces();
			case OsgimodelPackage.OSGI_PROJECT__PRODUCTS:
				return getProducts();
			case OsgimodelPackage.OSGI_PROJECT__IMPORTED_PACKAGES:
				return getImportedPackages();
			case OsgimodelPackage.OSGI_PROJECT__EXPORTED_PACKAGES:
				return getExportedPackages();
			case OsgimodelPackage.OSGI_PROJECT__BUNDLE_CATEGORIES:
				return getBundleCategories();
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
			case OsgimodelPackage.OSGI_PROJECT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__NUMBER_OF_JAVA_FILES:
				setNumberOfJavaFiles((Integer)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				getServiceComponents().addAll((Collection<? extends ServiceComponent>)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_INTERFACES:
				getServiceInterfaces().clear();
				getServiceInterfaces().addAll((Collection<? extends ServiceInterface>)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				getImportedPackages().addAll((Collection<? extends PackageObject>)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				getExportedPackages().addAll((Collection<? extends PackageObject>)newValue);
				return;
			case OsgimodelPackage.OSGI_PROJECT__BUNDLE_CATEGORIES:
				getBundleCategories().clear();
				getBundleCategories().addAll((Collection<? extends BundleCategory>)newValue);
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
			case OsgimodelPackage.OSGI_PROJECT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case OsgimodelPackage.OSGI_PROJECT__NUMBER_OF_JAVA_FILES:
				setNumberOfJavaFiles(NUMBER_OF_JAVA_FILES_EDEFAULT);
				return;
			case OsgimodelPackage.OSGI_PROJECT__BUNDLES:
				getBundles().clear();
				return;
			case OsgimodelPackage.OSGI_PROJECT__FEATURES:
				getFeatures().clear();
				return;
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				return;
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_INTERFACES:
				getServiceInterfaces().clear();
				return;
			case OsgimodelPackage.OSGI_PROJECT__PRODUCTS:
				getProducts().clear();
				return;
			case OsgimodelPackage.OSGI_PROJECT__IMPORTED_PACKAGES:
				getImportedPackages().clear();
				return;
			case OsgimodelPackage.OSGI_PROJECT__EXPORTED_PACKAGES:
				getExportedPackages().clear();
				return;
			case OsgimodelPackage.OSGI_PROJECT__BUNDLE_CATEGORIES:
				getBundleCategories().clear();
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
			case OsgimodelPackage.OSGI_PROJECT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case OsgimodelPackage.OSGI_PROJECT__NUMBER_OF_JAVA_FILES:
				return numberOfJavaFiles != NUMBER_OF_JAVA_FILES_EDEFAULT;
			case OsgimodelPackage.OSGI_PROJECT__BUNDLES:
				return bundles != null && !bundles.isEmpty();
			case OsgimodelPackage.OSGI_PROJECT__FEATURES:
				return features != null && !features.isEmpty();
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_COMPONENTS:
				return serviceComponents != null && !serviceComponents.isEmpty();
			case OsgimodelPackage.OSGI_PROJECT__SERVICE_INTERFACES:
				return serviceInterfaces != null && !serviceInterfaces.isEmpty();
			case OsgimodelPackage.OSGI_PROJECT__PRODUCTS:
				return products != null && !products.isEmpty();
			case OsgimodelPackage.OSGI_PROJECT__IMPORTED_PACKAGES:
				return importedPackages != null && !importedPackages.isEmpty();
			case OsgimodelPackage.OSGI_PROJECT__EXPORTED_PACKAGES:
				return exportedPackages != null && !exportedPackages.isEmpty();
			case OsgimodelPackage.OSGI_PROJECT__BUNDLE_CATEGORIES:
				return bundleCategories != null && !bundleCategories.isEmpty();
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
		result.append(" (projectName: ");
		result.append(projectName);
		result.append(", numberOfJavaFiles: ");
		result.append(numberOfJavaFiles);
		result.append(')');
		return result.toString();
	}

} //OsgiProjectImpl
