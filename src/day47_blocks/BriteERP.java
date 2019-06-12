package day47_blocks;

import java.time.LocalDateTime;

public class BriteERP {
	//add a block
	static {//automatically runs
		System.out.println("Lunch Browser");
		System.out.println("Navigate to: "+TestData.url  );
		
	}
	
	public static void enterEmail() {
		System.out.println("Enter email:"+ TestData.email);
	}
	public static void enterPassword() {
		System.out.println("Enter password:"+ TestData.password);
	}
	public static void verifyLogin() {
		System.out.println("Expected Name: "+ TestData.userName  );
		System.out.println("Actual Name displayed: Victoriia");
		System.out.println("Login Successful - "+ LocalDateTime.now());
	}

}
