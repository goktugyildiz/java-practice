package day40_customclasses_methods;

public class MyContacts {
	public static void main(String[] args) {
		//Creat Contact object
		
		Contact contact1 = new Contact();
		/*contact1.name = "Sofana";
		contact1.phoneNumber = "(202) 333-4444";
		contact1.email = "sofana.benoutiq123@gmail.com";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		*/
		
		Contact orhan = new Contact();
		orhan.name = "Orhan Cetin";
		orhan.phoneNumber = "(570) 500 03 75";
		orhan.email = "orhancetin@gmail.com";
		
		System.out.println("Name: "+ orhan.name);
		System.out.println("PhoneNumber: "+ orhan.phoneNumber);
		System.out.println("Email: "+ orhan.email);
		
		

	}
}
