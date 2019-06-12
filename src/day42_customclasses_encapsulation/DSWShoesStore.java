package day42_customclasses_encapsulation;
import java.util.*;
public class DSWShoesStore {

	public static void main(String[] args) {
		Shoes shoes1 = new Shoes();
		shoes1.setShoesData("NIKE", 10.5);
		System.out.println(shoes1.getShoesData());
		
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("ALDO", 7.5);
		
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("ADIDAS", 9.0);

		//create a array
		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		

		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		
		//ArrayList of shoes
		System.out.println("#######################");
		ArrayList<Shoes> myShoes = new ArrayList();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(2).getShoesData());

		//LETS SAY WE WANT TO KNOW WHICH SIZE AVAILABLE
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		
		//how can we get one of the shoe and store in another variable
		Shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getShoesData());
		
		//LETS USE FOR EACH LOOP AND PRINT DATA FOR EACH SHOE
		System.out.println("##########################");
		for( Shoes shoes: myShoes) {
			System.out.println(shoes.getShoesData());
			
		}
		
		//TASK: print name of shoes in the list that size is more than 4
		for(Shoes shoes : myShoes) {
			if(shoes.size >7.0) {
				System.out.println(shoes.brand);
			}
		}
		





	}

}
