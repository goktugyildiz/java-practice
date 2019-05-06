package day20_forloop;
import java.util.*;
public class Neigbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word:");
		String word = scan.next();
		
		//aabcdd if character and next one are same print
		//whenever you found a same letter right next to each other
		//print Beeep - a
		//Beeep - d
		 
		
		for(int i = 0; i<word.length()-1; i++) {
			if (word.charAt(i) == word.charAt(i+1)) {
				System.out.println("Beep - "+word.charAt(i));
				 
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
