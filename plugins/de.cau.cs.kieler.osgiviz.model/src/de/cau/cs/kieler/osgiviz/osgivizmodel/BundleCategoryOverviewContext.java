/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.BundleCategory;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Category Overview Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getCollapsedBundleCategoryContexts <em>Collapsed Bundle Category Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getDetailedBundleCategoryContexts <em>Detailed Bundle Category Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getBundleCategories <em>Bundle Categories</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleCategoryOverviewContext()
 * @model
 * @generated
 */
public interface BundleCategoryOverviewContext extends IOverviewVisualizationContext<BundleCategory> {
	/**
	 * Returns the value of the '<em><b>Collapsed Bundle Category Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle category contexts for all bundle categories in their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Bundle Category Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleCategoryOverviewContext_CollapsedBundleCategoryContexts()
	 * @model
	 * @generated
	 */
	EList<BundleCategoryContext> getCollapsedBundleCategoryContexts();

	/**
	 * Returns the value of the '<em><b>Detailed Bundle Category Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle category contexts for all bundle categories in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Bundle Category Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleCategoryOverviewContext_DetailedBundleCategoryContexts()
	 * @model
	 * @generated
	 */
	EList<BundleCategoryContext> getDetailedBundleCategoryContexts();

	/**
	 * Returns the value of the '<em><b>Bundle Categories</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.BundleCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle categories displayed in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle Categories</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleCategoryOverviewContext_BundleCategories()
	 * @model
	 * @generated
	 */
	EList<BundleCategory> getBundleCategories();

} // BundleCategoryOverviewContext
