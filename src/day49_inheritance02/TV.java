package day49_inheritance02;
			//TV is a sub class in the same package
public class TV extends Device {
	
		public void watch() {
			System.out.println("Watching TV "+ brand + " model: "+ model); // it is public thats why brand is working
			
			System.out.println("Price: "+ price);
			
			//System.out.println("Made in "+ country); not visable
		}
	

}
