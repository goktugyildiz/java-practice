package day38_arraylist03;

 import java.util.*;
 
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();
		friends1.add("Roman");
		friends1.add("Gokcesu");
		friends1.add("Orhan");
		friends1.add("Goksu");
		
		friends2.add("Roman");
		friends2.add("Gokcesu");
		friends2.add("Orhan");
		friends2.add("Goksu");
		
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) {
			System.out.println("Same Friends");
		}else {
			System.out.println("Different friends");
		}
	}

}
