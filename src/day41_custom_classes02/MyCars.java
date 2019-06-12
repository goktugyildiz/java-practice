package day41_custom_classes02;

public class MyCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed=55;
		car1.printCarInfo();
		
		//
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(55);
		
		car1.make = "Ford";
		car1.model = "Mustang";
		
		car1.drive();
		//
		System.out.println("Befor : "+ car1.currentSpeed);
		car1.accelerate(20);
		System.out.println("After : "+ car1.currentSpeed);
		
		//bmw
		Bmw bmw = new Bmw();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.showPrice();
		bmw.model = "740i";
		bmw.showPrice();
		
		Bmw bmw2 = new Bmw();
		bmw2.model = "X3";
		bmw2.showPrice();
		
	}
	

}
