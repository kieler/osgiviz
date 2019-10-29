/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.Reference#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Reference#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Reference#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Reference#getPolicy <em>Policy</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Reference#getBind <em>Bind</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.Reference#getUnbind <em>Unbind</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getReference_ReferenceName()
	 * @model unique="false"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Reference#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Service Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Interface</em>' reference.
	 * @see #setServiceInterface(ServiceInterface)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getReference_ServiceInterface()
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface#getReferencedBy
	 * @model opposite="referencedBy"
	 * @generated
	 */
	ServiceInterface getServiceInterface();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Reference#getServiceInterface <em>Service Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interface</em>' reference.
	 * @see #getServiceInterface()
	 * @generated
	 */
	void setServiceInterface(ServiceInterface value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getReference_Cardinality()
	 * @model unique="false"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Reference#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see #setPolicy(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getReference_Policy()
	 * @model unique="false"
	 * @generated
	 */
	String getPolicy();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Reference#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind</em>' attribute.
	 * @see #setBind(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getReference_Bind()
	 * @model unique="false"
	 * @generated
	 */
	String getBind();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Reference#getBind <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind</em>' attribute.
	 * @see #getBind()
	 * @generated
	 */
	void setBind(String value);

	/**
	 * Returns the value of the '<em><b>Unbind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbind</em>' attribute.
	 * @see #setUnbind(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getReference_Unbind()
	 * @model unique="false"
	 * @generated
	 */
	String getUnbind();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.Reference#getUnbind <em>Unbind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbind</em>' attribute.
	 * @see #getUnbind()
	 * @generated
	 */
	void setUnbind(String value);

} // Reference
