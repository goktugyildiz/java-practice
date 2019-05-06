package day22_loop_practice2;

public class CatAndDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "mycatyourcat";
		
		//count how many cat
		int cats = 0;
		for(int i =0; i<str.length()-2; i++) {
			
			System.out.println(str.substring(i, i+3));
			
			if(str.substring(i, i+3).equals("cat")) {
				cats++;
			}
				
		}
		System.out.println("Cats: "+cats);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
