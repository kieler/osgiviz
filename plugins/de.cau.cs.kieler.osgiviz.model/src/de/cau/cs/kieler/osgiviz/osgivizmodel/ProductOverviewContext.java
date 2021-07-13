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

import de.scheidtbachmann.osgimodel.Product;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Overview Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link Product} overviews.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getDetailedProductContexts <em>Detailed Product Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getCollapsedProductContexts <em>Collapsed Product Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductOverviewContext()
 * @model
 * @generated
 */
public interface ProductOverviewContext extends IOverviewVisualizationContext<Product> {
	/**
	 * Returns the value of the '<em><b>Detailed Product Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All products that should be drawn in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Product Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductOverviewContext_DetailedProductContexts()
	 * @model
	 * @generated
	 */
	EList<ProductContext> getDetailedProductContexts();

	/**
	 * Returns the value of the '<em><b>Collapsed Product Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All products that should be drawn in their collapsed, non-detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Product Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductOverviewContext_CollapsedProductContexts()
	 * @model
	 * @generated
	 */
	EList<ProductContext> getCollapsedProductContexts();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The products shown in this overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductOverviewContext_Products()
	 * @model
	 * @generated
	 */
	EList<Product> getProducts();

} // ProductOverviewContext
