package day24_array_loop;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		
		//lets create an array of  integers with length 3
		int[] numbers = new int[3];
		
		numbers[0] = 5;//first value in array
		numbers[1] = 10;//second value in array
		numbers[2] = 20;//third value in array
		
		
		System.out.println(numbers);
		//it will give us [I@a7e666 this is a hash code not what we want 
		
		System.out.println(Arrays.toString(numbers));
		//toString() from arrays class can help us as to print an arrays as string 
		
		int sum = 0;
		//please use for loop , in order to loop through the array
		//and calculate sum of all elements
		//numbers.length --> returns number of elements in the array
		
		//The final field array.length can not assigned
		//numbers.length = 5; there is no way we can change arrays length !!!!
		
		
		for( int i =0; i < numbers.length; i++) {
			sum = sum +numbers[i];
			
		}
 		
		System.out.println("Sum: "+sum);
		
		//lets say find the largest/biggest number in the array
		
		int max = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max value: "+max);
		
		
		//Find the min value in the array
		
		int min = Integer.MAX_VALUE;
		for( int j=0; j<numbers.length; j++) {
			if(numbers[j] <min) {
			
		
				min = numbers[j];
				
			}	
		}
		
		System.out.println("Min value: " +min);
		
		
		
		
	}

}
