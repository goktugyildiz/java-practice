package day23_arrays_and_loops;

public class PrintNumbersWithLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j =1; j<=10; j++) {
			//outer loop
			for(int i =1; i<=j; i++) {
				//inner loop
				System.out.print(i +" ");
				
			}
			
			System.out.println();
			
		}
		
		//reverse from 10 to 1
		for(int j =10; j>=1; j--) {
			
			for(int i=1; i<=j; i++ ) {
				System.out.print(i +" ");

			}
			System.out.println();

			
			
		}
		
		
		
		
	}

}
