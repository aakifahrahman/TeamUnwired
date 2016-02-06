package org.triloaded.unwired.projects;

import org.triloaded.unwired.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class Project_1 extends Activity {

	@Override 
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.project_layout);
		
		Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/tertre.ttf");
		Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/dreamorphans.ttf");
		
		TextView heading = (TextView) findViewById(R.id.heading);
		heading.setTypeface(custom_font2);
		heading.setText("2015 JKTYRE FDC"+Html.fromHtml("</br>"));
		
		ImageView image = (ImageView) findViewById(R.id.image);
		image.setImageResource(R.drawable.project_5);

		TextView body = (TextView) findViewById(R.id.text);
		body.setText("VEHICLE NAME : Suvire Unleashed 2.1"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"VEHICLE NO : 31"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT: JKTyre Formula Design Challenge 2015"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"EVENT LOCATION : Kari Motor Speedway, Chettipalayam, Coimbatore"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
					"CAR SPECS:");
		body.setTypeface(custom_font);
		
		TextView body2 = (TextView) findViewById(R.id.text2);
		body2.setTypeface(custom_font);
		body2.setText("CHASSIS : AISI 4130 + AISI 1018 FRAME"+Html.fromHtml("<br/>")+
				    "SUSPENSION : Double-wishbone A-arms with fox bike shocks"+Html.fromHtml("<br/>")+
				    "ENGINE : HONDA CBR 600RR"+Html.fromHtml("<br/>")+
				    "LUBRICATION : WET SUMP"+Html.fromHtml("<br/>")+
				    "DIFFERENTIAL : TORSEN T-1 LSD"+Html.fromHtml("<br/>")+
				    "TYRES : HOOSIER 43128R25B, 44185WET"+Html.fromHtml("<br/>")+
				    "BODY : Glass fibre reinforced polymer"+Html.fromHtml("<br/>"));

		TextView body3 = (TextView) findViewById(R.id.text3);
		body3.setTypeface(custom_font);
		body3.setText("SPONSORS : Suvire Group, Stanley, Speedway Kochi, Altem"
					+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+"ACHIEVEMENTS : " +
							"1st in Cost Event, 15th in Design Event, " +
							"16th in Business Plan Presentation, " +
							"Overall 12th"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>"));

	}
	
}
