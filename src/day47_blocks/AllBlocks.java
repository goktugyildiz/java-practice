package day47_blocks;

public class AllBlocks {
	
	int nonStaticInt = 10;
	static int staticInt = 10;
	
	
	static {
		System.out.println("Static Block - I run first and only ONCE");
		//nonStaticInt--; will not work because it is non static
		staticInt--;
		
		
	}
	
	
	{
		
		System.out.println("Init Block - I run each time object is crrated before constructor");
		nonStaticInt+=5;
		staticInt+=5;
		
		
	}
	
	public AllBlocks() {
		System.out.println("Constructor - I run each time object create it after init block");
		nonStaticInt+=3;
		staticInt+=3;
	}

}
