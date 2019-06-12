package day37_arraylist02;
import java.util.*;
public class Shopping {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		//print number of items
		int count = shoppingList.size();
		System.out.println("Count: "+ count);
		//print all items in single line
		System.out.println(shoppingList.toString());
		//print first and last item
		
		System.out.print(shoppingList.get(0) + " | "+ shoppingList.get(count-1) );
		
		System.out.println(shoppingList.remove(0));
		
		System.out.println(shoppingList.toString());
		
		for(String items :shoppingList) {
			System.out.println(items);
		}
		//remove everythimh on once
		shoppingList.clear();
		System.out.println(shoppingList.toString());//it will show empty []
	}

}
