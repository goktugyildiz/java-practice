package day15_string_manupulation;

public class IndexOf2 {

	public static void main(String[] args) {
		// index of with 2 inputs
		
		String list = "html-selenium-angular-jenkins-grid";
		 int firstDash = list.indexOf("-");
		 System.out.println("First dash: "+firstDash); //4
		 
		 
		 int secondDash = list.indexOf("-" , 5);
		 System.out.println("Second dash: "+secondDash);
		 
		 //find the third one by using secondDash variable
		 
		 int thirdDash = list.indexOf("-" , secondDash+1);
		 System.out.println("Third dash: "+ thirdDash);
		
		 
		 //find the last dash
		 int lastDash = list.lastIndexOf("-");
		 System.out.println("Last dash: " +lastDash);
		
		
		
		
		
		
		
		
		
		
	}

}
