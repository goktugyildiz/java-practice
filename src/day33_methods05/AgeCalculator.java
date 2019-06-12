package day33_methods05;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateAge(1992); //adult
		
		int age = calculateAge(1992);

		System.out.println("You are "+age+ " years old");

	}

	/*
	 * method: calculateAge
	 * return int
	 * params: int year
	 * calculates the age and return value
	 * ALSO
	 * age 0 - 14 --> child
	 * age 15 - 25 --> youngster
	 * age 26 -64 --> adult
	 *  age 65 > senior
	 *  age ---> negative -> invalid age
	 * 
	 */
	public static int calculateAge(int year) {
		int currentYear = 2019;
		int yourAge = currentYear - year;
		
		if(yourAge < 0 ) {
			System.out.println("Invalid age");
			return 0 ;
		
		}else if(yourAge ==0 && yourAge<=14) {
			System.out.println("Child");
			
		}else if(yourAge>=15 && yourAge<=25) {
			System.out.println("Youngster");
		}else if(yourAge>=26 && yourAge<=64) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior");
		}
		
		return yourAge;
		
		
		
		
		
	}
}
