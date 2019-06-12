package day35_methods_review;


public class Alphabet {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		/*
		 * "qzez" --> java
		 * 
		 * "fun" ===> ufm
		 */
		
		
		String word  = "doggy";
		/*
		 * "e" ==> "v"
		 * "a" ==> "z"
		 * "s" ==> "h"
		 * "t" ==> "g"
		 * "e" ==> "v"
		 * "r" ==> "i"
		 */
		/*char first = word.charAt(0);
		int position  = alphabet.indexOf(first);
		System.out.println("Position: "+position);
		char enChar = encrypted.charAt(position);
		System.out.println(first+" ---> "+ enChar);
		*/
		
		//with a loop
		String encryptedWord ="";
		for(int i =0; i<word.length(); i++) {
			char first1 = word.charAt(i);
			int position1  = alphabet.indexOf(first1);
			
			char enChar1 = encrypted.charAt(position1);
			System.out.println(first1+" ---> "+ enChar1);
			encryptedWord+=encrypted.charAt(position1);
		}
		System.out.println(word);
		System.out.println(encryptedWord);
		
	}
	
	

}
