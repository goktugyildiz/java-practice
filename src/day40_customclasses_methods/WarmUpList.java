package day40_customclasses_methods;
import java.util.*;
public class WarmUpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> newList = new ArrayList<>();
		newList.add("aa");
		newList.add("bb");
		newList.add("aa");
		newList.add("yy");
		newList.add("jj");
		String word2  = "aa";
		int count = countOccurences(newList, word2);
		if(count==2) {
		System.out.println("Unit test PASS: Count is 2 ");
		}else {
			System.out.println("Unit test Failed count : "+count);
		}

	}
	/*
	 * Method name countOccurances
	 * return: int 
	 * Params: ArrayList<String> , String word
	 * Method counts how many times, word appears in the list
	 * and return the count
	 * case sensitive
	 * 
	 */
	//lets say [aa,bb,aa,jj,yy]
	public static int countOccurences(ArrayList<String> list , String word) {
		int count =0;
		for(String str : list) {
			if(str.contentEquals(word)) {
				count++;
			}
		}
		return count;
		
	}
}
