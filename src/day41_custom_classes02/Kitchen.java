package day41_custom_classes02;

public class Kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Microwave micro = new Microwave();
		micro.brand = "Bosh";
		micro.turnOn();
		micro.heat("Pizza with mushrooms&anchovies");
		micro.turnOff();
		
	}

}
