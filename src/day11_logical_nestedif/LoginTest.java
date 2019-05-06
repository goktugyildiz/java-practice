package day11_logical_nestedif;
import java.util.*;
public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter username");
     String username = scan.next();
     System.out.println("Enter password");
     String password = scan.next();
     
     
     String validUserName = "cybertek@gmail.com";
     String validPassword = "WoodenSpoon123";
     
     if (username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
    	 System.out.println("Login Successful, Welcome!");
    	 
     }else if (!username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) { 
    	System.out.println("Invalid Username and Invalid Password"); 
      	 
     }else if(!username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
    	System.out.println("Invalid username");
    	 
     }else if (username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
    	System.out.println("Invalid Password");
    	 
     }
     
		
		
		
		
		
		
		
	}

}
