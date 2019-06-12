package day45_encapsulation_practice;

import java.util.Random;

public class EtsyAccount {

	/*
	 * task: encapsulated: email , firstName , password getter/setter, toString and
	 * add constructor
	 */
	private String email;
	private String firstName;
	private String password;

	
	// constructor number 1. No - args sets all as empty String
	public EtsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}
	//constructor number 2
	//takes 3 args sets them to instance variable
	//using setters
	
	public EtsyAccount(String email ,String firstName ,  String password) {
		setEmail(email); // or we can say this.setEmail(email);
		this.setFirstName(firstName);
		setPassword(password);
		
	}
	//constructor 3 
	//email , firstName --- call setter method
	//password is auto generated and assigned
	
	public   EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password =getRandomPassword(); //random, password with 6 charc
		
		
	}
	
	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";
		for(int i=1; i<+6; i++) {
			rdPassword+=letters.charAt(rd.nextInt(letters.length()));
		}
		return rdPassword;
		
	}

	@Override
	public String toString() {
		return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		//if it contains@ somewhere in the middle. assign it
		//if not print "please enter a valid email address"
		if(email.indexOf("@")>0 && email.indexOf('@')!= email.length()-1) {
			this.email = email;
		}else {
			System.out.println("Please enter a valid email address");
		}
		
	}

	public String getFirstName() {
		
		return firstName;
	}

	public void setFirstName(String firstName) {
		//cant be blank
		//needs to be only alphabetic/letters
		if(isValidFirstName(firstName)) {
			
			this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters");
		}
		
	}
	
	/*
	 * valid--. all letters , can have space in middle
	 * invalid-, cannot contain numberss or any other chars
	 */
	private boolean isValidFirstName(String firstName) {
		//check first if it starts with or ends with space
		//return false if true
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		if(firstName.isEmpty()) {
			System.out.println("Cannot be balnk");
			return false;
		}
		
		for(int i =0; i<firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if(!Character.isAlphabetic(ch) && ch!= ' ') {
				return false;
			}
		}
		return true;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		//at least need to be 6 chars
		if(password.length()<6) {
			System.out.println("Must be at least 6 characters");
			this.password = "";
		}else {
			this.password = password;
		}
			
		
		
	}

}
