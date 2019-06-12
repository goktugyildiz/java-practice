package day33_methods05;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int pay =  getHourlyPay(0, 50);
		
		System.out.println("Total pay for 40 hours: "+ pay);
		System.out.println(getHourlyPay(0, 50));
		int noPay = getHourlyPay(0, 10);
		System.out.println("NoPay: " + noPay);
	}

	
	/*
	 * method : getHourlyPay
	 * return type: int
	 * params : int hours , int rate
	 * return total pay by multiply hours *rate
	 * if(hours is 0 or negative 
	 * Print "invalid hours
	 * return0;
	 * if rate is 0 or negative
	 * print "invalid rate
	 * return 0 ;
	 */
	public static int getHourlyPay(int hours , int rate) {
				
		if(hours <=0 ) {
			System.out.println("Invalid hours");
			return 0 ;
		 }
		
		
		if(rate <= 0 ) {
			System.out.println("Invalid rate");
			return 0;
		}
		
		
		int total = hours*rate;
		return total;

	}
	
	
	
	
	
	
	
}
