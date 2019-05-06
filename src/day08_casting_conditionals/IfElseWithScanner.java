package day08_casting_conditionals;

import java.util.*;
public class IfElseWithScanner {

	public static void main(String[] args) {
		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		
		Scanner input = new Scanner(System.in);
		
		int passingPercentage = 65;
		System.out.println("What is the score?");
		
        int yourScorePercentage = input.nextInt();
		
		if (yourScorePercentage >= passingPercentage) {
			
			System.out.println("You passed Congratulations!");
		}else {
			
			System.out.println("You failed study more! don't be sad");
		}
		
		System.out.println("Java is fun!");
		
		
		
		
		
		
		
		
		
		
		

	}

}
