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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IVisualization Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Interface for visualization contexts of the OSGi model synthesis. Each context may contain child contexts, where each
 * context will give the synthesis additional information in which state parts of the model should be generated in.
 * 
 * @param <M> The model element class this visualization context is for.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#isChildrenInitialized <em>Children Initialized</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIVisualizationContext()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IVisualizationContext<M> extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext}<code>&lt;?&gt;</code>.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All contexts that need to be into the view model as children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Contexts</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIVisualizationContext_ChildContexts()
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IVisualizationContext<?>> getChildContexts();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element to get the data from for this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(Object)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIVisualizationContext_ModelElement()
	 * @model kind="reference"
	 * @generated
	 */
	M getModelElement();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(M value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getChildContexts <em>Child Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent visualization context containing this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IVisualizationContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIVisualizationContext_Parent()
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getChildContexts
	 * @model opposite="childContexts" transient="false"
	 * @generated
	 */
	IVisualizationContext<?> getParent();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IVisualizationContext<?> value);

	/**
	 * Returns the value of the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Indicating if the child contexts of this context have been initialized correctly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children Initialized</em>' attribute.
	 * @see #setChildrenInitialized(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getIVisualizationContext_ChildrenInitialized()
	 * @model unique="false"
	 * @generated
	 */
	boolean isChildrenInitialized();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#isChildrenInitialized <em>Children Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Initialized</em>' attribute.
	 * @see #isChildrenInitialized()
	 * @generated
	 */
	void setChildrenInitialized(boolean value);

} // IVisualizationContext
