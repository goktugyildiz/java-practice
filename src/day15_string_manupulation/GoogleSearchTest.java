package day15_string_manupulation;

public class GoogleSearchTest {

	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item+ " - Google search";
		
        //test if pageTitle starts with item
		
		if (pageTitle.startsWith(item)) {
			System.out.println("Pass: Page title check passed");
			
			
		}else {
			System.out.println("FAIL: Page title check failed");
			
		}
		
		if (pageTitle.startsWith("Google Search")) {
			System.out.println("Pass: Google Search title check passed");
		}else {
			System.out.println("FAIL: Google Search title check failed");
		}
		
		
		
		
	}

}
