package day19_loops;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word test:");
		String word = scan.next();
		String reversed = "";
		
		//loop through word in reverse order and
		//concatenate each character to reverse string
		
		int idx = word.length()-1;
		while(idx>= 0) {
			reversed = reversed +word.charAt(idx);
			idx--;
		}
		
		System.out.println(reversed);
		//compare if word and reverse are equal
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is polindrome");
		}else {
			System.out.println("It is not polindrome");

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
