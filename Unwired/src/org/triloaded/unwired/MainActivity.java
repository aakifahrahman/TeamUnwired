package org.triloaded.unwired;

import org.triloaded.unwired.projects.ProjectsMenu;
import org.triloaded.unwired.sponsors.Sponsors;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnTouchListener {

	Intent i;
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageView iv = (ImageView) findViewById (R.id.image);
		iv.setImageResource(R.drawable.onclick);
		if (iv != null) {
			iv.setOnTouchListener (this);
		}

	}

	@Override 
	public void onResume() {
		super.onResume();
		setContentView(R.layout.activity_main);

		ImageView iv = (ImageView) findViewById (R.id.image);
		iv.setImageResource(R.drawable.onclick);
		if (iv != null) {
			iv.setOnTouchListener (this);
		}

	}
	
	public boolean onTouch (View v, MotionEvent ev) {

		final int action = ev.getAction();

		final int evX = (int) ev.getX();
		final int evY = (int) ev.getY();
	
		ImageView imageView = (ImageView) v.findViewById (R.id.image);
		if (imageView == null) return false;

		switch (action) {
		
			case MotionEvent.ACTION_DOWN:
				Log.i("aaki", "DOWN");
				break;

			case MotionEvent.ACTION_UP :
				int touchColor = getHotspotColor (R.id.image_areas, evX, evY);

				ColorTool ct = new ColorTool ();
				int tolerance = 90;
				
				if (ct.closeMatch (Color.RED, touchColor, tolerance)){ 
		
					imageView.setImageResource(R.drawable.onclick3);
					showBanner("Our Projects", 1000);
					
					i = new Intent(this, ProjectsMenu.class);
					Thread thread = new Thread(){
				           @Override
				           public void run() {
				                try {
				                   Thread.sleep(1000);
				                   startActivity(i);   
				                } 
				                catch (Exception e) {
				                   e.printStackTrace();
				                }
				           } 
				     };
				     thread.start();
				}
				else 
				if (ct.closeMatch (Color.GREEN, touchColor, tolerance)){ 
					
					imageView.setImageResource(R.drawable.onclick2);
					showBanner("Locate Us", 1000);
					
					i = new Intent(this, Map.class);
					Thread thread = new Thread(){
				           @Override
				           public void run() {
				                try {
				                   Thread.sleep(1000);
				                   startActivity(i);   
				                } 
				                catch (Exception e) {
				                   e.printStackTrace();
				                }
				           } 
				     };
				     thread.start();
				     
				}
				else 
				if (ct.closeMatch (Color.BLUE, touchColor, tolerance)){ 
					
					imageView.setImageResource(R.drawable.onclick1);
					showBanner("About Us", 1000);
					
					i = new Intent(this, AboutUs.class);
					Thread thread = new Thread(){
				           @Override
				           public void run() {
				                try {
				                   Thread.sleep(1000);
				                   startActivity(i);   
				                } 
				                catch (Exception e) {
				                   e.printStackTrace();
				                }
				           } 
				     };
				     thread.start();
				     
				}
				else 
				if (ct.closeMatch (Color.YELLOW, touchColor, tolerance)){ 

					imageView.setImageResource(R.drawable.onclick4);
					showBanner("Contact Us", 1000);
					
					i = new Intent(this, Info.class);
					Thread thread = new Thread(){
				           @Override
				           public void run() {
				                try {
				                   Thread.sleep(1000);
				                   startActivity(i);   
				                } 
				                catch (Exception e) {
				                   e.printStackTrace();
				                }
				           } 
				     };
				     thread.start();
					
				}
				else 
				if (ct.closeMatch (Color.BLACK, touchColor, tolerance)){ 
					
					imageView.setImageResource(R.drawable.onclick5);
					showBanner("Our Sponsors", 1000);
					
					i = new Intent(this, Sponsors.class);
					Thread thread = new Thread(){
				           @Override
				           public void run() {
				                try {
				                   Thread.sleep(1000);
				                   startActivity(i);   
				                } 
				                catch (Exception e) {
				                   e.printStackTrace();
				                }
				           } 
				     };
				     thread.start();
				}
				 
				Log.i("aaki", "UP");
				break;

			default:
				

		} 

		return true;
	}   

	public int getHotspotColor (int hotspotId, int x, int y) {
		ImageView img = (ImageView) findViewById (hotspotId);
		if (img == null) {
			Log.d ("ImageAreasActivity", "Hot spot image not found");
			return 0;
		} 
		else 
		{
			img.setDrawingCacheEnabled(true); 
			Bitmap hotspots = Bitmap.createBitmap(img.getDrawingCache()); 
			
			if (hotspots == null) {
				Log.d ("ImageAreasActivity", "Hot spot bitmap was not created");
				return 0;
			} 
			else {
				img.setDrawingCacheEnabled(false);
				return hotspots.getPixel(x, y);
			}
		}
	}

	public void showBanner(String title, long duration){
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast));

		Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/tertre.ttf");
		TextView text = (TextView) layout.findViewById(R.id.toast_text);
		text.setText(title);
		text.setTypeface(custom_font2);

		final Toast toast = new Toast(getApplicationContext());
		toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 0);
		toast.setDuration(Toast.LENGTH_SHORT);
		toast.setView(layout);
		toast.show();
		
		Handler handler  = new Handler();
		handler.postDelayed(new Runnable(){
			@Override
			public void run(){
				toast.cancel();
			}
		}, duration);
	}
	
} 