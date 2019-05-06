package day08_casting_conditionals;

public class CastingPrimitivies {

	public static void main(String[] args) {
		
		// cast double value to int
		
		int i = (int)3.4; // will remove .4
		System.out.println("i : " +i);
		
		double price = 230.50;
		int dollars =(int) price;
		
		System.out.println("Price: " + price);
		System.out.println("Dollars: " +dollars);
				
		//whole numbers. byte ,short, int
		
		int count = 244;
		byte byteCount =(byte) count;
		System.out.println("ByteCount: " +byteCount );//-12 because of binary
		//it will give you unexpected result because it will convert to binary system
		
		long longValue = 13423523L;
		int intValue = (int)longValue;
		System.out.println("int value: " + intValue);
		
		int large = 5678;
		short small = (short)large;
		System.out.println("Small: " +small);
		
		int result =(int) (500.4/2.0);
		// int result = (int)500.4/2.0;
		System.out.println("Result; "+result);
		
		

	}

}
