/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel.impl;

import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelFactory;
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage;
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.Pair;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext;
import de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection;
import de.scheidtbachmann.osgimodel.OsgimodelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsgivizmodelPackageImpl extends EPackageImpl implements OsgivizmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iVisualizationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iOverviewVisualizationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleCategoryContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceComponentContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageObjectContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usedPackagesOfBundleEdgeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOverviewContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOverviewContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleOverviewContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleCategoryOverviewContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedInterfaceEdgeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOverviewContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageObjectOverviewContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osgiVizEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OsgivizmodelPackageImpl() {
		super(eNS_URI, OsgivizmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OsgivizmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OsgivizmodelPackage init() {
		if (isInited) return (OsgivizmodelPackage)EPackage.Registry.INSTANCE.getEPackage(OsgivizmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOsgivizmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OsgivizmodelPackageImpl theOsgivizmodelPackage = registeredOsgivizmodelPackage instanceof OsgivizmodelPackageImpl ? (OsgivizmodelPackageImpl)registeredOsgivizmodelPackage : new OsgivizmodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		OsgimodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOsgivizmodelPackage.createPackageContents();

		// Initialize created meta-data
		theOsgivizmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOsgivizmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsgivizmodelPackage.eNS_URI, theOsgivizmodelPackage);
		return theOsgivizmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIVisualizationContext() {
		return iVisualizationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIVisualizationContext_ChildContexts() {
		return (EReference)iVisualizationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIVisualizationContext_ModelElement() {
		return (EReference)iVisualizationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIVisualizationContext_Parent() {
		return (EReference)iVisualizationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIOverviewVisualizationContext() {
		return iOverviewVisualizationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIOverviewVisualizationContext_Expanded() {
		return (EAttribute)iOverviewVisualizationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_Bundle() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClass_ClassPath() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClass_InjectedInterfaces() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPair() {
		return pairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPair_Key() {
		return (EReference)pairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPair_Value() {
		return (EReference)pairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductContext() {
		return productContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContext_FeatureOverviewContext() {
		return (EReference)productContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContext_BundleOverviewContext() {
		return (EReference)productContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContext_ServiceOverviewContext() {
		return (EReference)productContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureContext() {
		return featureContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureContext_BundleOverviewContext() {
		return (EReference)featureContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleContext() {
		return bundleContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleContext_ClassesWithInjections() {
		return (EReference)bundleContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundleContext_AllRequiredBundlesShown() {
		return (EAttribute)bundleContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundleContext_AllRequiringBundlesShown() {
		return (EAttribute)bundleContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBundleContext_AllUsedPackagesShown() {
		return (EAttribute)bundleContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleContext_ServiceOverviewContext() {
		return (EReference)bundleContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleCategoryContext() {
		return bundleCategoryContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleCategoryContext_BundleOverviewContext() {
		return (EReference)bundleCategoryContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassContext() {
		return classContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassContext_AllInjectedInterfacesShownPlain() {
		return (EAttribute)classContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassContext_AllInjectedInterfacesShownInBundles() {
		return (EAttribute)classContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceComponentContext() {
		return serviceComponentContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponentContext_AllImplementedInterfacesShownPlain() {
		return (EAttribute)serviceComponentContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponentContext_AllImplementedInterfacesShownInBundles() {
		return (EAttribute)serviceComponentContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponentContext_AllReferencedInterfacesShownPlain() {
		return (EAttribute)serviceComponentContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceComponentContext_AllReferencedInterfacesShownInBundles() {
		return (EAttribute)serviceComponentContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInterfaceContext() {
		return serviceInterfaceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterfaceContext_AllImplementingComponentsShownPlain() {
		return (EAttribute)serviceInterfaceContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterfaceContext_AllImplementingComponentsShownInBundles() {
		return (EAttribute)serviceInterfaceContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterfaceContext_AllReferencingComponentsShownPlain() {
		return (EAttribute)serviceInterfaceContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterfaceContext_AllReferencingComponentsShownInBundles() {
		return (EAttribute)serviceInterfaceContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageObjectContext() {
		return packageObjectContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsedPackagesOfBundleEdgeConnection() {
		return usedPackagesOfBundleEdgeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsedPackagesOfBundleEdgeConnection_SourceBundleContext() {
		return (EReference)usedPackagesOfBundleEdgeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsedPackagesOfBundleEdgeConnection_UsedPackages() {
		return (EReference)usedPackagesOfBundleEdgeConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsedPackagesOfBundleEdgeConnection_Product() {
		return (EReference)usedPackagesOfBundleEdgeConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsedPackagesOfBundleEdgeConnection_TargetBundleContext() {
		return (EReference)usedPackagesOfBundleEdgeConnectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductOverviewContext() {
		return productOverviewContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOverviewContext_DetailedProductContexts() {
		return (EReference)productOverviewContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOverviewContext_CollapsedProductContexts() {
		return (EReference)productOverviewContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOverviewContext_Products() {
		return (EReference)productOverviewContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureOverviewContext() {
		return featureOverviewContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureOverviewContext_CollapsedFeatureContexts() {
		return (EReference)featureOverviewContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureOverviewContext_DetailedFeatureContexts() {
		return (EReference)featureOverviewContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureOverviewContext_Features() {
		return (EReference)featureOverviewContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleOverviewContext() {
		return bundleOverviewContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleOverviewContext_RequiredBundleEdges() {
		return (EReference)bundleOverviewContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleOverviewContext_UsedPackagesOfBundleEdges() {
		return (EReference)bundleOverviewContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleOverviewContext_UsedPackageEdges() {
		return (EReference)bundleOverviewContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleOverviewContext_CollapsedBundleContexts() {
		return (EReference)bundleOverviewContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleOverviewContext_DetailedBundleContexts() {
		return (EReference)bundleOverviewContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleOverviewContext_UsedPackageContexts() {
		return (EReference)bundleOverviewContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleOverviewContext_Bundles() {
		return (EReference)bundleOverviewContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBundleCategoryOverviewContext() {
		return bundleCategoryOverviewContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleCategoryOverviewContext_CollapsedBundleCategoryContexts() {
		return (EReference)bundleCategoryOverviewContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleCategoryOverviewContext_DetailedBundleCategoryContexts() {
		return (EReference)bundleCategoryOverviewContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBundleCategoryOverviewContext_BundleCategories() {
		return (EReference)bundleCategoryOverviewContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferencedInterfaceEdgeConnection() {
		return referencedInterfaceEdgeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencedInterfaceEdgeConnection_ServiceComponentContext() {
		return (EReference)referencedInterfaceEdgeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencedInterfaceEdgeConnection_ServiceInterfaceContext() {
		return (EReference)referencedInterfaceEdgeConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencedInterfaceEdgeConnection_Reference() {
		return (EReference)referencedInterfaceEdgeConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceOverviewContext() {
		return serviceOverviewContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_CollapsedServiceComponentContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_DetailedServiceComponentContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_CollapsedServiceInterfaceContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_DetailedServiceInterfaceContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_CollapsedClassContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_Classes() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_DetailedClassContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_CollapsedReferencedBundleContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_DetailedReferencedBundleContexts() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_ImplementedInterfaceEdgesPlain() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_ImplementedInterfaceEdgesInBundles() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_ReferencedInterfaceEdgesPlain() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_ReferencedInterfaceEdgesInBundles() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_InjectedInterfaceEdgesPlain() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_InjectedInterfaceEdgesInBundles() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_ServiceComponents() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_ServiceInterfaces() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceOverviewContext_ClassesWithInjections() {
		return (EReference)serviceOverviewContextEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceOverviewContext_AllowInBundleConnections() {
		return (EAttribute)serviceOverviewContextEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageObjectOverviewContext() {
		return packageObjectOverviewContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageObjectOverviewContext_CollapsedPackageObjectContexts() {
		return (EReference)packageObjectOverviewContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageObjectOverviewContext_DetailedPackageObjectContexts() {
		return (EReference)packageObjectOverviewContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageObjectOverviewContext_PackageObjects() {
		return (EReference)packageObjectOverviewContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsgiViz() {
		return osgiVizEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiViz_BundleOverviewContext() {
		return (EReference)osgiVizEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiViz_ProductOverviewContext() {
		return (EReference)osgiVizEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiViz_ServiceOverviewContext() {
		return (EReference)osgiVizEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiViz_FeatureOverviewContext() {
		return (EReference)osgiVizEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiViz_ImportedPackageOverviewContext() {
		return (EReference)osgiVizEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsgiViz_BundleCategoryOverviewContext() {
		return (EReference)osgiVizEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsgivizmodelFactory getOsgivizmodelFactory() {
		return (OsgivizmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iVisualizationContextEClass = createEClass(IVISUALIZATION_CONTEXT);
		createEReference(iVisualizationContextEClass, IVISUALIZATION_CONTEXT__CHILD_CONTEXTS);
		createEReference(iVisualizationContextEClass, IVISUALIZATION_CONTEXT__MODEL_ELEMENT);
		createEReference(iVisualizationContextEClass, IVISUALIZATION_CONTEXT__PARENT);

		iOverviewVisualizationContextEClass = createEClass(IOVERVIEW_VISUALIZATION_CONTEXT);
		createEAttribute(iOverviewVisualizationContextEClass, IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__BUNDLE);
		createEAttribute(classEClass, CLASS__CLASS_PATH);
		createEReference(classEClass, CLASS__INJECTED_INTERFACES);

		pairEClass = createEClass(PAIR);
		createEReference(pairEClass, PAIR__KEY);
		createEReference(pairEClass, PAIR__VALUE);

		productContextEClass = createEClass(PRODUCT_CONTEXT);
		createEReference(productContextEClass, PRODUCT_CONTEXT__FEATURE_OVERVIEW_CONTEXT);
		createEReference(productContextEClass, PRODUCT_CONTEXT__BUNDLE_OVERVIEW_CONTEXT);
		createEReference(productContextEClass, PRODUCT_CONTEXT__SERVICE_OVERVIEW_CONTEXT);

		featureContextEClass = createEClass(FEATURE_CONTEXT);
		createEReference(featureContextEClass, FEATURE_CONTEXT__BUNDLE_OVERVIEW_CONTEXT);

		bundleContextEClass = createEClass(BUNDLE_CONTEXT);
		createEReference(bundleContextEClass, BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS);
		createEAttribute(bundleContextEClass, BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN);
		createEAttribute(bundleContextEClass, BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN);
		createEAttribute(bundleContextEClass, BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN);
		createEReference(bundleContextEClass, BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT);

		bundleCategoryContextEClass = createEClass(BUNDLE_CATEGORY_CONTEXT);
		createEReference(bundleCategoryContextEClass, BUNDLE_CATEGORY_CONTEXT__BUNDLE_OVERVIEW_CONTEXT);

		classContextEClass = createEClass(CLASS_CONTEXT);
		createEAttribute(classContextEClass, CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN);
		createEAttribute(classContextEClass, CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES);

		serviceComponentContextEClass = createEClass(SERVICE_COMPONENT_CONTEXT);
		createEAttribute(serviceComponentContextEClass, SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN);
		createEAttribute(serviceComponentContextEClass, SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES);
		createEAttribute(serviceComponentContextEClass, SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN);
		createEAttribute(serviceComponentContextEClass, SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES);

		serviceInterfaceContextEClass = createEClass(SERVICE_INTERFACE_CONTEXT);
		createEAttribute(serviceInterfaceContextEClass, SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN);
		createEAttribute(serviceInterfaceContextEClass, SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES);
		createEAttribute(serviceInterfaceContextEClass, SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN);
		createEAttribute(serviceInterfaceContextEClass, SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES);

		packageObjectContextEClass = createEClass(PACKAGE_OBJECT_CONTEXT);

		usedPackagesOfBundleEdgeConnectionEClass = createEClass(USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION);
		createEReference(usedPackagesOfBundleEdgeConnectionEClass, USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT);
		createEReference(usedPackagesOfBundleEdgeConnectionEClass, USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES);
		createEReference(usedPackagesOfBundleEdgeConnectionEClass, USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT);
		createEReference(usedPackagesOfBundleEdgeConnectionEClass, USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT);

		productOverviewContextEClass = createEClass(PRODUCT_OVERVIEW_CONTEXT);
		createEReference(productOverviewContextEClass, PRODUCT_OVERVIEW_CONTEXT__DETAILED_PRODUCT_CONTEXTS);
		createEReference(productOverviewContextEClass, PRODUCT_OVERVIEW_CONTEXT__COLLAPSED_PRODUCT_CONTEXTS);
		createEReference(productOverviewContextEClass, PRODUCT_OVERVIEW_CONTEXT__PRODUCTS);

		featureOverviewContextEClass = createEClass(FEATURE_OVERVIEW_CONTEXT);
		createEReference(featureOverviewContextEClass, FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS);
		createEReference(featureOverviewContextEClass, FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS);
		createEReference(featureOverviewContextEClass, FEATURE_OVERVIEW_CONTEXT__FEATURES);

		bundleOverviewContextEClass = createEClass(BUNDLE_OVERVIEW_CONTEXT);
		createEReference(bundleOverviewContextEClass, BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES);
		createEReference(bundleOverviewContextEClass, BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES);
		createEReference(bundleOverviewContextEClass, BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES);
		createEReference(bundleOverviewContextEClass, BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS);
		createEReference(bundleOverviewContextEClass, BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS);
		createEReference(bundleOverviewContextEClass, BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS);
		createEReference(bundleOverviewContextEClass, BUNDLE_OVERVIEW_CONTEXT__BUNDLES);

		bundleCategoryOverviewContextEClass = createEClass(BUNDLE_CATEGORY_OVERVIEW_CONTEXT);
		createEReference(bundleCategoryOverviewContextEClass, BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS);
		createEReference(bundleCategoryOverviewContextEClass, BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS);
		createEReference(bundleCategoryOverviewContextEClass, BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES);

		referencedInterfaceEdgeConnectionEClass = createEClass(REFERENCED_INTERFACE_EDGE_CONNECTION);
		createEReference(referencedInterfaceEdgeConnectionEClass, REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT);
		createEReference(referencedInterfaceEdgeConnectionEClass, REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT);
		createEReference(referencedInterfaceEdgeConnectionEClass, REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE);

		serviceOverviewContextEClass = createEClass(SERVICE_OVERVIEW_CONTEXT);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__CLASSES);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES);
		createEReference(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS);
		createEAttribute(serviceOverviewContextEClass, SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS);

		packageObjectOverviewContextEClass = createEClass(PACKAGE_OBJECT_OVERVIEW_CONTEXT);
		createEReference(packageObjectOverviewContextEClass, PACKAGE_OBJECT_OVERVIEW_CONTEXT__COLLAPSED_PACKAGE_OBJECT_CONTEXTS);
		createEReference(packageObjectOverviewContextEClass, PACKAGE_OBJECT_OVERVIEW_CONTEXT__DETAILED_PACKAGE_OBJECT_CONTEXTS);
		createEReference(packageObjectOverviewContextEClass, PACKAGE_OBJECT_OVERVIEW_CONTEXT__PACKAGE_OBJECTS);

		osgiVizEClass = createEClass(OSGI_VIZ);
		createEReference(osgiVizEClass, OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT);
		createEReference(osgiVizEClass, OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT);
		createEReference(osgiVizEClass, OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT);
		createEReference(osgiVizEClass, OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT);
		createEReference(osgiVizEClass, OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT);
		createEReference(osgiVizEClass, OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		OsgimodelPackage theOsgimodelPackage = (OsgimodelPackage)EPackage.Registry.INSTANCE.getEPackage(OsgimodelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter iVisualizationContextEClass_M = addETypeParameter(iVisualizationContextEClass, "M");
		ETypeParameter iOverviewVisualizationContextEClass_M = addETypeParameter(iOverviewVisualizationContextEClass, "M");
		ETypeParameter pairEClass_K = addETypeParameter(pairEClass, "K");
		ETypeParameter pairEClass_V = addETypeParameter(pairEClass, "V");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getIVisualizationContext());
		EGenericType g2 = createEGenericType(theEcorePackage.getEEList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(iOverviewVisualizationContextEClass_M);
		g2.getETypeArguments().add(g3);
		iOverviewVisualizationContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getProduct());
		g1.getETypeArguments().add(g2);
		productContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getFeature());
		g1.getETypeArguments().add(g2);
		featureContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getBundle());
		g1.getETypeArguments().add(g2);
		bundleContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getBundleCategory());
		g1.getETypeArguments().add(g2);
		bundleCategoryContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(this.getClass_());
		g1.getETypeArguments().add(g2);
		classContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getServiceComponent());
		g1.getETypeArguments().add(g2);
		serviceComponentContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getServiceInterface());
		g1.getETypeArguments().add(g2);
		serviceInterfaceContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getPackageObject());
		g1.getETypeArguments().add(g2);
		packageObjectContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIOverviewVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getProduct());
		g1.getETypeArguments().add(g2);
		productOverviewContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIOverviewVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getFeature());
		g1.getETypeArguments().add(g2);
		featureOverviewContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIOverviewVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getBundle());
		g1.getETypeArguments().add(g2);
		bundleOverviewContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIOverviewVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getBundleCategory());
		g1.getETypeArguments().add(g2);
		bundleCategoryOverviewContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIOverviewVisualizationContext());
		g2 = createEGenericType(theEcorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		serviceOverviewContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIOverviewVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getPackageObject());
		g1.getETypeArguments().add(g2);
		packageObjectOverviewContextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType(theOsgimodelPackage.getOsgiProject());
		g1.getETypeArguments().add(g2);
		osgiVizEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(iVisualizationContextEClass, IVisualizationContext.class, "IVisualizationContext", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getIVisualizationContext_ChildContexts(), g1, this.getIVisualizationContext_Parent(), "childContexts", null, 0, -1, IVisualizationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(iVisualizationContextEClass_M);
		initEReference(getIVisualizationContext_ModelElement(), g1, null, "modelElement", null, 0, 1, IVisualizationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getIVisualizationContext());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getIVisualizationContext_Parent(), g1, this.getIVisualizationContext_ChildContexts(), "parent", null, 0, 1, IVisualizationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iOverviewVisualizationContextEClass, IOverviewVisualizationContext.class, "IOverviewVisualizationContext", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOverviewVisualizationContext_Expanded(), theEcorePackage.getEBoolean(), "expanded", "false", 0, 1, IOverviewVisualizationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, de.cau.cs.kieler.osgiviz.osgivizmodel.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_Bundle(), theOsgimodelPackage.getBundle(), null, "bundle", null, 0, 1, de.cau.cs.kieler.osgiviz.osgivizmodel.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_ClassPath(), theEcorePackage.getEString(), "classPath", null, 0, 1, de.cau.cs.kieler.osgiviz.osgivizmodel.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_InjectedInterfaces(), theOsgimodelPackage.getServiceInterface(), null, "injectedInterfaces", null, 0, -1, de.cau.cs.kieler.osgiviz.osgivizmodel.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pairEClass, Pair.class, "Pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(pairEClass_K);
		initEReference(getPair_Key(), g1, null, "key", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(pairEClass_V);
		initEReference(getPair_Value(), g1, null, "value", null, 0, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productContextEClass, ProductContext.class, "ProductContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductContext_FeatureOverviewContext(), this.getFeatureOverviewContext(), null, "featureOverviewContext", null, 0, 1, ProductContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContext_BundleOverviewContext(), this.getBundleOverviewContext(), null, "bundleOverviewContext", null, 0, 1, ProductContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContext_ServiceOverviewContext(), this.getServiceOverviewContext(), null, "serviceOverviewContext", null, 0, 1, ProductContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureContextEClass, FeatureContext.class, "FeatureContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureContext_BundleOverviewContext(), this.getBundleOverviewContext(), null, "bundleOverviewContext", null, 0, 1, FeatureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleContextEClass, BundleContext.class, "BundleContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleContext_ClassesWithInjections(), this.getClass_(), null, "classesWithInjections", null, 0, -1, BundleContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleContext_AllRequiredBundlesShown(), theEcorePackage.getEBoolean(), "allRequiredBundlesShown", null, 0, 1, BundleContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleContext_AllRequiringBundlesShown(), theEcorePackage.getEBoolean(), "allRequiringBundlesShown", null, 0, 1, BundleContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleContext_AllUsedPackagesShown(), theEcorePackage.getEBoolean(), "allUsedPackagesShown", null, 0, 1, BundleContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleContext_ServiceOverviewContext(), this.getServiceOverviewContext(), null, "serviceOverviewContext", null, 0, 1, BundleContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleCategoryContextEClass, BundleCategoryContext.class, "BundleCategoryContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleCategoryContext_BundleOverviewContext(), this.getBundleOverviewContext(), null, "bundleOverviewContext", null, 0, 1, BundleCategoryContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classContextEClass, ClassContext.class, "ClassContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassContext_AllInjectedInterfacesShownPlain(), theEcorePackage.getEBoolean(), "allInjectedInterfacesShownPlain", null, 0, 1, ClassContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassContext_AllInjectedInterfacesShownInBundles(), theEcorePackage.getEBoolean(), "allInjectedInterfacesShownInBundles", null, 0, 1, ClassContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceComponentContextEClass, ServiceComponentContext.class, "ServiceComponentContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceComponentContext_AllImplementedInterfacesShownPlain(), theEcorePackage.getEBoolean(), "allImplementedInterfacesShownPlain", null, 0, 1, ServiceComponentContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponentContext_AllImplementedInterfacesShownInBundles(), theEcorePackage.getEBoolean(), "allImplementedInterfacesShownInBundles", null, 0, 1, ServiceComponentContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponentContext_AllReferencedInterfacesShownPlain(), theEcorePackage.getEBoolean(), "allReferencedInterfacesShownPlain", null, 0, 1, ServiceComponentContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceComponentContext_AllReferencedInterfacesShownInBundles(), theEcorePackage.getEBoolean(), "allReferencedInterfacesShownInBundles", null, 0, 1, ServiceComponentContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceContextEClass, ServiceInterfaceContext.class, "ServiceInterfaceContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterfaceContext_AllImplementingComponentsShownPlain(), theEcorePackage.getEBoolean(), "allImplementingComponentsShownPlain", null, 0, 1, ServiceInterfaceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterfaceContext_AllImplementingComponentsShownInBundles(), theEcorePackage.getEBoolean(), "allImplementingComponentsShownInBundles", null, 0, 1, ServiceInterfaceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterfaceContext_AllReferencingComponentsShownPlain(), theEcorePackage.getEBoolean(), "allReferencingComponentsShownPlain", null, 0, 1, ServiceInterfaceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterfaceContext_AllReferencingComponentsShownInBundles(), theEcorePackage.getEBoolean(), "allReferencingComponentsShownInBundles", null, 0, 1, ServiceInterfaceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageObjectContextEClass, PackageObjectContext.class, "PackageObjectContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usedPackagesOfBundleEdgeConnectionEClass, UsedPackagesOfBundleEdgeConnection.class, "UsedPackagesOfBundleEdgeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsedPackagesOfBundleEdgeConnection_SourceBundleContext(), this.getBundleContext(), null, "sourceBundleContext", null, 0, 1, UsedPackagesOfBundleEdgeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsedPackagesOfBundleEdgeConnection_UsedPackages(), theOsgimodelPackage.getPackageObject(), null, "usedPackages", null, 0, -1, UsedPackagesOfBundleEdgeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsedPackagesOfBundleEdgeConnection_Product(), theOsgimodelPackage.getProduct(), null, "product", null, 0, 1, UsedPackagesOfBundleEdgeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsedPackagesOfBundleEdgeConnection_TargetBundleContext(), this.getBundleContext(), null, "targetBundleContext", null, 0, 1, UsedPackagesOfBundleEdgeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productOverviewContextEClass, ProductOverviewContext.class, "ProductOverviewContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductOverviewContext_DetailedProductContexts(), this.getProductContext(), null, "detailedProductContexts", null, 0, -1, ProductOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOverviewContext_CollapsedProductContexts(), this.getProductContext(), null, "collapsedProductContexts", null, 0, -1, ProductOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOverviewContext_Products(), theOsgimodelPackage.getProduct(), null, "products", null, 0, -1, ProductOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOverviewContextEClass, FeatureOverviewContext.class, "FeatureOverviewContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOverviewContext_CollapsedFeatureContexts(), this.getFeatureContext(), null, "collapsedFeatureContexts", null, 0, -1, FeatureOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOverviewContext_DetailedFeatureContexts(), this.getFeatureContext(), null, "detailedFeatureContexts", null, 0, -1, FeatureOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOverviewContext_Features(), theOsgimodelPackage.getFeature(), null, "features", null, 0, -1, FeatureOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleOverviewContextEClass, BundleOverviewContext.class, "BundleOverviewContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getPair());
		g2 = createEGenericType(this.getBundleContext());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getBundleContext());
		g1.getETypeArguments().add(g2);
		initEReference(getBundleOverviewContext_RequiredBundleEdges(), g1, null, "requiredBundleEdges", null, 0, -1, BundleOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleOverviewContext_UsedPackagesOfBundleEdges(), this.getUsedPackagesOfBundleEdgeConnection(), null, "usedPackagesOfBundleEdges", null, 0, -1, BundleOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPair());
		g2 = createEGenericType(this.getBundleContext());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getPackageObjectContext());
		g1.getETypeArguments().add(g2);
		initEReference(getBundleOverviewContext_UsedPackageEdges(), g1, null, "usedPackageEdges", null, 0, -1, BundleOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleOverviewContext_CollapsedBundleContexts(), this.getBundleContext(), null, "collapsedBundleContexts", null, 0, -1, BundleOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleOverviewContext_DetailedBundleContexts(), this.getBundleContext(), null, "detailedBundleContexts", null, 0, -1, BundleOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleOverviewContext_UsedPackageContexts(), this.getPackageObjectContext(), null, "usedPackageContexts", null, 0, -1, BundleOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleOverviewContext_Bundles(), theOsgimodelPackage.getBundle(), null, "bundles", null, 0, -1, BundleOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleCategoryOverviewContextEClass, BundleCategoryOverviewContext.class, "BundleCategoryOverviewContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleCategoryOverviewContext_CollapsedBundleCategoryContexts(), this.getBundleCategoryContext(), null, "collapsedBundleCategoryContexts", null, 0, -1, BundleCategoryOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleCategoryOverviewContext_DetailedBundleCategoryContexts(), this.getBundleCategoryContext(), null, "detailedBundleCategoryContexts", null, 0, -1, BundleCategoryOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleCategoryOverviewContext_BundleCategories(), theOsgimodelPackage.getBundleCategory(), null, "bundleCategories", null, 0, -1, BundleCategoryOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencedInterfaceEdgeConnectionEClass, ReferencedInterfaceEdgeConnection.class, "ReferencedInterfaceEdgeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencedInterfaceEdgeConnection_ServiceComponentContext(), this.getServiceComponentContext(), null, "serviceComponentContext", null, 0, 1, ReferencedInterfaceEdgeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencedInterfaceEdgeConnection_ServiceInterfaceContext(), this.getServiceInterfaceContext(), null, "serviceInterfaceContext", null, 0, 1, ReferencedInterfaceEdgeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencedInterfaceEdgeConnection_Reference(), theOsgimodelPackage.getReference(), null, "reference", null, 0, 1, ReferencedInterfaceEdgeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceOverviewContextEClass, ServiceOverviewContext.class, "ServiceOverviewContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceOverviewContext_CollapsedServiceComponentContexts(), this.getServiceComponentContext(), null, "collapsedServiceComponentContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_DetailedServiceComponentContexts(), this.getServiceComponentContext(), null, "detailedServiceComponentContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_CollapsedServiceInterfaceContexts(), this.getServiceInterfaceContext(), null, "collapsedServiceInterfaceContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_DetailedServiceInterfaceContexts(), this.getServiceInterfaceContext(), null, "detailedServiceInterfaceContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_CollapsedClassContexts(), this.getClassContext(), null, "collapsedClassContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_Classes(), this.getClass_(), null, "classes", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_DetailedClassContexts(), this.getClassContext(), null, "detailedClassContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_CollapsedReferencedBundleContexts(), this.getBundleContext(), null, "collapsedReferencedBundleContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_DetailedReferencedBundleContexts(), this.getBundleContext(), null, "detailedReferencedBundleContexts", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPair());
		g2 = createEGenericType(this.getServiceComponentContext());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getServiceInterfaceContext());
		g1.getETypeArguments().add(g2);
		initEReference(getServiceOverviewContext_ImplementedInterfaceEdgesPlain(), g1, null, "implementedInterfaceEdgesPlain", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPair());
		g2 = createEGenericType(this.getServiceComponentContext());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getServiceInterfaceContext());
		g1.getETypeArguments().add(g2);
		initEReference(getServiceOverviewContext_ImplementedInterfaceEdgesInBundles(), g1, null, "implementedInterfaceEdgesInBundles", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_ReferencedInterfaceEdgesPlain(), this.getReferencedInterfaceEdgeConnection(), null, "referencedInterfaceEdgesPlain", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_ReferencedInterfaceEdgesInBundles(), this.getReferencedInterfaceEdgeConnection(), null, "referencedInterfaceEdgesInBundles", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPair());
		g2 = createEGenericType(this.getClassContext());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getServiceInterfaceContext());
		g1.getETypeArguments().add(g2);
		initEReference(getServiceOverviewContext_InjectedInterfaceEdgesPlain(), g1, null, "injectedInterfaceEdgesPlain", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getPair());
		g2 = createEGenericType(this.getClassContext());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getServiceInterfaceContext());
		g1.getETypeArguments().add(g2);
		initEReference(getServiceOverviewContext_InjectedInterfaceEdgesInBundles(), g1, null, "injectedInterfaceEdgesInBundles", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_ServiceComponents(), theOsgimodelPackage.getServiceComponent(), null, "serviceComponents", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_ServiceInterfaces(), theOsgimodelPackage.getServiceInterface(), null, "serviceInterfaces", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceOverviewContext_ClassesWithInjections(), this.getClass_(), null, "classesWithInjections", null, 0, -1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceOverviewContext_AllowInBundleConnections(), theEcorePackage.getEBoolean(), "allowInBundleConnections", null, 0, 1, ServiceOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageObjectOverviewContextEClass, PackageObjectOverviewContext.class, "PackageObjectOverviewContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageObjectOverviewContext_CollapsedPackageObjectContexts(), this.getPackageObjectContext(), null, "collapsedPackageObjectContexts", null, 0, -1, PackageObjectOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageObjectOverviewContext_DetailedPackageObjectContexts(), this.getPackageObjectContext(), null, "detailedPackageObjectContexts", null, 0, -1, PackageObjectOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageObjectOverviewContext_PackageObjects(), theOsgimodelPackage.getPackageObject(), null, "packageObjects", null, 0, -1, PackageObjectOverviewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osgiVizEClass, OsgiViz.class, "OsgiViz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOsgiViz_BundleOverviewContext(), this.getBundleOverviewContext(), null, "bundleOverviewContext", null, 0, 1, OsgiViz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiViz_ProductOverviewContext(), this.getProductOverviewContext(), null, "productOverviewContext", null, 0, 1, OsgiViz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiViz_ServiceOverviewContext(), this.getServiceOverviewContext(), null, "serviceOverviewContext", null, 0, 1, OsgiViz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiViz_FeatureOverviewContext(), this.getFeatureOverviewContext(), null, "featureOverviewContext", null, 0, 1, OsgiViz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiViz_ImportedPackageOverviewContext(), this.getPackageObjectOverviewContext(), null, "importedPackageOverviewContext", null, 0, 1, OsgiViz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsgiViz_BundleCategoryOverviewContext(), this.getBundleCategoryOverviewContext(), null, "bundleCategoryOverviewContext", null, 0, 1, OsgiViz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OsgivizmodelPackageImpl
