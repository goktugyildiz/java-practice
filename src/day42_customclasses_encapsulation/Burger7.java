package day42_customclasses_encapsulation;
import java.util.*;
public class Burger7 {

	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name = "Cowboy";
		
		String[] ings = {"onions crisps", "american cheese", "lettuce", "b7 sauce"};
		burger1.ingredients = ings;
		System.out.println(burger1.name);
		//Print first ingredients
		System.out.println(Arrays.toString(burger1.ingredients));
		////Print all ingredients
		System.out.println(burger1.ingredients[0]);
		
		//Print all ingredients using a loop
		for(String ing : burger1.ingredients) {
			System.out.println(ing);
		}

	}

}
