package day37_arraylist02;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		
		//print each cities using for each loop separated by space
		
		for(String city : cities) {
			System.out.print(city+ " ");
		}
		System.out.println();
		//print each city using for loop, separated by space
		for(int i = 0; i<cities.size(); i++) {
			System.out.print( cities.get(i) +" ");
		}
		//remove Baku
		System.out.println();
		System.out.println("Remove Baku");
		cities.remove("Baku");
		cities.remove("New York"); // it will not remove or show error
		
		System.out.println(cities.toString());
		
		//isEmpty?
		
		System.out.println("Is list is empty? " + cities.isEmpty());
		
		cities.add(0, "Bishkek");
		System.out.println(cities.toString() );
		
		cities.add(1, "Istanbul");
		System.out.println(cities.toString() );
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString() );
		
		cities.indexOf("Sterling");
		
		int idx = cities.indexOf("Sterling");
		System.out.println("Streling index: "+ idx);
		
		cities.set(idx, "Alexandria");

		System.out.println(cities.toString() );
		cities.clear();



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
