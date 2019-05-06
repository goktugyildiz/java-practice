package day20_forloop;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* if statement 
		 * using for loop :1-100
		 * 1,Print all even numbers in same line
		 */
		for(int j =1; j<=100; j++) {
			if(j % 2 !=0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		for (int n =1; n<=100; n++) {
			if(n %2 ==0) {
				System.out.print(+n+" ");
			}
		}
		 //3.sumOfOdds, sumOfEvens - calculate
		 //and print out after the loop
		//sum of 1 - 10
		//1+2+3..10
		
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		for(int num = 1; num<=100; num++) {
			if((num % 2) == 0) {
				sumOfEvens += num;
				
			}else {
				sumOfOdds+=num;
			}
		}
		
		System.out.println();
		System.out.println("Sum of evens: "+ sumOfEvens);
		System.out.println("Sum of odds: "+ sumOfOdds);

		
		
		
		
		
	}

}
