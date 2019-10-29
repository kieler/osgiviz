/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.AttributeData#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.AttributeData#getAttributeData <em>Attribute Data</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getAttributeData()
 * @model
 * @generated
 */
public interface AttributeData extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getAttributeData_AttributeName()
	 * @model unique="false"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.AttributeData#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Data</em>' attribute.
	 * @see #setAttributeData(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getAttributeData_AttributeData()
	 * @model unique="false"
	 * @generated
	 */
	String getAttributeData();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.AttributeData#getAttributeData <em>Attribute Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Data</em>' attribute.
	 * @see #getAttributeData()
	 * @generated
	 */
	void setAttributeData(String value);

} // AttributeData
