package arrays;

public class AdvancedArrayMethods {

	static int[]array;
	
	public static void main(String[] args) {
		array = new int[100];//full of zeroes
		int[] someArray = new int[50];
		someArray = array;
		System.out.println(someArray.length);
		someArray[30] = 1;
		//someArray is 100 zeroes and 1 one
		System.out.println(array[30]);
		
//		methodA(someArray);
	}

	private static void methodA(int[] someArray) {
		int[] newArray = new int[someArray.length];
	}
	
	public static void copyArray(int[] original,int[] target){
		if(original.length == target.length){
			for(int i = 0; i <original.length; i++){
				target[i] = original[i];
			}	
		}else{
			//print an "error" message
			System.out.println("ERROR: tried to copy arrays of two different lengths.");
		}
	}
	
}
