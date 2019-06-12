package day35_methods_review;

import java.util.Arrays;

public class UniqueArray {

	public static void main(String... strings ) {
		
		//int[] array and we need to print unique numbers
		/*
		 * 1- in main method
		 * 2-void method that accepts an array
		 * 3-method that accepts int[] and return int[] with unique values
		 * 
		 */
		int[] nums = {7,4,1,4,1,5,9,9,3};
		System.out.println(Arrays.toString(nums));
		
		findUnique(nums);
		
		int [] arr = {4,5,2,4,5,6,6,};
		getUniqueArrayCheapV2(arr);
		
		
	}
	
	public static void findUnique(int[] nums) {
		for(int i = 0; i<nums.length; i++) { //outer loop
			int temp = nums[i];//get a number
			int counter = 0;
			//
			for(int j=0; j<nums.length; j++) {//in,er
				if(nums[j]==temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter==0) {//is it still 0. then it is unique
				System.out.println(temp);
			}
		}
		
		
	}
	
	//find out how  many unique numbers
	//declare new array with that size
	//and loop through again and assign unique numbers
	//return the array
	public static int[] getUniqueArray(int[] nums) {
		int uniqueCount = 0;
		for(int i = 0; i<nums.length; i++) { //outer loop
			int temp = nums[i];//get a number
			int counter = 0;
			//
			for(int j=0; j<nums.length; j++) {//in,er
				if(nums[j]==temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter==0) {//is it still 0. then it is unique
				uniqueCount++;
			}
		}
		return nums;
	}
	

	/*
	 * declare empty string 
	 * find unique numbers and add to that string
	 * split that string by space
	 * declare new int[] and assign each number from split
	 * return the int[] array
	 * 
	 */

	
	public static int[] getUniqueArrayCheapV2(int[] nums) {
		
		String unique = "";
		
		for(int i = 0; i<nums.length; i++) { //outer loop
			int temp = nums[i];//get a number
			int counter = 0;
			//
			for(int j=0; j<nums.length; j++) {//in,er
				if(nums[j]==temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if(counter==0) {//is it still 0. then it is unique
				unique+= temp+ " ";
			}
		}
		//split that string by space
		String[] strArr = unique.trim().split(" ");
		//declare new [] and assign each number from split
		int[] uniqueArr = new int [strArr.length];
		for(int k=0; k<strArr.length; k++) {
			uniqueArr[k]= Integer.parseInt(strArr[k]);
		}
		return uniqueArr;
	}
	
		

}
