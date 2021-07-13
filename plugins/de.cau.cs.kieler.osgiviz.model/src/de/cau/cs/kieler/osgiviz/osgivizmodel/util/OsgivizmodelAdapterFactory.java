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
package de.cau.cs.kieler.osgiviz.osgivizmodel.util;

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.Option;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage
 * @generated
 */
public class OsgivizmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OsgivizmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgivizmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OsgivizmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsgivizmodelSwitch<Adapter> modelSwitch =
		new OsgivizmodelSwitch<Adapter>() {
			@Override
			public <M> Adapter caseIVisualizationContext(IVisualizationContext<M> object) {
				return createIVisualizationContextAdapter();
			}
			@Override
			public <M> Adapter caseIOverviewVisualizationContext(IOverviewVisualizationContext<M> object) {
				return createIOverviewVisualizationContextAdapter();
			}
			@Override
			public Adapter caseClass(de.cau.cs.kieler.osgiviz.osgivizmodel.Class object) {
				return createClassAdapter();
			}
			@Override
			public <K, V> Adapter casePair(Pair<K, V> object) {
				return createPairAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseProductContext(ProductContext object) {
				return createProductContextAdapter();
			}
			@Override
			public Adapter caseFeatureContext(FeatureContext object) {
				return createFeatureContextAdapter();
			}
			@Override
			public Adapter caseBundleContext(BundleContext object) {
				return createBundleContextAdapter();
			}
			@Override
			public Adapter caseBundleCategoryContext(BundleCategoryContext object) {
				return createBundleCategoryContextAdapter();
			}
			@Override
			public Adapter caseClassContext(ClassContext object) {
				return createClassContextAdapter();
			}
			@Override
			public Adapter caseServiceComponentContext(ServiceComponentContext object) {
				return createServiceComponentContextAdapter();
			}
			@Override
			public Adapter caseServiceInterfaceContext(ServiceInterfaceContext object) {
				return createServiceInterfaceContextAdapter();
			}
			@Override
			public Adapter casePackageObjectContext(PackageObjectContext object) {
				return createPackageObjectContextAdapter();
			}
			@Override
			public Adapter caseUsedPackagesOfBundleEdgeConnection(UsedPackagesOfBundleEdgeConnection object) {
				return createUsedPackagesOfBundleEdgeConnectionAdapter();
			}
			@Override
			public Adapter caseProductOverviewContext(ProductOverviewContext object) {
				return createProductOverviewContextAdapter();
			}
			@Override
			public Adapter caseFeatureOverviewContext(FeatureOverviewContext object) {
				return createFeatureOverviewContextAdapter();
			}
			@Override
			public Adapter caseBundleOverviewContext(BundleOverviewContext object) {
				return createBundleOverviewContextAdapter();
			}
			@Override
			public Adapter caseBundleCategoryOverviewContext(BundleCategoryOverviewContext object) {
				return createBundleCategoryOverviewContextAdapter();
			}
			@Override
			public Adapter caseReferencedInterfaceEdgeConnection(ReferencedInterfaceEdgeConnection object) {
				return createReferencedInterfaceEdgeConnectionAdapter();
			}
			@Override
			public Adapter caseServiceOverviewContext(ServiceOverviewContext object) {
				return createServiceOverviewContextAdapter();
			}
			@Override
			public Adapter casePackageObjectOverviewContext(PackageObjectOverviewContext object) {
				return createPackageObjectOverviewContextAdapter();
			}
			@Override
			public Adapter caseOsgiViz(OsgiViz object) {
				return createOsgiVizAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext <em>IVisualization Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
	 * @generated
	 */
	public Adapter createIVisualizationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext <em>IOverview Visualization Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
	 * @generated
	 */
	public Adapter createIOverviewVisualizationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext <em>Product Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext
	 * @generated
	 */
	public Adapter createProductContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext <em>Feature Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext
	 * @generated
	 */
	public Adapter createFeatureContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext <em>Bundle Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
	 * @generated
	 */
	public Adapter createBundleContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext <em>Bundle Category Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext
	 * @generated
	 */
	public Adapter createBundleCategoryContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext <em>Class Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext
	 * @generated
	 */
	public Adapter createClassContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext <em>Service Component Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
	 * @generated
	 */
	public Adapter createServiceComponentContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext <em>Service Interface Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
	 * @generated
	 */
	public Adapter createServiceInterfaceContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext <em>Package Object Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext
	 * @generated
	 */
	public Adapter createPackageObjectContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection <em>Used Packages Of Bundle Edge Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection
	 * @generated
	 */
	public Adapter createUsedPackagesOfBundleEdgeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext <em>Product Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext
	 * @generated
	 */
	public Adapter createProductOverviewContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext <em>Feature Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext
	 * @generated
	 */
	public Adapter createFeatureOverviewContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext <em>Bundle Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
	 * @generated
	 */
	public Adapter createBundleOverviewContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext <em>Bundle Category Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext
	 * @generated
	 */
	public Adapter createBundleCategoryOverviewContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection <em>Referenced Interface Edge Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection
	 * @generated
	 */
	public Adapter createReferencedInterfaceEdgeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext <em>Service Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
	 * @generated
	 */
	public Adapter createServiceOverviewContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext <em>Package Object Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext
	 * @generated
	 */
	public Adapter createPackageObjectOverviewContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz <em>Osgi Viz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
	 * @generated
	 */
	public Adapter createOsgiVizAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OsgivizmodelAdapterFactory
