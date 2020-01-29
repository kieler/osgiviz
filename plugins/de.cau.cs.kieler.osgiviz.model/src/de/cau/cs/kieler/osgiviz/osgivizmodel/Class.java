/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.Bundle;
import de.scheidtbachmann.osgimodel.ServiceInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents java class files in an OSGi context and their relationship to injected services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getBundle <em>Bundle</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getClassPath <em>Class Path</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getInjectedInterfaces <em>Injected Interfaces</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bundle containing this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle</em>' reference.
	 * @see #setBundle(Bundle)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getClass_Bundle()
	 * @model
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getBundle <em>Bundle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	/**
	 * Returns the value of the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The file path to this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Path</em>' attribute.
	 * @see #setClassPath(String)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getClass_ClassPath()
	 * @model unique="false"
	 * @generated
	 */
	String getClassPath();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getClassPath <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Path</em>' attribute.
	 * @see #getClassPath()
	 * @generated
	 */
	void setClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Injected Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All service interfaces injected by this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injected Interfaces</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getClass_InjectedInterfaces()
	 * @model
	 * @generated
	 */
	EList<ServiceInterface> getInjectedInterfaces();

} // Class
