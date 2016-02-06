package org.triloaded.unwired.projects;

public class ProjectListItem {

	private String heading;
	private int image;

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "[heading=" + 
				heading +  "]";
	}
	
}
