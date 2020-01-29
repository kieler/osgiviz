/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.PackageObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Object Overview Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about {@link PackageObject} overviews.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getCollapsedPackageObjectContexts <em>Collapsed Package Object Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getDetailedPackageObjectContexts <em>Detailed Package Object Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getPackageObjects <em>Package Objects</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getPackageObjectOverviewContext()
 * @model
 * @generated
 */
public interface PackageObjectOverviewContext extends IOverviewVisualizationContext<PackageObject> {
	/**
	 * Returns the value of the '<em><b>Collapsed Package Object Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package object contexts for all package objects in their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Package Object Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getPackageObjectOverviewContext_CollapsedPackageObjectContexts()
	 * @model
	 * @generated
	 */
	EList<PackageObjectContext> getCollapsedPackageObjectContexts();

	/**
	 * Returns the value of the '<em><b>Detailed Package Object Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package object contexts for all package objects in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Package Object Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getPackageObjectOverviewContext_DetailedPackageObjectContexts()
	 * @model
	 * @generated
	 */
	EList<PackageObjectContext> getDetailedPackageObjectContexts();

	/**
	 * Returns the value of the '<em><b>Package Objects</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.PackageObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package objects displayed in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Objects</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getPackageObjectOverviewContext_PackageObjects()
	 * @model
	 * @generated
	 */
	EList<PackageObject> getPackageObjects();

} // PackageObjectOverviewContext
