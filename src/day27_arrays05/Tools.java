package day27_arrays05;

public class Tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Java --> programming language
		//Selenium---> Test Automation
		//TestNG --> Unit Tests
		//JUnit--> Unit Tests
		//Cucumber--> BDD Style testing
		//Git --> Version Control
		//Maven --> Building and execution for project
		
		String[] tools = {"Java", "Selenium","TestNG","JUnit" ,"Cucumber", "Git","Maven" };
		
		for(String tool :tools) {
			switch(tool.toLowerCase()) {
			case "java":
				System.out.println("Java --> programming language");
				break;
			case "selenium":
				System.out.println("Selenium---> Test Automation");
				break;
			case "testng":
				System.out.println("TestNG --> Unit Tests");
				break;
			case "junit":
				System.out.println("JUnit--> Unit Tests");
				break;
			case "cucumber":
				System.out.println("Cucumber--> BDD Style testing");
				break;
			case "git" :
				System.out.println("Git --> Version Control");
				break;
			case "maven":
				System.out.println("Maven --> Building and execution for project");
				break;
			default:
				System.out.println("Unknown tools");
				break;
				
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
