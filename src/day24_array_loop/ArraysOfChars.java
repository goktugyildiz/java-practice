package day24_array_loop;

public class ArraysOfChars {

	public static void main(String[] args) {
		
		char[] values = {'a', 'b', 'c'};		
		
		for(char value: values) {
			System.out.println(value);
		}
		
		 String str = "Wooden Spoon";
		 //This method toCharArray() converts string into
		 //array of characters
		 char[] chars = str.toCharArray();
		
		for(char ch: chars) {
			System.out.print(ch);
		}
		System.out.println();
		//reverse the each character
		
		str = "";
		for(int i =chars.length-1; i>=0; i--) {
			str+=chars[i];
		}
		System.out.print(str);
		
		//Task: Print characters with help of array characters , one by one
		//if characters is equals to 'o' ,
		//replace with'*'; print it instead of 'o'
		System.out.println();
		for(char ch : chars  ) {
			if(ch=='o') {
				System.out.print("*");
			}else {
				System.out.print(ch);
			}
				
		}
		
		
 		
		
		
		
		
		
		
		
		
		
		
		

	}

}
