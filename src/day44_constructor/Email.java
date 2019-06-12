package day44_constructor;

public class Email {
	String message;
	
	public Email(String message) {
		System.out.println("Sending email with message: "+ message);
		this.message = message;
		
	}
}
