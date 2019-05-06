package day15_string_manupulation;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes , apples, tomatoes, eggs, milk, bread, cereal, meat";
		
		//check if apples in the shopping list
		//apples are there ==>true
		//lets add apples now ==>false
		
		if(list.contains("apples")) {
			System.out.println("Apples are there!");
		}else  {
			System.out.println("Lets Add aplles now!");
		}
		
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: "+ hasEggs);
		
		boolean cucumber = list.toLowerCase().contains("cucumber");
		System.out.println("Contains cucumber: "+cucumber);
		
		
		if(email.contains("yahoo")) {
			System.out.println("It is a yahoo email");
		}else if(email.contains("gmail")) {
			System.out.println("Gmail account");
		}else if (email.contains("hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
			String str = " | ";
			System.out.println(etsyTitle.contains("e"));
		
		
		//assign your name and check it contains "a" or "e" letters
		
		String name = "goktug";
		if(name.contains("a") || name.contains("e")) {
			System.out.println("'a' or 'e' present");
		}else {
			System.out.println("'a' or 'e' missing");
		}
		
		
		
		
	}

}
