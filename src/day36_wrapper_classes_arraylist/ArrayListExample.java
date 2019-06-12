package day36_wrapper_classes_arraylist;

import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		//declare arrayList called languages
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("French");
		languages.add("Turkish");
		languages.add("Java");
		languages.add("Russian");
		languages.add("Spanich");
		
		languages.get(0);
		languages.get(1);
		languages.get(2);
		languages.get(3);
		
		System.out.println("Number of values: "+ languages.size());
		languages.add("Arabic");
		System.out.println("Number of values: "+ languages.size());
		//remove java
		languages.remove(2);
		System.out.println("Number of values: "+ languages.size());
		
		System.out.println(languages.toString());


	}

}
