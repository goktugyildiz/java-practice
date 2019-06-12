package day50_inheritance03;

public class AdminUser extends SlackUser {
	
	public AdminUser(String name) {
		super(name);
	}

	public void sendAMessage(String message) {
		System.out.println("@Channel");
		System.out.println(getName()+ " is sending a message < "+ message);
	}
}
