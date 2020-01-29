/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link Product}s.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getFeatureOverviewContext <em>Feature Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getBundleOverviewContext <em>Bundle Overview Context</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getServiceOverviewContext <em>Service Overview Context</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductContext()
 * @model
 * @generated
 */
public interface ProductContext extends IVisualizationContext<Product> {
	/**
	 * Returns the value of the '<em><b>Feature Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the feature overview shown in detailed products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Overview Context</em>' reference.
	 * @see #setFeatureOverviewContext(FeatureOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductContext_FeatureOverviewContext()
	 * @model
	 * @generated
	 */
	FeatureOverviewContext getFeatureOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getFeatureOverviewContext <em>Feature Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Overview Context</em>' reference.
	 * @see #getFeatureOverviewContext()
	 * @generated
	 */
	void setFeatureOverviewContext(FeatureOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Bundle Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the bundle overview shown in detailed products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle Overview Context</em>' reference.
	 * @see #setBundleOverviewContext(BundleOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductContext_BundleOverviewContext()
	 * @model
	 * @generated
	 */
	BundleOverviewContext getBundleOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getBundleOverviewContext <em>Bundle Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Overview Context</em>' reference.
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	void setBundleOverviewContext(BundleOverviewContext value);

	/**
	 * Returns the value of the '<em><b>Service Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the service component overview shown in detailed products.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Overview Context</em>' reference.
	 * @see #setServiceOverviewContext(ServiceOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getProductContext_ServiceOverviewContext()
	 * @model
	 * @generated
	 */
	ServiceOverviewContext getServiceOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getServiceOverviewContext <em>Service Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Overview Context</em>' reference.
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	void setServiceOverviewContext(ServiceOverviewContext value);

} // ProductContext
