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

package de.scheidtbachmann.osgi.language.database.provider.file.internal;

import org.osgi.service.component.annotations.Component;

import de.scheidtbachmann.osgi.language.model.LanguageDatabase;
import de.scheidtbachmann.osgi.language.model.impl.LanguageDatabaseImpl;
import de.scheidtbachmann.osgi.language.services.dataprovider.LanguageDatabaseProvider;

/**
 * Service implementation for loading language databases from file storage.
 * @author rumpf
 *
 */
@Component(name="FileBasedLanguageDatabaseLoader",service= {LanguageDatabaseProvider.class})
public class FileBasedLanguageDatabaseLoader implements LanguageDatabaseProvider{

	@Override
	public LanguageDatabase loadDatabase(String type) {
		// ...do some IO...
		return new LanguageDatabaseImpl(type);
	}

}
