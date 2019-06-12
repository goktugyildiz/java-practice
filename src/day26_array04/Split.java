package day26_array04;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "java,kava,htlm,selenium ";
		
		String[] wordsArray = words.split(",");
		
		System.out.println("Count: "+ wordsArray.length);
		System.out.println(wordsArray[0]);
		
		System.out.println(Arrays.toString(wordsArray));
		
		
		for(String word : wordsArray) {
			System.out.println(word);
		}
		
		String diceResult = "1 - 20 of 1,461 positions";
		
		//using split method , print 1,461
		
		String[] diceArray = diceResult.split(" ");
		System.out.println("Serach result total: " +diceArray[4]);
		
		String [] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0]);
		
		System.out.println(diceArray2[1]);

		//other way to do it
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
		
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn't really happy.";
		
		String[] allWords = sentence.split(" ");
		String[] splitArray1 = sentence.split("I");
		String[] splitArray2 = sentence.split("happy");
		
		for(String w : allWords) {
		System.out.println(w);
		
		}
		System.out.println("AFTER HAPPY SPLIT");
		
		for(String w :splitArray2 ) {
		System.out.println(w);
		}
		
		String word = "java";
		char[] charsArray = word.toCharArray();
		
		for(char ch : charsArray) {
			System.out.println(ch);
		}
		
		
		
	}

}
