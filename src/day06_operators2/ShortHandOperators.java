package day06_operators2;

public class ShortHandOperators {
	public static void main(String[] args) {
		
		int students = 45; // if you want to add 5 more students
		System.out.println("Students " +students);
		
		students = students + 5 ;
		System.out.println("Students " +students);
		
		students = students -2 ;
		System.out.println("Students " +students);
		int teachers = 5 ;
		System.out.println("Tachers " + teachers);
		
		teachers +=2; // increase teacher by 2 
		//teachers = teachers+ 2 ;
		System.out.println("Tachers " + teachers);
		
		//teacher = teacher - 5;
		teachers-=5;
		System.out.println("Teachers: " + teachers);
		
		int cars = 12;
		System.out.println("Cars: "+ cars);
		
		cars*=2; //cars = cars*2;
		cars+= cars;
		System.out.println("Cars : "+ cars);
		
		int shoes = 48;
		shoes/= 4;
		System.out.println("Shoes: " + shoes);
		
		double price = 45.50;
		double amount = 5;
		price+=amount;
		System.out.println("Price: " +price);
		
		int minutes = 66;
		minutes%= 60;
		System.out.println("Remaining : "+ minutes); 
		int pennies = 550;
		pennies %= 100;
		System.out.println("Pennies left: " + pennies);
		
		int apples =10;
		apples =-3;
		System.out.println(apples);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

				 
	}

}
