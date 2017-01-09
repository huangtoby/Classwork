package guiPractice.gui2D;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordScreen extends Screen implements MouseListener{
	
	private TextLabel label;
	private Button back;

	public CoordScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		back = new Button(50,50,100,60,"Return", Color.black, new Action() {
			public void act() {
				ButtonCordGame.game.setScreen(ButtonCordGame.buttonScreen);
			}
		});
		label = new TextLabel(200, 200, 760, 40, "Coordinates");
		
		viewObjects.add(label);
		viewObjects.add(back);	
	}

	@Override
	public void mouseClicked(MouseEvent m) {
		if(back.isHovered(m.getX(), m.getY())){
			back.act();
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
