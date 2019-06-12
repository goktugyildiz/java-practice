package day50_inheritance03;

public class Employee {
	/*
	 * Task: 
	 * Parent Class : Employee
	 * Child Class : FullTimeEmployee , Contractor
	 * 
	 * calculatePay(int hours , double rate )
	 * 
	 * Employee version " Employee total pay: " + hours*rate
	 * 
	 * fullTimeEmployee get some bonus should include 5% bonus
	 *  "FullTime employee total pay: " +total
	 *  
	 *  Contractor version: gets $200 extra for each pay
	 *  "Contractor employee total pay : "+ total
	 * 
	 */
	
	public void calculatePay(int hours, double rate) {
		System.out.println("Employee total pay: " + (hours*rate));
	}
	
	
}
