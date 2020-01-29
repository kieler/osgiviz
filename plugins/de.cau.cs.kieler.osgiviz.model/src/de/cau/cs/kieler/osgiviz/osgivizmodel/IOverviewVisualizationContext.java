/**
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

} // IOverviewVisualizationContext
