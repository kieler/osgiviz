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

import de.scheidtbachmann.osgimodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsgimodelFactoryImpl extends EFactoryImpl implements OsgimodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsgimodelFactory init() {
		try {
			OsgimodelFactory theOsgimodelFactory = (OsgimodelFactory)EPackage.Registry.INSTANCE.getEFactory(OsgimodelPackage.eNS_URI);
			if (theOsgimodelFactory != null) {
				return theOsgimodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsgimodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgimodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OsgimodelPackage.OSGI_PROJECT: return createOsgiProject();
			case OsgimodelPackage.PRODUCT: return createProduct();
			case OsgimodelPackage.FEATURE: return createFeature();
			case OsgimodelPackage.BUNDLE: return createBundle();
			case OsgimodelPackage.PACKAGE_OBJECT: return createPackageObject();
			case OsgimodelPackage.SERVICE_COMPONENT: return createServiceComponent();
			case OsgimodelPackage.SERVICE_INTERFACE: return createServiceInterface();
			case OsgimodelPackage.BUNDLE_CATEGORY: return createBundleCategory();
			case OsgimodelPackage.ECLIPSE_INJECTION: return createEclipseInjection();
			case OsgimodelPackage.ATTRIBUTE_DATA: return createAttributeData();
			case OsgimodelPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsgiProject createOsgiProject() {
		OsgiProjectImpl osgiProject = new OsgiProjectImpl();
		return osgiProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageObject createPackageObject() {
		PackageObjectImpl packageObject = new PackageObjectImpl();
		return packageObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceComponent createServiceComponent() {
		ServiceComponentImpl serviceComponent = new ServiceComponentImpl();
		return serviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BundleCategory createBundleCategory() {
		BundleCategoryImpl bundleCategory = new BundleCategoryImpl();
		return bundleCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EclipseInjection createEclipseInjection() {
		EclipseInjectionImpl eclipseInjection = new EclipseInjectionImpl();
		return eclipseInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeData createAttributeData() {
		AttributeDataImpl attributeData = new AttributeDataImpl();
		return attributeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsgimodelPackage getOsgimodelPackage() {
		return (OsgimodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsgimodelPackage getPackage() {
		return OsgimodelPackage.eINSTANCE;
	}

} //OsgimodelFactoryImpl
