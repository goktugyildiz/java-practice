package day08_casting_conditionals;

public class Relationals {

	public static void main(String[] args) {
		
		double d1 = 23.56;
		double d2 = 20.43;
		System.out.println(d1>=d2);
		
		boolean check = d1>d2;
		
		System.out.println("Check: "+check);
		
		char ch1 = 'a';
		
		char ch2 = 'j';
		
		char ch3 = 'A';
		 
		System.out.println(ch2>ch1); //true
		
		System.out.println(ch1>ch3);//true
		//keep it in your mind lower case bigger than camel case in this portion
		
		boolean b = true==false;
		System.out.println("B: "+b);//False
		
		
		b= true  != false;
		System.out.println();
		

	}

}
