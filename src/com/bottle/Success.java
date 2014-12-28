package com.bottle;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Success extends Activity implements OnClickListener{
	private Button home;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        					 WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_success);
		
        home = (Button)findViewById(R.id.homesuccess);
        home.setOnClickListener(this);
        
        new Timer().schedule(new TimerTask(){
            public void run() { 
                startActivity(new Intent(Success.this, Main.class));
            }
        }, 20000 /*amount of time in milliseconds before execution*/ );
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
	        case R.id.homesuccess:
	            startActivity(new Intent(Success.this, Main.class));
	        	break;
		}
	}

}
