package day16_String_manupilation;
import java.util.*;
public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter url:");
		
		String url = scan.next();
		
		//www.amazon.com
		
		//com, net, org , edu..
		//check if it start with www.
		
		//assign String domain and String extension
		//print them out
		
		if(url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format");
			return;
		}
		
		//check it contains the ending dot right before extension
		//find out the length of url
		//do -4 and using charAt get the character
		//compare if it is'.'
		//www.etsy.com==>12
		
		int dotIndex = url.length()-4;
		//url.lastIndexOf(".")
		
		System.out.println();
		
		if(url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extension");
			
		}else {
			System.out.println(". might be misplaced");
			
		}
		 /*
		  * 
		  * if (url.charAt(url.length - 4) == '.'){
		  * }
		  * 
		  * 
		  * 
		  * 
		  * 
		  */
		
		//get domain and extension
		String domain = url.substring(4, dotIndex);
		System.out.println("Domain: "+domain);
		
		String extension = url.substring(dotIndex+1, url.length() );
		
		System.out.println("Extension: " +extension);
		
		
	}

}
