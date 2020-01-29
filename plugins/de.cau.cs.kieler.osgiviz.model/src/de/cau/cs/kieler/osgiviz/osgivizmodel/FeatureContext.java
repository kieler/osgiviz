/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link Feature}s.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext#getBundleOverviewContext <em>Bundle Overview Context</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getFeatureContext()
 * @model
 * @generated
 */
public interface FeatureContext extends IVisualizationContext<Feature> {
	/**
	 * Returns the value of the '<em><b>Bundle Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the bundle overview shown in detailed features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle Overview Context</em>' reference.
	 * @see #setBundleOverviewContext(BundleOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getFeatureContext_BundleOverviewContext()
	 * @model
	 * @generated
	 */
	BundleOverviewContext getBundleOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext#getBundleOverviewContext <em>Bundle Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Overview Context</em>' reference.
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	void setBundleOverviewContext(BundleOverviewContext value);

} // FeatureContext
