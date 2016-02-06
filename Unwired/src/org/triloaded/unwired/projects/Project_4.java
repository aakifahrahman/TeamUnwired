package org.triloaded.unwired.projects;

import org.triloaded.unwired.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class Project_4 extends Activity {

	@Override 
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.project_layout);
		
		Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/tertre.ttf");
		Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/dreamorphans.ttf");
		
		TextView heading = (TextView) findViewById(R.id.heading);
		heading.setTypeface(custom_font2);
		heading.setText("2013 FSUK"+Html.fromHtml("</br>"));
		
		ImageView image = (ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.project_3);
		
		TextView body = (TextView) findViewById(R.id.text);
		body.setText("VEHICLE NAME : Kennametal Unleashed 1.0"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"VEHICLE NO : 52"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT: Formula Student UK 2013"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT LOCATION : Silverstone Racing Circuit, United Kingdom"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"CAR SPECS:");
		body.setTypeface(custom_font);
		
		TextView body2 = (TextView) findViewById(R.id.text2);
		body2.setTypeface(custom_font);
		body2.setText("CHASSIS : AISI 4130 FRAME"+Html.fromHtml("<br/>")+
				    "SUSPENSION : Double-wishbone A-arms with fox bike shocks"+Html.fromHtml("<br/>")+
				    "ENGINE : HONDA CBR 600RR"+Html.fromHtml("<br/>")+
				    "LUBRICATION : DRY SUMP"+Html.fromHtml("<br/>")+
				    "DIFFERENTIAL : TORSEN T-1 LSD"+Html.fromHtml("<br/>")+
				    "BODY : Glass fibre reinforced polymer"+Html.fromHtml("<br/>")+
				    "TYRES : HOOSIER 43128R25B, 44185WET"+Html.fromHtml("<br/>"));

		TextView body3 = (TextView) findViewById(R.id.text3);
		body3.setTypeface(custom_font);
		body3.setText("SPONSORS : Kennametal, Startup-village, Rajah Ayurveda," +
				"FlyinskyTravel, Ministry of Industries -Kerala Govt"
					+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+"ACHIEVEMENTS : ONE AMONG THE ONLY 5 TEAMS FROM INDIA," +
							" Overall 79th"
							+Html.fromHtml("<br/>")+Html.fromHtml("<br/>"));

	}
	
}
