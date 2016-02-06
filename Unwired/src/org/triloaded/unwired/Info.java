package org.triloaded.unwired;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Info extends Activity {

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.info);
	        
	        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/tertre.ttf");
			Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/modeno.ttf");
			
			TextView contact = (TextView) findViewById(R.id.txtheading);
			contact.setTypeface(custom_font2);
			
			TextView contactus = (TextView) findViewById(R.id.contactus);
			contactus.setTypeface(custom_font);
			contactus.setText(Html.fromHtml("<br/>")+"077-364-37859 Jobin George Mathew"+Html.fromHtml("<br/>")+
				    "094-974-20002 Aditya R Mohan"+Html.fromHtml("<br/>")+
				    "097-460-85066 Isa Rahman"+Html.fromHtml("<br/>")+Html.fromHtml("<br/>")+
				    "Email :"+Html.fromHtml("<br/>")+"teamunwired@nitc.ac.in, tuwnitc@gmail.com"
				    + Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				    "Youtube Channel :");
			
			TextView contactus2 = (TextView) findViewById(R.id.contactus2);
			contactus2.setTypeface(custom_font);
			contactus2.setText(Html.fromHtml("<a href=\"https://www.youtube.com/channel/UCZ-1FWuBQePQeAdoZx1S7Pw\">TeamUnwired NITC</a>"));
			contactus2.setMovementMethod(LinkMovementMethod.getInstance());

			TextView contactus3 = (TextView) findViewById(R.id.contactus3);
			contactus3.setTypeface(custom_font);
			contactus3.setText(Html.fromHtml("<br/>")+"Facebook :");
			
			TextView contactus4 = (TextView) findViewById(R.id.contactus4);
			contactus4.setTypeface(custom_font);
			contactus4.setText(Html.fromHtml("<a href=\"https://www.facebook.com/teamunwired\">Team Unwired</a>"));
			contactus4.setMovementMethod(LinkMovementMethod.getInstance());
			
			TextView contactus6 = (TextView) findViewById(R.id.contactus6);
			contactus6.setTypeface(custom_font);
			contactus6.setText(Html.fromHtml("<br/>")+"Institute Website :");
			
			TextView contactus7 = (TextView) findViewById(R.id.contactus7);
			contactus7.setTypeface(custom_font);
			contactus7.setText(Html.fromHtml("<a href=\"http://www.nitc.ac.in\">NIT Calicut</a>"));
			contactus7.setMovementMethod(LinkMovementMethod.getInstance());
			
			TextView contactus5 = (TextView) findViewById(R.id.contactus5);
			contactus5.setTypeface(custom_font);
			contactus5.setText(Html.fromHtml("<br/><br/>"));
			
	    }

}
