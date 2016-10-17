package arrays;
/**
 * Primitive type[] are "already" in the system, start as zero (cannot mix types)
 * Object[] unless materialized, start as null (different types of objects in an array of common superclass)
 */

public class ArrayPractice {
//If you want to put different primitive types into an array you must use their wrapper class
	static boolean[] boos3;
	
	public static void main(String[] args) {
		//how do you time a process?
		long currentTime = System.currentTimeMillis();
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		print(someStrings);
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took "+(endTime-currentTime+" ms."));
		
	}
	
	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";	
	}

	private static void print(String[] s) {
		for (int i = 0;i <s.length; i++){
			System.out.println(s[i]);
		}
	}
	
	private static void standardPopulate(String[] s) {
		for(int i = 0;i <s.length; i++){
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
