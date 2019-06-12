package day37_arraylist02;

import java.util.*;
public class ArraysAsList {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("Honda");
		//or
		//declare and add values in the single statement
		List<Integer> nums = Arrays.asList(4,2,5,6,3,45,56,6);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		
		//nums.add(10) will give you UnsportedOperation proble
		
		//create arrayList prices
		//assign 10 values using Arrays.asList method
		
		List<Integer> prices = Arrays.asList(12 ,34 ,500 ,12, 245 ,45 ,56 , 45 , 54 ,98);
 
		System.out.println(prices);
		 // calculate sum of prices
		
		int sum = 0;
		for(int loop : prices) {
			System.out.print(loop+ " ");
			sum+=loop;
		}
		System.out.println("\nSum : " +sum);
		int sum2 =0; 
		for(int i =0; i<prices.size(); i++) {
			sum2+=prices.get(i);
		}
		System.out.println("Sum2: " + sum2);
		//create new list expensive add prices that more than 100
		List<Double> expensive = new  ArrayList();
		
		for(double price : prices) {
			if(price>100) {
				expensive.add(price);
			}
		}
			System.out.println("Expensive: " + expensive.toString());
			
			//remove all expensive staff inside the prices list
			prices.removeAll(expensive);
			System.out.println(prices.toString());
	}

}
