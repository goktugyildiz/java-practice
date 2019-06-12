package day43_encapsulation_constructor;

public class MicroCenter {

	public static void main(String[] args) {
		Computer cmp1 = new Computer();
										//it is calling constructor automatically every time
		Computer cmp2 = new Computer();
		
		System.out.println(cmp1.toString());
		System.out.println(cmp2.toString());
		
		cmp1.setBrand("iMac");
		cmp1.setOs("macOs High Sierra");
		cmp1.setPrice(2567);
		
		cmp2.setBrand("Dell XPS");
		cmp2.setOs("Windows 10");
		cmp2.setPrice(1300);

		System.out.println(cmp1.toString());
		System.out.println(cmp2.toString());
		
		Computer cmp3 = new Computer("ASUS" , "Windows 7", 645.5);
		System.out.println(cmp3.toString());
		
		cmp3.setOs("Windows 11");
		System.out.println(cmp3.toString());
		
		cmp3.setPrice(cmp3.getPrice()-300);
		System.out.println(cmp3.toString());

			
		
		
	}

}
