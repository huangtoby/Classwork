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
		
		String[] array = {"a","b","c","d","e","f","g","h"};
		swap(array, 0, array.length-1);	
		shuffle(array);
	}

	private static void shuffle(String[] array) {
		for(int i = 0; i <array.length; i++){
			int random = (int)(Math.random()*6);
			swap(array, i,random);
		}
            
		
	}

	private static void swap(String[] arr, int a, int b) {
		String placeholder = arr[b];
		arr[b] = arr[a];
		arr[a] = placeholder;
		
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
