package day24_array_loop;

import java.util.Arrays;

public class LotteryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] lotterynumbers = {12,45,3,62,42,90};
		
		System.out.println(Arrays.toString(lotterynumbers));
		
		Arrays.sort(lotterynumbers);
		
		System.out.println(Arrays.toString(lotterynumbers));
		
		
		//Binary search works with only with sorted array
		
		int index = Arrays.binarySearch(lotterynumbers, 45);
		
		System.out.println("Position: "+index);
		
		// we are looking at after sort thats why 45 is in position 3
		
		//if the value does not exit it will give us some negative numbers
		int index2 = Arrays.binarySearch(lotterynumbers, 14);
		
		System.out.println("Position: "+index2);
		
		
		
		
		
		
		
		
		
		
	}

}
