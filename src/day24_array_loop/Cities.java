package day24_array_loop;

public class Cities {

	public static void main(String[] args) {
		
		String[] cities ={"Washington D.C" , "Kiev", "Annandale", "Moscow", "Istanbul", "Baku","Miami","Mclean"};
		
		System.out.println(cities.length);
		
		// print all cities that star with 'm'
		
		for(int i =0; i<cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		
		
		//do this with for each loop
		
		for(String city: cities) {
			if(city.toUpperCase().startsWith("M")) {
				System.out.println(city);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
