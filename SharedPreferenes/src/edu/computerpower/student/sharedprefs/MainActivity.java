package edu.computerpower.student.sharedprefs;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private final static String PREFSNAME = "userprefs";
	private final static int PREF_MODE_PRIVATE = 0;
	private final static String PREFKEY_USERNAME = "username";
	private final static String PREFKEY_DEFAULT_USERNAME = "not set";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String username = getSharedPreferences(PREFSNAME,PREF_MODE_PRIVATE).getString(PREFKEY_USERNAME, PREFKEY_DEFAULT_USERNAME);
	}

	public void saveUsername(View view) {
		EditText editResetUsername = (EditText)findViewById(R.id.editResetUsername);
		if (editResetUsername.getText().toString().length() > 0) {
			Editor editor = getSharedPreferences(PREFSNAME,PREF_MODE_PRIVATE).edit();
			editor.putString(PREFKEY_USERNAME, editResetUsername.getText().toString());
			editor.commit();
			editResetUsername.setText("");
			TextView txtUsername = (TextView)findViewById(R.id.txtUsername);
			txtUsername.setText(getSharedPreferences(PREFSNAME,PREF_MODE_PRIVATE).getString(PREFKEY_USERNAME, PREFKEY_DEFAULT_USERNAME));
		}
	}

	public void cancelAndClear(View view) {
		EditText editResetUsername = (EditText)findViewById(R.id.editResetUsername);
		editResetUsername.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
