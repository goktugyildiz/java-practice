package day33_methods05;

public class CalcTests {

	public static void main(String[] args) {
		System.out.println(Calculator.add(4, 5));
		System.out.println(Calculator.multiply(43, 5));
		System.out.println(Calculator.minus(34, 4.5));
		System.out.println(Calculator.divide(30, 5));
		double addResult = Calculator.add(21, 41);
		double mResult = Calculator.multiply(50, 40);
		double miResult = Calculator.minus(3000, 20);
		double dResult = Calculator.divide(45, 9);
		
		System.out.println("addResult: "+addResult);
		System.out.println("mResult: "+mResult);
		System.out.println("miResult: "+miResult);
		System.out.println("dResult: "+dResult);
		
		double a = 10.0 , b=5.0;
		double myResult = Calculator.minus(a, b);
		System.out.println("myResult: "+ myResult);
		
		double[] dNums = {2.0 , 4.0};
		double result2 = Calculator.multiply(dNums[0],dNums[1]);
		System.out.println("Result2: " + result2);
		
		if(Calculator.add(10, 16) == 26) {
			System.out.println("Add Unit Test Passed");
		}else {
			System.out.println("Add Unit Test Failed");
		}
		
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not 4 characters");
		}
		
		
	}
	
	
	

}
