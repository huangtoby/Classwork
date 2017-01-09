package guiPractice.gui2D;

import guiPractice.GUIApplication;

public class ButtonCordGame extends GUIApplication {

	public static ButtonCordGame game;
	public static ButtonScreen buttonScreen;
	public static CoordScreen coordScreen;
	
	public static void main(String[] args){
		game = new ButtonCordGame();
		Thread app = new Thread(game);
		app.start();
	}
	
	public ButtonCordGame() {
		// TODO Auto-generated constructor stub
	}

	protected void initScreen() {
		buttonScreen = new ButtonScreen(getWidth(), getHeight());
		coordScreen = new CoordScreen(getWidth(), getHeight());
		setScreen(buttonScreen);

	}

}
