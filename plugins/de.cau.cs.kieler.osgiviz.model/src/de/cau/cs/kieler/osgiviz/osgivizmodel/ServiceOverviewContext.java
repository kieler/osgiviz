/**
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2021 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import de.scheidtbachmann.osgimodel.ServiceComponent;
import de.scheidtbachmann.osgimodel.ServiceInterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Overview Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Context for the OSGi synthesis that contains information about service overviews.
 * Can contain all {@link ServiceInterface}s, {@link ServiceComponent}s and {@link Class}es with
 * {@link EclipseInjection}s.
 * 
 * @author nre
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedServiceComponentContexts <em>Collapsed Service Component Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedServiceComponentContexts <em>Detailed Service Component Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedServiceInterfaceContexts <em>Collapsed Service Interface Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedServiceInterfaceContexts <em>Detailed Service Interface Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedClassContexts <em>Collapsed Class Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getClasses <em>Classes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedClassContexts <em>Detailed Class Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedReferencedBundleContexts <em>Collapsed Referenced Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedReferencedBundleContexts <em>Detailed Referenced Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getImplementedInterfaceEdgesPlain <em>Implemented Interface Edges Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getImplementedInterfaceEdgesInBundles <em>Implemented Interface Edges In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getReferencedInterfaceEdgesPlain <em>Referenced Interface Edges Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getReferencedInterfaceEdgesInBundles <em>Referenced Interface Edges In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getInjectedInterfaceEdgesPlain <em>Injected Interface Edges Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getInjectedInterfaceEdgesInBundles <em>Injected Interface Edges In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getServiceInterfaces <em>Service Interfaces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getClassesWithInjections <em>Classes With Injections</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#isAllowInBundleConnections <em>Allow In Bundle Connections</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext()
 * @model superTypes="de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface ServiceOverviewContext extends IOverviewVisualizationContext<Object> {
	/**
	 * Returns the value of the '<em><b>Collapsed Service Component Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service component contexts for all service components in their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Service Component Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_CollapsedServiceComponentContexts()
	 * @model
	 * @generated
	 */
	EList<ServiceComponentContext> getCollapsedServiceComponentContexts();

	/**
	 * Returns the value of the '<em><b>Detailed Service Component Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service component contexts for all service components in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Service Component Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_DetailedServiceComponentContexts()
	 * @model
	 * @generated
	 */
	EList<ServiceComponentContext> getDetailedServiceComponentContexts();

	/**
	 * Returns the value of the '<em><b>Collapsed Service Interface Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service interface contexts for all service interfaces in their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Service Interface Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_CollapsedServiceInterfaceContexts()
	 * @model
	 * @generated
	 */
	EList<ServiceInterfaceContext> getCollapsedServiceInterfaceContexts();

	/**
	 * Returns the value of the '<em><b>Detailed Service Interface Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service interface contexts for all service interfaces in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Service Interface Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_DetailedServiceInterfaceContexts()
	 * @model
	 * @generated
	 */
	EList<ServiceInterfaceContext> getDetailedServiceInterfaceContexts();

	/**
	 * Returns the value of the '<em><b>Collapsed Class Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class contexts for all classes with eclipse injections in their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Class Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_CollapsedClassContexts()
	 * @model
	 * @generated
	 */
	EList<ClassContext> getCollapsedClassContexts();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The classes generated for and owned by this service overview.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Detailed Class Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class contexts for all classes with eclipse injections in their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Class Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_DetailedClassContexts()
	 * @model
	 * @generated
	 */
	EList<ClassContext> getDetailedClassContexts();

	/**
	 * Returns the value of the '<em><b>Collapsed Referenced Bundle Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All bundles defining the components and injections of this overview, if in bundle connections are allowed, in
	 * their collapsed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Referenced Bundle Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_CollapsedReferencedBundleContexts()
	 * @model
	 * @generated
	 */
	EList<BundleContext> getCollapsedReferencedBundleContexts();

	/**
	 * Returns the value of the '<em><b>Detailed Referenced Bundle Contexts</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All bundles defining the components and injections of this overview, if in bundle connections are allowed, in
	 * their detailed form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detailed Referenced Bundle Contexts</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_DetailedReferencedBundleContexts()
	 * @model
	 * @generated
	 */
	EList<BundleContext> getDetailedReferencedBundleContexts();

	/**
	 * Returns the value of the '<em><b>Implemented Interface Edges Plain</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair}<code>&lt;de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext, de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the implemented service interfaces that should be drawn in the plain variant of the
	 * {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option or also in any other variant,
	 * if in bundle connections are not allowed.
	 * The pairs should be viewed that the first component implements the second interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implemented Interface Edges Plain</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_ImplementedInterfaceEdgesPlain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair<ServiceComponentContext, ServiceInterfaceContext>> getImplementedInterfaceEdgesPlain();

	/**
	 * Returns the value of the '<em><b>Implemented Interface Edges In Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair}<code>&lt;de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext, de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the implemented service interfaces that should be drawn in the inBundles variant of the
	 * {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option if in bundle connections are
	 * allowed.
	 * The pairs should be viewed that the first component implements the second interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implemented Interface Edges In Bundles</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_ImplementedInterfaceEdgesInBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair<ServiceComponentContext, ServiceInterfaceContext>> getImplementedInterfaceEdgesInBundles();

	/**
	 * Returns the value of the '<em><b>Referenced Interface Edges Plain</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the referenced service interfaces that should be drawn in the plain variant of the
	 * {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option or also in any other variant,
	 * if in bundle connections are not allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Interface Edges Plain</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_ReferencedInterfaceEdgesPlain()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferencedInterfaceEdgeConnection> getReferencedInterfaceEdgesPlain();

	/**
	 * Returns the value of the '<em><b>Referenced Interface Edges In Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the referenced service interface that should be drawn in the inBundles variant of the
	 * {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option if in bundle connections
	 * are allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Interface Edges In Bundles</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_ReferencedInterfaceEdgesInBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferencedInterfaceEdgeConnection> getReferencedInterfaceEdgesInBundles();

	/**
	 * Returns the value of the '<em><b>Injected Interface Edges Plain</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair}<code>&lt;de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext, de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the injected service interfaces that should be drawn in the plain variant of the
	 * {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option if in bundle connections are
	 * not allowed.
	 * The pairs should be viewed that the first injection context is used to inject the second interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injected Interface Edges Plain</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_InjectedInterfaceEdgesPlain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair<ClassContext, ServiceInterfaceContext>> getInjectedInterfaceEdgesPlain();

	/**
	 * Returns the value of the '<em><b>Injected Interface Edges In Bundles</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair}<code>&lt;de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext, de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All connections for the injected service interfaces that should be drawn in the inBundles variant of the
	 * {@link OsgiOptions#SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES} option if in bundle connections
	 * are allowed.
	 * The pairs should be viewed that the first class context is used to inject the second interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Injected Interface Edges In Bundles</em>' containment reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_InjectedInterfaceEdgesInBundles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair<ClassContext, ServiceInterfaceContext>> getInjectedInterfaceEdgesInBundles();

	/**
	 * Returns the value of the '<em><b>Service Components</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service components displayed in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Components</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_ServiceComponents()
	 * @model
	 * @generated
	 */
	EList<ServiceComponent> getServiceComponents();

	/**
	 * Returns the value of the '<em><b>Service Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.scheidtbachmann.osgimodel.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service interfaces displayed in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interfaces</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_ServiceInterfaces()
	 * @model
	 * @generated
	 */
	EList<ServiceInterface> getServiceInterfaces();

	/**
	 * Returns the value of the '<em><b>Classes With Injections</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classes using eclipse injections displayed in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classes With Injections</em>' reference list.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_ClassesWithInjections()
	 * @model
	 * @generated
	 */
	EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> getClassesWithInjections();

	/**
	 * Returns the value of the '<em><b>Allow In Bundle Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag to indicate whether this service overview should allow its elements to be shown in the bundles which define
	 * the components and injections. If true, this overview can be toggled to show the elements directly flat or in
	 * their bundles with the {@link ToggleServiceConnectionVisualization}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow In Bundle Connections</em>' attribute.
	 * @see #setAllowInBundleConnections(boolean)
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#getServiceOverviewContext_AllowInBundleConnections()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowInBundleConnections();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#isAllowInBundleConnections <em>Allow In Bundle Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow In Bundle Connections</em>' attribute.
	 * @see #isAllowInBundleConnections()
	 * @generated
	 */
	void setAllowInBundleConnections(boolean value);

} // ServiceOverviewContext
