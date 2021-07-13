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

import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import de.cau.cs.kieler.klighd.lsp.launch.ILanguageRegistration
import de.cau.cs.kieler.osgiviz.osgivizmodel.OsgivizmodelPackage
import de.scheidtbachmann.osgimodel.OsgimodelPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

/**
 * Binds and registers the KGraph language and sets up usage for the OSGi(-viz) models.
 * 
 * @author nre
 */
class OsgivizLanguageRegistration implements ILanguageRegistration {
    
    override bindAndRegisterLanguages() {
        // There needs to be at least one XText language supported, as the KGraphLSExtension fails otherwise bc of that.
        // "No Xtext languages have been registered. Please make sure you have added the languages\'s setup class in \'/META-INF/services/org.eclipse.xtext.ISetup\'
        // in LanguageServerImpl.
        KGraphLSSetup.doLSSetup
        // Initialize the model packages by making sure they have been called.
        var osgimodelPackageInstance = OsgimodelPackage.eINSTANCE
        var osgivizmodelPackageInstance = OsgivizmodelPackage.eINSTANCE
        
        // use the variables to remove unused warning
        osgimodelPackageInstance = osgimodelPackageInstance
        osgivizmodelPackageInstance = osgivizmodelPackageInstance
        
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("model", new XMIResourceFactoryImpl);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("osgiviz", new XMIResourceFactoryImpl);
    }
}