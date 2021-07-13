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

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.Option;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelFactory;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.Pair;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection;

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
public class OsgivizmodelFactoryImpl extends EFactoryImpl implements OsgivizmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsgivizmodelFactory init() {
		try {
			OsgivizmodelFactory theOsgivizmodelFactory = (OsgivizmodelFactory)EPackage.Registry.INSTANCE.getEFactory(OsgivizmodelPackage.eNS_URI);
			if (theOsgivizmodelFactory != null) {
				return theOsgivizmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsgivizmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgivizmodelFactoryImpl() {
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
			case OsgivizmodelPackage.CLASS: return createClass();
			case OsgivizmodelPackage.PAIR: return createPair();
			case OsgivizmodelPackage.OPTION: return createOption();
			case OsgivizmodelPackage.PRODUCT_CONTEXT: return createProductContext();
			case OsgivizmodelPackage.FEATURE_CONTEXT: return createFeatureContext();
			case OsgivizmodelPackage.BUNDLE_CONTEXT: return createBundleContext();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_CONTEXT: return createBundleCategoryContext();
			case OsgivizmodelPackage.CLASS_CONTEXT: return createClassContext();
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT: return createServiceComponentContext();
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT: return createServiceInterfaceContext();
			case OsgivizmodelPackage.PACKAGE_OBJECT_CONTEXT: return createPackageObjectContext();
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION: return createUsedPackagesOfBundleEdgeConnection();
			case OsgivizmodelPackage.PRODUCT_OVERVIEW_CONTEXT: return createProductOverviewContext();
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT: return createFeatureOverviewContext();
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT: return createBundleOverviewContext();
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT: return createBundleCategoryOverviewContext();
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION: return createReferencedInterfaceEdgeConnection();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT: return createServiceOverviewContext();
			case OsgivizmodelPackage.PACKAGE_OBJECT_OVERVIEW_CONTEXT: return createPackageObjectOverviewContext();
			case OsgivizmodelPackage.OSGI_VIZ: return createOsgiViz();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.cau.cs.kieler.osgiviz.osgivizmodel.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <K, V> Pair<K, V> createPair() {
		PairImpl<K, V> pair = new PairImpl<K, V>();
		return pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductContext createProductContext() {
		ProductContextImpl productContext = new ProductContextImpl();
		return productContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureContext createFeatureContext() {
		FeatureContextImpl featureContext = new FeatureContextImpl();
		return featureContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleContext createBundleContext() {
		BundleContextImpl bundleContext = new BundleContextImpl();
		return bundleContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleCategoryContext createBundleCategoryContext() {
		BundleCategoryContextImpl bundleCategoryContext = new BundleCategoryContextImpl();
		return bundleCategoryContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassContext createClassContext() {
		ClassContextImpl classContext = new ClassContextImpl();
		return classContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponentContext createServiceComponentContext() {
		ServiceComponentContextImpl serviceComponentContext = new ServiceComponentContextImpl();
		return serviceComponentContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceContext createServiceInterfaceContext() {
		ServiceInterfaceContextImpl serviceInterfaceContext = new ServiceInterfaceContextImpl();
		return serviceInterfaceContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageObjectContext createPackageObjectContext() {
		PackageObjectContextImpl packageObjectContext = new PackageObjectContextImpl();
		return packageObjectContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedPackagesOfBundleEdgeConnection createUsedPackagesOfBundleEdgeConnection() {
		UsedPackagesOfBundleEdgeConnectionImpl usedPackagesOfBundleEdgeConnection = new UsedPackagesOfBundleEdgeConnectionImpl();
		return usedPackagesOfBundleEdgeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOverviewContext createProductOverviewContext() {
		ProductOverviewContextImpl productOverviewContext = new ProductOverviewContextImpl();
		return productOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOverviewContext createFeatureOverviewContext() {
		FeatureOverviewContextImpl featureOverviewContext = new FeatureOverviewContextImpl();
		return featureOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleOverviewContext createBundleOverviewContext() {
		BundleOverviewContextImpl bundleOverviewContext = new BundleOverviewContextImpl();
		return bundleOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleCategoryOverviewContext createBundleCategoryOverviewContext() {
		BundleCategoryOverviewContextImpl bundleCategoryOverviewContext = new BundleCategoryOverviewContextImpl();
		return bundleCategoryOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedInterfaceEdgeConnection createReferencedInterfaceEdgeConnection() {
		ReferencedInterfaceEdgeConnectionImpl referencedInterfaceEdgeConnection = new ReferencedInterfaceEdgeConnectionImpl();
		return referencedInterfaceEdgeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOverviewContext createServiceOverviewContext() {
		ServiceOverviewContextImpl serviceOverviewContext = new ServiceOverviewContextImpl();
		return serviceOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageObjectOverviewContext createPackageObjectOverviewContext() {
		PackageObjectOverviewContextImpl packageObjectOverviewContext = new PackageObjectOverviewContextImpl();
		return packageObjectOverviewContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgiViz createOsgiViz() {
		OsgiVizImpl osgiViz = new OsgiVizImpl();
		return osgiViz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgivizmodelPackage getOsgivizmodelPackage() {
		return (OsgivizmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsgivizmodelPackage getPackage() {
		return OsgivizmodelPackage.eINSTANCE;
	}

} //OsgivizmodelFactoryImpl
