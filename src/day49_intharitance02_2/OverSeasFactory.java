package day49_intharitance02_2;

import day49_inheritance02.Device;

//Non-sub class in different package
public class OverSeasFactory {

	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "Samsung";
		
		//dv.model = "3200"; it is protected not visible
		
		//d.price = 1000; not visible
		
		//d.country = "El Salvador"; is not visible
	}
	

}
