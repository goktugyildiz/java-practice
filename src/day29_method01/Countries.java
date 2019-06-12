package day29_method01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] countriesArray = {{"USA" ,"Washington DC"},
									{"Mexico", "Mexico City"},
									{"Canada", "Ottowa"},
									{"Brasil", "Brasilia"},
									{"Peru", "Lima"},
									{"Argentina", "Boanes Aeros"},
									{"Bolivia", "La Paz"},
									{"Macedonia", "Scopia"},
									{"Kazakhstan", "Nursultan"},
									};
		
		//Print USA and CApital
          System.out.println(countriesArray[0][0]+ " | "+countriesArray[0][1]);		
		
		//Nursultan
          System.out.println(countriesArray[8][0]+ " | "+countriesArray[8][1]);		
          
          
          //Print all the countries in same line
		for(String[] c :countriesArray ) {
			System.out.print(c[0] + " - ");
		}
          System.out.println();
          //get all the Cities and add to cities[] array
          //declare cities array and size needs to match countries Array size
			//String[] cities = new String[9];
		String[] cities = new String[countriesArray.length];
		
		System.out.println(Arrays.toString(cities));
		
		for(int i =0; i<countriesArray.length; i++) {
			cities[i]= countriesArray[i][1];
		}
		
		System.out.println(Arrays.toString(cities));
		
		//look for Bolivia int he countriesArray and test if
		//capital city is "La Paz"
		
		for(int row =0; row<countriesArray.length; row++) {
			if(countriesArray[row][0].equals("Bolivia")) {
				//System.out.println(countriesArray[row][1]);
				if(countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Bolivia test failed");
				}
				break; //exit the loop
				
			}
		}
		
		
		
		
		
		
		
		
		
		
          
	}

}
