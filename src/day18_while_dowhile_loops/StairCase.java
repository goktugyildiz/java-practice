package day18_while_dowhile_loops;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ** 
		 ** 
		 *** 
		 **** 
		 ***** 
		 ****** 
		 ******* 
		 longest one should be 20
		 */
		
		/*String stairs = "*";
		
		System.out.println(stairs);
		
		stairs = stairs +"*";
		System.out.println(stairs);
		*/
		
		String stairs = "*";
		//1) with counter
		int num = 1;
		while(num<=10) {
			System.out.println(stairs);
			stairs+= "*";
			num++;
		}
		
		//2) checking the length
		
		stairs = "*";
		while(stairs.length() <=10) {
			System.out.println(stairs);
			stairs+= "*";
		}
		
		
		
	}

}
