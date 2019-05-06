package day23_arrays_and_loops;

public class Arrays1 {

	public static void main(String[] args) {
		
		
			int [] numbers  = new int[3];
			
			int num1 = 5;
			int num2 = 7;
			int num3 = 10;
			
			//assign to the first element in thr array value of num1,2,3
			numbers[0] = num1;
			numbers[1] = num2;
			numbers[2] = num3;
		
			numbers[0] = 7;
			numbers[1] = 4;
			//numbers[2] = "a";
			// we cannot provide different data type, we have to use data type of any array
			numbers[2]= 'A'; //65
			
			
			
			System.out.println(numbers[0]);
		
			System.out.println(numbers[1]);

			System.out.println(numbers[2]);

		System.out.println("******************");
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//max size of array
		byte[] bytesArray = new byte[3];
		
		String[] names = new String[5];
		//size = to number if items
		String[] names2 = {"Bill", "Roman", "Vlad", "Burak", "Maria"};
		//if i wanna print maria
		System.out.println(names[4]);
		System.out.println("Numbers of items: "+names.length);

		
		String[] countries = {};
		// ARRAY HAS FIXED SIZE
		countries[0] = "USA";
		
		//THIS IS ANOTHER WAY TO ASSIGN A VARIABLE
		String [] fruits = new String[] {"orange", "apples"};
		
		//for each loop stands for collections of data
		//we need specify data type , variable name; our collection of data
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		
		
		
		
		
		
	}

}
