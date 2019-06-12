package day42_customclasses_encapsulation;

public class Coffee {

	/*
	 * instance variables:
	 * name
	 * size
	 * price
	 * calories
	 */
	//Methods:
	//getCoffeeInfo
	String name;
	String size;
	double price;
	int calories;
	public void getCoffeInfo() {
		String info = name.toUpperCase()+" "+ size.toUpperCase()+" $ "+price+" "+calories+" CAL";
		System.out.println(info);
	}
	/*
	 * setName
	 * void String newName
	 * it will assign newNAme to name instance variables
	 * -setter methods for other 3 variables
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall") || newSize.equalsIgnoreCase("grande") || newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		}else {
			System.out.println("ERROR : Invalid Size - "+ newSize);
			size = "unknown";
		}
		
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCalories(int newCalories) {
		calories = newCalories;
	}
	/*
	 * setCoffeeInfo
	 * void
	 * params: String newName, String newSize, double newPrice , int newCalories
	 */
	public void setCoffeeInfo(String newName, String newSize, double newPrice , int newCal) {
		name = newName;
		size = newSize;
		price = newPrice;
		calories = newCal;  
				
	}
}
