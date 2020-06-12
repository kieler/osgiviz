/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.Feature#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Feature#getBundles <em>Bundles</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends BasicOsgiObject {
	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getFeature_IsExternal()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Feature#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Bundles</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Bundle#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getFeature_Bundles()
	 * @see de.scheidtbachmann.osgimodel.Bundle#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	EList<Bundle> getBundles();

} // Feature
