package day08_casting_conditionals;

public class ImplicitCasting {

	public static void main(String[] args) {
		//Automatic casting from smaller to larger type
		short shortValue = 3445;
		int intValue = (int)shortValue;//you dont have to add (int) optinal
		
		System.out.println("Int value: "+ intValue);
		
		
		double price = 345;
		System.out.println("Price after casting: "+price); //345.0 will show up
		
		int price1 = 34563;
		double dPrice = price1;
		System.out.println("DPrice after casting: " +dPrice);
		
		double d= 40.2;
		int i = (byte)d; 
		//in above statement both explicit and implicit casting happenin
		
		//explicit:doble> byte
		//implicit: byte> int
		
		
		
		
		
		
		
		
	}

}
