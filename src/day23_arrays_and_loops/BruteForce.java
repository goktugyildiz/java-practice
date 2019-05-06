package day23_arrays_and_loops;
import java.util.*;
public class BruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		Scanner scan = new Scanner(System.in);
		int attempts = 5;
		
		do {
			if(attempts == 0) {
				System.out.println("You have exceeded number of attempt");
				System.out.println("This user has been deactivated for 30 minutes");
				return;
			}
			attempts--;
			System.out.println("Please enter user name");
			username = scan.next();
			if(!username.equals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: "+ attempts);
				continue;
			}
			System.out.println("Please enter your password");
			password = scan.next();
			if(!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left; "+attempts);
				continue;
			}
			
		}while(!username.equals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login successful!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
