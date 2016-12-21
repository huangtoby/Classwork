package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;

public class MoveScreen extends Screen implements MouseListener{
	
	private ClickableGraphic teemo;

	public MoveScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		teemo = new ClickableGraphic(450,40,.4,"resources/sampleImages/Teemo.jpg");
		teemo.setAction(new Action(){
			public void act(){
				teemo.setX(teemo.getX()-10);
			}
		});
		viewObjects.add(teemo);
	}

	public void mouseClicked(MouseEvent m) {
		if(teemo.isHovered(m.getX(), m.getY())){
			teemo.act();
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
