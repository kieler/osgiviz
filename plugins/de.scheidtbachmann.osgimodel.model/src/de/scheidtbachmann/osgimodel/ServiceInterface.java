/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceInterface#getName <em>Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceInterface#getAbout <em>About</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceInterface#getImplementedIn <em>Implemented In</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceInterface#getServiceComponent <em>Service Component</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceInterface#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceInterface()
 * @model
 * @generated
 */
public interface ServiceInterface extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Service Component</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceComponent}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getServiceInterfaces <em>Service Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Component</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceInterface_ServiceComponent()
	 * @see de.scheidtbachmann.osgimodel.ServiceComponent#getServiceInterfaces
	 * @model opposite="serviceInterfaces"
	 * @generated
	 */
	EList<ServiceComponent> getServiceComponent();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceInterface_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceInterface_About()
	 * @model unique="false"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Implemented In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented In</em>' reference.
	 * @see #setImplementedIn(Bundle)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceInterface_ImplementedIn()
	 * @model
	 * @generated
	 */
	Bundle getImplementedIn();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getImplementedIn <em>Implemented In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented In</em>' reference.
	 * @see #getImplementedIn()
	 * @generated
	 */
	void setImplementedIn(Bundle value);

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Reference}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Reference#getServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceInterface_ReferencedBy()
	 * @see de.scheidtbachmann.osgimodel.Reference#getServiceInterface
	 * @model opposite="serviceInterface"
	 * @generated
	 */
	EList<Reference> getReferencedBy();

} // ServiceInterface
