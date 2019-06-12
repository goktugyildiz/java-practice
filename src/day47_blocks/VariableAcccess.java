package day47_blocks;

public class VariableAcccess {
	//instance variable 
	int myInstanceVar = 40;
	
	//Static variable
	static int myStaticVariable = 55;

	public static void main(String[] args) {
		//System.out.println(myInstanceVar);
		//this will not work because it is not static
		System.out.println(myStaticVariable);
		//working because it is static
		
		
		/*
		 * the only way to access myInstanceVar
		 * you need to  create a object
		 */
		VariableAcccess v = new VariableAcccess();
		System.out.println(v.myInstanceVar); //40 
		//can i access static variable from v object?
		System.out.println(v.myStaticVariable);
		
		//access static variable using a class name
		System.out.println(VariableAcccess.myStaticVariable);
		
		

	}

}
