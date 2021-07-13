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

import de.scheidtbachmann.osgimodel.PackageObject;
import de.scheidtbachmann.osgimodel.Product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Packages Of Bundle Edge Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Helper data class that contains information about edges that should be visualized for used package associations.
 * This class contains the source bundle, the packages IDs used displayed by the edge, the product they are used in, and
 * the target bundle exporting the package.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getSourceBundleContext <em>Source Bundle Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getUsedPackages <em>Used Packages</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getProduct <em>Product</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getTargetBundleContext <em>Target Bundle Context</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getUsedPackagesOfBundleEdgeConnection()
 * @model
 * @generated
 */
public interface UsedPackagesOfBundleEdgeConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Bundle Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle context of the source bundle the edge should connect to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Bundle Context</em>' reference.
	 * @see #setSourceBundleContext(BundleContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getUsedPackagesOfBundleEdgeConnection_SourceBundleContext()
	 * @model
	 * @generated
	 */
	BundleContext getSourceBundleContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getSourceBundleContext <em>Source Bundle Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Bundle Context</em>' reference.
	 * @see #getSourceBundleContext()
	 * @generated
	 */
	void setSourceBundleContext(BundleContext value);

	/**
	 * Returns the value of the '<em><b>Used Packages</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.PackageObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The packages provided by the target bundle in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Packages</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getUsedPackagesOfBundleEdgeConnection_UsedPackages()
	 * @model
	 * @generated
	 */
	EList<PackageObject> getUsedPackages();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product in that this connection is used. May be null if this connection is used in no product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getUsedPackagesOfBundleEdgeConnection_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Target Bundle Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target bundle context the edge should connect to. It is the bundle exporting the packages in this product context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Bundle Context</em>' reference.
	 * @see #setTargetBundleContext(BundleContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getUsedPackagesOfBundleEdgeConnection_TargetBundleContext()
	 * @model
	 * @generated
	 */
	BundleContext getTargetBundleContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getTargetBundleContext <em>Target Bundle Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Bundle Context</em>' reference.
	 * @see #getTargetBundleContext()
	 * @generated
	 */
	void setTargetBundleContext(BundleContext value);

} // UsedPackagesOfBundleEdgeConnection
