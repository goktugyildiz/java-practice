package day41_custom_classes02;

public class Bmw {
	/*
	 * make = "Bmw"
	 * model
	 * price
	 * 
	 */
	String make= "Bmw";
	String model;
	double price;
	//methods
	//showPrice
	
	public void showPrice() {
	switch(model) {
	case "330i":
		price = 40250;
		break;
	case "740i":
		price = 86450;
		break;
	case "m3":
		price = 66500;
	break;
	default:
		System.out.println(model + " is not available");
	
	}
	System.out.println("Price: "+ price);
	
	}
}
