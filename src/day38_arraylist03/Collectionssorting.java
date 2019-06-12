package day38_arraylist03;
import java.util.*;
public class Collectionssorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		System.out.println(numsList);
		
		System.out.println("Sorting ... please wait ...");
		Collections.sort(numsList);
		System.out.println(numsList);

		List<String> strList = new ArrayList();
		strList.add("fuat");
		strList.add("roman");
		strList.add("murad");
		strList.add("maria");
		strList.add("dina");
		System.out.println("Sorting ... please wait ...");
		Collections.sort(strList);
		System.out.println(strList);
		
		//Max ,Min
		Collections.max(numsList);
		int maxNum =Collections.max(numsList);
		Collections.min(numsList);
		int minNum = Collections.min(numsList);

		System.out.println("maxnum: "+ maxNum);
		System.out.println("minnum: "+ minNum);
		
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		System.out.println("Max Name: "+ maxName);
		System.out.println("Min Name: "+ minName);
		
		
	}

}
