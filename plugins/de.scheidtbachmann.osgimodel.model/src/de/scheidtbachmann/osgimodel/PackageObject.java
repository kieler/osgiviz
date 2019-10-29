/**
 */
package de.scheidtbachmann.osgimodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.scheidtbachmann.osgimodel.PackageObject#getUniqueId <em>Unique Id</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.PackageObject#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link de.scheidtbachmann.osgimodel.PackageObject#getJavaDocPath <em>Java Doc Path</em>}</li>
 * </ul>
 *
 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getPackageObject()
 * @model
 * @generated
 */
public interface PackageObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Unique Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Id</em>' attribute.
	 * @see #setUniqueId(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getPackageObject_UniqueId()
	 * @model unique="false"
	 * @generated
	 */
	String getUniqueId();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.PackageObject#getUniqueId <em>Unique Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Id</em>' attribute.
	 * @see #getUniqueId()
	 * @generated
	 */
	void setUniqueId(String value);

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.Bundle}.
	 * It is bidirectional and its opposite is '{@link de.scheidtbachmann.osgimodel.Bundle#getImportedPackages <em>Imported Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getPackageObject_ImplementedBy()
	 * @see de.scheidtbachmann.osgimodel.Bundle#getImportedPackages
	 * @model opposite="importedPackages"
	 * @generated
	 */
	EList<Bundle> getImplementedBy();

	/**
	 * Returns the value of the '<em><b>Java Doc Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Doc Path</em>' attribute.
	 * @see #setJavaDocPath(String)
	 * @see de.scheidtbachmann.osgimodel.OsgimodelPackage#getPackageObject_JavaDocPath()
	 * @model unique="false"
	 * @generated
	 */
	String getJavaDocPath();

	/**
	 * Sets the value of the '{@link de.scheidtbachmann.osgimodel.PackageObject#getJavaDocPath <em>Java Doc Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Doc Path</em>' attribute.
	 * @see #getJavaDocPath()
	 * @generated
	 */
	void setJavaDocPath(String value);

} // PackageObject
