package day42_customclasses_encapsulation;

import java.lang.*; //this import always add by compiler
import java.util.Scanner;

public class StringShoesToObject {

	public static void main(String[] args) {
		//create Shoes object and assign the data from the
		//String data
		String data = "Bruno Magli,9.5";
		//split using, and store into array
		String[] arrData = data.split(",");
		//Create Shoes object
		Shoes shoes = new Shoes();
		shoes.brand = arrData[0];
		shoes.size = Double.parseDouble(arrData[1]);
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		//Creating object using data from scanner
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
		

	}

}
 