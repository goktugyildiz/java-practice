package day38_arraylist03;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<>();
		//add method to value
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		//toString method to print all value in same line
		System.out.println(list1.toString());
		//add method with index : yellow will be placed to index 0
		list1.add(0, "yellow");
		System.out.println(list1.toString());
		//size method
		System.out.println("Size: " +list1.size());
		System.out.println("3: " + list1.get(3));
		
		//remove using index. removes value from index position
		
		list1.remove(0);
		System.out.println(list1.toString());
		
		//remove using value/element removes element first occurrence
		
		list1.remove("blue");
		System.out.println(list1.toString());
		
		//set index value replace certain index with new value
		list1.set(0, "orange");
		System.out.println(list1.toString());
		
		//indexOfValue. returns index value i the list
		list1.indexOf("grey");
		System.out.println("Grey: "+list1.indexOf("grey") );
		
		//isEmpty 
		System.out.println(list1.isEmpty());
		
		//contains ==> return true or false
		
		System.out.println("White in the list "+ list1.contains("white"));
		
		List<String> list2 = new ArrayList<>();
		//addAll 
		list2.addAll(list1);
		System.out.println(list2.toString());
		
		//Contains all check if lists has all value of another list
		
		System.out.println("ContainsAll: "+ list1.containsAll(list2));
		//Equals checks if 2 lists are excatly equal
		System.out.println("equals"+ list1.equals(list2));
		
		list2.add("pink");
		//remove all matching values from your list that are in other
		
		list2.removeAll(list1);
		System.out.println("After remove all: "+ list2);
		System.out.println("After remove all: "+ list1);
		
		//ADDALL(index , list) adds a new list value starting from given index
		list2.addAll(0, list1);
		System.out.println("List2 after list2.addAll(0,list1): " + list2);
		
		//clear
		list1.clear();
		list2.clear();
		System.out.println("IS it empty" + list1 + " | "  +list2);

		
	}

}
