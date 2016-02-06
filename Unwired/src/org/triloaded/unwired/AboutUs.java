package org.triloaded.unwired;

import java.util.regex.Pattern;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class AboutUs extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us);
		
		Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/modeno.ttf");
		Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/dreamorphans.ttf");
		
		TextView us = (TextView) findViewById(R.id.txtus);
		us.setText("Official Name: SAEINDIA Collegiate Club, National Institute of Technology Calicut. " 
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				"Team Unwired: Visibly brilliant. We’re just another organization of those brilliant minds of NITC," +
				" with one difference. We don’t let go of our inquisitive nature." +
				" We use it to drive ourselves and push ourselves further so as to understand" +
				" the ways of nature, the laws of the universe and the beauty of science. " +
				 Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				"Striving to strike a balance between academics and our quest, at times we forego " +
				"sleep and forget we were hungry, working day and night just to satisfy " +
				"our intellectual hunger. Always looking to get our creations to challenge" +
				" the cutting edge, books can be found piled up and dog-eared, complex equations" +
				" broken and our own little theories cropping up as we build remote controlled " +
				"aircrafts and amphibian transporters. In the cold darkness of our hockey " +
				"grounds, we sometimes unfold our tripods and peer into the night skies through" +
				" our telescopes(Astro: Two 90 mm gallio telescopes). There is nothing that " +
				"enthrals us more than watching our little bots whirring through our workspace" +
				"(Won the fourth prize in IIT Bombay's 2011 robo-polo.) and our planes skimming" +
				" the blue skies. We have built three remote controlled airplanes of our own," +
				" which have flown in various college technological fests like IITBombay's " +
				"Techfest 2008 (18th position out of 120+ teams)." +
				 Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+ "In rocketry," +
				"we have conducted workshops for the NIT students and won the runners-up " +
				"in bottle rocketry competition (Prakshepan) at IIST trivandrum. " +
				"In the same technological fest (Conscientia), we got the second and third " +
				"prize for the amphibian transporter event(Salilsthalchar) and the robotics " +
				"competition(Bots up). In NIT Trichy, we ended up first in the “NFS Aqua” " +
				"remote controlled boat event. Needless to say, the money we receive is " +
				"invested in buying more equipment."
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				"We are immensely grateful to NITC for " +
				"guiding us all the way through, providing us with equipment and a space " +
				"both for our workshop and also in the computer center. Without their support " +
				"and trust, we would have remained a fledgling organization. Our projects " +
				"and achievements have been showcased in our famed technological fest " +
				"Tathva. Walk along gliders, quadrotors ( yes, the very same that was made " +
				"in the movie “3 idiots”) and a handful of remote controlled bots are " +
				"just a few of our completed projects. This Tathva, we have more to show. " 
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				"Amongst the teams of the year 2009 that competed in the hugely challenging " +
				"BAJA SAE India competition, ours is different in that we designed and " +
				"fabricated our own gearbox, suspensions and chassis for the off-road " +
				"buggy unlike the others that opted for industry-made equipment. " +
				"In Aakruti, a CAD competetion held by Dassault systems, we ended up " +
				"the first runner up, having presented the gearbox we designed and " +
				"created for our BAJA project. Next, it was Baja SAE India 2012 " +
				"where, we fabricated a new upgraded off-road vehicle and raced. " +
				" We used suggestions and the experience of the first attempt to " +
				"improve greatly on the performance and handling of the vehicle. " +
				"The car was 3rd fastest in the hill climb and the 8th quickest in " +
				"acceleration and secured overall16th out of the 244 teams. " +
				"Additionally, the team's faculty advisors Dr Sajith V and Mr " +
				"Shijo Thomas were awarded the Dronacharya Award for best faculties " +
				"in charge."
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				"Considering a good run in the Indian competitions such as " +
				"Baja SAE India and Asia, the decision was made to build track race cars " +
				"since it presented a much more challenging task. We got qualified for " +
				"the international Formula Student UK competition conducted in Silverstone," +
				" UK by IMechE and spent 18 months in the design and fabrication of the " +
				"vehicle. Called Unleashed 1.0, it was NITC's first representation in an " +
				"international student competition of such calibre. We were the first " +
				"Indian team with a dry sump lubrication system, that too in its first " +
				"attempt. This won considerable praise from the UK teams and judges. With " +
				"the enormous experience gained from the UK venture, the team decided to " +
				"put it to use in the Indian version of the competition: Supra SAE India. " +
				"This would imply rebuilding the car and fine tuning every component to " +
				"proper race worthiness."
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				"We secured the 11th position in SUPRA SAE " +
				"INDIA 2014 held at Madras Motor Race Track. We are now bracing to participate" +
				"in the BAJA SAE India competition to be held in NATRIP, Indore, " +
				"scheduled on 19-22 Feb 2015, this year. Having readied ourselves all through," +
				" each delving into the minute aspects of his expertise, we know we can " +
				"take it head-on. We have learned from our mistakes, we have done our " +
				"homework, we have pushed ahead and of most importance, we believe " +
				"in what we do. We have our little scuffles and our downs but we know if " +
				"true innovation and progress are to come about, it is passion that matters."
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>"));
		
		TextView heading = (TextView) findViewById(R.id.txttext);
		heading.setText("From the beginning in 2007 until now, reminiscence for each and " +
				"every member of SAE India Collegiate club of Nit calicut was too colourful to remember." +
				"A time period of 7 years and with in that frame, our club has been involved with numerous projects, " +
				"national and international, starting from the participation in Baja 2010. And this list continued on" +
				" and as years passed by , our club has grown beyond the limits and been witness to major events like" +
				" FS UK in 2013 held at Silverstone, UK and Supra Sae India Competition in 2014."+ Html.fromHtml("<br/>")
				+ Html.fromHtml("<br/>")
				+"Team " +"unwired is more than a club to any member. It gives them " +
				"a chance to realise the strength of hard work, " +
				"to explore  the worlds of wild imagination, the daring to think and most of all the will " +
				"to stand together united as a team."+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")
				+ "And  this never ends here. And let the future be the witness to that."+ Html.fromHtml("<br/>")
				+ "- Dr. Sajith V.");
		
		TextView body2 = (TextView) findViewById(R.id.txttext2);
		body2.setText("College did not seem very different from the days of school, " +
				"albeit some more freedom to do what I pleased after class. " +
				"There wasn't much that made a day eventful or left me excited for the next. " +
				"That was, until we had the orientation of Club Unwired and SAE India Collegiate Club NITC." 
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")
				+" For here was a group of youngsters who really liked to push their limits. " +
				"Joining the team was something that changed the way I saw the world around me and the whole \"Chalta Hai\"" +
				" attitude towards specifics was lifted. Working with them taught me" +
				" a number of things but if I were asked to name just one, I'd say I learned never to be content." +
				" There were very few who thought it feasible to aspire for a Formula Student UK event" +
				" when we had just done our second Baja in India. That clearly did not stop the team" +
				" from seeing the project through to the very end. Rest assured there were numerous" +
				" failures along the way but the method (and more importantly) the attitude that" +
				" was employed to overcome these was one of the most valuable lessons in the whole endeavor."
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")+
				" Something that was remarkable was how the team could be likened to an organism," +
				" filling the deficits and magnifying the strengths while all the way striding" +
				" towards that goal, constantly recalibrating the course through discussion." +
				" For this, it was essential that there exist absolutely no senior junior divide" +
				" and this being in the core philosophy of the team helped bring about better decision" +
				" making and quicker failure recovery."+ Html.fromHtml("<br/>")+Html.fromHtml("<br/>")
				+ "Personally, what I learned in my course of" +
				" working with the team has made me who I am today and was solely instrumental in" +
				" landing me my job at Honda Research and Development India. Coming from the" +
				" Production Engineering stream, not one generally preferred for research oriented professions," +
				" it was entirely the exposure with the team that let the firm even allow me to appear" +
				" for the selection process. A much larger \"organism\" where" +
				" team work is the very essence of its functioning, I feel very much at" +
				" home here and have a lot to thank Team Unwired for. At the end of the day," +
				" staying true to your passion is what brings you the most happiness."+ Html.fromHtml("<br/>")
				+ "Stay Unwired. Always."+ Html.fromHtml("<br/>")+"-Mithun Goutham");
		
		TextView body3 = (TextView) findViewById(R.id.txttext3);
		body3.setText("A team standing together with a mind set to race, to win with the car designed, fabricated and " +
				"developed all  by themselves."+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>")
				+"I felt being in the midst of a big family where " +
				"each of them work together through endless hours sharing their ideas, collaborating them and " +
				"coming up with their best. The knowledge that we gain, the skill that we develop, the tension that we have to " +
				"withstand, the failures that we have to accept, all these makes you different, different enough to" +
				" stand in the face of any challenge. A work for few months in that ten yards space is more" +
				" valuable to me compared to what i have learnt in hundred lectures over the years."+ Html.fromHtml("<br/>")
				+ Html.fromHtml("<br/>")+ "Unleash" +
				" the passion within you and just enjoy the ride. Stay unwired.."+ Html.fromHtml("<br/>")+"-Rahul Sebastian"
				+ Html.fromHtml("<br/>")+ Html.fromHtml("<br/>"));
		
		heading.setTypeface(custom_font);
		body2.setTypeface(custom_font);
		body3.setTypeface(custom_font);
		us.setTypeface(custom_font);
		
		TextView txt1 = (TextView) findViewById(R.id.txt1);
		TextView txt2 = (TextView) findViewById(R.id.txt2);
		TextView txt3 = (TextView) findViewById(R.id.txt3);
		txt1.setTypeface(custom_font2);
		txt2.setTypeface(custom_font2);
		txt3.setTypeface(custom_font2);
		
		TextView mainHeading = (TextView) findViewById(R.id.txtheading);
		mainHeading.setTypeface(custom_font);
		
		
	}
}
