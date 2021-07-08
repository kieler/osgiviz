package de.scheidtbachmann.osgi.language.german2klingon.internal;

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
@Component(service= {TranslatorService.class})
public class German2KlingonTranslator implements TranslatorService{

	@Reference
	private LanguageDatabaseProvider databaseProvider;
	
	private LanguageDatabase database;
	
	/**
	 * triggers loading of the database.
	 */
	@Activate
	public void activate() {
		database = databaseProvider.loadDatabase("german2Klingon");
	}
	
	@Override
	public String translate(String text) {
		return database.translateWord(text);
	}
}
