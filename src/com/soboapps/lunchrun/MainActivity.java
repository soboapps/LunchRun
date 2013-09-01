package com.soboapps.lunchrun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Arbys Button
		Button btnArbys = (Button) findViewById(R.id.bArbys);
		btnArbys.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.ARBYSMAIN"));
			}
		});
		
		// A&W Button
		Button btnAW = (Button) findViewById(R.id.bAW);
		btnAW.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.AWMAIN"));
			}
		});
		
		// Burger King Button
		Button btnBurgerking = (Button) findViewById(R.id.bBurgerking);
		btnBurgerking.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.BURGERKINGMAIN"));
			}
		});
		
		
		// Carls Jr Button
		Button btnCarlsjr = (Button) findViewById(R.id.bCarlsjr);
		btnCarlsjr.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.CARLSJRMAIN"));
			}
		});
		
		// Chick-fil-a Chicken Button
		Button btnChickfila = (Button) findViewById(R.id.bChickfila);
		btnChickfila.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.CHICKFILAMAIN"));
			}
		});
		
		// Churches Chicken Button
		Button btnChurches = (Button) findViewById(R.id.bChurches);
		btnChurches.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.CHURCHESMAIN"));
			}
		});
		
		
		// Dairy Queen Button
		Button btnDQ = (Button) findViewById(R.id.bDQ);
		btnDQ.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.DQMAIN"));
			}
		});
		
		
		// Hardees Button
		Button btnHardees = (Button) findViewById(R.id.bHardees);
		btnHardees.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.HARDEESMAIN"));
			}
		});
		
		
		// KFC Button
		Button btnKFC = (Button) findViewById(R.id.bKFC);
		btnKFC.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.KFCMAIN"));
			}
		});
		
		
		// McDonalds Button
		Button btnMcdonalds = (Button) findViewById(R.id.bMcdonalds);
		btnMcdonalds.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.MCDONALDSMAIN"));
			}
		});
		
		
		// Panera Bread Button
		Button btnPanera = (Button) findViewById(R.id.bPanera);
		btnPanera.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.PANERAMAIN"));
			}
		});
		
		
		// Pizza Hut Button
		Button btnPizzahut = (Button) findViewById(R.id.bPizzahut);
		btnPizzahut.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.PIZZAHUTMAIN"));
			}
		});
		
		
		// Popeyes Button
		Button btnPopeyes = (Button) findViewById(R.id.bPopeyes);
		btnPopeyes.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.POPEYESMAIN"));
			}
		});
		
		// Subway Button
		Button btnSubway = (Button) findViewById(R.id.bSubway);
		btnSubway.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.SUBWAYMAIN"));
			}
		});		
		
		// Taco Bell Button
		Button btnTacobell = (Button) findViewById(R.id.bTacobell);
		btnTacobell.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.TACOBELLMAIN"));
			}
		});
		
		// Wendy's Button
		Button btnWendys = (Button) findViewById(R.id.bWendys);
		btnWendys.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
               startActivity(new Intent("com.soboapps.lunchrun.WENDYSMAIN"));
			}
		});
	}
		public boolean onCreateOptionsMenu(Menu menu){
			super.onCreateOptionsMenu(menu);
			MenuInflater aboutnc = getMenuInflater();
			aboutnc.inflate(R.menu.main_menu, menu);
			return true;
		}
		
		public boolean onOptionsItemSelected(MenuItem item){
			switch(item.getItemId()){
			case R.id.menuAbout:
				startActivity(new Intent("com.soboapps.lunchrun.ABOUT"));
				return true;
			case R.id.menuDonate:
				startActivity(new Intent("com.soboapps.lunchrun.DONATE"));
				return true;			
			}
			return false;
		}
}


















