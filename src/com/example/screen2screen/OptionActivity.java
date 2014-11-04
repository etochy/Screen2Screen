package com.example.screen2screen;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OptionActivity extends Activity implements OnClickListener {
	
	private Intent intent;
	
	private Button retourmenu;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.option_activity);
		
		
		retourmenu = (Button)findViewById(R.id.retourmenu);

		retourmenu.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.retourmenu:
			System.exit(0);
			break;
		}

	}
	
}
