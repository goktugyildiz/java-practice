package day25_arrays03;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[] product = {"H&M Shirt", "Timbarland Shoes", "Swatch Watch Watch", "Gucci Bag", "Adidas Socks"};
			
			double [] prices = {120.0 , 5.99, 150.50 , 3000.5 , 6.99};
			
			int [] itemsId = {12345, 12346 , 12347 , 12348 , 12349};
			
		//print count of products 
			System.out.println("Product count: "+ product.length);
			
		//Check if product, prices and itemssIds same count	
			if(product.length == prices.length && itemsId.length ==product.length ) {
				System.out.println("Shopping list looks good");
			}else {
				System.out.println("Something is wrong in this list");
				return;
			}
		//loop through products and print each one in separate line
		
		for(String p : product) {
			System.out.println(p);
		}
		
		
		//print ---> for loop
		for(int i =0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
