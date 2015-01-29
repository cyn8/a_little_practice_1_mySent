package com.cyn.mysent;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{
	
	private EditText etNumber;
	private EditText etContent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etNumber = (EditText) findViewById(R.id.et_number);
		etContent = (EditText) findViewById(R.id.et_content);
		
		Button button = (Button) findViewById(R.id.btn_send);
		button.setOnClickListener(this);
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
		// TODO Auto-generated method stub
		String number = etNumber.getText().toString();
		String content = etContent.getText().toString();
		
		SmsManager smsManager = SmsManager.getDefault();
		
		smsManager.sendTextMessage(
				number, 
				null, 
				content, 
				null, 
				null);
	}
	

}
