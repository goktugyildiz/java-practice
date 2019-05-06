package day22_loop_practice2;

public class LookForWordinString {

	public static void main(String[] args) {
		

		String sentence = "He said hi, then she replied hi, hi guys";
		//look fir"java" in the sentence and print the count 
		//print letters in pairs
		//He
		//e
		// s
		//ai
		//check if temp equals "hi" , if true, add 1 to count
		int count =0;
		
		for(int i =0; i<sentence.length()-1; i++) {
			String temp = sentence.substring(i, i+2);
			//System.out.println(temp);
			if(temp.equals("hi")) {
				count++;
			}
		}
		
		//Count: 3
		System.out.println("Count: "+count);
	}

}
