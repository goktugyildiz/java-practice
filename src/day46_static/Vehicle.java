package day46_static;

public class Vehicle {

	String type;//instance variable every object has its own type
	static int numberOfVehicle;//shared, one central copy
	
	public static void vehicleInfo() {
		//System.out.println("type:"+ type); this will not work based on rules
		System.out.println(numberOfVehicle);
		
		int count =  getNumberOfInfo();//this will work because both static
		String make = "Kia";
		make.toUpperCase(); // its a local variable so its fine
		System.out.println("Make : "+ make);
		//System.out.println(toString()); > cannot call non-static method
		
		/*
		 * Vehicle vh = new Vehicle();
		 * vh.toString();
		 */
	}
	public static int getNumberOfInfo() {
		
		return numberOfVehicle;
	}
	
	public String toString() {
		return "Vehicle type: "+type + " | numberOfVehicle: "+ numberOfVehicle;  
		
	}
}
