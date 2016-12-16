package guiPractice.components;

import java.awt.image.BufferedImage;
import guiPractice.components.Visible;

public class Graphic implements Visible {

	
	//fields
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	
	
	public Graphic(int x, int y, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, 0.0);
	}
	
	private void loadImages(String imageLocation, double d) {
		
	}

	public BufferedImage getImage() {
		return null;
	}

	public int getX() {
		return 0;
	}

	public int getY() {
		return 0;
	}

	public int getWidth() {
		return 0;
	}

	public int getHeight() {
		return 0;
	}

	public boolean isAnimated() {
		return false;
	}

	public void update() {

	}

}