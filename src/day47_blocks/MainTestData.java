package day47_blocks;

public class MainTestData {

	public static void main(String[] args) {
		//we dont need to crrate a object we can call directly from classname
		System.out.println(TestData.url);
		
		String briteErpUrl = TestData.url;
		System.out.println(TestData.url);
		
		//how can i access email through object
		System.out.println(TestData.email); //main way
		//### after add private constructor will not work 
		//TestData td = new TestData();
		//System.out.println(td.email);
		
	}

}
