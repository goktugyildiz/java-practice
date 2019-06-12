package day31_methods03;

public class Authentication {

	public static void main(String[] args) {
		
		login("mentoring@cyberteckschool.com" , "mentor001");
		login("google.com", "1223345");
		
	}
	
	/*name : login
		 * return type = void
		 * 2 String args/params: username , password
		 * 
		 * Inside the method : 
		 * validUsername : "mentoring@cyberteckschool.com"
		 * validPassword : "mentor001"
		 * login successful
		 * login failed
		 */
		
	public static void login(String userName , String password) {
		String validUsername = "mentoring@cyberteckschool.com";
		String validPassword = "mentor001";
		
		if(userName.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Login successful! Welcom to Okta");
		}else {
			System.out.println("Sign in failed");
		}
	}
	
}
