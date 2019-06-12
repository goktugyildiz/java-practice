package day46_static;

public class Restaurant {

	public static void main(String[] args) {
		Dinner Mom = new Dinner();
		Dinner Kid = new Dinner();
		Dinner Dad = new Dinner();
		
		System.out.println("Total slices: "+ Dinner.pizzaSlices);
		
		Dad.takeASlice();
		Kid.takeASlice();
		Mom.takeASlice();
		
		System.out.println("Total slices: "+ Dinner.pizzaSlices);
		
		System.out.println("Total slices: "+ Dad.pizzaSlices);
		
		Kid.takeASlices(3);
		
		Dad.takeASlices(2);
		//Mom.takeASlice();
		
		System.out.println("Total slices: "+ Mom.pizzaSlices);
		System.out.println("Total slices: "+ Dinner.pizzaSlices);

		


	}

}
