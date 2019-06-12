package day46_static;

public class Ebay {

	public static void main(String[] args) {
		
		Customer cm1 = new Customer("Abdallah Assillet" , "abdallah@gmail.com");
		Customer cm2 = new Customer("Adilet Krgyz" , "adilet@yahoo.com");
		Customer cm3 = new Customer("Anastasiia Zasibna" , "anastasiia@hotmail.com");
		
		System.out.println(cm1.count);
		System.out.println(Customer.count);

		Customer cm4 = new Customer("Burak Ocal" , "burak@gmail.com");
		System.out.println("Total count: "+ Customer.count);
		cm1.count = 10;
		
		System.out.println(cm3.count);
		System.out.println(Customer.count );
		
		//what if we will make static to methods
		System.out.println(cm1.toString());
		System.out.println(cm2.toString());
		System.out.println(cm3.toString());
		System.out.println(cm4.toString());

	}

}
