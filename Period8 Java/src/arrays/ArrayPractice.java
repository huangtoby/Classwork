package arrays;
/**
 * Primitive type[] are "already" in the system, start as zero (cannot mix types)
 * Object[] unless materialized, start as null (different types of objects in an array of common superclass)
 */

public class ArrayPractice {
//If you want to put different primitive types into an array you must use their wrapper class
	static boolean[] boos3;
	
	public static void main(String[] args) {
		
		listPrimes(120);
//		//how do you time a process?
//		long currentTime = System.currentTimeMillis();
//		
//		int[] fiftyNumbers = new int[50000];
//		//populate(fiftyNumbers);
//		//print(fiftyNumbers);
//		//randomize(fiftyNumbers,50000);
//		//print(fiftyNumbers);
//		rollDice(fiftyNumbers,2);
//		//count each die roll and provide a percentage
//		countResult(fiftyNumbers,4);
//		//listcards();
//		
//		long endTime = System.currentTimeMillis();
//		System.out.println("The process took "+(endTime-currentTime+" ms."));
//		
	}
	
	private static void listPrimes(int limit) {
		int lastToCheck = (int)(Math.sqrt(limit));
		boolean[] numbers = new boolean[limit+1];
		for(int i = 0; i <limit+1; i++){
			numbers[i] = true;
		}
		//0 and 1 are, by definition, not prime
		numbers[0] = false;
		numbers[1] = false;
		//check all "non-crossed off" numbers (start with 2)
		for(int prime = 2; prime <= lastToCheck; prime++){
			if(numbers[prime]){
				System.out.println("\n"+prime+" is prime. Crossing off:");
				for(int i = (int)(Math.pow(prime,2)); i <limit+1; i += prime){
					System.out.print(i+", ");
					numbers[i] = false;
				}
			}
		}
		//print the primes
		System.out.println("\nThe primes are:");
		for(int index = 0; index <numbers.length; index++){
			if(numbers[index])System.out.print(index+", ");
		}
	}

	private static void countResult(int[] fiftyNumbers, int numberOfDice) {
		System.out.println("CountResultMethod");
		int[] counter = new int[numberOfDice*6];
		for(int n: fiftyNumbers){
			counter[n-1] = counter[n-1]+1;
		}
		for(int i = numberOfDice-1; i <counter.length; i++){
			System.out.println((i+1) +" was rolled "+100*counter[i]/fiftyNumbers.length+"% of the time.");
		}
		
	}

	private static void rollDice(int[] fiftyNumbers, int numberOfDice) {
		System.out.println("RollDiceMethod");
		for(int i = 0; i <fiftyNumbers.length; i++){
			int dice = 0;
			for(int j = 0; j <numberOfDice; j++){
				dice = dice + (int)(1+6*Math.random());
			}
			fiftyNumbers[i] = dice;
		}
		
	}

	private static void randomize(int[] fiftyNumbers,int max) {
		for(int i = 0; i <fiftyNumbers.length; i++){
			int randomNumber = (int)(1+(max*Math.random()));
			fiftyNumbers[i] = randomNumber;
		}
	}

	private static void print(int[] fiftyNumbers) {
		for(int i = 0; i <fiftyNumbers.length; i++){
			System.out.println(fiftyNumbers[i]);
		}		
	}

	private static void populate(int[] fiftyNumbers) {
		for(int i = 0; i <fiftyNumbers.length; i++){
			fiftyNumbers[i] = i+1;
		}
	}

	private void demonstratePassByValue(){
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		someStrings[999] = getASpecialString();
		print(someStrings);
	}
	
	private static String getASpecialString() {
		String s = "THIS IS STRING IS SPECIAL!";
		return s;
	}

	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";	
	}

	private static void print(String[] s) {
		for (int i = 0; i <s.length; i++){
			System.out.println(s[i]);
		}
	}
	
	private static void standardPopulate(String[] s) {
		for(int i = 0; i <s.length; i++){
			String string = "String #"+(i+1);
			s[i] = string;
		}
	}
	
	public static void initializingArraysExample(){
		//two different ways to instantiate an array
		boolean[] boos1 = new boolean[3];
		//this can only be done at the declaration
		//because it sets size and content
		boolean[] boos2 = {false, false, false};
		//this does NOT work:
		//boos3 = {false, true, true};
		//this is all that will work
		boos3 = new boolean[3];
		
		/**2 ways of iterating through an array:
		 *STANDARD FOR LOOP
		 *	- the index is important to keep track of 
		 *	- you need to customize the order
		 */
		for(int i = 0; i <boos1.length; i++){
			System.out.println(boos1[1]);
		}
		
		/**
		 * "FOR - EACH" LOOP
		 * 	- the index is not important
		 * 	- you don't need to customize
		 * 	- automatically assigns a "handle"
		 * 	- faster
		 */
		for(boolean b: boos1){
			System.out.println(b);	
		}
		//OBJECT ARRAYS
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a","b","c"};
		//you can do this to instantiate the elements...
//		someStrings1[0] = "a";
//		someStrings1[1] = "b";
//		someStrings1[2] = "c";
		//..but it is repetitive
		
		//let's try a loop to instantiate
		for(int i = 0; i <someStrings1.length; i++){
			someStrings1[i] = "a new String";
		}
		//a loop to print it
		for(String s:someStrings1){
			System.out.println(s);
		}
		
	}

}
