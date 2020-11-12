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
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.osgiviz.language.server

import de.cau.cs.kieler.klighd.lsp.KGraphLanguageClient
import de.cau.cs.kieler.klighd.lsp.launch.AbstractLsCreator
import java.util.List
import org.eclipse.xtext.ide.server.ILanguageServerExtension

/** 
 * Provides methods to create a LS.
 * This involves binding of modules and creating, starting, and configure logging for an LS.
 * 
 * @author nre
 */
class OsgivizLsCreator extends AbstractLsCreator {
    
    override getLanguageServerExtensions() {
        val List<ILanguageServerExtension> iLanguageServerExtensions = #[
            injector.getInstance(OsgivizRegistrationLanguageServerExtension)
        ]
        return iLanguageServerExtensions
    }
    
    override getRemoteInterface() {
        KGraphLanguageClient
    }
    
}
