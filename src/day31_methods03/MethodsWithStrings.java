package day31_methods03;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		countWords("Java is fun");
		countWords("This is methods with Strings");
		googleSearchResult("About 121,000,000 results (0.75 seconds)");
	}
	
	//name : countWords
	//return: void
	//params/args ; String sentence
	//countwords9"Java is fun"
	//"Words in this sentence [java , is ,fun ] "
	//number of words: 3
	
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		
		System.out.println("Words in this sentence " +Arrays.toString(words));
		System.out.println("Number of words: " +words.length);
		
	}
	
	/*public static void googleSearchResult(long results , double seconds) {
		System.out.println("About " + results + " results " + " ("+seconds+" seconds)");
		System.out.println("Results count: " +results);
		System.out.println("Time in seconds: " + seconds);
		*/
	public static void googleSearchResult(String result) {
		//split by space into array
		String[] words = result.split(" ");
		String count = words[1].replace(",", "");
		String seconds = words[3].replace("(", "");
		System.out.println("Results count: "+count);
		System.out.println("Number of words: " + seconds);
	}
	
	
}
