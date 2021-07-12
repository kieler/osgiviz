/**
 */
package de.cau.cs.kieler.osgiviz.osgivizmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * <!-- end-model-doc -->
 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelFactory
 * @model kind="package"
 * @generated
 */
public interface OsgivizmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osgivizmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.cau.cs.kieler.osgiviz.osgivizmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "osgivizmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsgivizmodelPackage eINSTANCE = de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext <em>IVisualization Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getIVisualizationContext()
	 * @generated
	 */
	int IVISUALIZATION_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVISUALIZATION_CONTEXT__CHILD_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVISUALIZATION_CONTEXT__MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVISUALIZATION_CONTEXT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED = 3;

	/**
	 * The number of structural features of the '<em>IVisualization Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVISUALIZATION_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IVisualization Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVISUALIZATION_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext <em>IOverview Visualization Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getIOverviewVisualizationContext()
	 * @generated
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IOverview Visualization Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IOverview Visualization Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IOVERVIEW_VISUALIZATION_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 2;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BUNDLE = 0;

	/**
	 * The feature id for the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_PATH = 1;

	/**
	 * The feature id for the '<em><b>Injected Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INJECTED_INTERFACES = 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PairImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OptionImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductContextImpl <em>Product Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getProductContext()
	 * @generated
	 */
	int PRODUCT_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Feature Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT__FEATURE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT__BUNDLE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT__SERVICE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureContextImpl <em>Feature Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getFeatureContext()
	 * @generated
	 */
	int FEATURE_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Bundle Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__BUNDLE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl <em>Bundle Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleContext()
	 * @generated
	 */
	int BUNDLE_CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Classes With Injections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Required Bundles Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Requiring Bundles Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Used Packages Shown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bundle Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bundle Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryContextImpl <em>Bundle Category Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleCategoryContext()
	 * @generated
	 */
	int BUNDLE_CATEGORY_CONTEXT = 8;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Bundle Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_CONTEXT__BUNDLE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle Category Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bundle Category Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl <em>Class Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getClassContext()
	 * @generated
	 */
	int CLASS_CONTEXT = 9;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>All Injected Interfaces Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Injected Interfaces Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl <em>Service Component Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getServiceComponentContext()
	 * @generated
	 */
	int SERVICE_COMPONENT_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>All Implemented Interfaces Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Implemented Interfaces Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Referenced Interfaces Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Referenced Interfaces Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Component Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Component Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl <em>Service Interface Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getServiceInterfaceContext()
	 * @generated
	 */
	int SERVICE_INTERFACE_CONTEXT = 11;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>All Implementing Components Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Implementing Components Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Referencing Components Shown Plain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Referencing Components Shown In Bundles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Interface Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Interface Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectContextImpl <em>Package Object Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getPackageObjectContext()
	 * @generated
	 */
	int PACKAGE_OBJECT_CONTEXT = 12;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_CONTEXT__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_CONTEXT__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_CONTEXT__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_CONTEXT__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The number of structural features of the '<em>Package Object Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_CONTEXT_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package Object Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_CONTEXT_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl <em>Used Packages Of Bundle Edge Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getUsedPackagesOfBundleEdgeConnection()
	 * @generated
	 */
	int USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Source Bundle Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Used Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES = 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Target Bundle Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Used Packages Of Bundle Edge Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Used Packages Of Bundle Edge Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductOverviewContextImpl <em>Product Overview Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductOverviewContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getProductOverviewContext()
	 * @generated
	 */
	int PRODUCT_OVERVIEW_CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__CHILD_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__MODEL_ELEMENT = IOVERVIEW_VISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__PARENT = IOVERVIEW_VISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED = IOVERVIEW_VISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__EXPANDED = IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED;

	/**
	 * The feature id for the '<em><b>Detailed Product Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__DETAILED_PRODUCT_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collapsed Product Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__COLLAPSED_PRODUCT_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT__PRODUCTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT_FEATURE_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OVERVIEW_CONTEXT_OPERATION_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl <em>Feature Overview Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getFeatureOverviewContext()
	 * @generated
	 */
	int FEATURE_OVERVIEW_CONTEXT = 15;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__CHILD_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__MODEL_ELEMENT = IOVERVIEW_VISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__PARENT = IOVERVIEW_VISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED = IOVERVIEW_VISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__EXPANDED = IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED;

	/**
	 * The feature id for the '<em><b>Collapsed Feature Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Detailed Feature Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT__FEATURES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT_FEATURE_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feature Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OVERVIEW_CONTEXT_OPERATION_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl <em>Bundle Overview Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleOverviewContext()
	 * @generated
	 */
	int BUNDLE_OVERVIEW_CONTEXT = 16;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__CHILD_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__MODEL_ELEMENT = IOVERVIEW_VISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__PARENT = IOVERVIEW_VISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED = IOVERVIEW_VISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__EXPANDED = IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED;

	/**
	 * The feature id for the '<em><b>Required Bundle Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Packages Of Bundle Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Package Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collapsed Bundle Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Detailed Bundle Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Used Package Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT__BUNDLES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Bundle Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT_FEATURE_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Bundle Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OVERVIEW_CONTEXT_OPERATION_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl <em>Bundle Category Overview Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleCategoryOverviewContext()
	 * @generated
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT = 17;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILD_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__MODEL_ELEMENT = IOVERVIEW_VISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__PARENT = IOVERVIEW_VISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED = IOVERVIEW_VISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__EXPANDED = IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED;

	/**
	 * The feature id for the '<em><b>Collapsed Bundle Category Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Detailed Bundle Category Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bundle Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uncategorized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Detailed Uncategorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_UNCATEGORIZED = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bundle Category Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT_FEATURE_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bundle Category Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_OVERVIEW_CONTEXT_OPERATION_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ReferencedInterfaceEdgeConnectionImpl <em>Referenced Interface Edge Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ReferencedInterfaceEdgeConnectionImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getReferencedInterfaceEdgeConnection()
	 * @generated
	 */
	int REFERENCED_INTERFACE_EDGE_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Service Component Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Service Interface Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Referenced Interface Edge Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_INTERFACE_EDGE_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Referenced Interface Edge Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_INTERFACE_EDGE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl <em>Service Overview Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getServiceOverviewContext()
	 * @generated
	 */
	int SERVICE_OVERVIEW_CONTEXT = 19;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__CHILD_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__MODEL_ELEMENT = IOVERVIEW_VISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__PARENT = IOVERVIEW_VISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED = IOVERVIEW_VISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__EXPANDED = IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED;

	/**
	 * The feature id for the '<em><b>Collapsed Service Component Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Detailed Service Component Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collapsed Service Interface Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Detailed Service Interface Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collapsed Class Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__CLASSES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Detailed Class Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collapsed Referenced Bundle Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Detailed Referenced Bundle Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Implemented Interface Edges Plain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Implemented Interface Edges In Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Referenced Interface Edges Plain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Referenced Interface Edges In Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Injected Interface Edges Plain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Injected Interface Edges In Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Service Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Service Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Classes With Injections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Allow In Bundle Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Service Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT_FEATURE_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Service Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OVERVIEW_CONTEXT_OPERATION_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectOverviewContextImpl <em>Package Object Overview Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectOverviewContextImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getPackageObjectOverviewContext()
	 * @generated
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT = 20;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__CHILD_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__MODEL_ELEMENT = IOVERVIEW_VISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__PARENT = IOVERVIEW_VISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__CHILDREN_INITIALIZED = IOVERVIEW_VISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__EXPANDED = IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED;

	/**
	 * The feature id for the '<em><b>Collapsed Package Object Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__COLLAPSED_PACKAGE_OBJECT_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Detailed Package Object Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__DETAILED_PACKAGE_OBJECT_CONTEXTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT__PACKAGE_OBJECTS = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Object Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT_FEATURE_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Package Object Overview Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OBJECT_OVERVIEW_CONTEXT_OPERATION_COUNT = IOVERVIEW_VISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl <em>Osgi Viz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getOsgiViz()
	 * @generated
	 */
	int OSGI_VIZ = 21;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__CHILD_CONTEXTS = IVISUALIZATION_CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__MODEL_ELEMENT = IVISUALIZATION_CONTEXT__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__PARENT = IVISUALIZATION_CONTEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Children Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__CHILDREN_INITIALIZED = IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED;

	/**
	 * The feature id for the '<em><b>Synthesis Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__SYNTHESIS_OPTIONS = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__LAYOUT_OPTIONS = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bundle Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imported Package Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bundle Category Overview Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ__FOCUS = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Osgi Viz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ_FEATURE_COUNT = IVISUALIZATION_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Osgi Viz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSGI_VIZ_OPERATION_COUNT = IVISUALIZATION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext <em>IVisualization Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVisualization Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
	 * @generated
	 */
	EClass getIVisualizationContext();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getChildContexts <em>Child Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getChildContexts()
	 * @see #getIVisualizationContext()
	 * @generated
	 */
	EReference getIVisualizationContext_ChildContexts();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getModelElement()
	 * @see #getIVisualizationContext()
	 * @generated
	 */
	EReference getIVisualizationContext_ModelElement();

	/**
	 * Returns the meta object for the container reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#getParent()
	 * @see #getIVisualizationContext()
	 * @generated
	 */
	EReference getIVisualizationContext_Parent();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#isChildrenInitialized <em>Children Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Children Initialized</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext#isChildrenInitialized()
	 * @see #getIVisualizationContext()
	 * @generated
	 */
	EAttribute getIVisualizationContext_ChildrenInitialized();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext <em>IOverview Visualization Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOverview Visualization Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
	 * @generated
	 */
	EClass getIOverviewVisualizationContext();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext#isExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext#isExpanded()
	 * @see #getIOverviewVisualizationContext()
	 * @generated
	 */
	EAttribute getIOverviewVisualizationContext_Expanded();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getBundle()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Bundle();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getClassPath <em>Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Path</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getClassPath()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_ClassPath();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getInjectedInterfaces <em>Injected Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Injected Interfaces</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Class#getInjectedInterfaces()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_InjectedInterfaces();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Pair#getKey()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Key();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Pair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Pair#getValue()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Value();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Option#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Option#getId()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext <em>Product Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext
	 * @generated
	 */
	EClass getProductContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getFeatureOverviewContext <em>Feature Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getFeatureOverviewContext()
	 * @see #getProductContext()
	 * @generated
	 */
	EReference getProductContext_FeatureOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getBundleOverviewContext <em>Bundle Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getBundleOverviewContext()
	 * @see #getProductContext()
	 * @generated
	 */
	EReference getProductContext_BundleOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getServiceOverviewContext <em>Service Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductContext#getServiceOverviewContext()
	 * @see #getProductContext()
	 * @generated
	 */
	EReference getProductContext_ServiceOverviewContext();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext <em>Feature Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext
	 * @generated
	 */
	EClass getFeatureContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext#getBundleOverviewContext <em>Bundle Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureContext#getBundleOverviewContext()
	 * @see #getFeatureContext()
	 * @generated
	 */
	EReference getFeatureContext_BundleOverviewContext();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext <em>Bundle Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext
	 * @generated
	 */
	EClass getBundleContext();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#getClassesWithInjections <em>Classes With Injections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes With Injections</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#getClassesWithInjections()
	 * @see #getBundleContext()
	 * @generated
	 */
	EReference getBundleContext_ClassesWithInjections();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiredBundlesShown <em>All Required Bundles Shown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Required Bundles Shown</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiredBundlesShown()
	 * @see #getBundleContext()
	 * @generated
	 */
	EAttribute getBundleContext_AllRequiredBundlesShown();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiringBundlesShown <em>All Requiring Bundles Shown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Requiring Bundles Shown</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllRequiringBundlesShown()
	 * @see #getBundleContext()
	 * @generated
	 */
	EAttribute getBundleContext_AllRequiringBundlesShown();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllUsedPackagesShown <em>All Used Packages Shown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Used Packages Shown</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#isAllUsedPackagesShown()
	 * @see #getBundleContext()
	 * @generated
	 */
	EAttribute getBundleContext_AllUsedPackagesShown();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#getServiceOverviewContext <em>Service Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleContext#getServiceOverviewContext()
	 * @see #getBundleContext()
	 * @generated
	 */
	EReference getBundleContext_ServiceOverviewContext();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext <em>Bundle Category Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Category Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext
	 * @generated
	 */
	EClass getBundleCategoryContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext#getBundleOverviewContext <em>Bundle Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryContext#getBundleOverviewContext()
	 * @see #getBundleCategoryContext()
	 * @generated
	 */
	EReference getBundleCategoryContext_BundleOverviewContext();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext <em>Class Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext
	 * @generated
	 */
	EClass getClassContext();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownPlain <em>All Injected Interfaces Shown Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Injected Interfaces Shown Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownPlain()
	 * @see #getClassContext()
	 * @generated
	 */
	EAttribute getClassContext_AllInjectedInterfacesShownPlain();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownInBundles <em>All Injected Interfaces Shown In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Injected Interfaces Shown In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ClassContext#isAllInjectedInterfacesShownInBundles()
	 * @see #getClassContext()
	 * @generated
	 */
	EAttribute getClassContext_AllInjectedInterfacesShownInBundles();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext <em>Service Component Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Component Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext
	 * @generated
	 */
	EClass getServiceComponentContext();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownPlain <em>All Implemented Interfaces Shown Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Implemented Interfaces Shown Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownPlain()
	 * @see #getServiceComponentContext()
	 * @generated
	 */
	EAttribute getServiceComponentContext_AllImplementedInterfacesShownPlain();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownInBundles <em>All Implemented Interfaces Shown In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Implemented Interfaces Shown In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllImplementedInterfacesShownInBundles()
	 * @see #getServiceComponentContext()
	 * @generated
	 */
	EAttribute getServiceComponentContext_AllImplementedInterfacesShownInBundles();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownPlain <em>All Referenced Interfaces Shown Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Referenced Interfaces Shown Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownPlain()
	 * @see #getServiceComponentContext()
	 * @generated
	 */
	EAttribute getServiceComponentContext_AllReferencedInterfacesShownPlain();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownInBundles <em>All Referenced Interfaces Shown In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Referenced Interfaces Shown In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceComponentContext#isAllReferencedInterfacesShownInBundles()
	 * @see #getServiceComponentContext()
	 * @generated
	 */
	EAttribute getServiceComponentContext_AllReferencedInterfacesShownInBundles();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext <em>Service Interface Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext
	 * @generated
	 */
	EClass getServiceInterfaceContext();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownPlain <em>All Implementing Components Shown Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Implementing Components Shown Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownPlain()
	 * @see #getServiceInterfaceContext()
	 * @generated
	 */
	EAttribute getServiceInterfaceContext_AllImplementingComponentsShownPlain();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownInBundles <em>All Implementing Components Shown In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Implementing Components Shown In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllImplementingComponentsShownInBundles()
	 * @see #getServiceInterfaceContext()
	 * @generated
	 */
	EAttribute getServiceInterfaceContext_AllImplementingComponentsShownInBundles();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownPlain <em>All Referencing Components Shown Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Referencing Components Shown Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownPlain()
	 * @see #getServiceInterfaceContext()
	 * @generated
	 */
	EAttribute getServiceInterfaceContext_AllReferencingComponentsShownPlain();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownInBundles <em>All Referencing Components Shown In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Referencing Components Shown In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceInterfaceContext#isAllReferencingComponentsShownInBundles()
	 * @see #getServiceInterfaceContext()
	 * @generated
	 */
	EAttribute getServiceInterfaceContext_AllReferencingComponentsShownInBundles();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext <em>Package Object Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Object Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectContext
	 * @generated
	 */
	EClass getPackageObjectContext();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection <em>Used Packages Of Bundle Edge Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Packages Of Bundle Edge Connection</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection
	 * @generated
	 */
	EClass getUsedPackagesOfBundleEdgeConnection();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getSourceBundleContext <em>Source Bundle Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Bundle Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getSourceBundleContext()
	 * @see #getUsedPackagesOfBundleEdgeConnection()
	 * @generated
	 */
	EReference getUsedPackagesOfBundleEdgeConnection_SourceBundleContext();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getUsedPackages <em>Used Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Packages</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getUsedPackages()
	 * @see #getUsedPackagesOfBundleEdgeConnection()
	 * @generated
	 */
	EReference getUsedPackagesOfBundleEdgeConnection_UsedPackages();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getProduct()
	 * @see #getUsedPackagesOfBundleEdgeConnection()
	 * @generated
	 */
	EReference getUsedPackagesOfBundleEdgeConnection_Product();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getTargetBundleContext <em>Target Bundle Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Bundle Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.UsedPackagesOfBundleEdgeConnection#getTargetBundleContext()
	 * @see #getUsedPackagesOfBundleEdgeConnection()
	 * @generated
	 */
	EReference getUsedPackagesOfBundleEdgeConnection_TargetBundleContext();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext <em>Product Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext
	 * @generated
	 */
	EClass getProductOverviewContext();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getDetailedProductContexts <em>Detailed Product Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Product Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getDetailedProductContexts()
	 * @see #getProductOverviewContext()
	 * @generated
	 */
	EReference getProductOverviewContext_DetailedProductContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getCollapsedProductContexts <em>Collapsed Product Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Product Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getCollapsedProductContexts()
	 * @see #getProductOverviewContext()
	 * @generated
	 */
	EReference getProductOverviewContext_CollapsedProductContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ProductOverviewContext#getProducts()
	 * @see #getProductOverviewContext()
	 * @generated
	 */
	EReference getProductOverviewContext_Products();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext <em>Feature Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext
	 * @generated
	 */
	EClass getFeatureOverviewContext();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getCollapsedFeatureContexts <em>Collapsed Feature Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Feature Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getCollapsedFeatureContexts()
	 * @see #getFeatureOverviewContext()
	 * @generated
	 */
	EReference getFeatureOverviewContext_CollapsedFeatureContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getDetailedFeatureContexts <em>Detailed Feature Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Feature Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getDetailedFeatureContexts()
	 * @see #getFeatureOverviewContext()
	 * @generated
	 */
	EReference getFeatureOverviewContext_DetailedFeatureContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.FeatureOverviewContext#getFeatures()
	 * @see #getFeatureOverviewContext()
	 * @generated
	 */
	EReference getFeatureOverviewContext_Features();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext <em>Bundle Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext
	 * @generated
	 */
	EClass getBundleOverviewContext();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getRequiredBundleEdges <em>Required Bundle Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Bundle Edges</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getRequiredBundleEdges()
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	EReference getBundleOverviewContext_RequiredBundleEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackagesOfBundleEdges <em>Used Packages Of Bundle Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Packages Of Bundle Edges</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackagesOfBundleEdges()
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	EReference getBundleOverviewContext_UsedPackagesOfBundleEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackageEdges <em>Used Package Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Package Edges</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackageEdges()
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	EReference getBundleOverviewContext_UsedPackageEdges();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getCollapsedBundleContexts <em>Collapsed Bundle Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Bundle Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getCollapsedBundleContexts()
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	EReference getBundleOverviewContext_CollapsedBundleContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getDetailedBundleContexts <em>Detailed Bundle Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Bundle Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getDetailedBundleContexts()
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	EReference getBundleOverviewContext_DetailedBundleContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackageContexts <em>Used Package Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Package Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getUsedPackageContexts()
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	EReference getBundleOverviewContext_UsedPackageContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleOverviewContext#getBundles()
	 * @see #getBundleOverviewContext()
	 * @generated
	 */
	EReference getBundleOverviewContext_Bundles();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext <em>Bundle Category Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Category Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext
	 * @generated
	 */
	EClass getBundleCategoryOverviewContext();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getCollapsedBundleCategoryContexts <em>Collapsed Bundle Category Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Bundle Category Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getCollapsedBundleCategoryContexts()
	 * @see #getBundleCategoryOverviewContext()
	 * @generated
	 */
	EReference getBundleCategoryOverviewContext_CollapsedBundleCategoryContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getDetailedBundleCategoryContexts <em>Detailed Bundle Category Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Bundle Category Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getDetailedBundleCategoryContexts()
	 * @see #getBundleCategoryOverviewContext()
	 * @generated
	 */
	EReference getBundleCategoryOverviewContext_DetailedBundleCategoryContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getBundleCategories <em>Bundle Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bundle Categories</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getBundleCategories()
	 * @see #getBundleCategoryOverviewContext()
	 * @generated
	 */
	EReference getBundleCategoryOverviewContext_BundleCategories();

	/**
	 * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getUncategorized <em>Uncategorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uncategorized</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#getUncategorized()
	 * @see #getBundleCategoryOverviewContext()
	 * @generated
	 */
	EReference getBundleCategoryOverviewContext_Uncategorized();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#isDetailedUncategorized <em>Detailed Uncategorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detailed Uncategorized</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.BundleCategoryOverviewContext#isDetailedUncategorized()
	 * @see #getBundleCategoryOverviewContext()
	 * @generated
	 */
	EAttribute getBundleCategoryOverviewContext_DetailedUncategorized();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection <em>Referenced Interface Edge Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Interface Edge Connection</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection
	 * @generated
	 */
	EClass getReferencedInterfaceEdgeConnection();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceComponentContext <em>Service Component Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Component Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceComponentContext()
	 * @see #getReferencedInterfaceEdgeConnection()
	 * @generated
	 */
	EReference getReferencedInterfaceEdgeConnection_ServiceComponentContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceInterfaceContext <em>Service Interface Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Interface Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getServiceInterfaceContext()
	 * @see #getReferencedInterfaceEdgeConnection()
	 * @generated
	 */
	EReference getReferencedInterfaceEdgeConnection_ServiceInterfaceContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ReferencedInterfaceEdgeConnection#getReference()
	 * @see #getReferencedInterfaceEdgeConnection()
	 * @generated
	 */
	EReference getReferencedInterfaceEdgeConnection_Reference();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext <em>Service Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext
	 * @generated
	 */
	EClass getServiceOverviewContext();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedServiceComponentContexts <em>Collapsed Service Component Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Service Component Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedServiceComponentContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_CollapsedServiceComponentContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedServiceComponentContexts <em>Detailed Service Component Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Service Component Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedServiceComponentContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_DetailedServiceComponentContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedServiceInterfaceContexts <em>Collapsed Service Interface Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Service Interface Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedServiceInterfaceContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_CollapsedServiceInterfaceContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedServiceInterfaceContexts <em>Detailed Service Interface Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Service Interface Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedServiceInterfaceContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_DetailedServiceInterfaceContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedClassContexts <em>Collapsed Class Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Class Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedClassContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_CollapsedClassContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getClasses()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_Classes();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedClassContexts <em>Detailed Class Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Class Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedClassContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_DetailedClassContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedReferencedBundleContexts <em>Collapsed Referenced Bundle Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Referenced Bundle Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getCollapsedReferencedBundleContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_CollapsedReferencedBundleContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedReferencedBundleContexts <em>Detailed Referenced Bundle Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Referenced Bundle Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getDetailedReferencedBundleContexts()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_DetailedReferencedBundleContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getImplementedInterfaceEdgesPlain <em>Implemented Interface Edges Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implemented Interface Edges Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getImplementedInterfaceEdgesPlain()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_ImplementedInterfaceEdgesPlain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getImplementedInterfaceEdgesInBundles <em>Implemented Interface Edges In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implemented Interface Edges In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getImplementedInterfaceEdgesInBundles()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_ImplementedInterfaceEdgesInBundles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getReferencedInterfaceEdgesPlain <em>Referenced Interface Edges Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Interface Edges Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getReferencedInterfaceEdgesPlain()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_ReferencedInterfaceEdgesPlain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getReferencedInterfaceEdgesInBundles <em>Referenced Interface Edges In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Interface Edges In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getReferencedInterfaceEdgesInBundles()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_ReferencedInterfaceEdgesInBundles();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getInjectedInterfaceEdgesPlain <em>Injected Interface Edges Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injected Interface Edges Plain</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getInjectedInterfaceEdgesPlain()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_InjectedInterfaceEdgesPlain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getInjectedInterfaceEdgesInBundles <em>Injected Interface Edges In Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Injected Interface Edges In Bundles</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getInjectedInterfaceEdgesInBundles()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_InjectedInterfaceEdgesInBundles();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getServiceComponents <em>Service Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Components</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getServiceComponents()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_ServiceComponents();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getServiceInterfaces <em>Service Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Interfaces</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getServiceInterfaces()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_ServiceInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getClassesWithInjections <em>Classes With Injections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes With Injections</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#getClassesWithInjections()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EReference getServiceOverviewContext_ClassesWithInjections();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#isAllowInBundleConnections <em>Allow In Bundle Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow In Bundle Connections</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.ServiceOverviewContext#isAllowInBundleConnections()
	 * @see #getServiceOverviewContext()
	 * @generated
	 */
	EAttribute getServiceOverviewContext_AllowInBundleConnections();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext <em>Package Object Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Object Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext
	 * @generated
	 */
	EClass getPackageObjectOverviewContext();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getCollapsedPackageObjectContexts <em>Collapsed Package Object Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Collapsed Package Object Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getCollapsedPackageObjectContexts()
	 * @see #getPackageObjectOverviewContext()
	 * @generated
	 */
	EReference getPackageObjectOverviewContext_CollapsedPackageObjectContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getDetailedPackageObjectContexts <em>Detailed Package Object Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detailed Package Object Contexts</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getDetailedPackageObjectContexts()
	 * @see #getPackageObjectOverviewContext()
	 * @generated
	 */
	EReference getPackageObjectOverviewContext_DetailedPackageObjectContexts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getPackageObjects <em>Package Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Package Objects</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.PackageObjectOverviewContext#getPackageObjects()
	 * @see #getPackageObjectOverviewContext()
	 * @generated
	 */
	EReference getPackageObjectOverviewContext_PackageObjects();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz <em>Osgi Viz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osgi Viz</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz
	 * @generated
	 */
	EClass getOsgiViz();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getSynthesisOptions <em>Synthesis Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synthesis Options</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getSynthesisOptions()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_SynthesisOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getLayoutOptions <em>Layout Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layout Options</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getLayoutOptions()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_LayoutOptions();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleOverviewContext <em>Bundle Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleOverviewContext()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_BundleOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getProductOverviewContext <em>Product Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getProductOverviewContext()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_ProductOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getServiceOverviewContext <em>Service Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getServiceOverviewContext()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_ServiceOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFeatureOverviewContext <em>Feature Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFeatureOverviewContext()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_FeatureOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getImportedPackageOverviewContext <em>Imported Package Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Package Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getImportedPackageOverviewContext()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_ImportedPackageOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleCategoryOverviewContext <em>Bundle Category Overview Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle Category Overview Context</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getBundleCategoryOverviewContext()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_BundleCategoryOverviewContext();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Focus</em>'.
	 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.OsgiViz#getFocus()
	 * @see #getOsgiViz()
	 * @generated
	 */
	EReference getOsgiViz_Focus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsgivizmodelFactory getOsgivizmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext <em>IVisualization Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getIVisualizationContext()
		 * @generated
		 */
		EClass IVISUALIZATION_CONTEXT = eINSTANCE.getIVisualizationContext();

		/**
		 * The meta object literal for the '<em><b>Child Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVISUALIZATION_CONTEXT__CHILD_CONTEXTS = eINSTANCE.getIVisualizationContext_ChildContexts();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVISUALIZATION_CONTEXT__MODEL_ELEMENT = eINSTANCE.getIVisualizationContext_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IVISUALIZATION_CONTEXT__PARENT = eINSTANCE.getIVisualizationContext_Parent();

		/**
		 * The meta object literal for the '<em><b>Children Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVISUALIZATION_CONTEXT__CHILDREN_INITIALIZED = eINSTANCE.getIVisualizationContext_ChildrenInitialized();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext <em>IOverview Visualization Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getIOverviewVisualizationContext()
		 * @generated
		 */
		EClass IOVERVIEW_VISUALIZATION_CONTEXT = eINSTANCE.getIOverviewVisualizationContext();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IOVERVIEW_VISUALIZATION_CONTEXT__EXPANDED = eINSTANCE.getIOverviewVisualizationContext_Expanded();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__BUNDLE = eINSTANCE.getClass_Bundle();

		/**
		 * The meta object literal for the '<em><b>Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CLASS_PATH = eINSTANCE.getClass_ClassPath();

		/**
		 * The meta object literal for the '<em><b>Injected Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INJECTED_INTERFACES = eINSTANCE.getClass_InjectedInterfaces();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PairImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__KEY = eINSTANCE.getPair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__VALUE = eINSTANCE.getPair_Value();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OptionImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__ID = eINSTANCE.getOption_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductContextImpl <em>Product Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getProductContext()
		 * @generated
		 */
		EClass PRODUCT_CONTEXT = eINSTANCE.getProductContext();

		/**
		 * The meta object literal for the '<em><b>Feature Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTEXT__FEATURE_OVERVIEW_CONTEXT = eINSTANCE.getProductContext_FeatureOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Bundle Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTEXT__BUNDLE_OVERVIEW_CONTEXT = eINSTANCE.getProductContext_BundleOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Service Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTEXT__SERVICE_OVERVIEW_CONTEXT = eINSTANCE.getProductContext_ServiceOverviewContext();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureContextImpl <em>Feature Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getFeatureContext()
		 * @generated
		 */
		EClass FEATURE_CONTEXT = eINSTANCE.getFeatureContext();

		/**
		 * The meta object literal for the '<em><b>Bundle Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONTEXT__BUNDLE_OVERVIEW_CONTEXT = eINSTANCE.getFeatureContext_BundleOverviewContext();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl <em>Bundle Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleContext()
		 * @generated
		 */
		EClass BUNDLE_CONTEXT = eINSTANCE.getBundleContext();

		/**
		 * The meta object literal for the '<em><b>Classes With Injections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONTEXT__CLASSES_WITH_INJECTIONS = eINSTANCE.getBundleContext_ClassesWithInjections();

		/**
		 * The meta object literal for the '<em><b>All Required Bundles Shown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CONTEXT__ALL_REQUIRED_BUNDLES_SHOWN = eINSTANCE.getBundleContext_AllRequiredBundlesShown();

		/**
		 * The meta object literal for the '<em><b>All Requiring Bundles Shown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CONTEXT__ALL_REQUIRING_BUNDLES_SHOWN = eINSTANCE.getBundleContext_AllRequiringBundlesShown();

		/**
		 * The meta object literal for the '<em><b>All Used Packages Shown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CONTEXT__ALL_USED_PACKAGES_SHOWN = eINSTANCE.getBundleContext_AllUsedPackagesShown();

		/**
		 * The meta object literal for the '<em><b>Service Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONTEXT__SERVICE_OVERVIEW_CONTEXT = eINSTANCE.getBundleContext_ServiceOverviewContext();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryContextImpl <em>Bundle Category Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleCategoryContext()
		 * @generated
		 */
		EClass BUNDLE_CATEGORY_CONTEXT = eINSTANCE.getBundleCategoryContext();

		/**
		 * The meta object literal for the '<em><b>Bundle Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CATEGORY_CONTEXT__BUNDLE_OVERVIEW_CONTEXT = eINSTANCE.getBundleCategoryContext_BundleOverviewContext();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl <em>Class Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ClassContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getClassContext()
		 * @generated
		 */
		EClass CLASS_CONTEXT = eINSTANCE.getClassContext();

		/**
		 * The meta object literal for the '<em><b>All Injected Interfaces Shown Plain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_PLAIN = eINSTANCE.getClassContext_AllInjectedInterfacesShownPlain();

		/**
		 * The meta object literal for the '<em><b>All Injected Interfaces Shown In Bundles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_CONTEXT__ALL_INJECTED_INTERFACES_SHOWN_IN_BUNDLES = eINSTANCE.getClassContext_AllInjectedInterfacesShownInBundles();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl <em>Service Component Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceComponentContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getServiceComponentContext()
		 * @generated
		 */
		EClass SERVICE_COMPONENT_CONTEXT = eINSTANCE.getServiceComponentContext();

		/**
		 * The meta object literal for the '<em><b>All Implemented Interfaces Shown Plain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_PLAIN = eINSTANCE.getServiceComponentContext_AllImplementedInterfacesShownPlain();

		/**
		 * The meta object literal for the '<em><b>All Implemented Interfaces Shown In Bundles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT_CONTEXT__ALL_IMPLEMENTED_INTERFACES_SHOWN_IN_BUNDLES = eINSTANCE.getServiceComponentContext_AllImplementedInterfacesShownInBundles();

		/**
		 * The meta object literal for the '<em><b>All Referenced Interfaces Shown Plain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_PLAIN = eINSTANCE.getServiceComponentContext_AllReferencedInterfacesShownPlain();

		/**
		 * The meta object literal for the '<em><b>All Referenced Interfaces Shown In Bundles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_COMPONENT_CONTEXT__ALL_REFERENCED_INTERFACES_SHOWN_IN_BUNDLES = eINSTANCE.getServiceComponentContext_AllReferencedInterfacesShownInBundles();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl <em>Service Interface Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceInterfaceContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getServiceInterfaceContext()
		 * @generated
		 */
		EClass SERVICE_INTERFACE_CONTEXT = eINSTANCE.getServiceInterfaceContext();

		/**
		 * The meta object literal for the '<em><b>All Implementing Components Shown Plain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_PLAIN = eINSTANCE.getServiceInterfaceContext_AllImplementingComponentsShownPlain();

		/**
		 * The meta object literal for the '<em><b>All Implementing Components Shown In Bundles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_CONTEXT__ALL_IMPLEMENTING_COMPONENTS_SHOWN_IN_BUNDLES = eINSTANCE.getServiceInterfaceContext_AllImplementingComponentsShownInBundles();

		/**
		 * The meta object literal for the '<em><b>All Referencing Components Shown Plain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_PLAIN = eINSTANCE.getServiceInterfaceContext_AllReferencingComponentsShownPlain();

		/**
		 * The meta object literal for the '<em><b>All Referencing Components Shown In Bundles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_CONTEXT__ALL_REFERENCING_COMPONENTS_SHOWN_IN_BUNDLES = eINSTANCE.getServiceInterfaceContext_AllReferencingComponentsShownInBundles();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectContextImpl <em>Package Object Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getPackageObjectContext()
		 * @generated
		 */
		EClass PACKAGE_OBJECT_CONTEXT = eINSTANCE.getPackageObjectContext();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl <em>Used Packages Of Bundle Edge Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.UsedPackagesOfBundleEdgeConnectionImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getUsedPackagesOfBundleEdgeConnection()
		 * @generated
		 */
		EClass USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION = eINSTANCE.getUsedPackagesOfBundleEdgeConnection();

		/**
		 * The meta object literal for the '<em><b>Source Bundle Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__SOURCE_BUNDLE_CONTEXT = eINSTANCE.getUsedPackagesOfBundleEdgeConnection_SourceBundleContext();

		/**
		 * The meta object literal for the '<em><b>Used Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__USED_PACKAGES = eINSTANCE.getUsedPackagesOfBundleEdgeConnection_UsedPackages();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__PRODUCT = eINSTANCE.getUsedPackagesOfBundleEdgeConnection_Product();

		/**
		 * The meta object literal for the '<em><b>Target Bundle Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_PACKAGES_OF_BUNDLE_EDGE_CONNECTION__TARGET_BUNDLE_CONTEXT = eINSTANCE.getUsedPackagesOfBundleEdgeConnection_TargetBundleContext();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductOverviewContextImpl <em>Product Overview Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ProductOverviewContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getProductOverviewContext()
		 * @generated
		 */
		EClass PRODUCT_OVERVIEW_CONTEXT = eINSTANCE.getProductOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Detailed Product Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OVERVIEW_CONTEXT__DETAILED_PRODUCT_CONTEXTS = eINSTANCE.getProductOverviewContext_DetailedProductContexts();

		/**
		 * The meta object literal for the '<em><b>Collapsed Product Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OVERVIEW_CONTEXT__COLLAPSED_PRODUCT_CONTEXTS = eINSTANCE.getProductOverviewContext_CollapsedProductContexts();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OVERVIEW_CONTEXT__PRODUCTS = eINSTANCE.getProductOverviewContext_Products();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl <em>Feature Overview Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.FeatureOverviewContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getFeatureOverviewContext()
		 * @generated
		 */
		EClass FEATURE_OVERVIEW_CONTEXT = eINSTANCE.getFeatureOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Collapsed Feature Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OVERVIEW_CONTEXT__COLLAPSED_FEATURE_CONTEXTS = eINSTANCE.getFeatureOverviewContext_CollapsedFeatureContexts();

		/**
		 * The meta object literal for the '<em><b>Detailed Feature Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OVERVIEW_CONTEXT__DETAILED_FEATURE_CONTEXTS = eINSTANCE.getFeatureOverviewContext_DetailedFeatureContexts();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OVERVIEW_CONTEXT__FEATURES = eINSTANCE.getFeatureOverviewContext_Features();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl <em>Bundle Overview Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleOverviewContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleOverviewContext()
		 * @generated
		 */
		EClass BUNDLE_OVERVIEW_CONTEXT = eINSTANCE.getBundleOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Required Bundle Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_OVERVIEW_CONTEXT__REQUIRED_BUNDLE_EDGES = eINSTANCE.getBundleOverviewContext_RequiredBundleEdges();

		/**
		 * The meta object literal for the '<em><b>Used Packages Of Bundle Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGES_OF_BUNDLE_EDGES = eINSTANCE.getBundleOverviewContext_UsedPackagesOfBundleEdges();

		/**
		 * The meta object literal for the '<em><b>Used Package Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_EDGES = eINSTANCE.getBundleOverviewContext_UsedPackageEdges();

		/**
		 * The meta object literal for the '<em><b>Collapsed Bundle Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CONTEXTS = eINSTANCE.getBundleOverviewContext_CollapsedBundleContexts();

		/**
		 * The meta object literal for the '<em><b>Detailed Bundle Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CONTEXTS = eINSTANCE.getBundleOverviewContext_DetailedBundleContexts();

		/**
		 * The meta object literal for the '<em><b>Used Package Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_OVERVIEW_CONTEXT__USED_PACKAGE_CONTEXTS = eINSTANCE.getBundleOverviewContext_UsedPackageContexts();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_OVERVIEW_CONTEXT__BUNDLES = eINSTANCE.getBundleOverviewContext_Bundles();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl <em>Bundle Category Overview Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.BundleCategoryOverviewContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getBundleCategoryOverviewContext()
		 * @generated
		 */
		EClass BUNDLE_CATEGORY_OVERVIEW_CONTEXT = eINSTANCE.getBundleCategoryOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Collapsed Bundle Category Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CATEGORY_OVERVIEW_CONTEXT__COLLAPSED_BUNDLE_CATEGORY_CONTEXTS = eINSTANCE.getBundleCategoryOverviewContext_CollapsedBundleCategoryContexts();

		/**
		 * The meta object literal for the '<em><b>Detailed Bundle Category Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_BUNDLE_CATEGORY_CONTEXTS = eINSTANCE.getBundleCategoryOverviewContext_DetailedBundleCategoryContexts();

		/**
		 * The meta object literal for the '<em><b>Bundle Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CATEGORY_OVERVIEW_CONTEXT__BUNDLE_CATEGORIES = eINSTANCE.getBundleCategoryOverviewContext_BundleCategories();

		/**
		 * The meta object literal for the '<em><b>Uncategorized</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CATEGORY_OVERVIEW_CONTEXT__UNCATEGORIZED = eINSTANCE.getBundleCategoryOverviewContext_Uncategorized();

		/**
		 * The meta object literal for the '<em><b>Detailed Uncategorized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CATEGORY_OVERVIEW_CONTEXT__DETAILED_UNCATEGORIZED = eINSTANCE.getBundleCategoryOverviewContext_DetailedUncategorized();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ReferencedInterfaceEdgeConnectionImpl <em>Referenced Interface Edge Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ReferencedInterfaceEdgeConnectionImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getReferencedInterfaceEdgeConnection()
		 * @generated
		 */
		EClass REFERENCED_INTERFACE_EDGE_CONNECTION = eINSTANCE.getReferencedInterfaceEdgeConnection();

		/**
		 * The meta object literal for the '<em><b>Service Component Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_COMPONENT_CONTEXT = eINSTANCE.getReferencedInterfaceEdgeConnection_ServiceComponentContext();

		/**
		 * The meta object literal for the '<em><b>Service Interface Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_INTERFACE_EDGE_CONNECTION__SERVICE_INTERFACE_CONTEXT = eINSTANCE.getReferencedInterfaceEdgeConnection_ServiceInterfaceContext();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_INTERFACE_EDGE_CONNECTION__REFERENCE = eINSTANCE.getReferencedInterfaceEdgeConnection_Reference();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl <em>Service Overview Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.ServiceOverviewContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getServiceOverviewContext()
		 * @generated
		 */
		EClass SERVICE_OVERVIEW_CONTEXT = eINSTANCE.getServiceOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Collapsed Service Component Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_COMPONENT_CONTEXTS = eINSTANCE.getServiceOverviewContext_CollapsedServiceComponentContexts();

		/**
		 * The meta object literal for the '<em><b>Detailed Service Component Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_COMPONENT_CONTEXTS = eINSTANCE.getServiceOverviewContext_DetailedServiceComponentContexts();

		/**
		 * The meta object literal for the '<em><b>Collapsed Service Interface Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__COLLAPSED_SERVICE_INTERFACE_CONTEXTS = eINSTANCE.getServiceOverviewContext_CollapsedServiceInterfaceContexts();

		/**
		 * The meta object literal for the '<em><b>Detailed Service Interface Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__DETAILED_SERVICE_INTERFACE_CONTEXTS = eINSTANCE.getServiceOverviewContext_DetailedServiceInterfaceContexts();

		/**
		 * The meta object literal for the '<em><b>Collapsed Class Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__COLLAPSED_CLASS_CONTEXTS = eINSTANCE.getServiceOverviewContext_CollapsedClassContexts();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__CLASSES = eINSTANCE.getServiceOverviewContext_Classes();

		/**
		 * The meta object literal for the '<em><b>Detailed Class Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__DETAILED_CLASS_CONTEXTS = eINSTANCE.getServiceOverviewContext_DetailedClassContexts();

		/**
		 * The meta object literal for the '<em><b>Collapsed Referenced Bundle Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__COLLAPSED_REFERENCED_BUNDLE_CONTEXTS = eINSTANCE.getServiceOverviewContext_CollapsedReferencedBundleContexts();

		/**
		 * The meta object literal for the '<em><b>Detailed Referenced Bundle Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__DETAILED_REFERENCED_BUNDLE_CONTEXTS = eINSTANCE.getServiceOverviewContext_DetailedReferencedBundleContexts();

		/**
		 * The meta object literal for the '<em><b>Implemented Interface Edges Plain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_PLAIN = eINSTANCE.getServiceOverviewContext_ImplementedInterfaceEdgesPlain();

		/**
		 * The meta object literal for the '<em><b>Implemented Interface Edges In Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__IMPLEMENTED_INTERFACE_EDGES_IN_BUNDLES = eINSTANCE.getServiceOverviewContext_ImplementedInterfaceEdgesInBundles();

		/**
		 * The meta object literal for the '<em><b>Referenced Interface Edges Plain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_PLAIN = eINSTANCE.getServiceOverviewContext_ReferencedInterfaceEdgesPlain();

		/**
		 * The meta object literal for the '<em><b>Referenced Interface Edges In Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__REFERENCED_INTERFACE_EDGES_IN_BUNDLES = eINSTANCE.getServiceOverviewContext_ReferencedInterfaceEdgesInBundles();

		/**
		 * The meta object literal for the '<em><b>Injected Interface Edges Plain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_PLAIN = eINSTANCE.getServiceOverviewContext_InjectedInterfaceEdgesPlain();

		/**
		 * The meta object literal for the '<em><b>Injected Interface Edges In Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__INJECTED_INTERFACE_EDGES_IN_BUNDLES = eINSTANCE.getServiceOverviewContext_InjectedInterfaceEdgesInBundles();

		/**
		 * The meta object literal for the '<em><b>Service Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__SERVICE_COMPONENTS = eINSTANCE.getServiceOverviewContext_ServiceComponents();

		/**
		 * The meta object literal for the '<em><b>Service Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__SERVICE_INTERFACES = eINSTANCE.getServiceOverviewContext_ServiceInterfaces();

		/**
		 * The meta object literal for the '<em><b>Classes With Injections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_OVERVIEW_CONTEXT__CLASSES_WITH_INJECTIONS = eINSTANCE.getServiceOverviewContext_ClassesWithInjections();

		/**
		 * The meta object literal for the '<em><b>Allow In Bundle Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_OVERVIEW_CONTEXT__ALLOW_IN_BUNDLE_CONNECTIONS = eINSTANCE.getServiceOverviewContext_AllowInBundleConnections();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectOverviewContextImpl <em>Package Object Overview Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.PackageObjectOverviewContextImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getPackageObjectOverviewContext()
		 * @generated
		 */
		EClass PACKAGE_OBJECT_OVERVIEW_CONTEXT = eINSTANCE.getPackageObjectOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Collapsed Package Object Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OBJECT_OVERVIEW_CONTEXT__COLLAPSED_PACKAGE_OBJECT_CONTEXTS = eINSTANCE.getPackageObjectOverviewContext_CollapsedPackageObjectContexts();

		/**
		 * The meta object literal for the '<em><b>Detailed Package Object Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OBJECT_OVERVIEW_CONTEXT__DETAILED_PACKAGE_OBJECT_CONTEXTS = eINSTANCE.getPackageObjectOverviewContext_DetailedPackageObjectContexts();

		/**
		 * The meta object literal for the '<em><b>Package Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OBJECT_OVERVIEW_CONTEXT__PACKAGE_OBJECTS = eINSTANCE.getPackageObjectOverviewContext_PackageObjects();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl <em>Osgi Viz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgiVizImpl
		 * @see de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl#getOsgiViz()
		 * @generated
		 */
		EClass OSGI_VIZ = eINSTANCE.getOsgiViz();

		/**
		 * The meta object literal for the '<em><b>Synthesis Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__SYNTHESIS_OPTIONS = eINSTANCE.getOsgiViz_SynthesisOptions();

		/**
		 * The meta object literal for the '<em><b>Layout Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__LAYOUT_OPTIONS = eINSTANCE.getOsgiViz_LayoutOptions();

		/**
		 * The meta object literal for the '<em><b>Bundle Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__BUNDLE_OVERVIEW_CONTEXT = eINSTANCE.getOsgiViz_BundleOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Product Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__PRODUCT_OVERVIEW_CONTEXT = eINSTANCE.getOsgiViz_ProductOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Service Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__SERVICE_OVERVIEW_CONTEXT = eINSTANCE.getOsgiViz_ServiceOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Feature Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__FEATURE_OVERVIEW_CONTEXT = eINSTANCE.getOsgiViz_FeatureOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Imported Package Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__IMPORTED_PACKAGE_OVERVIEW_CONTEXT = eINSTANCE.getOsgiViz_ImportedPackageOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Bundle Category Overview Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__BUNDLE_CATEGORY_OVERVIEW_CONTEXT = eINSTANCE.getOsgiViz_BundleCategoryOverviewContext();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSGI_VIZ__FOCUS = eINSTANCE.getOsgiViz_Focus();

	}

} //OsgivizmodelPackage
