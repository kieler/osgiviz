/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.cau.cs.kieler.osgiviz.language.server

import com.google.inject.Singleton
import de.cau.cs.kieler.klighd.lsp.launch.AbstractRegistrationLanguageServerExtension
import de.cau.cs.kieler.klighd.lsp.launch.Language

/**
 * Extends the language server with support for the OSGi model and visualization languages.
 * 
 * @author nre
 */
 @Singleton
class OsgivizRegistrationLanguageServerExtension extends AbstractRegistrationLanguageServerExtension {
    
    override getLanguageExtensions() {
        return newArrayList(
            new Language("model", "Osgi Model", #[]),
            new Language("osgiviz", "OsgiViz Model", #[])
        )
    }
    
}