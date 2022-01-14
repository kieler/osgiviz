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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOverview Visualization Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Interface for a visualization context for overviews that simply shows a list of elements in collapsed or detailed
 * fashion individually.
 * 
 * @param <M> The model element class of the child contexts of this context.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext#isShowCollapsedElements <em>Show Collapsed Elements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIOverviewVisualizationContext()
 * @model interface="true" abstract="true" superTypes="de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext&lt;org.eclipse.emf.ecore.EEList&lt;M&gt;&gt;"
 * @generated
 */
public interface IOverviewVisualizationContext<M> extends IVisualizationContext<EList<M>> {
	/**
	 * Returns the value of the '<em><b>Expanded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the overview should be shown plain or expanded with its contents shown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expanded</em>' attribute.
	 * @see #setExpanded(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIOverviewVisualizationContext_Expanded()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isExpanded();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext#isExpanded <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded</em>' attribute.
	 * @see #isExpanded()
	 * @generated
	 */
	void setExpanded(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Collapsed Elements</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Indicates whether the collapsed elements in this overview should be shown
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Collapsed Elements</em>' attribute.
	 * @see #setShowCollapsedElements(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIOverviewVisualizationContext_ShowCollapsedElements()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowCollapsedElements();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext#isShowCollapsedElements <em>Show Collapsed Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Collapsed Elements</em>' attribute.
	 * @see #isShowCollapsedElements()
	 * @generated
	 */
	void setShowCollapsedElements(boolean value);

} // IOverviewVisualizationContext
