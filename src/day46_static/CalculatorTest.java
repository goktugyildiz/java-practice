package day46_static;

public class CalculatorTest {

	public static void main(String[] args) {
		double result  = Calculator.plus(55, 23);//static way
		System.out.println("Result: "+ result);
		
		result = Calculator.minus(43, 12);
		System.out.println("Result: "+ result);

		Calculator c = new Calculator();
		
		System.out.println(c.multiply(4, 6));
		
		int i = Integer.parseInt("##") ; //static method for example
		System.out.println(Character.isDigit('5'));// this is also static
		System.out.println();
		
		
	}

}
