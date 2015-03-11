package edu.computerpower.student.dma_android_themes;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PreferencesActivity extends ActionBarActivity {

	private int selectedResourceId;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_preferences);

	}

	public void closePreferences(View view) {
		
		Intent intent = new Intent(this, MainActivity.class);
		
		if (selectedResourceId != 0) {
			intent.putExtra("themeid", selectedResourceId);
		}

		startActivity(intent);
	}

	public void setActivityTheme(View view) {
		int buttonId = view.getId();
		TextView txtSelectedTheme = (TextView)findViewById(R.id.txtSelectedTheme);
		switch (buttonId) {
		case R.id.btnSetWhiteTheme:
			selectedResourceId = R.style.WhiteTheme;
			txtSelectedTheme.setText("You have selected the White theme");
			txtSelectedTheme.setTextColor(Color.WHITE);
			break;
		case R.id.btnSetBlueTheme:
			selectedResourceId = R.style.BlueTheme;
			txtSelectedTheme.setText("You have selected the Blue theme");
			txtSelectedTheme.setTextColor(Color.BLUE);
			break;
		case R.id.btnSetRedTheme:
			selectedResourceId = R.style.RedTheme;
			txtSelectedTheme.setText("You have selected the Red theme");
			txtSelectedTheme.setTextColor(Color.RED);
			break;
		default:
			setTheme(R.style.WhiteTheme);
			selectedResourceId = R.style.WhiteTheme;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next, menu);
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
