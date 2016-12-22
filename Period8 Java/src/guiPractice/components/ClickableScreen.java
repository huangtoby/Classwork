package guiPractice.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;

public abstract class ClickableScreen extends Screen implements MouseListener{
	
	private ArrayList<Clickable> clickables;

	public ClickableScreen(int width, int height) {
		super(width, height);
	}

	abstract void initAllObjects(ArrayList<Visible> viewObjects);
	
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = 
		missing them code
	}

	public void mouseClicked(MouseEvent m) {
		for(Clickable c: clickables){
			if(c.isHovered(m.getX(), m.getY())){
				c.act();
				break;
			}
		}
	}
	
	public void addObject(Visible v){
		super.addObject(v);
		if(v instanceof Clickable){
			clickables.add((Clickable)v);
		}
	}
		 
	public void remove(Visible v){
		super.remove(v);
		clickables.remove(v);
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
	
	public MouseListener getMouseListenter(){
		return this;
	}

}
