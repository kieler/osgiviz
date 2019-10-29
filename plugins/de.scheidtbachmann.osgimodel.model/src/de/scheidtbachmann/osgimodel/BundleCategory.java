/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.BundleCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.BundleCategory#getBundle <em>Bundle</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundleCategory()
 * @model
 * @generated
 */
public interface BundleCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundleCategory_CategoryName()
	 * @model unique="false"
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.BundleCategory#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Bundle#getBundleCategory <em>Bundle Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getBundleCategory_Bundle()
	 * @see de.scheidtbachmann.osgimodel.Bundle#getBundleCategory
	 * @model opposite="bundleCategory"
	 * @generated
	 */
	EList<Bundle> getBundle();

} // BundleCategory
