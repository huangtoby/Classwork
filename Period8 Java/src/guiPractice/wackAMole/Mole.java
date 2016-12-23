package guiPractice.wackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface{
	
	private int appearanceTime;
	
	public Mole(int x, int y){
		super(x,y,.3, "resources/sampleImages/Monty.png");
	}

	public Mole(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public Mole(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public int getAppearanceTime() {
		return appearanceTime;
	}

	public void setAppearanceTime(int d) {
		this.appearanceTime = d;	
	}

}
