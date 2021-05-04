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
