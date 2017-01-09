package guiPractice.gui2D;

import guiPractice.GUIApplication;

public class ButtonCordGame extends GUIApplication {

	public static ButtonCordGame game;
	public static ButtonCordScreen buttoncordScreen;
	
	public static void main(String[] args){
		game = new ButtonCordGame();
		Thread app = new Thread(game);
		app.start();
	}
	
	public ButtonCordGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		ButtonCordScreen bcs = new ButtonCordScreen(getWidth(), getHeight());
		setScreen(bcs);

	}

}
