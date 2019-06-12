package day32_methods04;

public class MethodWithReturn {
	public static void main(String[] args) {
		
		System.out.println(giveMe10$());
		
		int i = giveMe10$();
		System.out.println("i: " +i);
		////////////////////////
		
		System.out.println(GiveMeYourName());
		String myName = GiveMeYourName();
		System.out.println("My name is : "+ myName);
	}
	
	/*
	 * this methods ,returns int value
	 * 
	 * 
	 * 
	 * 
	 */
	public static int giveMe10$() {
		System.out.println("Returning 10 from method");
		return 10;
	}

	//giveMeYourName(
	//return type String 
	//declare name varaible and assign your name
	//then return it . call in main method
	
	public static String GiveMeYourName() {
		String name  = "Goktug";
		return name;
		
	}
	
	
	
	
	
	
	
}
