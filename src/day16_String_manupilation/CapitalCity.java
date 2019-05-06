package day16_String_manupilation;

public class CapitalCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Moscow is a capital of Russia";
		
		//Baku, Azerbaijan
		
		str = str.replace("Moscow", "Baku");
		str = str.replace("Russia", "Azerbaijan");
		
		System.out.println(str);
		
		String email = "goktugyildiz1992@gmail.com";
		
		String company = "deloitte";
		
		String newEmail = email.replace("gmail", company);
		
		System.out.println(newEmail);
		
		
		
		
	}

}
