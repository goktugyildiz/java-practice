package day27_arrays05;

public class CanvasCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://learn.cybertekschool.com/courses/149";
		
		/*
		 * 147 - > Java programming 
		 * 204 --> Mentoring sessions
		 * 149--> SDLC
		 * 152--> QA Testing
		 * 144--> Team activity
		 * 143--> Welcome kit
		 * 
		 *---> split by "/" and get the last value from array
		 *---> convert it to integer . Integer.parseInt(..) --> int value
		 *Switch statement and find the course name
		 */
		
		//1-)
		
		String [] myUrl = url.split("/");
		System.out.println(myUrl.length);
		
		System.out.println(myUrl[myUrl.length-1]);
		
		//2-)converting from string to integer
		int courseId = Integer.parseInt(myUrl[myUrl.length-1]);
		
		//3-) Switch statement
		
		
		switch(courseId) {
		case 147:
			System.out.println("Java Programing");
			break;
		case 204:
			System.out.println("Mentoring Sessions");
			break;	
			
		case 149:
			System.out.println("SDLC");
			break;	
			
		case 152:
			System.out.println("QA Testing");
			break;	
			
		case 144:
			System.out.println("Team Activity");
			break;	
			
		case 143:
			System.out.println("Team Activity");
			break;		
			
		default:
			System.out.println("Invalid number for the course");
			break;
		
		}
		
	}

}
