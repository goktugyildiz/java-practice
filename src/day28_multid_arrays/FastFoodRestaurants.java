package day28_multid_arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	
			//read all data and assign to Array
			
			String[] data = Files.readAllLines(Paths.get("FastFoodrestaurants.csv")).toArray(new String[0]);
			
			System.out.println("Data size: " + data.length);
			
			
			//print first row
			System.out.println(data[0]);
			System.out.println(data[1]);
			//print the last restaurant
			System.out.println(data[data.length-1]);
	
			
			//print each restaurants information in separate lines
			int counter = 0;
			for(String separate : data) {
				//System.out.println("#"+counter+"=>"+separate); we will have long data in output :)
				counter++;
			}
			
			//Print all restaurant information in state of VA
			
			//and print the number
			int countVA = 0;
			
			for(String row :data) {
				if(row.contains(",VA,") ) {
					System.out.println(row);
					countVA++;
				}
				
			}
			System.out.println("##### Total restaurants in VA :" +countVA);
		
			//Print all restaurants information in state in VA
			//print the restaurant  names alond with cityname
			//Subway - Herndon
				
			for(String res:data) {
				if(res.contains(",VA,")) {
					String[] resArray = res.split(",");
					
					System.out.println(resArray[2] +" - "+ resArray[1]);
				}
			}
		
	}

}
