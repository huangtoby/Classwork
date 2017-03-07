package quiz3;

import java.util.ArrayList;

public class ListRunner {
	
	static ArrayList<Item> shoppingList;

	public static void main(String[] args) {
		String[] justDescriptions = getDescription();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void printPurchasedItems() {
		for(int i=0; i<shoppingList.size(); i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println(shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				//System.out.println(shoppingList.remove(i).getDescription());
				i--;
			}
		}	
	}

	private static void doSomeShopping() {
		shoppingList.get(0).setPurchaseed(true);
		shoppingList.get(3).setPurchaseed(true);	
	}

	private static void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();//1 point
		for(String s: justDescriptions){//.5 point
			Item temp = new Item(s);//1 point
			shoppingList.add(temp);//.5 adding
		}		
	}

	private static String[] getDescription() {
		String[] test = {"coffee","video games","potato chips","a life"};
		return test;
	}

}
