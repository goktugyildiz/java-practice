package day25_arrays03;

public class PopulationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] population = new int[5];
		
		population[0] = 5000;
		population[1] = population[0]*2;
		population[2] = 7000;
		population[3] = 7600;
		population[4] =4890;
		
	
		//int [] population = {5000, 10000, 7000,4890,7600};
		
		int idx = 0;
		
		System.out.println("City 0 population : "+population[0]);
		
		System.out.println("City 1 population : "+population[1]);

		System.out.println("City 2 population : "+population[2]);

		///..............
		
		
		
		System.out.println("City1 population :"+ population[idx]);
		
		String str  ="abc";
		
		System.out.println("City1 population :"+ population[str.length()]);

		
		
		
		
		
		
	}

}
