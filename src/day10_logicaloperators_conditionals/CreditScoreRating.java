package day10_logicaloperators_conditionals;
import java.util.*;
public class CreditScoreRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter your credit score: ");
	      
		  int creditScore = 800; //int creditScore =scan.nextInt(); if you want to type in scanner
		  //Excellent ==> 750 - 850
	if (creditScore >=750 && creditScore<=850) {
		
		System.out.println("Excellent");
	}else if (creditScore >=700 && creditScore<=749) {
		System.out.println("Good");
	}else if (creditScore >=650 && creditScore<=699) {
		System.out.println("Fair");
	}else if (creditScore >=550 && creditScore<=649) {
		System.out.println("Poor");
	}else if (creditScore >= 0 && creditScore <=549) {
		System.out.println("Bad");
	}else {
		System.out.println("Invalid score");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}