package day21_loops_practice1;
import java.util.*;;
public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome, how many items are you purchasing today");
		
		int itemsCount = scan.nextInt();
		double totalPrice = 0.0;
		String items = "";
		
		for(int count = 1; count<= itemsCount; count++) {
			System.out.println("What is item "+count+"?");
			String itemName = scan.next();
			
			System.out.println("How much is "+itemName +"?");
			double itemPrice = scan.nextDouble();
			//add itemName to items and itemPrice to totalPrice
			items+=itemName+", ";
			totalPrice+=itemPrice;
		}
		
		if(items.endsWith(", ")) {
			//get rid of that ","
		}
		
		System.out.println("Total price: " +totalPrice);
		System.out.println("Your items: $ "+ items);
		
		
		
		
		
		
		
		
	}

}
