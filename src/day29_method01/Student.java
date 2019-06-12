package day29_method01;

public class Student {

	public static void main(String[] args) {
		
			//System.out.println("Student is studying");
		
			//System.out.println("Student is eating");
		
			//System.out.println("Student is studying");

		study();
		study();	
		sayHello();
		
		code();			
	}
	
	public static void study() {
		System.out.println("Student is studying");
	}
	//create a method with name sayHello that prints "Hello Friends!
	
	public static void sayHello() {
	System.out.println("Hello Friends!");
	System.out.println("How are you doing today?");
	}
	//create a method with name code
	//inside code method
	//students are coding java
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Students are coding java");
	}
	
	
	
}
