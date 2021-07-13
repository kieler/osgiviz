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

import de.scheidtbachmann.osgimodel.OsgiProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Osgi Viz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about the root project overview.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getSynthesisOptions <em>Synthesis Options</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getLayoutOptions <em>Layout Options</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleOverviewContext <em>Bundle Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getProductOverviewContext <em>Product Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getServiceOverviewContext <em>Service Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFeatureOverviewContext <em>Feature Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getImportedPackageOverviewContext <em>Imported Package Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleCategoryOverviewContext <em>Bundle Category Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFocus <em>Focus</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz()
 * @model
 * @generated
 */
public interface OsgiViz extends IVisualizationContext<OsgiProject> {
	/**
	 * Returns the value of the '<em><b>Synthesis Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * KLighD's synthesis options for storing/restoring an equal view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synthesis Options</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_SynthesisOptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getSynthesisOptions();

	/**
	 * Returns the value of the '<em><b>Layout Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * KLighD's layout options for storing/restoring an equal view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layout Options</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_LayoutOptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getLayoutOptions();

	/**
	 * Returns the value of the '<em><b>Bundle Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the bundle overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle Overview Context</em>' reference.
	 * @see #setBundleOverviewContext(BundleOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_BundleOverviewContext()
	 * @model
	 * @generated
	 */
	BundleOverviewContext getBundleOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleOverviewContext <em>Bundle Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Overview Context</em>' reference.
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	void setBundleOverviewContext(BundleOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Product Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the product overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Overview Context</em>' reference.
	 * @see #setProductOverviewContext(ProductOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_ProductOverviewContext()
	 * @model
	 * @generated
	 */
	ProductOverviewContext getProductOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getProductOverviewContext <em>Product Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Overview Context</em>' reference.
	 * @see #getProductOverviewContext()
	 * @generated
	 */
	void setProductOverviewContext(ProductOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Service Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the service overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Overview Context</em>' reference.
	 * @see #setServiceOverviewContext(ServiceOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_ServiceOverviewContext()
	 * @model
	 * @generated
	 */
	ServiceOverviewContext getServiceOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getServiceOverviewContext <em>Service Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Overview Context</em>' reference.
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	void setServiceOverviewContext(ServiceOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Feature Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the feature overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Overview Context</em>' reference.
	 * @see #setFeatureOverviewContext(FeatureOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_FeatureOverviewContext()
	 * @model
	 * @generated
	 */
	FeatureOverviewContext getFeatureOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFeatureOverviewContext <em>Feature Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Overview Context</em>' reference.
	 * @see #getFeatureOverviewContext()
	 * @generated
	 */
	void setFeatureOverviewContext(FeatureOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Imported Package Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the imported package overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Package Overview Context</em>' reference.
	 * @see #setImportedPackageOverviewContext(PackageObjectOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_ImportedPackageOverviewContext()
	 * @model
	 * @generated
	 */
	PackageObjectOverviewContext getImportedPackageOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getImportedPackageOverviewContext <em>Imported Package Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package Overview Context</em>' reference.
	 * @see #getImportedPackageOverviewContext()
	 * @generated
	 */
	void setImportedPackageOverviewContext(PackageObjectOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Bundle Category Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the bundle category overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle Category Overview Context</em>' reference.
	 * @see #setBundleCategoryOverviewContext(BundleCategoryOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_BundleCategoryOverviewContext()
	 * @model
	 * @generated
	 */
	BundleCategoryOverviewContext getBundleCategoryOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleCategoryOverviewContext <em>Bundle Category Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Category Overview Context</em>' reference.
	 * @see #getBundleCategoryOverviewContext()
	 * @generated
	 */
	void setBundleCategoryOverviewContext(BundleCategoryOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child context currently in focus of the view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' reference.
	 * @see #setFocus(IVisualizationContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getOsgiViz_Focus()
	 * @model
	 * @generated
	 */
	IVisualizationContext<?> getFocus();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFocus <em>Focus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(IVisualizationContext<?> value);

} // OsgiViz
