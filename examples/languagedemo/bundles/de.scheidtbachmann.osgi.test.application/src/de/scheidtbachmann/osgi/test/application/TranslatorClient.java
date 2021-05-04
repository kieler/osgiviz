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
