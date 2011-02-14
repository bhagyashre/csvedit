package org.fhsolution.eclipse.plugins.csvedit.customeditor.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.fhsolution.eclipse.plugins.csvedit.Activator;

/**
 * Class used to initialize default preference values.
 *
 * @author fhenri
 *
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

    /**
     *
     * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
     */
    public void initializeDefaultPreferences() {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        store.setDefault(PreferenceConstants.USE_FIRST_LINE_AS_HEADER, true);
        store.setDefault(PreferenceConstants.CASE_SENSITIVE_SEARCH, false);
        store.setDefault(PreferenceConstants.CUSTOM_DELIMITER, ",");
    }

}