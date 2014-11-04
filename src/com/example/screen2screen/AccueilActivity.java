package com.example.screen2screen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AccueilActivity extends Activity implements OnClickListener{

	private Intent intent;
	
	private Button host;
	private Button connect;
	private Button option;
	private Button quit;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accueil_activity);

		host = (Button) findViewById(R.id.host);
		connect = (Button) findViewById(R.id.connect);
		option = (Button) findViewById(R.id.option);
		quit = (Button) findViewById(R.id.quit);


		host.setOnClickListener(this); 
		connect.setOnClickListener(this); 
		option.setOnClickListener(this); 
		quit.setOnClickListener(this); 




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

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.host:
			// do something
			break;
		case R.id.connect:
			ouvrirConnect();
			System.exit(0);
			break;
		case R.id.option:
			ouvrirOption();
			System.exit(0);
			break;
		case R.id.quit:
			System.exit(0);
			break;
		}
	}
	
	private void ouvrirOption() {
		intent = new Intent(this, OptionActivity.class);
		startActivity(intent);
	}
	private void ouvrirConnect(){
		intent = new Intent(this, ConnectionActivity.class);
		startActivity(intent);
	}
}
