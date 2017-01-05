package simon;

import java.util.ArrayList;
import java.util.List;

import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class SimonScreenToby extends ClickableScreen implements Runnable {
	
	private TextLabel label;
	private ButtonInterfaceToby[] button;
	private ProgressInterfaceToby progress;
	private ArrayList<MoveInterfaceToby> sequence;
	
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;

	public SimonScreenToby(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceToby>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);	

	}
	
	private MoveInterfaceToby randomMove() {
		ButtonInterfaceToby b;
		//code that randomly selects a ButtonInterface
		b = (int)(Math.random()*button.length);
		lastSelectedButton = b;
		while(b == lastSelectedButton){
			b = (int)(Math.random()*button.length);
		}
		return getMove(b);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceToby getProgress() {
		// TODO Auto-generated method stub
		return null; 
	}

	private void addButtons() {
		int numberOfButtons = 5;
		
		
	}

}
