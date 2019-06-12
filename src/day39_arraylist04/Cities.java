package day39_arraylist04;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1- Print each city in same line separated by | use for each loop
		 * 2-use for loop
		 * 3- Print each city all upper case
		 */
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("Tokyo");
		cities.add("Izmir");
		cities.add("Antalya");
		
		for(String turkCity : cities) {
			System.out.print(turkCity+ " | ");
		}
		System.out.println();
		
		for(int i =0; i<cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		System.out.println();
		
		//ToString . Print each city all UPPERCASE
		System.out.println(cities.toString().toUpperCase());
		
		//make each city all uppercase
		System.out.println();
		
		
		//how to update cities
		String istanbul = cities.get(0).toUpperCase();
		cities.set(0, istanbul);
		System.out.println(cities.get(0));
		
		cities.set(1, cities.get(1).toUpperCase()); // 1 line code
		

		for(int i = 0; i<cities.size(); i++) {
			String city = cities.get(i).toUpperCase();
			cities.set(i, city);
			
		}
		System.out.println(cities.toString());
		
		//find the longest city
		String longestCity = "" , shortestCity = "";
		
		for(String city : cities) {
			if(city.length() > longestCity.length()) {
				longestCity = city;
			}
		}
		shortestCity = cities.get(0);
		for(String city : cities) {
			if(city.length() < longestCity.length()) {
				shortestCity = city;
			}
		}
		
		
		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		//assign all cities that have more than 6 chars to this arrayList
		
		for(String ct : cities) {
			if(ct.length() > 6) {
				citiesMoreThan6.add(ct);
			}
			
		}
		System.out.println(citiesMoreThan6);
		
		
	}

}
