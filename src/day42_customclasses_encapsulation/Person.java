package day42_customclasses_encapsulation;

public class Person {
	//declare name and age
		private String name;
		private int age;
		
		/*public static void main(String[] args) {
			Person p1 = new Person();
			p1.age = 1;
			p1.name = "Goktug";
			
		}
		*/
		
		//public getter and setter methods for name
		//read only
		public String getName() {
			
			return name;
			
		}
		//write only setter
		public void setName(String name) {
			this.name = name;
			//we need to say this. so java will know which name we are meaing
		}
	

}
