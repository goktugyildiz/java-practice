package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {

	public static void main(String[] args) {
		
		//carType : 1,2
		//isRushHour : true or false
		
		// we will use logical operator and nested if statements
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Vhicle Type: 1 or 2");
		int carType = keyboard.nextInt();
		
		System.out.println("Is it rush hour: yes | no");
		 String answer = keyboard.next();
		 
		 //check if rusHour string is "yes" ==> assign true to isRushHour
		 //if it is "no" assign false to isRushHour
		 
		 
		 boolean isRushHour ;
		  if(answer.equalsIgnoreCase("yes")) {
			  isRushHour = true; 
		  }else {
			  isRushHour = false;
		  }
		   //System.out.println(isRushHour);
		  
		  
		  
		 double price= 0.0;
		 if (carType ==1) {
			 if(isRushHour) {
				 price = 30.0;
				 
			 }else {
				 price = 5.0;
			 }
			 
		 }else if(carType==2) {
			 if(isRushHour) {
				 price =55.0;
				 
			 }else {
				 price = 15.20;
			 }
			 
		 }
		 
		System.out.println("Toll cost : " +price);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
