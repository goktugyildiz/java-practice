package day14_string_manupulation;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good morning";
		//check if it match "Good morning" and print match
		//or not match
		if(str1.equals("Goog morning")) {
			System.out.println("Match");
			
		}else {
			System.out.println("Not match");
		}
		
		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not match -  ignore case");
		}

		//convert to all upper case and print
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1); // it stays as old value. not upper case
		
		str1 = str1.toUpperCase();
		System.out.println("After assignment: " +str1);
		
		//combine the above  methods together:
		//convert to all lower case first then check if it equals ("good morning")
		//before converting to lower case value is "GOOG MORNING"
		if (str1.toLowerCase().equals("good morning")) {
		System.out.println("Chained methods: match");	
		
		
		}else {
			System.out.println("Chained methods: do not match");
		}
		
		// FIND OUT HOW MANY CHARACTERS IN THE STRING
		String myName = "Goktug";
		System.out.println(myName.length()); // it is counting how many characters have her its 6
		String myName1 = "aysen";
		System.out.println(myName1.length()); // here is 5 for example
		
		int length = myName.length();
		System.out.println("My name's length: "+ length);
		
		
		//user names must be exactly 8 characters
		//set some values and using a if statements check it is 
		//* characters: if true => valid user name. false => invalid user name
		
		String userName = "galatasaray";
		
		if(userName.length() ==8 ) {
			System.out.println("Valid username:");
			
			// password must be at least 6 characters
		}else {
			System.out.println("Invalid username , must be 8 characters");
		}
		
		String password = "woodenSpoon";
		
		if (password.length() >=6) {
			System.out.println("Password is good");
		}else {
			System.out.println("password is short");
		}
		
		int passwordLength = password.length();
		
		if (passwordLength <6) {
			System.out.println("Invalid password. Too short");
		}else {
			System.out.println("Valid password, good job");
		}
		
		
	}

}
