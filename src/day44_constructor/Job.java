package day44_constructor;

public class Job {
	/*
	 * title , company , annualSalary
	 * 
	 * Encapsulated above private instance fields
	 * create no arg constructor set title , company to "undefined"
	 * 
	 * Create 1 arg constructor to set title company to undefined
	 * 
	 * Create 3 args constructor to set all 3 fields
	 * create a method called toString
	 * 
	 */
	private String title;
	private String company;
	private double salary;
	
	public Job() {
		System.out.println("No - args constructor");
		this.title = "undefined";
		this.company = "undefined";
		
	}
	public Job(String title) {
		System.out.println("One - args constructor");
		setTitle(title); 
		this.company = "undefined";
		
	}
	public Job(String title, String company, double salary) {
		System.out.println("Three - args constructor ");
		this.title = title;
		setCompany(company);
		this.salary = salary;
	}
	
	
	
	
	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", salary=" + salary + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		//we can add conditions here
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
