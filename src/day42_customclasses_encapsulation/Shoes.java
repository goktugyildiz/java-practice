package day42_customclasses_encapsulation;

public class Shoes {

	/*
	 * Shoes
	 * --> String brand
	 * double size
	 * 
	 * Methods:
	 *       setShoesData
	 *      public String getShoesData() {
	 *      return brand+ " | " + size
	 *      }
	 */
	String brand;
	double size;
	
	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;
	}
	
	public String getShoesData() {
		return brand + " | "+ size;
		
	}
}
