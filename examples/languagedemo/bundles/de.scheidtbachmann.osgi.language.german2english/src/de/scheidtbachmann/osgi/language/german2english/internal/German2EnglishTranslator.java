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
package de.scheidtbachmann.osgi.language.german2english.internal;

import de.scheidtbachmann.osgi.language.model.LanguageDatabase;
import de.scheidtbachmann.osgi.language.services.dataprovider.LanguageDatabaseProvider;
import de.scheidtbachmann.osgi.language.services.translator.TranslatorService;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Translator implementation for German to English translation.
 * @author rumpf
 *
 */
@Component
public class German2EnglishTranslator implements TranslatorService{

	@Reference
	private LanguageDatabaseProvider databaseProvider;
	private LanguageDatabase database;
	
	/**
	 * triggers loading of the database.
	 */
	@Activate
	public void activate() {
		database = databaseProvider.loadDatabase("german2English");
	}
	
	@Override
	public String translate(String text) {
		return database.translateWord(text);
	}
}
