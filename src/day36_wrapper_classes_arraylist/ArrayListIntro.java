package day36_wrapper_classes_arraylist;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[5];
		
		ArrayList<String> names = new ArrayList<>();
		
		int [] numsArray = new int[5];
		//ArrayList<int> nums = new ArrayList<>();// will not work
		ArrayList<Integer> nums = new ArrayList<>(); // will work
		
		//assign values into aarayList
		names.add("Roman");
		names.add("Kemal");
		names.add("Goktug");
		names.add("Natalia");
		names.add("Maria");
		names.add("ciki");
		
		nums.add(12);
		nums.add(32);
		nums.add(200);
		nums.add(34);
		nums.add(new Integer("100"));
		
		//read from arraylist
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(5));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
	}

}
