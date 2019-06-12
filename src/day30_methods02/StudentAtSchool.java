package day30_methods02;

public class StudentAtSchool {

	public static void main(String[] args) {
		
		study("Selenium");
		study("SQL");
		
		sleep(10);
		sleep(4);
		sleep(7);
	}
	
	public static void study(String topic) {
		System.out.println("Student is studying " + topic);
	}

	
	/*Method name : sleep 
	 * return type = void
	 * parms/args/input: int hours
	 * 
	 * Method accepts hours value and prints
	 * "Student has been sleeping for 5 hours"
	 * 
	 */
	
	public static void sleep(int hours) {
		System.out.println("Student has been sleepping for "+ hours+ " hours");
	}
}
