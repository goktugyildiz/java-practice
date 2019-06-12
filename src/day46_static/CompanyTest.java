package day46_static;

public class CompanyTest {

	public static void main(String[] args) {
		//print cname variable value
		
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
		
	// Class name / variable/ methods 	
		//Company.cname.toUpperCase();
		//System.out.println();
		
		Company c = new Company();
		System.out.println(c.cname);		//it is all up to you 
		c.companyInfo();
		Company.companyInfo();
		
		System.out.println(Math.round(344.67));

	}

}
