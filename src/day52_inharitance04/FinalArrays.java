package day52_inharitance04;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		
	final int[] TEAMS = {11, 11};
	
	System.out.println("Team1 : "+ TEAMS[0]);
	System.out.println("Team2 : "+ TEAMS[1]);
	
	TEAMS[0] = 10;
	TEAMS[1] = 9;
	
	System.out.println("Team1 : "+ TEAMS[0]);
	System.out.println("Team2 : "+ TEAMS[1]);
	
	//TEAMS = new int[] {10, 10 ,10}
	
	int[] nums  = new int[] {23,55,235};
	System.out.println(Arrays.toString(nums));
	
	nums = new int[] {124,4654,3,4,5,6,67,467};
	System.out.println(Arrays.toString(nums));
	
	final int[] finalNums = {23,66,44,11};
	System.out.println(Arrays.toString(finalNums));
	
	finalNums[0] =34567;
	System.out.println(Arrays.toString(finalNums));
	
	/*
	 * finalNums = new int[] {23,45,24,35,134,34}; this will not work because its is final
	 * you can change the values but yu can not change whole thing in once
	 */

	final double[] PRICES =new double[3];
	PRICES[0] = 85.5;
	
	PRICES[1] = 99.99;
	PRICES[2] = 99.98;
	

	System.out.println(Arrays.toString(PRICES));
	
	PRICES[1] = 19.99;
	System.out.println(Arrays.toString(PRICES));


	
 	
	
	}
}
