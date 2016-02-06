package org.triloaded.unwired.projects;

import org.triloaded.unwired.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class Project_6 extends Activity {

	@Override 
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.project_layout);
		
		Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/tertre.ttf");
		Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/dreamorphans.ttf");
		
		TextView heading = (TextView) findViewById(R.id.heading);
		heading.setTypeface(custom_font2);
		heading.setText("2010 BAJA SAE ASIA"+Html.fromHtml("</br>"));
		
		ImageView image = (ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.project_1);
		
		TextView body = (TextView) findViewById(R.id.text);
		body.setText(Html.fromHtml("<h1>VEHICLE NAME : Gasotech Unwind 1.0</h1>")+
					"VEHICLE NO : 45"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT: SAE BAJA ASIA 2010"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT LOCATION : NATRAX, Pithampur, Indore, Madhya Pradesh"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"CAR SPECS:");
		body.setTypeface(custom_font);
		
		TextView body2 = (TextView) findViewById(R.id.text2);
		body2.setTypeface(custom_font);
		body2.setText("CHASSIS : AISI 4130 FRAME"+Html.fromHtml("<br/>")+
				    "SUSPENSION : DOUBLE-WISHBONE"+Html.fromHtml("<br/>")+
				    "ENGINE : Lombardini LGA 340"+Html.fromHtml("<br/>")+
				    "TRANSMISSION : CVT + CUSTOM GEARBOX"+Html.fromHtml("<br/>")+
				    "STEERING : Custom-built Rack & pinion"+Html.fromHtml("<br/>")+
				    "TYRES : KINGS TIRE - BAJA TRAX"+Html.fromHtml("<br/>"));

		TextView body3 = (TextView) findViewById(R.id.text3);
		body3.setTypeface(custom_font);
		body3.setText("SPONSORS : Gasotech, EATON, ONGC, HPL, NRB Bearings, ACC"
					+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+"ACHIEVEMENTS : 7th best in design, 3rd lightest vehicle"
				+Html.fromHtml("<br/>")+Html.fromHtml("<br/>"));

	}
	
}
