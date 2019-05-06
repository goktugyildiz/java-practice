package day20_forloop;
import java.util.*;
public class MultipilicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number:");
			int num = scan.nextInt();
			
			//Check if it is valid.
			//if it is not  valid return
			
			if(num<1 || num>10) {
				System.out.println("ERROR: Invalid input");
				return; //Stop execution here
			}
			
			//for loop to print multiplication table
		
			for (int i =1; i <=10; i++) {
				System.out.println(num + " x "+ i + " = "+(num*i));
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
