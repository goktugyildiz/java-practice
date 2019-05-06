package day24_array_loop;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//BMW , Audi, Ford, Honda, Mercedes , Mercury, Rolls-Royce, Tesla
		//1.step create a array of string, on store these cars inside that array.
		
		String[] cars = { "BMW" , "Audi", "Ford", "Honda", "Mercedes" , "Mercury", "Rolls-Royce", "Tesla"};
		
		//2.Step: Print car names that starts with M
		
		for(String c: cars) {
			if(c.startsWith("M")) {
				System.out.println(c);
			}
			
		}
		
		//print the all cars that have letter "r" somewhere in the name
		
		//please make your search key insensitive 
		System.out.println("**********************");
		
		for(String make: cars) {
			if(make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
			
		}	
		
		//print car name that end with a
		
		for(String b: cars) {
			if(b.endsWith("a")) {
				System.out.println(b);
			}
			
		}
		//print all car that have at least 6 letters in the name
		
		for(String x:cars) {
			if(x.length()>=6) {
				System.out.println(x);
			}
		}
		
		
		//// swap first and last value in array
		//create temp variable , that will give you the first element of the cars
		String temp = cars[0];
		//we swap first value and last element
		cars[0]= cars[cars.length-1];
		//since temp variable has value of first element of array
		//we assign this value to last element in the array
		cars[cars.length-1] = temp;
		System.out.println(Arrays.toString(cars));
		
		
		System.out.println("Position: " +Arrays.binarySearch(cars, "Ford"));
		
		
	}

}
