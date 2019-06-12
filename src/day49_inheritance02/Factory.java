package day49_inheritance02;
			//factory is a NonSub class that is in same package
public class Factory {

	public static void main(String[] args) {
		
		Device d = new Device();
		d.brand = "LG";
		d.model = "4K HD";
		
		d.price = 1000;
		
		//d.country = "USA"; it is not visable
		
		
	
	}

}
