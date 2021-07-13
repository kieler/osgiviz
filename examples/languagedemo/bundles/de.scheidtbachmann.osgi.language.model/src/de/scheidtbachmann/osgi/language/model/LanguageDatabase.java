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
package de.scheidtbachmann.osgi.language.model;

/**
 * Generic interface for a language database.
 * @author rumpf
 */
public interface LanguageDatabase {
	
	/**
	 * @return the identifier of the database.
	 */
	String getIdentifier();
	
	/**
	 * translates the given text.
	 * @param word the word to be translated
	 * @return the translation
	 */
	String translateWord(String word);
}
