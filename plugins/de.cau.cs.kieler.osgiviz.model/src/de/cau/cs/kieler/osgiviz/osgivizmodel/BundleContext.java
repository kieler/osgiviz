/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.Bundle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link Bundle}s.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#getClassesWithInjections <em>Classes With Injections</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiredBundlesShown <em>All Required Bundles Shown</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiringBundlesShown <em>All Requiring Bundles Shown</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllUsedPackagesShown <em>All Used Packages Shown</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#getServiceOverviewContext <em>Service Overview Context</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleContext()
 * @model
 * @generated
 */
public interface BundleContext extends IVisualizationContext<Bundle> {
	/**
	 * Returns the value of the '<em><b>Classes With Injections</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * All classes with injections contained in this bundle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classes With Injections</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleContext_ClassesWithInjections()
	 * @model containment="true"
	 * @generated
	 */
	EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> getClassesWithInjections();

	/**
	 * Returns the value of the '<em><b>All Required Bundles Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if all required bundles and their connections are shown in this parent's context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Required Bundles Shown</em>' attribute.
	 * @see #setAllRequiredBundlesShown(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleContext_AllRequiredBundlesShown()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllRequiredBundlesShown();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiredBundlesShown <em>All Required Bundles Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Required Bundles Shown</em>' attribute.
	 * @see #isAllRequiredBundlesShown()
	 * @generated
	 */
	void setAllRequiredBundlesShown(boolean value);

	/**
	 * Returns the value of the '<em><b>All Requiring Bundles Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if all bundles that require this bundle and their connections are shown in this parent's context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Requiring Bundles Shown</em>' attribute.
	 * @see #setAllRequiringBundlesShown(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleContext_AllRequiringBundlesShown()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllRequiringBundlesShown();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiringBundlesShown <em>All Requiring Bundles Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Requiring Bundles Shown</em>' attribute.
	 * @see #isAllRequiringBundlesShown()
	 * @generated
	 */
	void setAllRequiringBundlesShown(boolean value);

	/**
	 * Returns the value of the '<em><b>All Used Packages Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicated if all used packages resp. the bundles providing the packages and their connections are shown in this
	 * parent's context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Used Packages Shown</em>' attribute.
	 * @see #setAllUsedPackagesShown(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleContext_AllUsedPackagesShown()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllUsedPackagesShown();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllUsedPackagesShown <em>All Used Packages Shown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Used Packages Shown</em>' attribute.
	 * @see #isAllUsedPackagesShown()
	 * @generated
	 */
	void setAllUsedPackagesShown(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the service overview shown in detailed bundles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Overview Context</em>' reference.
	 * @see #setServiceOverviewContext(ServiceOverviewContext)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getBundleContext_ServiceOverviewContext()
	 * @model
	 * @generated
	 */
	ServiceOverviewContext getServiceOverviewContext();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#getServiceOverviewContext <em>Service Overview Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Overview Context</em>' reference.
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	void setServiceOverviewContext(ServiceOverviewContext value);

} // BundleContext
