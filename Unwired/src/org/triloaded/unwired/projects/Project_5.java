package org.triloaded.unwired.projects;

import org.triloaded.unwired.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class Project_5 extends Activity {

	@Override 
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.project_layout);
		
		Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/tertre.ttf");
		Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/dreamorphans.ttf");
		
		TextView heading = (TextView) findViewById(R.id.heading);
		heading.setTypeface(custom_font2);
		heading.setText("2012 BAJA SAE INDIA"+Html.fromHtml("</br>"));
		
		ImageView image = (ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.project_2);
		
		TextView body = (TextView) findViewById(R.id.text);
		body.setText("VEHICLE NAME : Gasotech Unwind 2.0"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"VEHICLE NO : 27"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT: BAJA SAE INDIA 2012"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT LOCATION : NATRAX, Pithampur, Indore, Madhya Pradesh"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"CAR SPECS:");
		body.setTypeface(custom_font);
		
		TextView body2 = (TextView) findViewById(R.id.text2);
		body2.setTypeface(custom_font);
		body2.setText("CHASSIS : AISI 1018 FRAME"+Html.fromHtml("<br/>")+
				    "SUSPENSION : DOUBLE-WISHBONE A-ARMS"+Html.fromHtml("<br/>")+
				    "ENGINE : Briggs & Stratton 10 hp OHV Intek"+Html.fromHtml("<br/>")+
				    "TRANSMISSION : CVT + CUSTOM GEARBOX"+Html.fromHtml("<br/>")+
				    "STEERING : Custom-built Rack & pinion"+Html.fromHtml("<br/>")+
				    "TYRES : KINGS TIRE - BAJA TRAX"+Html.fromHtml("<br/>"));

		TextView body3 = (TextView) findViewById(R.id.text3);
		body3.setTypeface(custom_font);
		body3.setText("SPONSORS : Gasotech, EATON, Sanpar"
					+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+"ACHIEVEMENTS : Overall 16th of 250 teams," +
							"Dronacharya Award - Best Faculty Advisors, 3rd in Hill Climb, 8th in Acceleration"
							+Html.fromHtml("<br/>")+Html.fromHtml("<br/>"));

	}
	
}
