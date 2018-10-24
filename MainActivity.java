package com.mycompany.myapp2;

import android.app.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	
	boolean flag = true;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		 final View background = findViewById(R.id.background);
		Button btn = (Button)findViewById(R.id.button);
		
		btn.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p)
				{
					if(flag){
						background.setBackgroundColor(Color.parseColor("#FF0000"));
					} else {
						background.setBackgroundColor(Color.parseColor("#00FF00"));
					}
					flag = !flag;
				}
				
		});
		
    }
}
