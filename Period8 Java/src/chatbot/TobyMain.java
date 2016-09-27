package chatbot;

import java.util.Scanner;

public class TobyMain {
	
	static String response;
	static boolean inMainLoop;
	static Scanner input;
	static String user;
	//list all the chatbot available under this class
	static Chatbot school;
	
	public static void main(String[] args) {
		 //demostrateStringMethods();
		 createFields();
		 promptName();
		 promptForever();
	}	
	
	public static void promptName() {
		print("Enter your name");
		user = input.nextLine();
		print("Glad to meet you, "+user+". "
			+ "For the rest of time, I will call you "+user+"."
			+ " You may call me Computer."
			+ " We should become friends.");
	}

	public static void promptForever() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, "+user+". How are you?");
			response = promptInput();
			
			//response to how you feel
			if(findKeyword(response, "good",0)>=0){
				print("That's wonderful. So glad you feel good.");
			}
			
			else if(response.indexOf("school") >=0){
				print("School is great! Tell me about school.");
				inMainLoop = false;
				school.talk();
			}
			
			else{
				print("I don't understand.");
			}
		}	
	}

	public static int findKeyword(String searchString, String keyword, int StartPsn) {
		//delete white space
		searchString = searchString.trim();
		//make lowercase
		searchString = searchString.toLowerCase(); 
		keyword = keyword.toLowerCase();
		print("The phrase is "+searchString);
		print("The keyword is "+keyword);
		//find first position of keyword
		int psn = searchString.indexOf(keyword);
		System.out.println("The keyword was found at "+psn);
		
		//keep searching until context keyword is found
		while(psn >=0){
			//assume preceded and followed by space
			String before = " ";
			String after = " ";
			//check character in front, if it exists
			if(psn >0){
				before = searchString.substring(psn-1, psn);
				print("The character before is "+before);
			}
			//check if there is a character after the keyword
			if(psn+ keyword.length() <searchString.length()){
				after = searchString.substring
						(psn + keyword.length(), psn + keyword.length()+1);
				print("The character after is "+after);
			}
			if(before.compareTo("a")< 0 && after.compareTo("a") <0 && noNegations(searchString,psn)){
				print("Found "+keyword+" at "+psn);
				return psn;
			}else{
				//psn+1 is one space after our current psn, so this finds the NEXT word
				psn = searchString.indexOf(keyword,psn+1);
				print("Did not find "+keyword+", checking position " +psn);
			}
		}
		
		return -1;	
	}
	
	/**This is a helper method. A helper method is a method designed for "helping" a larger 
	 *method. Because of this, helper methods are generally private because they are only 
	 *used by only used by the methods they are helping. Also, when you do your project, I
	 *expect to see helper methods because they are also make code more READABLE
	 *@param searchString (always lowercase)
	 *@param psn
	 *@return "true" if there is no negation words in front of psn
	*/
	private static boolean noNegations(String searchString, int psn) {
		//check to see if the word "no" is in front of psn
		//check to see if there are 3 spaces in front
		//check to see if "no" is there
		if(psn -3 >=0 && searchString.substring(psn-3,psn).equals("no ")){
			return false;
		}
		
		if(psn -4 >=0 && searchString.substring(psn-4,psn).equals("not ")){
			return false;
			
		}
		
		if(psn -6 >=0 && searchString.substring(psn-6,psn).equals("never ")){
			return false;
		}	
		
		if(psn -4 >=0 && searchString.substring(psn-4,psn).equals("n't ")){
			return false;
		}
			
		return true;
	}

	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
	}
	
	private static void createFields() {
		input = new Scanner (System.in);
		user = "";
		school = new TobySchool();
	}
	
	public static void demostrateStringMethods(){
		String text1 = new String("Hello World");
		String text2 = "Hello World";//same as above
		
		if (text1.equals(text2)){
			print("These strings are equal:");
		}
		print(text1);
		print(text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) <0){
			print("word1 comes before word2");
		}
	}
	
	public static void print(String s) {
		String printString = "";
		int cutoff = 35;
		//check for words to add, IOW s has a length >0
		while(s.length() >0){
			String cut = "";
			String nextWord = "";
			//check to see if the next word will fit on line
			//there must still be words to add
			while(cut.length() +nextWord.length() <cutoff && s.length() >0){
				//add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				
				//identify the following word without the space
				int endOfWord = s.indexOf(" ");
				//if there are no more spaces, 
				//this is the last word so add the whole thing
				if(endOfWord == -1){
					endOfWord = s.length() -1;//-1 for index
				}
				
				nextWord = s.substring(0, endOfWord+1);
			}			
			
			printString += cut+"\n";
		}
		
		System.out.println(printString);
	}

}

