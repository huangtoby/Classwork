package chatbot;

public class TobySchool implements Chatbot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			TobyMain.print("(Type 'quit' to go back.)");
			//static call on promptInput method from TobyMain class
			schoolResponse = TobyMain.promptInput();
			if(schoolResponse.indexOf("quit") >=0){
				inSchoolLoop = false;
				TobyMain.promptForever();
			}
			TobyMain.print("That's my favorite part about school");
		}
	}

	public boolean isTriggered(String userInput) {
		//String[] triggers = {"school","class","teacher"};
		
		if(TobyMain.findKeyword(userInput, "school", 0) >=0){
			return true;
		}

		if(TobyMain.findKeyword(userInput, "class", 0) >=0){
			return true;
		}
		
		return false;
	}	
}


