package day34_methods06;

import java.util.Arrays;
import java.util.Random;

public class MainArray {

	public static void main(String[] args) {
		CountArray.getArray();
		
		System.out.println(Arrays.toString(CountArray.getArray()));
		//second way
		int[] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		////////////////////////////
		
		System.out.println(Arrays.toString(getRandomArray(10)));
		//infinite loop
				//for(;;) { //while(true) ==> both are infinite loop
					//System.out.println();
			     // }
			
		int [] randomNums = getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
		

		
	}
	//Method : getRandomArray
	//return type: int[]
	//params: int size
	//int he method create an array with value of size. 
	//and assign random values from 0 - 100
	//and return it
	
	public static int[] getRandomArray(int size) {
		Random rand = new Random();
		
		int [] nums =new int[size];
		
		for(int i=0; i<size; i++) {
			nums[i] = rand.nextInt(101);
		}
		return nums;
	}
	
}
