package com.soboapps.lunchrun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class ListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {

        
		// Share Selected Items Button
		Button btnShareList = (Button) findViewById(R.id.shareMyList);
		btnShareList.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent share = new Intent(Intent.ACTION_SEND);
				share.setType("text/plain");
				share.putExtra(Intent.EXTRA_TEXT, "I'm being sent!!");
				startActivity(Intent.createChooser(share, "Share Text"));
			}
		});
    }
}