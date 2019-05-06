package day22_loop_practice2;

public class SubstringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "java";
		System.out.println(word.substring(0,2));
		
		//print each character in separate line using
		//substring, no loop please
		
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3));
		
		int i = 0;						//0,1
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		
		
		System.out.println("########### FOR LOOP ###########");
		//using for loop and substring, print each char
		//java
		//0123
		
		
		for(int n = 0; n<=3; n++) {
			//System.out.println(word.substring(n,n+1));
			String letter = word.substring(n,n+1);
			System.out.println(letter);
		}
		
		System.out.println("########### FOR LOOP ###########");
		//print letters in reverse
		
		for(int v = 3; v>=0; v--) {
			String letter = word.substring(v,v+1);
			System.out.println(letter);

			
		}
		
		int start =1;
		int end = 5;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start,end));
		
		String word3 = "apple";
		System.out.println(word3.length()-1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
