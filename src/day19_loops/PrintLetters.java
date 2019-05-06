package day19_loops;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Amazon";
		             //012345 index
		             //123456 length
		//print each character one by one separate lines
		int idx = 0;
		/*
		 * 
		System.out.println(word.charAt(idx));
		
		idx++;
		System.out.println(word.charAt(idx));

		idx++;
		System.out.println(word.charAt(idx));
		idx++;
		
		System.out.println(word.charAt(idx));
		idx++;
		System.out.println(word.charAt(idx));
		
		idx++;
		System.out.println(word.charAt(idx));
		*/
		//lets do with loop 
		
		while(idx < word.length()) {
			System.out.println(word.charAt(idx));
			idx++;
		}
		
		//Print each character in reverse order
		int idx2 = word.length()-1;
		while(idx2 >=0) {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
		
		
		
	}

}
