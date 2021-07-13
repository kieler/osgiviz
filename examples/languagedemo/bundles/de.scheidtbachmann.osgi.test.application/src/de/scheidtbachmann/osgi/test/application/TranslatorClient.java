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
package de.scheidtbachmann.osgi.test.application;

import de.scheidtbachmann.osgi.language.services.translator.TranslatorService;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Example client for the translator service.
 * @author rumpf
 *
 */
@Component
public class TranslatorClient {

	@Reference
	private TranslatorService translatorService;
	
	/**
	 * performs a demo call to the translator service.
	 */
	@Activate
	public void activate() {
		translatorService.translate("nordic coding");
	}
}
