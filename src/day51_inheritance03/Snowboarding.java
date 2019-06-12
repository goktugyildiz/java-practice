package day51_inheritance03;

public class Snowboarding extends Exercise {
	
	public int perform(int minutes) {
		super.perform(10);//call super class version
		
		System.out.println("Snowboarding for "+minutes+" minutes");
		return minutes*7;
	}

}
