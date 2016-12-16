package guiPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

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
		loadImages(imageLocation, 0, 0);
	}
	
	private void loadImages(String imageLocation, int w, int h) {
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			
			if(w == 0 && h == 0){
				//use original scale
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				//draw icon into image
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0 , null);
			}else{
				//use custom size (complete on Monday)
			}
			loadedImages = true;
		}catch(Exception e){
			//in case file is not found
			e.printStackTrace();
		}
	}

	private void loadImages(String imageLocation, double scale) {
		
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