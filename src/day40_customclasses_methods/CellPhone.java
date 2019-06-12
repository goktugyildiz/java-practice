package day40_customclasses_methods;

public class CellPhone {
	/*
	 * CellPhone :
	 * attributes/data/inst variable:
	 * -brand
	 * screensize
	 * color
	 * price
	 * 
	 * behavior:
	 * call message
	 * takePicture
	 * 
	 */
	String brand;//null
	double screenSize;//0.0
	String color;//null
	double price;//default value of 0.0
	
	public void call() {
		System.out.println("Calling .....");
	}
	public void message() {
		System.out.println("Sending txt message....");
	}
	public void takeAPhoto() {
		System.out.println("Taking a photo....");
	}
	
	public static void main(String[] args) {
		//System.out.println(brand);
		//above line will not work we need to create object to use brand
		//create CellPhone object
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);//null
		System.out.println(cell1.screenSize);//0.0
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16; 
		System.out.println("Brand: "+ cell1.brand);
		System.out.println("ScreenSize: "+ cell1.screenSize);
		System.out.println("Color: " +cell1.color);
		System.out.println("Price: "+ cell1.price);
		
		
		//
		System.out.println("### CEll2 METHODS ###");
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.price = 39.22;
		cell2.color = "Black";
		System.out.println("Brand: "+ cell2.brand);
		System.out.println("ScreenSize: "+ cell2.screenSize);
		System.out.println("Color: " +cell2.color);
		System.out.println("Price: "+ cell2.price);
		
		////////
		System.out.println("### Calling Methods ###");
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		
		cell2.call();
		cell2.message();
		cell2.takeAPhoto();
		
		
		
	}
	
}








