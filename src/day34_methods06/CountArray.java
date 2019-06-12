package day34_methods06;

public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,35,5,4,2,4,5,6,6,6,63,2};
		//1. with print return right away
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 6));
		
		//2. assign return value into a variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values: "+five);
		if(findOccurences(nums, 2)>0) {
			System.out.println("Present");
			
		}else {
			System.out.println("Dont present");
		}
		//create array and pass to method
		int twenty =findOccurences(new int[] {10,20,30,40,50}, 20 );
		System.out.println("Twent: "+ twenty);
	}
		
		
	//method findOccurences
	//return type int
	//params int[] array, int value
	//method will look for value in the array and return the count of occurrences
 
	public static int findOccurences(int[] array, int value) {
		int counter = 0;
		for(int num :array ) {
			if(num==value) {
				counter++;
			}
			
		}
		return counter;
	}
	
	/*1-)
	 * method name getArray
	 * return type: int[]
	 * no params
	 * in the method , build array and return assign value then retirn it
	 * 
	 * 
	 */
	public static int[] getArray() {
		int[] retArray = {345,41243,555,612,787};
		return retArray;
	}


}
