// ******************************************************************************
//
// Copyright (c) 2021 by
// Scheidt & Bachmann System Technik GmbH, 24145 Kiel
//
// This program and the accompanying materials are made available under the
// terms of the Eclipse Public License 2.0 which is available at
// http://www.eclipse.org/legal/epl-2.0.
// 
// SPDX-License-Identifier: EPL-2.0
//
// ******************************************************************************
package de.scheidtbachmann.osgi.language.services.dataprovider;

import de.scheidtbachmann.osgi.language.model.LanguageDatabase;

/**
 * provides the language database
 * @author rumpf
 *
 */
public interface LanguageDatabaseProvider {
	
	/**
	 * loads the database
	 * @param type the translation type
	 * @return the language database
	 */
	LanguageDatabase loadDatabase(String type);
}
