package day41_custom_classes02;

import java.util.ArrayList;
import java.util.List;

public class WarmUpWithList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		numbers.add(5);
		numbers.add(12);
		numbers.add(23);
		
		System.out.println(doubleTheList(numbers));
	}
	/*
	 * nameDoubleTheList
	 * return type: List<Integer>
	 * params:List<Integer>
	 * it will double the values of each element and return it
	 * 
	 * doubleTheList([3,5,7]);==> [6,10,14]
	 * try solving without creating another arrayList in the method
	 */
	public static List<Integer> doubleTheList(List<Integer> nums){
		for(int i =0; i<nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		
		return nums;
		
	}
	

}
