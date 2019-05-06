package day24_array_loop;

public class SplitSentence {

	public static void main(String[] args) {
		int counter = 0;
		String sentence = "Java is a general purpose computer proframing "
				+ "language that is corcurrent, class-based , object-orienteg"
				+ "and specifically designed to have as"
				+ "few implementation dependicies as posibble";
		
		String[] words = sentence.split(" ");
		
		for(String str: words ) {
			System.out.println(str);
		}
		
		System.out.println(words[0]); // first word will print which is Java
		
		for(String str: words ) {
			if(str.equals("language")) {
				break;
			}
			
			counter++;
		}
		
		System.out.println("Position: "+counter);
		
		System.out.println(words[counter]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
