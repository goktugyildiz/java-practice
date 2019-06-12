package day34_methods06;

import java.util.Arrays;

public class VarArgs {

	public static void main(String... args) {
		
		printWords("Red","Blue");
		printWords("Grey");
		printWords();
		
		String[] myPets = {"Cat","Horse","Dog","Sheep",};
		printWords(myPets);
		
		//
		System.out.println(sum(13,43,53,11));
		int budget = 200;
		if(sum(10, 45,110,30,46) <=budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(234,43,567,12,34,5);
		System.out.println("Total: " + total);
		
		////////
		cook("Burrito bowl", "Rice","Beans", "Sour cream", "Meat" );
		cook("Avacoda toast", "Avacado", "Suuny side eggs","Chesee");
		
		
		////////////////////////////
		shoppingList(1000, "Avacado toast", "Burrito bowl", "Swatch watch");
	}
	
	
	public static void printWords(String... words) {
		//handle it like an ARRAY
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	
	/*
	 * 
	 * sum(10,20,30);==> 80
	 * sum(40,30);==> 70;
	 */
	public static int sum(int... nums) {
		int sum = 0;
		for(int n :nums) {
			sum+=n;
		}
		return sum;
		
	}
	
	
	public static void cook(String name, String... ings  ) {
		System.out.println("Food "+ name);
		System.out.println(Arrays.toString(ings));
	}
	
	public static void shoppingList(int totalPrices, String... items) {
		System.out.println("Total cost: "+ totalPrices);
		System.out.println(Arrays.toString(items));
		
	}

}
