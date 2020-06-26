/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.OsgiProject;

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
