package org.triloaded.unwired.projects;

import org.triloaded.unwired.ColorTool;
import org.triloaded.unwired.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class ProjectsMenu extends Activity implements View.OnTouchListener {
	
	Intent i;
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.projects);

		ImageView iv = (ImageView) findViewById (R.id.image);
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
					i = new Intent(this, Project_2.class);
					startActivity(i);   
				}
				else 
				if (ct.closeMatch (Color.GREEN, touchColor, tolerance)){ 
					i = new Intent(this, Project_1.class);
					startActivity(i);
				}
				else 
				if (ct.closeMatch (Color.WHITE, touchColor, tolerance)){ 
						i = new Intent(this, Project_3.class);
						startActivity(i);
				}
				else 
				if (ct.closeMatch (Color.BLACK, touchColor, tolerance)){ 
						i = new Intent(this, Project_4.class);
						startActivity(i);
				}
				else 
				if (ct.closeMatch (Color.BLUE, touchColor, tolerance)){ 
					i = new Intent(this, Project_5.class);
					startActivity(i);
				}
				
				else 
				if (ct.closeMatch (Color.YELLOW, touchColor, tolerance)){ 
					i = new Intent(this, Project_6.class);
					startActivity(i);
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
	
}
