package day52_inharitance04;

import java.util.*;
public class FinalList {
	
	final static public  String COLORS = "Red";

	public static void main(String[] args) {
		ArrayList<String> COLORS =  new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("White");
		COLORS.add("Grey");
		COLORS.add("Blue");
		
		System.out.println(COLORS.toString());
		
		COLORS.add("Black");
		System.out.println(COLORS.toString());
		
		COLORS = new ArrayList<>();//new keyword means new object
		System.out.println(COLORS.toString());

		COLORS.add("Yellow");
		 
		
		

	}

}
