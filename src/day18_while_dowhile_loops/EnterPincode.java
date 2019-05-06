package day18_while_dowhile_loops;

import java.util.*;
public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		
		int secretPincode = 1234;
		
		int pincode = 0;
		
		//keep asking for pin code till correct one entered
		
		
		
		//access granted, select operation
		
		while(pincode != secretPincode) {
			System.out.println(pincode);
			pincode = scan.nextInt();
			
		}
		
		System.out.println("Access granted, Select operation");
		
		
		
		
		
		
		
		
		
	}

}
