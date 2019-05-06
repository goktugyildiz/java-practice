package Day05_math_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
	 // + - addition operator
		System.out.println(55+5); //60
		int chairs = 140;
		System.out.println(chairs+2); //142
		
		int moreChairs = chairs +5; 
		System.out.println(moreChairs); //140+5
		
		int tables = 130;
		int total = tables+chairs;
		System.out.println(total); //130+140=270
		
		//Subtraction. minus
		System.out.println(500-123);
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance - transaction);//1144.60
		balance = balance - transaction;//bcz we are changing the value
		System.out.println(balance);//1144.60
		
		//create a variable lineOfcode and assign 50 and print"Lines of code 50"
		//you delete 2 line 
		//decrease the value of lineOfcode by 2 and print : Lines of code 48"
		int linesOfCodes = 50 ;
		
		System.out.println("Lines of code "+ linesOfCodes);
		
		linesOfCodes = linesOfCodes-2;
		
		System.out.println("Lines of code "+ linesOfCodes);
		
		//multiplications *
		System.out.println(22*2); //44
		
		//declare variables classes and assign 5
		
		int classes = 5;
		System.out.println(linesOfCodes* classes); //240
		
		
		int totalLinesOfCode = linesOfCodes* classes;
		// totalLinesOfCode = 240
		System.out.println("totalLinesOfCode = "+ totalLinesOfCode);
		
		//Division operator
		
		System.out.println(10/3); //3
		
		System.out.println(55/5); //11
		
		System.out.println(10.0/3); //3.33333333 because is decimal :)
		
		System.out.println(15/7); //2
		System.out.println(15.0/7); //2.14285
		
		
		System.out.println(11/0);//errors
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
