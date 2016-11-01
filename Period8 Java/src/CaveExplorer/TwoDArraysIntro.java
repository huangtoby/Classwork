package CaveExplorer;

import java.util.Arrays;

public class TwoDArraysIntro {

	public static void main(String[] args) {
		String[][] pic = new String[10][8];
		for(int row = 0; row <pic.length; row++){
			for(int col = 0; col <pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		//sun
		pic[1][2] = "-";
		pic[0][3] = "|";
		pic[1][3] = "O";
		pic[2][3] = "|";
		pic[1][4] = "-";
		
		//birds
		pic[4][1] = "v";
		
		//grassy field
		for(int row = 5; row <pic.length; row++){
			for(int col = 0; col <pic[row].length; col++){
				pic[row][col] = "w";
			}
		}
		
		for(String[] row:pic){
			for(String col:row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
		public static void intro(){
			String[] xox = {"x","o","x","o","x"};
			System.out.println(Arrays.toString(xox));
			//a 1D array prints a horizontal string
			//5 arrays and 4 array.length
			String[][] arr2D = new String[5][4];
			System.out.println("The height is "+arr2D.length);
			System.out.println("The width is "+arr2D[0].length);
		
			for(int row = 0; row <arr2D.length; row++){
				//populate with coordinates
				for(int col = 0; col <arr2D[row].length; col++){
					arr2D[row][col] = "("+row+", "+col+")";
				}
			}
			//print the 2D array
			//Every element in a 2D array IS itself an array. so a for-each loop looks like this:
			for(String[] row : arr2D){
				System.out.println(Arrays.toString(row));
			}
		}
	}