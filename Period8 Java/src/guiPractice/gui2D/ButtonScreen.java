package guiPractice.gui2D;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Visible;
import simon.ButtonInterfaceToby;
import simon.SimonScreenToby;

public class ButtonScreen extends Screen implements MouseListener{

	private Button button;
	private ButtonInterface[] buttons;
	public static String[][] coord;
	public static int[] getCoord;
	
	public ButtonScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		addButtons(viewObjects);
		button = new Button(locateX(),locateY(),100,60,"Button", Color.GRAY, new Action() {
			public void act() {
				ButtonCordGame.game.setScreen(ButtonCordGame.coordScreen);
			}
		});
		
		viewObjects.add(button);	
	}

	private void addButtons(ArrayList<Visible> viewObjects) {
		int numberOfButtons = 16;
		buttons = new ButtonInterface[numberOfButtons];
		for(int i = 0; i <numberOfButtons;i++){
			buttons[i] = getAButton();
			buttons[i].setColor(Color.black);
			ButtonInterface b = buttons[i];
			viewObjects.add(buttons[i]);
		}
		coord = createCoord(buttons);		
	}

	private String[][] createCoord(ButtonInterface[] buttons) {
		coord = new String[4][4];
		for(int row = 0; row <coord.length; row++){
			for(int col = 0; col <coord[row].length; col++){
				buttons.length = setX(20+13*row);
				buttons.setY(20+13*col);
			}
		}
		return coord;
	}

	private ButtonInterface getAButton() {
		// TODO Auto-generated method stub
		return null;
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
