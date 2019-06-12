package day31_methods03;

public class Drive {

	public static void main(String[] args) {
		drive("Mercedes", 75);

	}
	/*
	 * method name : drive
	 * return type : void
	 * 2 params/args : String car , int speed
	 * Audi driving 60 mph
	 */

	
	public static void drive(String car, int speed) {
		System.out.println(car+ " is driving "+speed+ " mph");
	}
}
