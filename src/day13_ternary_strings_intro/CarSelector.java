package day13_ternary_strings_intro;
import java.util.*;
public class CarSelector {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which type of care you are interested? ");
		
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean ");
		
		int carType = scan.nextInt();
		
		double avaragePrice = 0.0;
		
		String carOptions = "";
		String carOrigin = "";
		
		switch (carType) {
		     case 1 :
		    	 avaragePrice = 33000.0;
		         carOptions = "Ford, Dodge, Tesla, Chevroler, Lincoln";
		         carOrigin = "American";
		     break;
		     
		     case 2 :
		    	 avaragePrice = 32000.0;
		         carOptions = "Toyota, Mitsubishi, Honda, Subaru, Mazda";
		         carOrigin = "Japanese";
		     break;
		     
		     case 3 :
		    	 avaragePrice = 55000.0;
		         carOptions = "Bmw, Vw, Audi, Mercedes, Porshe";
		         carOrigin = "German";
		     break;
		
		     case 4 :
		    	 avaragePrice = 85000.0;
		         carOptions = "Alfa Romeo , Ferrari, Lomborghini, Fiat";
		         carOrigin = "Italian";
		     break;
		
		     case 5 :
		    	 avaragePrice = 25000.0;
		         carOptions = "Kia, Hyundai, Daewod";
		         carOrigin = "Korean";
		     break;
		     
		     
		     default: 
		    	 System.out.println("Car type is not available");
		    	 
		    	 return; // stop execution. Don't run the rest code.
		
		}
		
		
		System.out.println("You selected " + carOrigin +" car and your option is " +carOptions);
		
		System.out.println("Avarage Price : "+ avaragePrice);
		
		
		
		
		
		
		
		
		
		
		

	}

}
