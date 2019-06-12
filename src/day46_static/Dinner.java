package day46_static;

public class Dinner {
	
	public static int pizzaSlices = 8;
	
	public void takeASlice() {
		pizzaSlices--;
	}
	
	public void takeASlices(int count) {
		pizzaSlices-=count;
		
	}
	

}
