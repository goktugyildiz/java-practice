package day49_inheritance02;

public class Leopar extends Animal{
	
	public Leopar() {
		super(); // call parent/ super class
		System.out.println("Leopar constructor");
		setType("Leopar");
		
	}
	
	public Leopar(String type) {
		
		super(type);//call animal(String type)
		System.out.println("Leopar one - arg constructor");
	}

}
