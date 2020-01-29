/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.ServiceInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link ServiceInterface}s.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownPlain <em>All Implementing Components Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownInBundles <em>All Implementing Components Shown In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownPlain <em>All Referencing Components Shown Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownInBundles <em>All Referencing Components Shown In Bundles</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceInterfaceContext()
 * @model
 * @generated
 */
public interface ServiceInterfaceContext extends IVisualizationContext<ServiceInterface> {
	/**
	 * Returns the value of the '<em><b>All Implementing Components Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service components implementing this service interface are shown and connected to this.
	 * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Implementing Components Shown Plain</em>' attribute.
	 * @see #setAllImplementingComponentsShownPlain(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceInterfaceContext_AllImplementingComponentsShownPlain()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllImplementingComponentsShownPlain();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownPlain <em>All Implementing Components Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Implementing Components Shown Plain</em>' attribute.
	 * @see #isAllImplementingComponentsShownPlain()
	 * @generated
	 */
	void setAllImplementingComponentsShownPlain(boolean value);

	/**
	 * Returns the value of the '<em><b>All Implementing Components Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service components implementing this service interface are shown and connected to this.
	 * This is for the inBundles variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Implementing Components Shown In Bundles</em>' attribute.
	 * @see #setAllImplementingComponentsShownInBundles(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceInterfaceContext_AllImplementingComponentsShownInBundles()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllImplementingComponentsShownInBundles();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownInBundles <em>All Implementing Components Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Implementing Components Shown In Bundles</em>' attribute.
	 * @see #isAllImplementingComponentsShownInBundles()
	 * @generated
	 */
	void setAllImplementingComponentsShownInBundles(boolean value);

	/**
	 * Returns the value of the '<em><b>All Referencing Components Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service components referencing this service interface are shown and connected to this.
	 * This is for the plain variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Referencing Components Shown Plain</em>' attribute.
	 * @see #setAllReferencingComponentsShownPlain(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceInterfaceContext_AllReferencingComponentsShownPlain()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllReferencingComponentsShownPlain();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownPlain <em>All Referencing Components Shown Plain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Referencing Components Shown Plain</em>' attribute.
	 * @see #isAllReferencingComponentsShownPlain()
	 * @generated
	 */
	void setAllReferencingComponentsShownPlain(boolean value);

	/**
	 * Returns the value of the '<em><b>All Referencing Components Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether all service components referencing this service interface are shown and connected to this.
	 * This is for the inBundles variant for the {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Referencing Components Shown In Bundles</em>' attribute.
	 * @see #setAllReferencingComponentsShownInBundles(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceInterfaceContext_AllReferencingComponentsShownInBundles()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllReferencingComponentsShownInBundles();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownInBundles <em>All Referencing Components Shown In Bundles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Referencing Components Shown In Bundles</em>' attribute.
	 * @see #isAllReferencingComponentsShownInBundles()
	 * @generated
	 */
	void setAllReferencingComponentsShownInBundles(boolean value);

} // ServiceInterfaceContext
