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
