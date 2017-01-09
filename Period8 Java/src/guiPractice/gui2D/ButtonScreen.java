package guiPractice.gui2D;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Visible;

public class ButtonScreen extends Screen implements MouseListener{

	private Button button;
	public static String[][] coord;
	public static int[] getCoord;
	
	public ButtonScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		button = new Button(locateX(),locateY(),100,60,"Button", Color.GRAY, new Action() {
			public void act() {
				ButtonCordGame.game.setScreen(ButtonCordGame.coordScreen);
			}
		});
		
		viewObjects.add(button);	
	}

	private void addButtons() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		if(button.isHovered(m.getX(), m.getY())){
			button.act();
		}	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
		
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

}
