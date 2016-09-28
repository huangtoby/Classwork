package chatbot;

public class TobyHello implements Chatbot {

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"We already said hello. Let's move the convesation along."
									+"You said hello already, Did you forget?"};
	
	private String[] angryResponses = {"Okay seriously. Stop saying hi. What is wrong with you "
									+"and saying hello?"};
	
	private int helloCount;
	
	public TobyHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();//helper method
			helloResponse = TobyMain.promptInput();
			//negate use !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				TobyMain.promptForever();
			}
		}
		
		
	}

	private void printResponse() {
		if(helloCount >4){
			int responseSelection = (int)(Math.random()*angryResponses.length);
			TobyMain.print(angryResponses[responseSelection]);
		}else{
				int responseSelection = (int)(Math.random()*calmResponses.length);
				TobyMain.print(calmResponses[responseSelection]);
		}
		
	}

	public boolean isTriggered(String userInput) {
		if(TobyMain.findKeyword(userInput, "hello", 0) >=0){
			return true;
			
		}
		if(TobyMain.findKeyword(userInput, "hi", 0) >=0){
			return true;
			
		}
		if(TobyMain.findKeyword(userInput, "hey", 0) >=0){
			return true;
			
		}
		return false;
	}

}
