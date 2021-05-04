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
