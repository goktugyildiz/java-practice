package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean isBreakTime = true;
        
        if (isBreakTime = true) {
        	System.out.println("Break Till 8:35 PM");
        	
        }else {
        	System.out.println("Not Break Time yet.");
        }
		
		//second version
        
        if (isBreakTime ) { // you dont have to use == bcz it is already boolean variable
        	System.out.println("Break Till 8:35 PM");
        	
        }else {
        	System.out.println("Not Break Time yet.");
        }
		
		boolean classTime = false;
		if (classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			
		}else {
		
			System.out.println("Take a walk and have some water");
		}
		
		boolean qualified  = false;
		// send a notifications message if not qualified
		//we need to check if qualified variable contains False
		if (qualified==false   ) {
			System.out.println("Your app was not approve.");
		}
		
		
		
	}

}
