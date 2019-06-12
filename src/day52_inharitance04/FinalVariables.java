package day52_inharitance04;

public class FinalVariables {

	public final int ROADSTER_MAX_RANGE = 610;

	public final int MODEL_3_MAX_SPEED;

	public final int MODEL_X_PASSENGERS;
	
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;	
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";

	}

	public FinalVariables() {

		MODEL_3_MAX_SPEED = 180;
	}

	{

		MODEL_X_PASSENGERS = 7;

	}

	public static void main(String[] args) {

		final int MAX_PASSENGERS_COUNT = 5;
		// MAX_PASSENGERS_COUNT = 10;

		final double PI = 3.144262346356;
		// PI = 4.6667467467;
		System.out.println(MAX_PASSENGERS_COUNT);

		final int SSN;
		SSN = 352352667;

		// SSN++ is not possible
		
		FinalVariables finalVar = new FinalVariables();
		System.out.println("Max range for roadster: "+ finalVar.ROADSTER_MAX_RANGE);
		
		System.out.println("Model 3 max speed: "+ finalVar.MODEL_3_MAX_SPEED);
		System.out.println("Model x max passenger: "+ finalVar.MODEL_X_PASSENGERS);
		
		System.out.println("Company name: "+COMPANY_NAME );
		System.out.println("ADMIN_USERNAME : "+ ADMIN_USERNAME);
	
		

	}

}
