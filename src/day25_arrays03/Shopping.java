package day25_arrays03;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[] products = {"H&M Shirt", "Timbarland Shoes", "Swatch Watch Watch", "Gucci Bag", "Adidas Socks"};
			
			double [] prices = {120.0 , 5.99, 150.50 , 3000.5 , 6.99};
			
			int [] itemsId = {12345, 12346 , 12347 , 12348 , 12349};
			
		//print count of products 
			System.out.println("Product count: "+ products.length);
			
		//Check if product, prices and itemssIds same count	
			if(products.length == prices.length && itemsId.length ==products.length ) {
				System.out.println("Shopping list looks good");
			}else {
				System.out.println("Something is wrong in this list");
				return;
			}
		//loop through products and print each one in separate line
		
		for(String p : products) {
			System.out.println(p);
		}
		
		
		//print ---> for loop
		for(int i =0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		
		//print itemsId reverse order
		
		for(int n = itemsId.length -1; n>=0; n-- ) {
			System.out.println(itemsId[n]);
		}
		
		
		
		//Print a report with a total price
		//Item 1 : 12345 - H&M Shirt - 120.0
		//.....
		//Total Price: 
		double totalPrice = 0.0;
		System.out.println("###### YOUR SHOPPING RECIEPT #######");
		for(int total = 0; total < products.length; total++) {
			System.out.println("Item "+(total+1)+": "+ itemsId[total]+" - " +products[total]+" - $"+prices[total]);
			totalPrice += prices[total];
		
		}
		
		System.out.println("Total Price: " +totalPrice );
		
		
		//find the most expensive item and print it as a report
		//loop and find . Do not use arrays class
		
		int maxIndex = 0 ;
		double maxPrice = 0;
		
		for(int j = 0; j<prices.length; j++) {
			if(prices[j] >maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
			
		}
		System.out.println(itemsId[maxIndex]+ " - "+ products[maxIndex] + " - $ " +maxPrice);
		
	}

}
