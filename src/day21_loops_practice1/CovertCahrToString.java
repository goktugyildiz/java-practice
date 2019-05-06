package day21_loops_practice1;

public class CovertCahrToString {

	public static void main(String[] args) {
		// Following ways can be used to convert char to String

		char ch = 'a';
		//String str1 = ch; will not work because ch  is char
		
		// in this kind of situations 
		String str1 = ""+ch;
		System.out.println(str1);
		
		char ch2 ='v';
		//String str2 = new String(ch2);
		String str2 = new String(""+ch2);
		
		String str3 = Character.toString(ch2);
		
		
		
		
		
		
		
		
		
		
	}

}
