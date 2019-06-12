package day48_inheritance01;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Maria";
		emp1.age  = 27;
		emp1.jobTitle = "Teacher";
		emp1.gender = 'F';
		
		Employee emp2 = new Employee();
		emp2.name = "Keke";
		emp2.age = 24;
		emp2.gender = 'F';
		emp2.jobTitle = "HR";
		
		emp1.work();
		emp2.work();
		
		emp1.eat("Chicken");
		emp2.eat("Taco");
		
		emp1.walk();
		emp2.walk();
		
		emp1.sleep(5);
		emp2.sleep(6);

		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		


	}

}
