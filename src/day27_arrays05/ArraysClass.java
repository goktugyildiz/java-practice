package day27_arrays05;
import java.util.Arrays;
public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {43, 12, 4, 1, 3, 5};
		
		//toString method
		
		System.out.println(Arrays.toString(nums));//1st way
		
		String str = Arrays.toString(nums);//second way
		
		System.out.println(str);
		
		//======================================
		
		//sort method . sort array  in ascending order 
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu" , "Spanish", "Italian" , "Polish", "Arabic", "Uzbek"};
		System.out.println(Arrays.toString(languages));

		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		
		int[] nums2 = {345, 654, 457,1245,235,11,23563,0};
		
		
		//find the lowest and highest number
		
		Arrays.sort(nums2);
		
		int lowest = nums2[0];
		int highest = nums2[nums2.length-1];
		
		System.out.println("Lowest number: " + lowest);
		System.out.println("Highest number: "+ highest);
		
		
		
	}

}
