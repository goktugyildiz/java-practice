package day43_encapsulation_constructor;

public class TeslaDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tesla tesla = new Tesla();
		tesla.setModel("Model Y");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: "+ tesla.getModel());
		System.out.println("Range: "+ tesla.getRange());
		System.out.println("Zero to 60 : "+ tesla.getZeroTo60());
		System.out.println("Price: "+ tesla.getPrice());
		System.out.println("Self Driving ? "+ tesla.isSelfDriving());
		
		System.out.println(tesla);//automatically calling the toString 
		System.out.println(tesla.toString() );
		
		////////////////////////////
		//setTeslaInfo
		System.out.println("######################");
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		if(tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: "+myTesla.getModel());
			System.out.println("0-60 speed: "+myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model: "+tesla.getModel());
			System.out.println("0-60 speed: "+tesla.getZeroTo60());
		}
		buy(myTesla);
		buy(tesla);
		System.out.println(testDrive("Model S"));
		Tesla testCar = testDrive("Model 3");
		System.out.println(testCar.toString());
	} // main method
	
	/*
	 * method that return or accept custom class type
	 * in teslaDealer class
	 * 			buy
	 * 			return type void
	 * 			params:  Tesla object
	 * 		"purchasing +toString value"
	 */
	
						//car = myTesla;
	public static void buy(Tesla car) {
		System.out.println("Purchasing: " + car.toString());
	}
	/*
	 * testDrive r
	 * return tesla
	 * param: String model
	 * "I would like to test drive -"+ model
	 * "Sure, let me build the object and return it"
	 * create object with data here and return
	 * return {tesla object};
	 * 
	 */
	public static Tesla testDrive(String model) {
		System.out.println("-Hi, I would like to test drive - "+ model);
		System.out.println("Sure, let me build the object and return it");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);;
		return car;
	}
	
	
	
	
	
	

}
