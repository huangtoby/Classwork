package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication {

	public static ClickGraphicsGame game;
	public static MoveScreen moveScreen;
	
	public static void main(String[] args){
		game = new ClickGraphicsGame();
		Thread app = new Thread(game);
		app.start();
	}

	protected void initScreen() {
		MoveScreen gcs = new MoveScreen(getWidth(), getHeight());
		setScreen(gcs);
	}

}
