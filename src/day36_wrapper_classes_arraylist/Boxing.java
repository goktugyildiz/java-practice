package day36_wrapper_classes_arraylist;

public class Boxing {

	public static void main(String[] args) {
		// AutoBoxing primitive---> object
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
 
		
		//Unboxing object to primitive
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("D1: "+ d1);
		System.out.println("D2: "+d2);
		
		long l1 = new Long(600000000);// Unboxing
		Long l2 = new Long(34453345L);
		long l3 = l2; // Unboxing object to primitive
		Long l4 = l3; //autoboxing
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = nums3;  casting not possible with wrapper classes
		
	}

}
