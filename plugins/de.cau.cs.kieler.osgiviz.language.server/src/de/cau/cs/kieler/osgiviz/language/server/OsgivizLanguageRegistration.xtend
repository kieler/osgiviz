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

import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import de.cau.cs.kieler.klighd.lsp.launch.ILanguageRegistration
import de.cau.cs.kieler.osgiviz.osgivizmodel.impl.OsgivizmodelPackageImpl
import de.scheidtbachmann.osgimodel.impl.OsgimodelPackageImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

/**
 * Binds and registers the KGraph language and sets up usage for the OSGi(-viz) models.
 * 
 * @author nre
 */
class OsgivizLanguageRegistration implements ILanguageRegistration {
    
    override bindAndRegisterLanguages() {
        KGraphLSSetup.doLSSetup
        OsgimodelPackageImpl.init
        OsgivizmodelPackageImpl.init
        
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("model", new XMIResourceFactoryImpl);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("osgiviz", new XMIResourceFactoryImpl);
    }
}