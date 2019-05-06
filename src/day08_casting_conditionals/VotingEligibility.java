package day08_casting_conditionals;
import java.util.*;
public class VotingEligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
       /*
        program to tell if you are eligible to vote 
        votingAge =18
        yourAge = take from scanner
        if you are eligible to vote:
        you are eligible to vote.
        you have been eligible for 3 years.
        else
        you are not eligible to vote
        you still have 3 more years to go
        */
		
		int votingAge = 18;
		System.out.println("How old are you?");
		int yourAge = scan.nextInt();
		
		int years = yourAge - votingAge; 
		if(yourAge >= votingAge) {
			System.out.println("you are eligible to vote.");
			System.out.println("You have been eligible for 3 years.");
			
			}else {
				System.out.println("you are not eligible to vote");
				System.out.println("You still have "+ (-years) +" more years to go");
				
			}
		
		
		
		
		
		
		
		
	
		
	}

}
