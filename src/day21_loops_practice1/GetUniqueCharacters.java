package day21_loops_practice1;

import java.util.*;
public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word:");
		
		String word = scan.next();// javva lest say
		String unique = "";
		
		for(int i = 0; i<word.length(); i++) {
			
			// read the letter and assign
			char letter = word.charAt(i);
			//System.out.println(letter);
			
			if(!unique.contains(""+letter)) {
				unique+=letter;
			}
			
			
		}
		
		System.out.println(unique);
		
		
		
		
	//	for(int i = 0; i< word.length(); i++) {
			//System.out.println(i)); print i it increase we will see index of word

			
		//	System.out.println(word.charAt(i));
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
