package day42_customclasses_encapsulation;

public class MyCoffees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee cof = new Coffee();
		cof.name = "Mocha";
		cof.size = "Tall";
		cof.calories = 250;
		cof.price = 4.35;
		cof.getCoffeInfo();
		//setName
		Coffee cof2 = new Coffee();
		cof2.setName("JAVA CHIP");
		cof2.size = "VENTI";
		cof2.price = 5.95;
		cof2.calories = 600;
		cof2.getCoffeInfo();
		
		//
		Coffee cof3 = new Coffee();
		cof3.setName("ICED COFFEE");
		cof3.setSize("TALL");
		cof3.setPrice(5.25);
		cof3.setCalories(575);
		cof3.getCoffeInfo();
		System.out.println("Coffee3 name: "+ cof3.name);
		//
		Coffee cof4 = new Coffee();
		cof4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		cof4.getCoffeInfo();
		
		
	}

}
