package day43_encapsulation_constructor;

public class Pet {

	private String type;
	private String name;
	
	
	
	
	
	public Pet(String type, String name) {
		
		this.type = type;
		this.name = name;
		
	}
	
	public Pet() {
		System.out.println("No - args constructor");
	}
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("Miyaavv");
			break;
		case "dog":
			System.out.println("hav hav hav");
			break;
		case "bird":
			System.out.println("chick chick chick");
			break;
		case "goat":
			System.out.println("meee meee meee");
			break;
			default: 
				System.out.println("...");
		}
	}
	public String toString() {
		return "Pet [name=" + name + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
