package guiPractice.wackAMole;

import java.util.ArrayList;
import java.util.List;

import guiPractice.components.Action;
import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class WackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	public void initAllObjects(List<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60,50, 120, 60, "");
		viewObjects.add(label);
		viewObjects.add(player);
		viewObjects.add(timeLabel);
	}

	public void update(){
		super.update();
	}
	
	private void changeText(String s){
		try{
			label.setText(s);
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void run() {
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0){
			//frame updates every 100ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}
	}
	
	private void addNewMoles() {
		//probability of mole appearance depends on time left
		double probability = .2+.1*(30.0-timeLeft)/30;
		if(Math.random() <probability){
			final MoleInterface mole = getAMole();
			//between .5 and 2.5 seconds
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//remove mole from viewObjects
					remove(mole);
					//remove mole from database
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		//each mole has a "clock"
		//when the clock counts down to zero, it disappears
		for(int i = 0; i <moles.size(); i++){
			MoleInterface m = moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime()-100);
			if(m.getAppearanceTime() <= 0){
				//remove from viewObjects
				remove(m);
				//remove mole from database
				moles.remove(i);
				i--;//compensate for i++
			}
		}
		
	}

	/**
	 * this is a placeholder because early in the game design process, the players aren't designed yet, 
	 * so we use this method later, once we lean how to create a Player
	 * @return
	 */
	private PlayerInterface getAPlayer(){
		return new Player(20,20);
	}
	
	/**
	 * this is a placeholder because early in the game design process, the enemies aren't designed yet, 
	 * so we use this method later, once we lean how to create an Enemy(moles)
	 * @return
	 */
	private MoleInterface getAMole(){
		return new Mole((int)(getWidth()*Math.random())-100, (int)(getHeight()*Math.random()));
	}

}
