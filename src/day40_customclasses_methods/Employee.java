package day40_customclasses_methods;

public class Employee {
	
	 public String name; // when you declare public you can use anywhere other just in the package
	 public String jobTitle;
	 double salary;
	 
	 public void work() {
		 System.out.println(name + " is working hard...");
	 }
	 public void attendMeeting() {
		 System.out.println(name+ " is attending a meeting...");
	 }
	public void  introduce() {
		System.out.println("Name[" + name +"], jobTitle[ "+ jobTitle+ " ], salary[ " + salary+ "]");
	}

}
