package Day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		
		
		//declare companyName
		//address
		//numberOfEmployees
		//revenue
		//isTechCompany
		
		//assign values
		//"Facebook"
		//"Silicon Valley, CA"
		//10000
		//4 000 000
		//yes
		
		//print statements and describe each value:
		
		
		String companyName = "Facebook";  
		String address = "Silicon Valley";
		int  numberOfEmployees = 1000;
		long revenue = 40658600000L;
		boolean isTechCompany = true;
		
		
		System.out.println("Company name is " + companyName);
		System.out.println("Addres is " +address);
		System.out.println("Number Of Employees is " + numberOfEmployees);
		System.out.println("Annual revenue is " + revenue);
		System.out.println("is it tech company? - " + isTechCompany);
		
		String aboutCompany = "Company " + companyName+ " is located in "+ address+ " and "+ numberOfEmployees+ " work for it."
;		
		
		System.out.println(aboutCompany );
		
		
		
		
		
		
	}

}
