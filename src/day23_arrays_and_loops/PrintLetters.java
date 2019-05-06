package day23_arrays_and_loops;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		//outer loop will repeat printing of letter as many time as want
		//in this case we will print 3 lines
		//so we are repeating inner loop 3 times
		for(int i =0; i<10; i++) {
			//if index odd print from a to z	
			
			
			if(i%2==0) { 
				
				for(char letter = 'a'; letter<='z'; letter++) {
					System.out.print(letter+ " ");
				} 
				//if index is even  print from z to a
			}else {
				for(char letter = 'z'; letter>='a'; letter--) {
					System.out.print(letter+ " ");

				}
			}
		
			System.out.println("\n******************************************************");
		}
		
		
		}
		
		
		
	
		
		
		
		
		
		
	}


