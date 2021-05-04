package de.scheidtbachmann.osgi.language.database.provider.file.internal;

import org.osgi.service.component.annotations.Component;

import de.scheidtbachmann.osgi.language.model.LanguageDatabase;
import de.scheidtbachmann.osgi.language.model.impl.LanguageDatabaseImpl;
import de.scheidtbachmann.osgi.language.services.dataprovider.LanguageDatabaseProvider;

/**
 * Service implementation for loading language databases from file storage.
 * @author rumpf
 *
 */
@Component(name="FileBasedLanguageDatabaseLoader",service= {LanguageDatabaseProvider.class})
public class FileBasedLanguageDatabaseLoader implements LanguageDatabaseProvider{

	@Override
	public LanguageDatabase loadDatabase(String type) {
		// ...do some IO...
		return new LanguageDatabaseImpl(type);
	}

}
