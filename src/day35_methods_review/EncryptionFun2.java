package day35_methods_review;

public class EncryptionFun2 {

	public static void main(String[] args) {

		System.out.println(encryptChar('d'));
		System.out.println(encryptChar('b'));
		System.out.println(encryptChar('l'));
		///////////////////////
		System.out.println(encryptedWord("sampiyongalatasaray"));
		String normal = "sunday";
		String encrypted = encryptedWord(normal);
		System.out.println("Normal: "+normal + "\n"+
							"Encrypted: "+ encrypted);
		
		////////////////////////////
		System.out.println(encryptCharReverse("hznkrblmtzozgzhzizb"));

	}
		// method name encryptChar
		//return type char
		//param char
		//take a char and returns encrypted version
		//encryptChar('a') ---> 'z'
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		return encrypted.charAt(alphabet.indexOf(ch)) ;
		/*
		 * int i = alphabet.indexOf(ch);
		 * char ret = encrypted.charAt(alphabet.indexOf(ch)) ;
		 * return ret;
		 */
		
		
	}
	
	/*
	 * encryptedword 
	 * return type : String
	 * Param: String
	 * take a String and returns encrypted version for the whole words
	 * 
	 * 
	 */
	
	public static String encryptedWord(String word) {
		String cyphered = "";
		for(int i=0; i<word.length(); i++) {
			cyphered+= encryptChar(word.charAt(i));
		}
		return cyphered;
		
	}
	
	public static char encryptCharReverse(String str) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		return alphabet.charAt(encrypted.indexOf(str)) ;
	
	
	
	}
	
	
	
	
}
