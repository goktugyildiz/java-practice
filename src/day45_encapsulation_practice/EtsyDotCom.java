package day45_encapsulation_practice;

public class EtsyDotCom {

	public static void main(String[] args) {
		
		EtsyAccount account1 = new EtsyAccount();
		System.out.println(account1.toString());
		
		account1.setEmail("goktugyildiz1992@gmail.com");
		account1.setFirstName("goktug");
		account1.setPassword("turkey1234");
		System.out.println(account1.toString());
		
		//
		EtsyAccount account2 = new EtsyAccount();
		account2.setEmail("adFAef.info");
		account2.setFirstName("herelinoe233");
		account2.setPassword("abc12");
		System.out.println(account2.toString());
		
		//
		EtsyAccount account3 = new EtsyAccount("adFAef@info" , "herelinoe","abc123" );
		System.out.println(account3.toString());
		
		//
		System.out.println("###############");
		EtsyAccount account4 = new EtsyAccount("woodenspoon@gmail.com", "wooden spoon");
		System.out.println(account4.toString());

	}

}
