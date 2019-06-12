package day46_static;

public class Customer {

	/*
	 * getters / setters 
	 * 2 constructor
	 * first no args = "undefined"
	 * second will have 2 args
	 */
	private static String name;
	private String email;
	
	static int count; //shared by everyone/all objects
						//one central copy of this variable
	
	public Customer() {
		name = "undefined";
		this.email= "undefined";
		
		
		
	}
	
	
	public Customer(String name , String email) {
		//very time we create customer we need to increase
		this.name = name;
		this.email = email;
		count++;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
