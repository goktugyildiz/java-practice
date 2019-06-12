package day39_arraylist04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getList(10));
		System.out.println(getList(10).contains(5));
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		////////////////////////////
		System.out.println(getRandomList(5));
		
		/////////////////////////////
		
		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("65");
		strNums.add("24124");
		
		System.out.println(convertToIntList(strNums));


	}
	/*getList
	 * return type : ArrayList<Integer>
	 * params: int size
	 * getList(5); ==> [1,2,3,4,5]
	 * 
	 */

	public static ArrayList<Integer> getList(int size){
		ArrayList<Integer> newList  = new ArrayList<>();
		for(int w = 1; w<=size; w++) {
			newList.add(w);
		}
		return newList;
	}
	/*
	 * 4- getRandomList
	 * return type : List<Integer> 
	 * params : int size
	 * getList(5); ==> 3,55,12,99,34
	 * 
	 */
	public static List<Integer> getRandomList(int size){
		
		Random r = new Random(); //object of random numbers
		List<Integer> randomList = new ArrayList();
		for(int k = 1; k <= size; k++) {
			randomList.add(r.nextInt(101));
		}
		
		
		return randomList;
		
	}
	/*5-) convertToIntList
	 * return: type List<Integer>
	 * param: List<String>
	 * it will take each string and convert to integer and return as Integer list
	 * List<String> strL = new ArrayList<>();
	 * strl.add("55");
	 * strl.add("99");
	 * convertToIntList(strL); ==> [55,99]
	 * 
	 */
	
	public static List<Integer> convertToIntList(List<String> strList){
		List<Integer> newList = new ArrayList();
		
		for(String str : strList) {
			newList.add(Integer.parseInt(str));
		}
		
		return newList;
	}
	
	
	
	
	
}
