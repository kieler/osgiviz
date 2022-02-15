/*
 * OsgiViz - Kieler Visualization for Projects using the OSGi Technology
 * 
 * A part of kieler
 * https://github.com/kieler
 * 
 * Copyright 2019 by
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
package de.cau.cs.kieler.osgiviz

import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * A collection of all options that are used in the OSGi synthesis and their required enums.
 * 
 * @author nre
 */
class OsgiOptions {
    
    /** The enum holding all possible values for the {@link #BUNDLE_TEXT} option. */
    enum SimpleTextType {
        Id, Name
    }
    
    /** Option for setting the main text to be shown in unexpanded objects. */
    public static final SynthesisOption SIMPLE_TEXT = SynthesisOption.createChoiceOption("Descriptive text",
        #[SimpleTextType.Id, SimpleTextType.Name], SimpleTextType.Id)
        .description = "Set the main text to be shown in unexpanded objects."
    
    /** Option for toggling service components and classes to be shown on their own or in their bundle context. */
    public static final SynthesisOption SERVICE_CONNECTION_VISUALIZATION_IN_BUNDLES = SynthesisOption.createCheckOption(
        "Service connection visualization in bundles", false)
        .description = "Toggle service components and classes to be shown in their bundle context or on their own."
    
    /** Category option containing options for filtering. */
    public static final SynthesisOption FILTER_CATEGORY = SynthesisOption.createCategory("Filter", true)
        .description = "Category containing options for filtering."
    
    /** Category option containing options for text filtering. */
    public static final SynthesisOption TEXT_FILTER_CATEGORY = SynthesisOption.createCategory("Text filter", false)
        .setCategory(FILTER_CATEGORY)
        .description = "Category for filtering based on texts."
    
    /** Option for filtering bundles and services by their bundle category. */
    public static final SynthesisOption FILTER_BY_BUNDLE_CATEGORY = SynthesisOption.createTextOption(
        "Filter by Bundle Categories containing ...", "").setCategory(TEXT_FILTER_CATEGORY)
        .description = "Filter bundles and services by their bundle category. You may use a Java regex to specify complex filters."
    
    /** Option for filtering an overview by only elements containing the regular expression in their identifier. */
    public static final SynthesisOption FILTER_BY = SynthesisOption.createTextOption(
        "Filter by IDs containing ...", "").setCategory(TEXT_FILTER_CATEGORY)
        .description = "Filter an overview by only elements containing the regular expression in their identifier. You may use a Java regex to specify complex filters."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown bundles. */
    public static final SynthesisOption FILTER_BUNDLES = SynthesisOption.createCheckOption(
        "Apply to bundles", true).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown bundles."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown bundle categories. */
    public static final SynthesisOption FILTER_BUNDLE_CATEGORIES = SynthesisOption.createCheckOption(
        "Apply to bundle categories", false).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown bundle categories."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown features. */
    public static final SynthesisOption FILTER_FEATURES = SynthesisOption.createCheckOption(
        "Apply to features", true).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown features."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown package objects. */
    public static final SynthesisOption FILTER_PACKAGE_OBJECTS = SynthesisOption.createCheckOption(
        "Apply to package objects", true).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown package objects."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown products. */
    public static final SynthesisOption FILTER_PRODUCTS = SynthesisOption.createCheckOption(
        "Apply to products", true).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown products."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown service components. */
    public static final SynthesisOption FILTER_SERVICE_COMPONENTS = SynthesisOption.createCheckOption(
        "Apply to service components", false).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown service components."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown service interfaces. */
    public static final SynthesisOption FILTER_SERVICE_INTERFACES = SynthesisOption.createCheckOption(
        "Apply to service interfaces", true).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown service interfaces."
    
    /** Option that indicates if the {@link #FILTER_BY} option should be applied to shown classes. */
    public static final SynthesisOption FILTER_CLASSES= SynthesisOption.createCheckOption(
        "Apply to classes", true).setCategory(TEXT_FILTER_CATEGORY)
        .description = "Indicates if the \"Filter by IDs containing ...\"-option should be applied to shown classes."
    
    
    /** Category option containing options for view filtering. */
    public static final SynthesisOption VIEW_FILTER_CATEGORY = SynthesisOption.createCategory("View filter", false)
        .setCategory(FILTER_CATEGORY)
        .description = "Category for filtering the view."
    
    /** Option indicating whether external elements should be shown. */
    public static final SynthesisOption SHOW_EXTERNAL = SynthesisOption.createCheckOption(
        "External elements", true).setCategory(VIEW_FILTER_CATEGORY)
        .description = "Changes whether elements not directly defined in the model should be shown."
    
    /** Option indicating whether service elements should be shown in bundles. */
    public static final SynthesisOption BUNDLE_SHOW_SERVICES= SynthesisOption.createCheckOption(
        "Service Overviews in Bundles", true).setCategory(VIEW_FILTER_CATEGORY)
        .description = "Changes whether the service element overview should be shown in bundles for all the services that bundle uses or provides."
    
    /** Option that indicates if the cardinality label on referenced service interfaces are shown. */
    public static final SynthesisOption FILTER_CARDINALITY_LABEL = SynthesisOption.createCheckOption(
        "Cardinality label", true).setCategory(VIEW_FILTER_CATEGORY)
        .description = "Show the cardinality label on referenced service interfaces."
    
    /** Option that indicates if the description texts are shown at all. */
    public static final SynthesisOption FILTER_DESCRIPTIONS = SynthesisOption.createCheckOption(
        "Description texts", true).setCategory(VIEW_FILTER_CATEGORY)
        .description = "Show the description texts for all elements."
    
    /** Option for limiting the length of descriptive texts. */
    public static final SynthesisOption DESCRIPTION_LENGTH = SynthesisOption.createRangeOption(
        "Description text length", 0, 500, 1, 20).setCategory(VIEW_FILTER_CATEGORY)
        .description = "Limit the length of descriptive texts to this maximum value."
        
    /** Option for shortening all IDs by the prefix in the option. */
    public static final SynthesisOption SHORTEN_BY = SynthesisOption.createTextOption(
        "Shorten IDs by").setCategory(VIEW_FILTER_CATEGORY)
        .description = "Shorten all IDs by this prefix."
    
    /** Option for showing interactive buttons. */
    public static final SynthesisOption INTERACTIVE_BUTTONS = SynthesisOption.createCheckOption(
        "Interactive Buttons", true).setCategory(VIEW_FILTER_CATEGORY)
        .description = "Shows interactive buttons for navigating this view."
    
    
    /** Category option containing options for graphical performance. */
    public static final SynthesisOption PERFORMANCE = SynthesisOption.createCategory("Performance", false)
        .description = "Options for graphical performance."
    
    /** Option for using Icons or simpler texts. */
    public static final SynthesisOption SHOW_ICONS = SynthesisOption.createCheckOption("Icons", true)
        .setCategory(PERFORMANCE)
        .description = "Use images as icons for the buttons. Inflates the view model and reduces performance for a cleaner view."
}
