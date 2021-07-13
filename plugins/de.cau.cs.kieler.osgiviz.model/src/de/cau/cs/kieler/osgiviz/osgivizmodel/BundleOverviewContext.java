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
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.Bundle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Overview Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link Bundle} overviews.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getRequiredBundleEdges <em>Required Bundle Edges</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackagesOfBundleEdges <em>Used Packages Of Bundle Edges</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackageEdges <em>Used Package Edges</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getCollapsedBundleContexts <em>Collapsed Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getDetailedBundleContexts <em>Detailed Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackageContexts <em>Used Package Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getBundles <em>Bundles</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext()
 * @model
 * @generated
 */
public interface BundleOverviewContext extends IOverviewVisualizationContext<Bundle> {
	/**
	 * Returns the value of the '<em><b>Required Bundle Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair}<code>&lt;de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext, de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the required bundles hierarchy that should be drawn.
	 * The pairs should be viewed that the first bundle requires the second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Bundle Edges</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext_RequiredBundleEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair<BundleContext, BundleContext>> getRequiredBundleEdges();

	/**
	 * Returns the value of the '<em><b>Used Packages Of Bundle Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the required packages with resolved bundles that should be drawn.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Packages Of Bundle Edges</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext_UsedPackagesOfBundleEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsedPackagesOfBundleEdgeConnection> getUsedPackagesOfBundleEdges();

	/**
	 * Returns the value of the '<em><b>Used Package Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair}<code>&lt;de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext, de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the required packages without known source bundles that should be drawn.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Package Edges</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext_UsedPackageEdges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair<BundleContext, PackageObjectContext>> getUsedPackageEdges();

	/**
	 * Returns the value of the '<em><b>Collapsed Bundle Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle contexts for all bundles in their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Bundle Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext_CollapsedBundleContexts()
	 * @model
	 * @generated
	 */
	EList<BundleContext> getCollapsedBundleContexts();

	/**
	 * Returns the value of the '<em><b>Detailed Bundle Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle contexts for all bundles in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Bundle Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext_DetailedBundleContexts()
	 * @model
	 * @generated
	 */
	EList<BundleContext> getDetailedBundleContexts();

	/**
	 * Returns the value of the '<em><b>Used Package Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All used packages not contained within another internal bundle where the providing bundle is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Package Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext_UsedPackageContexts()
	 * @model
	 * @generated
	 */
	EList<PackageObjectContext> getUsedPackageContexts();

	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundles displayed in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundles</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleOverviewContext_Bundles()
	 * @model
	 * @generated
	 */
	EList<Bundle> getBundles();

} // BundleOverviewContext
