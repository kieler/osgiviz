/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2019-2020 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.osgiviz

import de.cau.cs.kieler.klighd.IAction.ActionContext
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses
import de.cau.cs.kieler.osgiviz.osgivizmodel.Class
import de.cau.cs.kieler.osgiviz.osgivizmodel.IOverviewVisualizationContext
import de.cau.cs.kieler.osgiviz.osgivizmodel.IVisualizationContext
import de.scheidtbachmann.osgimodel.Bundle
import de.scheidtbachmann.osgimodel.BundleCategory
import de.scheidtbachmann.osgimodel.Feature
import de.scheidtbachmann.osgimodel.PackageObject
import de.scheidtbachmann.osgimodel.Product
import de.scheidtbachmann.osgimodel.ServiceComponent
import de.scheidtbachmann.osgimodel.ServiceInterface
import java.util.List
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting

import static de.cau.cs.kieler.osgiviz.OsgiOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension de.cau.cs.kieler.osgiviz.osgivizmodel.util.ContextExtensions.*

/**
 * Util class that contains some static methods commonly used for the Osgi synthesis.
 * 
 * @author nre
 */
final class SynthesisUtils {
    /**
     * Utils class can not be instanciated.
     */
    private new() {}
    
    /**
     * Returns the domain element the clicked KNode given its action context.
     * Uses a fallback mechanism to work around the SourceModelTrackingAdapter that seems bugged for this synthesis.
     * FIXME: find out why the usual way does not work all the time and remove the need for this method!
     */
    def static Object getDomainElement(ActionContext context) {
        getDomainElement(context, context.KNode)
    }
    
    /**
     * Returns the domain element for any KNode given its action context.
     * Uses a fallback mechanism to work around the SourceModelTrackingAdapter that seems bugged for this synthesis.
     * FIXME: find out why the usual way does not work all the time and remove the need for this method!
     */
    def static Object getDomainElement(ActionContext context, KGraphElement kElement) {
        // Default case, how it should work all the time.
        var Object element
        if (kElement instanceof KNode) {
            element = context.getDomainElement(kElement)
        }
        
        // Fallback by using the KLighD internal property set during the synthesis.
        if (element === null) {
            element = kElement.getProperty(KlighdInternalProperties.MODEL_ELEMEMT)
        }
        return element
    }
    
    
    /**
     * If the id should be truncated by the prefix of the {@link OsgiOptions#SHORTEN_BY} option, this returns a
     * truncated version of the id, otherwise the id itself.
     * 
     * @param id The id that should possibly be truncated.
     * @return The possibly truncated id.
     */
    def static String getId(String id, ViewContext usedContext) {
        val prefix = usedContext.getOptionValue(SHORTEN_BY) as String
        if (!prefix.empty && id.startsWith(prefix)) {
            return "..." + id.substring(prefix.length)
        }
        return id
    }
    
    /**
     * Filters the list of given objects visualized in the osgi synthesis by the filter options of the diagram options
     * and the overview context they are shown in.
     * 
     * @param elements The unfiltered list of all elements.
     * @param oc The element overview context showing which of the given elements are relevant.
     * @param usedContext The ViewContext used to display the diagram these elements are shown in.
     * @return An Iterable of the elements filtered by the diagram options.
     */
    def static <M> Iterable<M> filteredElements(List<M> elements, IOverviewVisualizationContext<M> oc,
        ViewContext usedContext) {
        val elementsInContext = elements.filter [
            oc.modelElements.contains(it)
        ]
        
        val regex = ".*" + usedContext.getOptionValue(FILTER_BY) as String + ".*"
        if (!regex.empty && !elementsInContext.empty) {
            val (M) => boolean filter = switch (elementsInContext.head) {
                Bundle           case usedContext.getOptionValue(FILTER_BUNDLES)            === true: {
                    [ (it as Bundle)          .uniqueId       .matches(regex) ]
                }
                Feature          case usedContext.getOptionValue(FILTER_FEATURES)           === true: {
                    [ (it as Feature)         .uniqueId       .matches(regex) ]
                }
                Product          case usedContext.getOptionValue(FILTER_PRODUCTS)           === true: {
                    [ (it as Product)         .uniqueId       .matches(regex) ]
                }
                BundleCategory   case usedContext.getOptionValue(FILTER_BUNDLE_CATEGORIES)  === true: {
                    [ (it as BundleCategory)  .categoryName   .matches(regex) ]
                }
                PackageObject    case usedContext.getOptionValue(FILTER_PACKAGE_OBJECTS)    === true: {
                    [ (it as PackageObject)   .uniqueId       .matches(regex) ]
                }
                ServiceComponent case usedContext.getOptionValue(FILTER_SERVICE_COMPONENTS) === true: {
                    [ (it as ServiceComponent).name           .matches(regex) ]
                }
                ServiceInterface case usedContext.getOptionValue(FILTER_SERVICE_INTERFACES) === true: {
                    [ (it as ServiceInterface).name           .matches(regex) ]
                }
                Class            case usedContext.getOptionValue(FILTER_CLASSES)            === true: {
                    [ (it as Class).displayedString           .matches(regex) ]
                }
                default: {
                    // In case the option for the filter is turned off, just return the given list.
                    null
                }
            }
            if (filter === null) {
                return elementsInContext
            } else {
                return elementsInContext.filter(filter)
            }
        } else {
            return elementsInContext
        }
    }
    
    /**
     * Filters the list of given visualization contexts by the filter options of the diagram options.
     * 
     * @param visualizationContexts The unfiltered list of all visualization contexts.
     * @param usedContext The ViewContext used to display the diagram these visualizations are shown in.
     * @return An Iterable of the visualization contexts filtered by the diagram options.
     */
    def static <M> Iterable<? extends IVisualizationContext<M>> filteredElementContexts(
        List<? extends IVisualizationContext<M>> visualizationContexts, ViewContext usedContext) {
        val regex = ".*" + usedContext.getOptionValue(FILTER_BY) as String + ".*"
        val filterByBundleCategory = usedContext.getOptionValue(FILTER_BY_BUNDLE_CATEGORY) as String
        val filterBundleCategoryRegex = ".*" + filterByBundleCategory + ".*"
        if (!regex.empty && !visualizationContexts.empty) {
            val (IVisualizationContext<M>) => boolean filter = switch (visualizationContexts.head.modelElement) {
                Bundle           case usedContext.getOptionValue(FILTER_BUNDLES)            === true: {
                        
                    // The filter function returned in the Bundle case.
                    [ 
                        // The bundle's ID needs to match the FILTER_BY regex,
                        if (!(modelElement as Bundle).uniqueId.matches(regex)) {
                            return false
                        }
                        // and we need to filter out if external elements are not shown,
                        if ((usedContext.getOptionValue(OsgiOptions.SHOW_EXTERNAL) === false)
                            && (modelElement as Bundle).isExternal) {
                            return false
                        }
                        // and the the bundle needs to be in a bundle category matching FILTER_BY_BUNDLE_CATEGORY regex
                        // if that filter is non-empty
                        if (!filterByBundleCategory.empty && (modelElement as Bundle).bundleCategory.findFirst [
                            categoryName.matches(filterBundleCategoryRegex)
                        ] === null) {
                            return false
                        }
                        return true
                    ]
                }
                Feature          case usedContext.getOptionValue(FILTER_FEATURES)           === true: {
                    [ (modelElement as Feature)         .uniqueId       .matches(regex)
                        && if (usedContext.getOptionValue(OsgiOptions.SHOW_EXTERNAL) === true) {
                            true
                        } else {
                            !(modelElement as Feature).isExternal
                        }
                    ]
                }
                Product          case usedContext.getOptionValue(FILTER_PRODUCTS)           === true: {
                    [ (modelElement as Product)         .uniqueId       .matches(regex) ]
                }
                BundleCategory   case usedContext.getOptionValue(FILTER_BUNDLE_CATEGORIES)  === true: {
                    [ (modelElement as BundleCategory)  .categoryName   .matches(regex) ]
                }
                PackageObject    case usedContext.getOptionValue(FILTER_PACKAGE_OBJECTS)    === true: {
                    [ (modelElement as PackageObject)   .uniqueId       .matches(regex) ]
                }
                ServiceComponent case usedContext.getOptionValue(FILTER_SERVICE_COMPONENTS) === true: {
                    [
                        // The component's ID needs to match the FILTER_BY regex,
                        if (!(modelElement as ServiceComponent).name.matches(regex)) {
                            return false
                        }
                        // and the the component needs to be defined in a bundle with a bundle category
                        // matching FILTER_BY_BUNDLE_CATEGORY regex if that filter is non-empty.
                        if (!filterByBundleCategory.empty && (modelElement as ServiceComponent).bundle?.bundleCategory
                            ?.findFirst [
                                categoryName.matches(filterBundleCategoryRegex)
                            ] === null) {
                            return false
                        }
                        return true
                    ]
                }
                ServiceInterface case usedContext.getOptionValue(FILTER_SERVICE_INTERFACES) === true: {
                    [
                        // The interface's ID needs to match the FILTER_BY regex,
                        if (!(modelElement as ServiceInterface).name.matches(regex)) {
                            return false
                        }
                        // and the the interface needs to be defined in a bundle with a bundle category
                        // matching FILTER_BY_BUNDLE_CATEGORY regex if that filter is non-empty.
                        if (!filterByBundleCategory.empty && (modelElement as ServiceInterface).implementedIn
                            ?.bundleCategory?.findFirst [
                                categoryName.matches(filterBundleCategoryRegex)
                            ] === null) {
                            return false
                        }
                        return true
                    ]
                }
                Class case usedContext.getOptionValue(FILTER_CLASSES)                       === true: {
                    [ (modelElement as Class).displayedString           .matches(regex) ]
                }
                default: {
                    null
                }
            }
            if (filter === null) {
                return visualizationContexts
            } else {
                return visualizationContexts.filter(filter)
            }
        } else {
            return visualizationContexts
        }
    }
    
    /**
     * Returns the descriptive text of a label shortened by the {@link OsgiOptions#DESCRIPTION_LENGTH} option.
     * @param text The text that should be shortened.
     * @param context The view context used to display the diagram.
     * @return The given string shortened by the description length option.
     */
    def static String descriptionLabel(String text, ViewContext context) {
        val threshold = context.getOptionValue(DESCRIPTION_LENGTH) as Number
        if (text === null) {
            return ""
        }
        if (text.length <= threshold.intValue) {
            return text
        }
        return text.substring(0, threshold.intValue) + " ..."
    }
    
    /**
     * Configures the layout of any overview node. Configures the box layout algorithm of elk.
     */
    def static void configureBoxLayout(KNode node) {
        node => [
            DiagramSyntheses.setLayoutOption(node, CoreOptions::ALGORITHM, "org.eclipse.elk.box")
//            setLayoutOption(CoreOptions::EXPAND_NODES, true)
        ]
    }
    
    /**
     * Configures the layout on a overview for the top level node that shows the connection between elements within that
     * overview.
     * 
     * @param node The node containing the elements of the overview.
     */
    def static void configureOverviewLayout(KNode node) {
        node => [
            setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
            setLayoutOption(CoreOptions::DIRECTION, Direction.RIGHT)
            setLayoutOption(CoreOptions::EDGE_ROUTING, EdgeRouting.POLYLINE)
        ]
    }
    
    /**
     * Returns the displayed string for {@link Class}es by taking the file name.
     * 
     * @param c The Class.
     * @return The displayed string for {@link Class}es.  
     */
    def static String displayedString(Class ei) {
        return ei.classPath.replace("\\", "/").split("/").last
    }
    
    
    
    /**
     * Configures the {@code option} of the {@code viewContext} with the new {@code value} while regarding some special
     * cases that arise when using an arbitrary Object as the value.
     * 
     * @param option The synthesis option
     * @param value The value for that option
     * @param viewContext The current {@code ViewContext} in which the option is configured
     */
    def static void configureSynthesisOption(SynthesisOption option, String value, ViewContext viewContext) {
        if (option.isChoiceOption) {
            // If the string representation matches between an option value and the new value, use that.
            var newOption = option.values.findFirst[toString.equals(value.toString)]
            if (option.values.contains(newOption)) {
                viewContext.configureOption(option, newOption)
            }
        } else if (option.isRangeOption) {
            val lowerBound = option.range.first
            val upperBound = option.range.second
            val stepSize = option.stepSize
            val initialValue = option.initialValue as Number
            if (lowerBound.equals(lowerBound.intValue())
                && upperBound.equals(upperBound.intValue())
                && stepSize.equals(stepSize.intValue())
                && initialValue.equals(initialValue.intValue())) {
                // The option contains an Integer
                viewContext.configureOption(option, Float.parseFloat(value).intValue)
            } else {
                // The option contains a Float
                viewContext.configureOption(option, Float.parseFloat(value))
            }
        } else if (option.isCheckOption) {
            viewContext.configureOption(option, Boolean.parseBoolean(value))
        } else if (option.isCategory) {
            viewContext.configureOption(option, Boolean.parseBoolean(value))
        } else if (option.isTextOption) {
            viewContext.configureOption(option, value)
        } else if (option.isSeparator) {
            // Do nothing, separators cannot be configured.
        }
    }
    
}
