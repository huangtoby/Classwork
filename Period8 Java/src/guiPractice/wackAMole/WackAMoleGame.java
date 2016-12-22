package guiPractice.wackAMole;

import guiPractice.GUIApplication;

public class WackAMoleGame extends GUIApplication {

	public WackAMoleGame() {
		// TODO Auto-generated constructor stub
	}

	protected void initScreen() {
		WackAMoleScreen wams = new WackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);

	}

	public static void main(String[] args) {
		WackAMoleGame game = new WackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

}
