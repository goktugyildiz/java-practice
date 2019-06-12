package day50_inheritance03;

public class TestAnimal {
	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		
		an.move(356);
		cat.move(213);
		duck.move(7869);
	}

}
