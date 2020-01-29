/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Overview Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link Feature} overviews.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getCollapsedFeatureContexts <em>Collapsed Feature Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getDetailedFeatureContexts <em>Detailed Feature Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getFeatureOverviewContext()
 * @model
 * @generated
 */
public interface FeatureOverviewContext extends IOverviewVisualizationContext<Feature> {
	/**
	 * Returns the value of the '<em><b>Collapsed Feature Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature contexts for all features in their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Feature Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getFeatureOverviewContext_CollapsedFeatureContexts()
	 * @model
	 * @generated
	 */
	EList<FeatureContext> getCollapsedFeatureContexts();

	/**
	 * Returns the value of the '<em><b>Detailed Feature Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature contexts for all features in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Feature Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getFeatureOverviewContext_DetailedFeatureContexts()
	 * @model
	 * @generated
	 */
	EList<FeatureContext> getDetailedFeatureContexts();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features displayed in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getFeatureOverviewContext_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureOverviewContext
