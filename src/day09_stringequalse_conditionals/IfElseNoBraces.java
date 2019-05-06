package day09_stringequalse_conditionals;

public class IfElseNoBraces {

	public static void main(String[] args) {
		String  day = "Tuesday";
		
		if (day.equals("Tuesday")) 
		System.out.println("Today is Tuesday");	
			
		else 
			
			System.out.println("Today is not Tuesday");
		
		System.out.println("Today is not Tuesday");//this line is not part of else block
	}

}
