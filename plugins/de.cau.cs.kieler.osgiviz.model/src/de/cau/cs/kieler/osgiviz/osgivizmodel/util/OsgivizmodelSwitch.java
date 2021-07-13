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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage
 * @generated
 */
public class OsgivizmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OsgivizmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsgivizmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = OsgivizmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OsgivizmodelPackage.IVISUALIZATION_CONTEXT: {
				IVisualizationContext<?> iVisualizationContext = (IVisualizationContext<?>)theEObject;
				T result = caseIVisualizationContext(iVisualizationContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.IOVERVIEW_VISUALIZATION_CONTEXT: {
				IOverviewVisualizationContext<?> iOverviewVisualizationContext = (IOverviewVisualizationContext<?>)theEObject;
				T result = caseIOverviewVisualizationContext(iOverviewVisualizationContext);
				if (result == null) result = caseIVisualizationContext(iOverviewVisualizationContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.CLASS: {
				de.cau.cs.kieler.osgiviz.osgivizmodel.Class class_ = (de.cau.cs.kieler.osgiviz.osgivizmodel.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.PAIR: {
				Pair<?, ?> pair = (Pair<?, ?>)theEObject;
				T result = casePair(pair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.PRODUCT_CONTEXT: {
				ProductContext productContext = (ProductContext)theEObject;
				T result = caseProductContext(productContext);
				if (result == null) result = caseIVisualizationContext(productContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.FEATURE_CONTEXT: {
				FeatureContext featureContext = (FeatureContext)theEObject;
				T result = caseFeatureContext(featureContext);
				if (result == null) result = caseIVisualizationContext(featureContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.BUNDLE_CONTEXT: {
				BundleContext bundleContext = (BundleContext)theEObject;
				T result = caseBundleContext(bundleContext);
				if (result == null) result = caseIVisualizationContext(bundleContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.BUNDLE_CATEGORY_CONTEXT: {
				BundleCategoryContext bundleCategoryContext = (BundleCategoryContext)theEObject;
				T result = caseBundleCategoryContext(bundleCategoryContext);
				if (result == null) result = caseIVisualizationContext(bundleCategoryContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.CLASS_CONTEXT: {
				ClassContext classContext = (ClassContext)theEObject;
				T result = caseClassContext(classContext);
				if (result == null) result = caseIVisualizationContext(classContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.SERVICE_COMPONENT_CONTEXT: {
				ServiceComponentContext serviceComponentContext = (ServiceComponentContext)theEObject;
				T result = caseServiceComponentContext(serviceComponentContext);
				if (result == null) result = caseIVisualizationContext(serviceComponentContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.SERVICE_INTERFACE_CONTEXT: {
				ServiceInterfaceContext serviceInterfaceContext = (ServiceInterfaceContext)theEObject;
				T result = caseServiceInterfaceContext(serviceInterfaceContext);
				if (result == null) result = caseIVisualizationContext(serviceInterfaceContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.PACKAGE_OBJECT_CONTEXT: {
				PackageObjectContext packageObjectContext = (PackageObjectContext)theEObject;
				T result = casePackageObjectContext(packageObjectContext);
				if (result == null) result = caseIVisualizationContext(packageObjectContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION: {
				UsedPackagesOfBundleEdgeConnection usedPackagesOfBundleEdgeConnection = (UsedPackagesOfBundleEdgeConnection)theEObject;
				T result = caseUsedPackagesOfBundleEdgeConnection(usedPackagesOfBundleEdgeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.PRODUCT_OVERVIEW_CONTEXT: {
				ProductOverviewContext productOverviewContext = (ProductOverviewContext)theEObject;
				T result = caseProductOverviewContext(productOverviewContext);
				if (result == null) result = caseIOverviewVisualizationContext(productOverviewContext);
				if (result == null) result = caseIVisualizationContext(productOverviewContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.FEATURE_OVERVIEW_CONTEXT: {
				FeatureOverviewContext featureOverviewContext = (FeatureOverviewContext)theEObject;
				T result = caseFeatureOverviewContext(featureOverviewContext);
				if (result == null) result = caseIOverviewVisualizationContext(featureOverviewContext);
				if (result == null) result = caseIVisualizationContext(featureOverviewContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.BUNDLE_OVERVIEW_CONTEXT: {
				BundleOverviewContext bundleOverviewContext = (BundleOverviewContext)theEObject;
				T result = caseBundleOverviewContext(bundleOverviewContext);
				if (result == null) result = caseIOverviewVisualizationContext(bundleOverviewContext);
				if (result == null) result = caseIVisualizationContext(bundleOverviewContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.BUNDLE_CATEGORY_OVERVIEW_CONTEXT: {
				BundleCategoryOverviewContext bundleCategoryOverviewContext = (BundleCategoryOverviewContext)theEObject;
				T result = caseBundleCategoryOverviewContext(bundleCategoryOverviewContext);
				if (result == null) result = caseIOverviewVisualizationContext(bundleCategoryOverviewContext);
				if (result == null) result = caseIVisualizationContext(bundleCategoryOverviewContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.REFERENCED_INTERFACE_EDGE_CONNECTION: {
				ReferencedInterfaceEdgeConnection referencedInterfaceEdgeConnection = (ReferencedInterfaceEdgeConnection)theEObject;
				T result = caseReferencedInterfaceEdgeConnection(referencedInterfaceEdgeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT: {
				ServiceOverviewContext serviceOverviewContext = (ServiceOverviewContext)theEObject;
				T result = caseServiceOverviewContext(serviceOverviewContext);
				if (result == null) result = caseIOverviewVisualizationContext(serviceOverviewContext);
				if (result == null) result = caseIVisualizationContext(serviceOverviewContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.PACKAGE_OBJECT_OVERVIEW_CONTEXT: {
				PackageObjectOverviewContext packageObjectOverviewContext = (PackageObjectOverviewContext)theEObject;
				T result = casePackageObjectOverviewContext(packageObjectOverviewContext);
				if (result == null) result = caseIOverviewVisualizationContext(packageObjectOverviewContext);
				if (result == null) result = caseIVisualizationContext(packageObjectOverviewContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OsgivizmodelPackage.OSGI_VIZ: {
				OsgiViz osgiViz = (OsgiViz)theEObject;
				T result = caseOsgiViz(osgiViz);
				if (result == null) result = caseIVisualizationContext(osgiViz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVisualization Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVisualization Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <M> T caseIVisualizationContext(IVisualizationContext<M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOverview Visualization Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOverview Visualization Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <M> T caseIOverviewVisualizationContext(IOverviewVisualizationContext<M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(de.cau.cs.kieler.osgiviz.osgivizmodel.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <K, V> T casePair(Pair<K, V> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductContext(ProductContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureContext(FeatureContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleContext(BundleContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Category Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Category Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleCategoryContext(BundleCategoryContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassContext(ClassContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Component Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Component Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceComponentContext(ServiceComponentContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interface Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interface Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInterfaceContext(ServiceInterfaceContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Object Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Object Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageObjectContext(PackageObjectContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Used Packages Of Bundle Edge Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Used Packages Of Bundle Edge Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsedPackagesOfBundleEdgeConnection(UsedPackagesOfBundleEdgeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Overview Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductOverviewContext(ProductOverviewContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Overview Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOverviewContext(FeatureOverviewContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Overview Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleOverviewContext(BundleOverviewContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bundle Category Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bundle Category Overview Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBundleCategoryOverviewContext(BundleCategoryOverviewContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Interface Edge Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Interface Edge Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedInterfaceEdgeConnection(ReferencedInterfaceEdgeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Overview Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOverviewContext(ServiceOverviewContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Object Overview Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Object Overview Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageObjectOverviewContext(PackageObjectOverviewContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osgi Viz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osgi Viz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsgiViz(OsgiViz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OsgivizmodelSwitch
