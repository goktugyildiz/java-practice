package day09_stringequalse_conditionals;
import java.util.*;
public class Canada {

	public static void main(String[] args) {
		// Ask user "What is the Capital of Canada?"
		//using Scanner assign the value to capital variable.
		
		//Check if the answer i correct
		//==> your answer is correct!
		//false
		//==> your answer is incorrect! value is not capital of Canada
		
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the Capital of Canada?");
      String capital = scan.nextLine();
      
     //  if(capital =="Ottawa") { it will not work
      
      if(capital.equals("Ottawa")) { //this is the right way to do it
    	//if(capital.equalsIgnoreCase("Ottawa")) { lower or upper case dosen't matter 
    	  System.out.println("your answer is correct!");  
      }else {
    	  
    	  System.out.println("your answer is incorrect! "+capital+" is not capital of Canada");
      }
      
      
      
      
      
      
      
      
	}

}
