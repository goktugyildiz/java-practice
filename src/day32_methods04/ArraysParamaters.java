package day32_methods04;

import java.util.Arrays;

public class ArraysParamaters {

	public static void main(String[] args) {
		int[] myArray = {44,22,66,11};
		printArray(myArray);
		
		printArray(new int[] {33,44,55,5,455});
		
		int[] mynums = new int[] {3,4,23,456,7,332,55,6,3,};
		printArray(mynums);
		
		//
		int[] number1 = {44,32,567,32,78};
		int[] number2 = {22,2321,43,4566,322};
		printArryas2(number1, number2);
		
		
		//
		printArryas2V2(number1, number2);
		
		
	}

	
	
	//Method name : printArray
	//return type: void
	//param: int[]nums
	//print values of nums array
	
	public static void printArray(int[] nums) {
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	/*
	 * method name : printArrays2
	 * return type: void
	 * params: 2 int
	 * it print the larger array followed by smaller array
	 * 
	 * 
	 */
	
	public static void printArryas2(int[] arrNum1, int[] arrNum2) {
		
		if(arrNum1.length > arrNum2.length) {
			System.out.println(Arrays.toString(arrNum1));
			System.out.println(Arrays.toString(arrNum2));

		}else {
			System.out.println(Arrays.toString(arrNum2));
			System.out.println(Arrays.toString(arrNum1));

		}
	}
	
	//version2 we will call printArray method
	public static void printArryas2V2(int[] arrNum1, int[] arrNum2) {

		if (arrNum1.length > arrNum2.length) {
			printArray(arrNum1);
			printArray(arrNum2);

		} else {
			printArray(arrNum2);
			printArray(arrNum1);

		}
	}	
	
	
	
	
	
 }
