package day21_loops_practice1;
import java.util.*;
public class StringMethodsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String word = "javva";
		
		String unique = "";
		
		char ch = word.charAt(0);
		
		System.out.println(word.concat(""+ch));
		System.out.println(word.indexOf(ch));
		
		//1-)
			if(!unique.contains(""+ch)) {
				unique+=ch;
			}
		
		System.out.println("Unique: " + unique);
		
		//2-)	
		if(word.indexOf(ch) == -1) {
				unique+=ch;
			}
		System.out.println("Unique: " + unique);

		
		//===========================================
		String word2 = "bananas";
		String unique2= "";
		int i = 0;
		
		char ch2 = word2.charAt(i);
		
		System.out.println("Ch2: " + ch2); //b
		
		i =1;
		ch2=word2.charAt(i);
		System.out.println("Ch2: " + ch2);//a
		
		i++;
		ch2=word2.charAt(i);
		System.out.println("Ch2: " + ch2);//n
		
		//check if ch2 in the unique2 variable
		
		if(unique2.contains(""+ch2)) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
