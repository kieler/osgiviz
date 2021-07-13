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
package de.scheidtbachmann.osgi.language.services.translator;

/**
 * General purpose translator service.
 */
public interface TranslatorService {

	/**
	 * translates the given text.
	 * @param text the text to be translated
	 * @return the translated text
	 */
	String translate(String text);
	
}
