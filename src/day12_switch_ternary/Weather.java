package day12_switch_ternary;
import java.util.*;
public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner (System.in);
       
       System.out.println("How is th weather: ");
       
       String weather = scan.next().toLowerCase();// make everything lowercase example "SUnny" --> sunny
       
       switch (weather) {
             
       case "sunny" :
    	   System.out.println("Go to the park");
    	   break;
       case "hot" :
    	   System.out.println("Go swimming");
    	   break;
       case "rainy":
    	   System.out.println("Stay home");
    	   break;
       case "snow":
    	   System.out.println("Code java");
    	   System.out.println("Go to skiing");
       default:
    	   System.out.println("Code java in anyway");
    		break;
    		   
    	  }
		
		
		System.out.println("End the program");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
