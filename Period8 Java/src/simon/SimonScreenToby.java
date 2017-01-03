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
	private ArrayList<MoveInterfaceToby> move;
	
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;

	public SimonScreenToby(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub

	}

}
