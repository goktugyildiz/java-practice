package day20_forloop;

public class CountHowMany {

	public static void main(String[] args) {
		//word
		//char to count the number of 

		String word = "computer programming";
		char myChar ='m';
		int counter = 0;
		
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i) ==myChar) {
				counter++;
				
			}
		}
		
		System.out.println("Conter: "+ counter);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
