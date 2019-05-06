package day04_pirimitives_operators;

public class CitiesTogether {
	private static final int Tashkent = 0;
	private static final int Kyiv = 0;
	private static final int Moscow = 0;

	public static void main(String[] args) {
		
		//declare 3 string variables
		//city1 
		//city2 
		//city3 
		//assign value Tashkent , Kyiv , Moscow
		
		String city1 = "Tashkent";
		String city2 = "Kyiv";
		String city3 = "Moscow";
		//print : From Tashkent to Kyiv is $500
		//        From Moscow to Tashkent is $550
		//        I have been to Tashkent , Moscow, Kyiv.
		System.out.println("From "+ city1+ " to "+ city2+ " is $500");
		System.out.println("From "+city3+ " to " + city1+ " is $550");
		System.out.println("I have been to "+ city1+", "+ city2+ ", "+ city3+ ".");
		
		//We use <Slack> for messaging with Classmates
		String app = "Slack";
		System.out.println("We use " + app+ " for messaging with Clasmates");
		
		
		
	}

}
