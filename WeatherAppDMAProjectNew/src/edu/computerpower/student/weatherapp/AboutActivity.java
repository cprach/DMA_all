package edu.computerpower.student.weatherapp;

//Instructor@computerpower

import com.example.dma1.R;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AboutActivity extends ActionBarActivity {

	private final static String PREFSNAME = "dmaprefs";
	private final static int PREF_MODE_PRIVATE = 0;
	private final static String PREFKEY_TEXTCOLOR = "textcolor";
	private final static String PREFKEYCHECK = "empty";

	private final static String TEXT_WHITE = "White";
	private final static String TEXT_BLUE = "Blue";
	private final static String TEXT_RED = "Red";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch (id) {
		case R.id.action_settings:
			launchPreferencesActivity();
			break;
		case R.id.action_getWeather:
			launchGetWeatherActivity();
			break;
		default:
			return false;
		}
		return super.onOptionsItemSelected(item);
	}

	private void launchPreferencesActivity(){
		Intent i = new Intent(this,PrefsActivity.class);
		startActivity(i);
	}

	private void launchGetWeatherActivity(){
		Intent i = new Intent(this,GetWeatherActivity.class);
		startActivity(i);
	}
}
