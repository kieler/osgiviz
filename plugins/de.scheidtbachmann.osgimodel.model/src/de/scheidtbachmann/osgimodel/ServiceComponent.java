/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getName <em>Name</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getPath <em>Path</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getAbout <em>About</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getBundle <em>Bundle</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getServiceInterfaces <em>Service Interfaces</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getReference <em>Reference</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.ServiceComponent#getJavaDocPath <em>Java Doc Path</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent()
 * @model
 * @generated
 */
public interface ServiceComponent extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_About()
	 * @model unique="false"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Class</em>' attribute.
	 * @see #setImplementationClass(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_ImplementationClass()
	 * @model unique="false"
	 * @generated
	 */
	String getImplementationClass();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getImplementationClass <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class</em>' attribute.
	 * @see #getImplementationClass()
	 * @generated
	 */
	void setImplementationClass(String value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Bundle#getServiceComponents <em>Service Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' container reference.
	 * @see #setBundle(Bundle)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_Bundle()
	 * @see de.scheidtbachmann.osgimodel.Bundle#getServiceComponents
	 * @model opposite="serviceComponents" transient="false"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getBundle <em>Bundle</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' container reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	/**
	 * Returns the value of the '<em><b>Service Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceInterface}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.ServiceInterface#getServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Interfaces</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_ServiceInterfaces()
	 * @see de.scheidtbachmann.osgimodel.ServiceInterface#getServiceComponent
	 * @model opposite="serviceComponent"
	 * @generated
	 */
	EList<ServiceInterface> getServiceInterfaces();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_Reference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReference();

	/**
	 * Returns the value of the '<em><b>Java Doc Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Doc Path</em>' attribute.
	 * @see #setJavaDocPath(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getServiceComponent_JavaDocPath()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getJavaDocPath();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.ServiceComponent#getJavaDocPath <em>Java Doc Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Doc Path</em>' attribute.
	 * @see #getJavaDocPath()
	 * @generated
	 */
	void setJavaDocPath(String value);

} // ServiceComponent
