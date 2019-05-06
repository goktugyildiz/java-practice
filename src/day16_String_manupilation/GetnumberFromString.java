package day16_String_manupilation;

public class GetnumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "I wrote [2345] lines of code today";
		
		//assign to variable Print the number between []
		int start = sentence.indexOf('[')+1;
		int end = sentence.indexOf(']');
		
		String codeCount = sentence.substring(start, end);
		System.out.println("Lines of code:" +codeCount);
		System.out.println("Lines of code:"+sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));

		
		
		//check if codeCount is more than 20 
         int count = Integer.parseInt(codeCount);
		
		
		if(count > 20 ) {
			System.out.println("Wrote more than 20 lines of code today");
		}else {
			System.out.println("not enough codeing for today");
		}
		
		
		
		
		
		
	}

}
