package day49_intharitance02_2;

import day49_inheritance02.Device;
			//IPad IS A Device. IPad is a subCalss in a different package
public class Ipad  extends Device{
	
	public void readEBook(String title) {
		
		System.out.println("REading a book "+ title + " using "+ brand+ " ipad");
		
		System.out.println("Model - "+ model);
		
		//System.out.println("Price: "+ price); not inherited not visible
		//System.out.println("Made in"+ country); not visible
		
	}

}
