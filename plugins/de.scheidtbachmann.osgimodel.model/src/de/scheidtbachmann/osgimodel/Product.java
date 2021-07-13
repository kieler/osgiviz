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
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.Product#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends BasicOsgiObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getProduct_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Product
