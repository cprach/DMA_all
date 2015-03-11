package edu.computerpower.student.weatherapp.settings;

import android.content.Context;
import edu.computerpower.student.weatherapp.data.Prefs;
import edu.computerpower.student.weatherapp.data.PrefsDataSource;

public class UserSettingsManagerDB {

	private PrefsDataSource prefsDatasource;
	private Prefs pref;

	private Prefs getPrefsDataSource(Context c) {
		if (prefsDatasource == null) {
			prefsDatasource = new PrefsDataSource(c);
		}
		prefsDatasource.open();
		if ((pref = prefsDatasource.getPref()) == null) {
			pref = prefsDatasource.createPref("melbourne", "metric", "white");
		}	
		prefsDatasource.close();
		return pref;
	}

}
