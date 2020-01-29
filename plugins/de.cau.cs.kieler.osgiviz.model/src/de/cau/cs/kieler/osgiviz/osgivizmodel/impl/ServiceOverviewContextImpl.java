/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.Pair;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext;
import de.scheidtbachmann.osgimodel.ServiceComponent;
import de.scheidtbachmann.osgimodel.ServiceInterface;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Overview Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#isExpanded <em>Expanded</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getCollapsedServiceComponentContexts <em>Collapsed Service Component Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getDetailedServiceComponentContexts <em>Detailed Service Component Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getCollapsedServiceInterfaceContexts <em>Collapsed Service Interface Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getDetailedServiceInterfaceContexts <em>Detailed Service Interface Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getCollapsedClassContexts <em>Collapsed Class Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getDetailedClassContexts <em>Detailed Class Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getCollapsedReferencedBundleContexts <em>Collapsed Referenced Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getDetailedReferencedBundleContexts <em>Detailed Referenced Bundle Contexts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getImplementedInterfaceEdgesPlain <em>Implemented Interface Edges Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getImplementedInterfaceEdgesInBundles <em>Implemented Interface Edges In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getReferencedInterfaceEdgesPlain <em>Referenced Interface Edges Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getReferencedInterfaceEdgesInBundles <em>Referenced Interface Edges In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getInjectedInterfaceEdgesPlain <em>Injected Interface Edges Plain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getInjectedInterfaceEdgesInBundles <em>Injected Interface Edges In Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getServiceComponents <em>Service Components</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getServiceInterfaces <em>Service Interfaces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#getClassesWithInjections <em>Classes With Injections</em>}</li>
 *   <li>{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl#isAllowInBundleConnections <em>Allow In Bundle Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceOverviewContextImpl extends MinimalEObjectImpl.Container implements ServiceOverviewContext {
	/**
	 * The cached value of the '{@link #getChildContexts() <em>Child Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<IVisualizationContext<?>> childContexts;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> modelElement;

	/**
	 * The default value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected boolean expanded = EXPANDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollapsedServiceComponentContexts() <em>Collapsed Service Component Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedServiceComponentContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponentContext> collapsedServiceComponentContexts;

	/**
	 * The cached value of the '{@link #getDetailedServiceComponentContexts() <em>Detailed Service Component Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedServiceComponentContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponentContext> detailedServiceComponentContexts;

	/**
	 * The cached value of the '{@link #getCollapsedServiceInterfaceContexts() <em>Collapsed Service Interface Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedServiceInterfaceContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterfaceContext> collapsedServiceInterfaceContexts;

	/**
	 * The cached value of the '{@link #getDetailedServiceInterfaceContexts() <em>Detailed Service Interface Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedServiceInterfaceContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterfaceContext> detailedServiceInterfaceContexts;

	/**
	 * The cached value of the '{@link #getCollapsedClassContexts() <em>Collapsed Class Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedClassContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassContext> collapsedClassContexts;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> classes;

	/**
	 * The cached value of the '{@link #getDetailedClassContexts() <em>Detailed Class Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedClassContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassContext> detailedClassContexts;

	/**
	 * The cached value of the '{@link #getCollapsedReferencedBundleContexts() <em>Collapsed Referenced Bundle Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedReferencedBundleContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleContext> collapsedReferencedBundleContexts;

	/**
	 * The cached value of the '{@link #getDetailedReferencedBundleContexts() <em>Detailed Referenced Bundle Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedReferencedBundleContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleContext> detailedReferencedBundleContexts;

	/**
	 * The cached value of the '{@link #getImplementedInterfaceEdgesPlain() <em>Implemented Interface Edges Plain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaceEdgesPlain()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesPlain;

	/**
	 * The cached value of the '{@link #getImplementedInterfaceEdgesInBundles() <em>Implemented Interface Edges In Bundles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaceEdgesInBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair<ServiceComponentContext, ServiceInterfaceContext>> implementedInterfaceEdgesInBundles;

	/**
	 * The cached value of the '{@link #getReferencedInterfaceEdgesPlain() <em>Referenced Interface Edges Plain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedInterfaceEdgesPlain()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesPlain;

	/**
	 * The cached value of the '{@link #getReferencedInterfaceEdgesInBundles() <em>Referenced Interface Edges In Bundles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedInterfaceEdgesInBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencedInterfaceEdgeConnection> referencedInterfaceEdgesInBundles;

	/**
	 * The cached value of the '{@link #getInjectedInterfaceEdgesPlain() <em>Injected Interface Edges Plain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectedInterfaceEdgesPlain()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair<ClassContext, ServiceInterfaceContext>> injectedInterfaceEdgesPlain;

	/**
	 * The cached value of the '{@link #getInjectedInterfaceEdgesInBundles() <em>Injected Interface Edges In Bundles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectedInterfaceEdgesInBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Pair<ClassContext, ServiceInterfaceContext>> injectedInterfaceEdgesInBundles;

	/**
	 * The cached value of the '{@link #getServiceComponents() <em>Service Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceComponent> serviceComponents;

	/**
	 * The cached value of the '{@link #getServiceInterfaces() <em>Service Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> serviceInterfaces;

	/**
	 * The cached value of the '{@link #getClassesWithInjections() <em>Classes With Injections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesWithInjections()
	 * @generated
	 * @ordered
	 */
	protected EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> classesWithInjections;

	/**
	 * The default value of the '{@link #isAllowInBundleConnections() <em>Allow In Bundle Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowInBundleConnections()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_IN_BUNDLE_CONNECTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowInBundleConnections() <em>Allow In Bundle Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowInBundleConnections()
	 * @generated
	 * @ordered
	 */
	protected boolean allowInBundleConnections = ALLOW_IN_BUNDLE_CONNECTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOverviewContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsgivizmodelPackage.Literals.SERVICE_OVERVIEW_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IVisualizationContext<?>> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<IVisualizationContext<?>>(IVisualizationContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__PARENT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Object> getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (EList<Object>)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelElement(EList<Object> newModelElement) {
		EList<Object> oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVisualizationContext<?> getParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisualizationContext<?> basicGetParent() {
		if (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT) return null;
		return (IVisualizationContext<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IVisualizationContext<?> newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(IVisualizationContext<?> newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__CHILD_CONTEXTS, IVisualizationContext.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExpanded() {
		return expanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpanded(boolean newExpanded) {
		boolean oldExpanded = expanded;
		expanded = newExpanded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__EXPANDED, oldExpanded, expanded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceComponentContext> getCollapsedServiceComponentContexts() {
		if (collapsedServiceComponentContexts == null) {
			collapsedServiceComponentContexts = new EObjectResolvingEList<ServiceComponentContext>(ServiceComponentContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS);
		}
		return collapsedServiceComponentContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceComponentContext> getDetailedServiceComponentContexts() {
		if (detailedServiceComponentContexts == null) {
			detailedServiceComponentContexts = new EObjectResolvingEList<ServiceComponentContext>(ServiceComponentContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS);
		}
		return detailedServiceComponentContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInterfaceContext> getCollapsedServiceInterfaceContexts() {
		if (collapsedServiceInterfaceContexts == null) {
			collapsedServiceInterfaceContexts = new EObjectResolvingEList<ServiceInterfaceContext>(ServiceInterfaceContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS);
		}
		return collapsedServiceInterfaceContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInterfaceContext> getDetailedServiceInterfaceContexts() {
		if (detailedServiceInterfaceContexts == null) {
			detailedServiceInterfaceContexts = new EObjectResolvingEList<ServiceInterfaceContext>(ServiceInterfaceContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS);
		}
		return detailedServiceInterfaceContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassContext> getCollapsedClassContexts() {
		if (collapsedClassContexts == null) {
			collapsedClassContexts = new EObjectResolvingEList<ClassContext>(ClassContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS);
		}
		return collapsedClassContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class>(de.cau.cs.kieler.osgiviz.osgivizmodel.Class.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassContext> getDetailedClassContexts() {
		if (detailedClassContexts == null) {
			detailedClassContexts = new EObjectResolvingEList<ClassContext>(ClassContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS);
		}
		return detailedClassContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleContext> getCollapsedReferencedBundleContexts() {
		if (collapsedReferencedBundleContexts == null) {
			collapsedReferencedBundleContexts = new EObjectResolvingEList<BundleContext>(BundleContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS);
		}
		return collapsedReferencedBundleContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BundleContext> getDetailedReferencedBundleContexts() {
		if (detailedReferencedBundleContexts == null) {
			detailedReferencedBundleContexts = new EObjectResolvingEList<BundleContext>(BundleContext.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS);
		}
		return detailedReferencedBundleContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pair<ServiceComponentContext, ServiceInterfaceContext>> getImplementedInterfaceEdgesPlain() {
		if (implementedInterfaceEdgesPlain == null) {
			implementedInterfaceEdgesPlain = new EObjectResolvingEList<Pair<ServiceComponentContext, ServiceInterfaceContext>>(Pair.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN);
		}
		return implementedInterfaceEdgesPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pair<ServiceComponentContext, ServiceInterfaceContext>> getImplementedInterfaceEdgesInBundles() {
		if (implementedInterfaceEdgesInBundles == null) {
			implementedInterfaceEdgesInBundles = new EObjectResolvingEList<Pair<ServiceComponentContext, ServiceInterfaceContext>>(Pair.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES);
		}
		return implementedInterfaceEdgesInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferencedInterfaceEdgeConnection> getReferencedInterfaceEdgesPlain() {
		if (referencedInterfaceEdgesPlain == null) {
			referencedInterfaceEdgesPlain = new EObjectResolvingEList<ReferencedInterfaceEdgeConnection>(ReferencedInterfaceEdgeConnection.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN);
		}
		return referencedInterfaceEdgesPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferencedInterfaceEdgeConnection> getReferencedInterfaceEdgesInBundles() {
		if (referencedInterfaceEdgesInBundles == null) {
			referencedInterfaceEdgesInBundles = new EObjectResolvingEList<ReferencedInterfaceEdgeConnection>(ReferencedInterfaceEdgeConnection.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES);
		}
		return referencedInterfaceEdgesInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pair<ClassContext, ServiceInterfaceContext>> getInjectedInterfaceEdgesPlain() {
		if (injectedInterfaceEdgesPlain == null) {
			injectedInterfaceEdgesPlain = new EObjectResolvingEList<Pair<ClassContext, ServiceInterfaceContext>>(Pair.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN);
		}
		return injectedInterfaceEdgesPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pair<ClassContext, ServiceInterfaceContext>> getInjectedInterfaceEdgesInBundles() {
		if (injectedInterfaceEdgesInBundles == null) {
			injectedInterfaceEdgesInBundles = new EObjectResolvingEList<Pair<ClassContext, ServiceInterfaceContext>>(Pair.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES);
		}
		return injectedInterfaceEdgesInBundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceComponent> getServiceComponents() {
		if (serviceComponents == null) {
			serviceComponents = new EObjectResolvingEList<ServiceComponent>(ServiceComponent.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS);
		}
		return serviceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceInterface> getServiceInterfaces() {
		if (serviceInterfaces == null) {
			serviceInterfaces = new EObjectResolvingEList<ServiceInterface>(ServiceInterface.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES);
		}
		return serviceInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class> getClassesWithInjections() {
		if (classesWithInjections == null) {
			classesWithInjections = new EObjectResolvingEList<de.cau.cs.kieler.osgiviz.osgivizmodel.Class>(de.cau.cs.kieler.osgiviz.osgivizmodel.Class.class, this, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS);
		}
		return classesWithInjections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowInBundleConnections() {
		return allowInBundleConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowInBundleConnections(boolean newAllowInBundleConnections) {
		boolean oldAllowInBundleConnections = allowInBundleConnections;
		allowInBundleConnections = newAllowInBundleConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS, oldAllowInBundleConnections, allowInBundleConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IVisualizationContext<?>)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT:
				return basicSetParent(null, msgs);
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT:
				return eInternalContainer().eInverseRemove(this, OsgivizmodelPackage.IVISUALIZATION_CONTEXT__CHILD_CONTEXTS, IVisualizationContext.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__EXPANDED:
				return isExpanded();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS:
				return getCollapsedServiceComponentContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS:
				return getDetailedServiceComponentContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS:
				return getCollapsedServiceInterfaceContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS:
				return getDetailedServiceInterfaceContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS:
				return getCollapsedClassContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES:
				return getClasses();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS:
				return getDetailedClassContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS:
				return getCollapsedReferencedBundleContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS:
				return getDetailedReferencedBundleContexts();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN:
				return getImplementedInterfaceEdgesPlain();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES:
				return getImplementedInterfaceEdgesInBundles();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN:
				return getReferencedInterfaceEdgesPlain();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES:
				return getReferencedInterfaceEdgesInBundles();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN:
				return getInjectedInterfaceEdgesPlain();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES:
				return getInjectedInterfaceEdgesInBundles();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS:
				return getServiceComponents();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES:
				return getServiceInterfaces();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS:
				return getClassesWithInjections();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS:
				return isAllowInBundleConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends IVisualizationContext<?>>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<Object>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded((Boolean)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS:
				getCollapsedServiceComponentContexts().clear();
				getCollapsedServiceComponentContexts().addAll((Collection<? extends ServiceComponentContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS:
				getDetailedServiceComponentContexts().clear();
				getDetailedServiceComponentContexts().addAll((Collection<? extends ServiceComponentContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS:
				getCollapsedServiceInterfaceContexts().clear();
				getCollapsedServiceInterfaceContexts().addAll((Collection<? extends ServiceInterfaceContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS:
				getDetailedServiceInterfaceContexts().clear();
				getDetailedServiceInterfaceContexts().addAll((Collection<? extends ServiceInterfaceContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS:
				getCollapsedClassContexts().clear();
				getCollapsedClassContexts().addAll((Collection<? extends ClassContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends de.cau.cs.kieler.osgiviz.osgivizmodel.Class>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS:
				getDetailedClassContexts().clear();
				getDetailedClassContexts().addAll((Collection<? extends ClassContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS:
				getCollapsedReferencedBundleContexts().clear();
				getCollapsedReferencedBundleContexts().addAll((Collection<? extends BundleContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS:
				getDetailedReferencedBundleContexts().clear();
				getDetailedReferencedBundleContexts().addAll((Collection<? extends BundleContext>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN:
				getImplementedInterfaceEdgesPlain().clear();
				getImplementedInterfaceEdgesPlain().addAll((Collection<? extends Pair<ServiceComponentContext, ServiceInterfaceContext>>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES:
				getImplementedInterfaceEdgesInBundles().clear();
				getImplementedInterfaceEdgesInBundles().addAll((Collection<? extends Pair<ServiceComponentContext, ServiceInterfaceContext>>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN:
				getReferencedInterfaceEdgesPlain().clear();
				getReferencedInterfaceEdgesPlain().addAll((Collection<? extends ReferencedInterfaceEdgeConnection>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES:
				getReferencedInterfaceEdgesInBundles().clear();
				getReferencedInterfaceEdgesInBundles().addAll((Collection<? extends ReferencedInterfaceEdgeConnection>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN:
				getInjectedInterfaceEdgesPlain().clear();
				getInjectedInterfaceEdgesPlain().addAll((Collection<? extends Pair<ClassContext, ServiceInterfaceContext>>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES:
				getInjectedInterfaceEdgesInBundles().clear();
				getInjectedInterfaceEdgesInBundles().addAll((Collection<? extends Pair<ClassContext, ServiceInterfaceContext>>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				getServiceComponents().addAll((Collection<? extends ServiceComponent>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES:
				getServiceInterfaces().clear();
				getServiceInterfaces().addAll((Collection<? extends ServiceInterface>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS:
				getClassesWithInjections().clear();
				getClassesWithInjections().addAll((Collection<? extends de.cau.cs.kieler.osgiviz.osgivizmodel.Class>)newValue);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS:
				setAllowInBundleConnections((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				setModelElement((EList<Object>)null);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT:
				setParent((IVisualizationContext<?>)null);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS:
				getCollapsedServiceComponentContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS:
				getDetailedServiceComponentContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS:
				getCollapsedServiceInterfaceContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS:
				getDetailedServiceInterfaceContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS:
				getCollapsedClassContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES:
				getClasses().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS:
				getDetailedClassContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS:
				getCollapsedReferencedBundleContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS:
				getDetailedReferencedBundleContexts().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN:
				getImplementedInterfaceEdgesPlain().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES:
				getImplementedInterfaceEdgesInBundles().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN:
				getReferencedInterfaceEdgesPlain().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES:
				getReferencedInterfaceEdgesInBundles().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN:
				getInjectedInterfaceEdgesPlain().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES:
				getInjectedInterfaceEdgesInBundles().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS:
				getServiceComponents().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES:
				getServiceInterfaces().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS:
				getClassesWithInjections().clear();
				return;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS:
				setAllowInBundleConnections(ALLOW_IN_BUNDLE_CONNECTIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__PARENT:
				return basicGetParent() != null;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__EXPANDED:
				return expanded != EXPANDED_EDEFAULT;
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS:
				return collapsedServiceComponentContexts != null && !collapsedServiceComponentContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS:
				return detailedServiceComponentContexts != null && !detailedServiceComponentContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS:
				return collapsedServiceInterfaceContexts != null && !collapsedServiceInterfaceContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS:
				return detailedServiceInterfaceContexts != null && !detailedServiceInterfaceContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS:
				return collapsedClassContexts != null && !collapsedClassContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES:
				return classes != null && !classes.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS:
				return detailedClassContexts != null && !detailedClassContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS:
				return collapsedReferencedBundleContexts != null && !collapsedReferencedBundleContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS:
				return detailedReferencedBundleContexts != null && !detailedReferencedBundleContexts.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN:
				return implementedInterfaceEdgesPlain != null && !implementedInterfaceEdgesPlain.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES:
				return implementedInterfaceEdgesInBundles != null && !implementedInterfaceEdgesInBundles.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN:
				return referencedInterfaceEdgesPlain != null && !referencedInterfaceEdgesPlain.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES:
				return referencedInterfaceEdgesInBundles != null && !referencedInterfaceEdgesInBundles.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN:
				return injectedInterfaceEdgesPlain != null && !injectedInterfaceEdgesPlain.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES:
				return injectedInterfaceEdgesInBundles != null && !injectedInterfaceEdgesInBundles.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS:
				return serviceComponents != null && !serviceComponents.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES:
				return serviceInterfaces != null && !serviceInterfaces.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS:
				return classesWithInjections != null && !classesWithInjections.isEmpty();
			case OsgivizmodelPackage.SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS:
				return allowInBundleConnections != ALLOW_IN_BUNDLE_CONNECTIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (expanded: ");
		result.append(expanded);
		result.append(", allowInBundleConnections: ");
		result.append(allowInBundleConnections);
		result.append(')');
		return result.toString();
	}

} //ServiceOverviewContextImpl
