package day18_while_dowhile_loops;

public class Counter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//1,2,3,4,5,6,7,8,9,10
		
		int num =1;
		
		while(num<=10) {
			System.out.print(num+",");
		    num++;
		   // Thread.sleep(1000); //pause the code execution for a second
		}
		
		System.out.println("\nNum value after loop:" +num);
		
		
		//11,10,9,8,7,6,5,4,3,2,1
		int num2 = 11;
		
		while(num2>=1) {
			System.out.print(num2 +", " );
			num2--;
			//Thread.sleep(456);
		}
		
		System.out.println("\nNum2: "+num2);
		
		
		
		
		
		
		
	}

}
