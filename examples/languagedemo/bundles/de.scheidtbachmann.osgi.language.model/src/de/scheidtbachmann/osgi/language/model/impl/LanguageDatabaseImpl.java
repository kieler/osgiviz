package de.scheidtbachmann.osgi.language.model.impl;

import java.util.HashMap;
import java.util.Map;

import de.scheidtbachmann.osgi.language.model.LanguageDatabase;

/**
 * Generic storage for a  language
 * @author rumpf
 *
 */
public class LanguageDatabaseImpl implements LanguageDatabase {

	private Map<String,String> dictionary = new HashMap<>();
	private String identifier;
	
	/**
	 * creates the language database
	 * @param identifier free identifier
	 */
	public LanguageDatabaseImpl(final String identifier) {
		this.identifier = identifier;
		
	}
	@Override
	public String translateWord(String word) {
		return dictionary.get(word);
	}

	@Override
	public String getIdentifier() {
		return identifier;
	}

}
