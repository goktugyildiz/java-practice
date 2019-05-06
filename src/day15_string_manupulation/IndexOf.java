package day15_string_manupulation;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                     // 012345
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		
		System.out.println(word1.indexOf("th")); // it will give you first position which is 2
		
		System.out.println(word1.indexOf("hub")); // 3

		System.out.println(word1.indexOf("java"));
		
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Position of . : "+i);
		System.out.println(url.charAt(i+1));
		
		String title = "Java - Google Search";
		//find pos of '-' and check if space
		//is on right and left sides
		int dash = title.indexOf('-'); //5
		
		System.out.println(title.charAt(dash-1)); //" "
		System.out.println(title.charAt(dash+1));
		System.out.println(title.charAt(dash-2)); //
		System.out.println(title.charAt(dash+2)); //" "

		
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position if states: " +states);
		
		
		String word2 = "java, c++, pyhton, tomcat, eclipse";
		
		//check if c++ is in the word2
		//1) using contains
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");

		}
		  // using indexOf
		
		if(word2.indexOf("c++") > -1) {
			System.out.println("c++ is there");

		}else {
			System.out.println("c++ is not there");

		}
		
		
		
		
		
		
	}

}
