package com.soboapps.lunchrun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class kfcListMenu extends Activity{
	
	String itemsordered;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kfcmain);
        final ListView lv=(ListView)findViewById(R.id.kfclistView);              
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.kfc_menu,android.R.layout.simple_list_item_1);
        lv.setAdapter(adapter);
        final ArrayList<String> myNewList = new ArrayList<String>();
        lv.setOnItemClickListener(new OnItemClickListener() {
        	
        	
        	
        	@Override
   			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {	
        		String item=lv.getItemAtPosition(arg2).toString();
	   			String itemordered;
	   			itemordered = item + " added to list";
	   			Toast.makeText(getApplicationContext(), itemordered, Toast.LENGTH_SHORT).show();
	   			myNewList.add(item);	   			
   			}
        });
        
				// List View Button
				Button btnLunchList = (Button) findViewById(R.id.lrList);
				btnLunchList.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {						
						setContentView(R.layout.selecteditems);
		                ListView selecteditems = (ListView) findViewById(android.R.id.list);
		        		ArrayAdapter<String> newadapter = new ArrayAdapter<String>(kfcListMenu.this, android.R.layout.simple_list_item_1, myNewList);              
				        selecteditems.setAdapter(newadapter);
				        
				        // Get sdCard location so we can Create Dir and File
				    	File sdCard = Environment.getExternalStorageDirectory();
				    	File lunchrun = new File(sdCard,"LunchRun");
				    	lunchrun.mkdirs();
				    	File file = new File(lunchrun, "LunchRun.txt");
				        PrintWriter out = null;
						try {
							out = new PrintWriter(new FileWriter(file));
						} catch (IOException e) {
							e.printStackTrace();
						}  
						
				        // Write each string in the array
						StringBuilder text = new StringBuilder();
				        for (String s : myNewList) {  
				            out.println(s);  
				        }  
				        out.close();
				        
				        // read File
		    			try {
		    			    BufferedReader br = new BufferedReader(new FileReader(file));
		    			    String line;
		    			    while ((line = br.readLine()) != null) {
		    			        text.append(line);
		    			        text.append(',');
		    			        text.append(' ');
		    			    }
		    			}
		    			catch (IOException e) {
		    			}
		    			itemsordered = "Please pick me up a " + text + "from KFC. Thanks!"; 
					}
				});
    }
    				
					public void shareMyList(View v){
				    	// Share Selected Items Button
				    	Button btnShareItems = (Button) findViewById(R.id.shareMyList);
				    	btnShareItems.setOnClickListener(new View.OnClickListener() {
	
				    		@Override
				    		public void onClick(View v) {
				    			Intent sendIntent = new Intent(Intent.ACTION_VIEW);
								sendIntent.putExtra("sms_body", itemsordered); 
				                sendIntent.setType("vnd.android-dir/mms-sms");
				                startActivity(sendIntent);
				    		}
			    		});
					}
}