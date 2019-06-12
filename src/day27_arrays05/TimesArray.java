package day27_arrays05;

public class TimesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] time1 = new int[2];
		int[] time2 = new int [2];
		/*
		 * 
		 * 
		  int[] time1 = {20,45};
		  int[] time2 = {15,35};
		 * 
		 * 
		 * 
		 * 
		 */
		//System.out.println(time1[0]); //0
		time1[0] =10;//hour
		time1[1] =20;//minute
		
		time2[0] =12;//hour
		time2[1] =45;//minute
		
		//before comparing check if both arrays j=have
		//Valid hour and minute
		
		if(time1[0] <0 || time1[0]>23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		
		if(time1[1] <0 || time1[1]>59) {
			System.out.println("Time1 has invalid minute");
			return;
		}
		
		if(time2[0] <0 || time2[0]>23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		
		
		if(time2[1] <0 || time2[1]>59) {
			System.out.println("Time2 has invalid minute");
			return;
		}
		//compare ARRAYS and tell which one is earlier
		//compare hours 
		if(time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}else if (time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}else { // hours are equal, check minutes
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("Same Time!");
			}
			
		}
		
		
	}

}
