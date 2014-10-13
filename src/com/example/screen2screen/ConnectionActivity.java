package com.example.screen2screen;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ExpandableListView;

public class ConnectionActivity extends Activity{
	
	public ExpandableListView list;
	public Button conn;
	public Button retour;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.connection_activity);
	
			list = (ExpandableListView) findViewById(R.id.list);
			conn = (Button) findViewById(R.id.buttonConn);
			retour = (Button) findViewById(R.id.buttonReturn);
			
	       
	        list.setGroupIndicator(null);
	        list.setChildIndicator(null);
	        
	        String[] titles = {"Téléphone Esteban","Téléphone B","Téléphone C"};
	        String[] fruits = {"a1","a2"};
	        String[] veggies = {"b1","b2","b3"};
	        String[] meats = {"c1","c2"};
	        String[][] contents = {fruits,veggies,meats};
	        
	        MyExpandableAdapter adapter = new MyExpandableAdapter(this,titles,contents);

	        list.setAdapter(adapter);
	        
	       
		
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

