package day33_methods05;

public class Calculator {

	public static void main(String[] args) {

		int result = add(45, 13);
		System.out.println(result);

		// 1-)
		add1(32, 23);
		// below line will not work because add1
		// does not return a value. it just perform action
		// int result = add1(4,5);

		// 2-)
		int result1 = add2(15, 13);
		System.out.println("Result: " + result1);
		result1 = add(10, 20);
		System.out.println("Result: " + result1);

		System.out.println(add(4, 6));

		/////////////////////////////
		System.out.println("#################");

	}

	public static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	// method addVoid
	// return type void
	// prams: int num1, int num2
	// add them and print sum

	public static void add1(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

	// method name add
	// return type: int
	// params: int num1 , int num2
	// add them and return the sum

	public static int add2(int number1, int number2) {
		int sum2 = number1 + number2;
		return sum2;

	}
	// method name : multiply
	// method minus with return value
	// method divide with return value

	public static double multiply(double n2, double n3) {
		double c = n2 * n3;

		return c; // return n2 * n3;
	}

	public static double minus(double n2, double n3) {
		double m = n2 - n3;

		return m; // return n2 - n3;
	}

	public static double divide(double n2, double n3) {
		if (n3 == 0) {
			System.out.println("ERROR: Cannot / by 0");

			return 0;

		} else {

			double d = n2 / n3;

			return d;
		}
	}

}
