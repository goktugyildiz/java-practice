package day40_customclasses_methods;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.name = "Kate";
		emp1.jobTitle = "Developer";
		emp1.salary = 115000.00;
		
		emp1.introduce();
		emp1.work();
		emp1.attendMeeting();
		
		emp1.jobTitle = "Team Lead";
		emp1.salary = 120000.0;
		emp1.introduce();

		
	}

}
