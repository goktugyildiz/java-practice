package day50_inheritance03;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		FullTimeEmployee ft = new FullTimeEmployee();
		
		Contractor ct = new Contractor();

		emp1.calculatePay(40, 23.5);
		ft.calculatePay(40, 34);
		ct.calculatePay(40, 55);
		

	}

}
