package day19_loops;
import java.util.*;
public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		
		
		int secretNumber = random.nextInt(101);
		//this will give us a number between 0 - 101
		int guessNumber;
		
		do {
			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if(guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
			
		}while(guessNumber != secretNumber);
		
		
		System.out.println("Bingo , Congratulations you won");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
