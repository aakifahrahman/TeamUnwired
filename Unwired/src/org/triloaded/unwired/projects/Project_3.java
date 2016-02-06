package org.triloaded.unwired.projects;

import org.triloaded.unwired.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class Project_3 extends Activity {

	@Override 
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.project_layout);
		
		Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/tertre.ttf");
		Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/dreamorphans.ttf");
		
		TextView heading = (TextView) findViewById(R.id.heading);
		heading.setTypeface(custom_font2);
		heading.setText("2014 SUPRA SAE INDIA"+Html.fromHtml("</br>"));
		
		ImageView image = (ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.project_4);
		
		TextView body = (TextView) findViewById(R.id.text);
		body.setText("VEHICLE NAME : Kalkitech Unleashed 2.0"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"VEHICLE NO : 58"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT: SUPRA SAEINDIA STUDENT FORMULA 2014"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT LOCATION : :Madras Motorsport Racing Track, Tamil Nadu"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"CAR SPECS:");
		body.setTypeface(custom_font);
		
		TextView body2 = (TextView) findViewById(R.id.text2);
		body2.setTypeface(custom_font);
		body2.setText("CHASSIS : AISI 4130 + AISI 1018 FRAME"+Html.fromHtml("<br/>")+
				    "SUSPENSION : Double-wishbone A-arms with fox bike shocks"+Html.fromHtml("<br/>")+
				    "ENGINE : HONDA CBR 600RR"+Html.fromHtml("<br/>")+
				    "LUBRICATION : DRY SUMP"+Html.fromHtml("<br/>")+
				    "DIFFERENTIAL : TORSEN T-1 LSD"+Html.fromHtml("<br/>")+
				    "BODY : Polypropylene + Glass fibre reinforced polymer"+Html.fromHtml("<br/>")+
				    "TYRES : HOOSIER 43128R25B, 44185WET"+Html.fromHtml("<br/>"));

		TextView body3 = (TextView) findViewById(R.id.text3);
		body3.setTypeface(custom_font);
		body3.setText("SPONSORS : Kelkitech, Altem, Speedway Kochi, Polycan, Popular Maruti, TEQIP"
					+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+"ACHIEVEMENTS : " +
							"Overall 11th among 97 teams who entered the FINALS"+
					Html.fromHtml("<br/>")+Html.fromHtml("<br/>"));

	}
	
}
