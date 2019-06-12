package day27_arrays05;

import java.util.*;

public class ArraysEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {3,5,8};
		int[] num2 = {3,5,8};
		
		System.out.println(Arrays.equals(num1, num2));
		
		if(Arrays.equals(num1, num2)) {
			System.out.println("They are exactly same ");
		}else {
			System.out.println("Mismatch values present");
		}
		
		String[] strArr1 = {"one", "two" , "three"};
		
		String[] strArry2= {"One" , "Two" ,"Three"};
		
		System.out.println(Arrays.equals(strArr1, strArry2));
		
		boolean match = Arrays.equals(strArr1, strArry2);
		
		System.out.println("Match: "+match);
		//below will not work you can compare only same data type
		//Arrays.equals(strArry1,nums1);
		
		
		
		
	}

}
