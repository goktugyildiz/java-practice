package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a String variable sentence and assign value
		//find out  and print  number of words
		//reverse the sentence and assign to new string called reversed
		//print the reverse
		String sentence = "java love you"; // you are very interesting person
		
		//you love java
		//java love you
		
		String[] arrSentence = sentence.split(" ");
		
		System.out.println("Number of eords"+arrSentence.length);
		
		System.out.println(Arrays.toString(arrSentence));
		
		String reversed = "";
		
		for(int i =arrSentence.length-1; i>=0; i-- ) {
			//System.out.println(arrSentence[i]);
			reversed+= arrSentence[i]+" ";
			
		}
		    reversed = reversed.trim();
			System.out.println(reversed);
		
		
		
		
		
		
		
		
		
		
		
	}

}
