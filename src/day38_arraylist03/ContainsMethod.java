package day38_arraylist03;

import java.util.*;

public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1; // list1 ,list2 pointing to some object remamber heap

		ArrayList<String> months = new ArrayList<>(list1);
		// copy all the values from list1
		System.out.println(months);

		months.add("Jun");
		months.add("Jul");
		months.add("Agu");

		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		System.out.println(months.contains("Jun"));

		// how would you check if Feb is in second position
		System.out.println(months.indexOf("Feb") == 1); // this better way to check
		System.out.println(months.get(1).equals("Feb"));

		ArrayList<String> months2 = new ArrayList<>(list1);
		System.out.println("Month: " + months.toString());
		System.out.println("Month: " + months2.toString());

		// check if month has all value of months2
		if ((months.containsAll(months2))) {

			System.out.println("Months has all of moths2");
		} else {
			System.out.println("Some values are missing");
		}

		// add one more Jan to months2

		months2.add("Jan");
		if ((months.containsAll(months2))) {

			System.out.println("Months has all of moths2");
		} else {
			System.out.println("Some values are missing");
		}

	}

}
