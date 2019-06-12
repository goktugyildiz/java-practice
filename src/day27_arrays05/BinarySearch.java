package day27_arrays05;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {34,565,23,454,36,12,45};
		
		Arrays.parallelSort(nums);
		
		Arrays.binarySearch(nums, 36);
		
		System.out.println(Arrays.binarySearch(nums, 36));
		
		System.out.println(Arrays.binarySearch(nums, 454));
		System.out.println(Arrays.binarySearch(nums, 23));
		
		int i = Arrays.binarySearch(nums, 34);
		System.out.println(i);
		
		
		int[]  nums2 = {40,6,17,10,55};
		
		System.out.println(Arrays.binarySearch(nums2, 40)); //output: -5 because we didn't sort it  we have to sort fist
		
	}

}
