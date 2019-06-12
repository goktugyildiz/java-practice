package day39_arraylist04;


import java.util.List;
import java.util.ArrayList;



public class CustomListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(20);
		numsList.add(30);
		numsList.add(40);
		numsList.add(50);
		
		printList(numsList);
		
		/////////////////////
		List<Double> doubleList = new ArrayList();
		doubleList.add(10.20);
		doubleList.add(23.20);
		doubleList.add(45.20);
		doubleList.add(345.20);
		doubleList.add(188.20);
		doubleList.add(124.20);
		doubleList.add(130.20);
		System.out.println(sumList(doubleList));
		
		double sum = sumList(doubleList);
		System.out.println("Sum: "+ sum);
		
		////////////////////////////
		System.out.println(getList(5));
		
	}
	
	public static void printList(ArrayList<Integer> nums) {
		for(Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		
	}
	/*
	 *  sumList
	 *return type : int 
	 *param: List<Double> Calculates sum of each values and return the result
	 */
	
	public static double sumList(List<Double> dList) {
		double sum = 0.0;
		for(double d : dList ) {
			
			sum+= d;
		
		}
		return sum;
		
	}

	/*getList
	 * return type : ArrayList<Integer> 
	 * params : int size
	 * getList(5); --> [1.,2,3,4,5]
	 */
	 
	public static ArrayList<Integer> getList (int size){
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		for(int w =1; w<nums.size(); w++) {
			nums.add(w);
		}
		return nums;
		
		
	}
	
}
