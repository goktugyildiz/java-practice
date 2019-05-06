package day18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letter = 'a';
		//System.out.println(letter);//a
		//letter++;
		//System.out.println(letter);//b
		//letter++;
		//System.out.println(letter);//c
		//letter++;
		//System.out.println(letter);//d
		//letter++;
		//System.out.println(letter);//e
		//letter++;
		//System.out.println(letter);//f
		//letter++;
		//System.out.println(letter);//g
		//.
		//.
		// till z
		
		while(letter<= 'z') {
			System.out.print(letter+" " );
			letter++;
			
		}
		
		System.out.println(); //new line so we can separate
		char capitals = 'A';
		
		while(capitals<= 'Z') {
			System.out.print(capitals+ " ");
			capitals++;
		}
		
		//print lower case in reverse
		
		System.out.println();
		char lowerCase = 'z';
		while(lowerCase >= 'a') {
			System.out.print(lowerCase +" ");
			lowerCase--;
		}
		
		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 * ABCDEF
		 */
		System.out.println();
		
		String letters = "";
		
		//letters = letters+'A';
		//System.out.println(letters);
		
		//letters = letters+'B';
		//System.out.println(letters);
		
		//letters = letters+'C';
		//System.out.println(letters);
		
		//letters = letters+'D';
		//System.out.println(letters);
		
		char myLetter = 'A';
		
		while(myLetter<= 'Z') {
			letters = letters +myLetter;
			
			System.out.println(letters);
			myLetter++;
		}
		
		
		
		
	}

}
