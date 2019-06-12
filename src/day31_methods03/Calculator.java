package day31_methods03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		add(14, 45);
		subtract(23, 5);
		multiply(15, 5);
		divide(42 , 7);
		remainder(45 , 9);
		
		//using scanner pass 2 numbers and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		System.out.println("Select operations: '+' , '-', '/', '*', '%' ");
		String operator = scan.next();
		
		//using switch statement , call the matching method to perform calculation
		
		switch(operator) {
			case "+" :
				add(n1 , n2);
				break;
			case "-":
				subtract(n1 , n2);
				break;
			case "/":
				divide(n1 , n2);
				break;	
			case "*":
				multiply(n1 , n2);
				break;
			case "%":
				remainder(n1 , n2);
				break;	
			default:	
				System.out.println("Invalid operator!");
		}
		
		
		
	}
	//add , subtract ,  , divide , remainder
	//
	public static void add(double num1, double num2) {
		double results = num1+num2;
		System.out.println("Result "+ results);
	}
	public static void subtract(double num1, double num2) {
		double results = num1-num2;
		System.out.println("Result "+ results);
	}
	public static void multiply(double num1, double num2) {
		double results = num1*num2;
		System.out.println("Result "+ results);
	}
	public static void divide(double num1, double num2) {
		if(num2==0) {
			System.out.println("Connot / by zero");
			return; // exit the method here . do not run the test
		}
		double results = num1/num2;
		System.out.println("Result "+ results);
	}
	public static void remainder(double num1, double num2) {
		double results = num1%num2;
		System.out.println("Result "+ results);
	}
}
