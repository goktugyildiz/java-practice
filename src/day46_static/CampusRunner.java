package day46_static;

public class CampusRunner {

	public static void main(String[] args) {
	    Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Chicago");
		Campus c3 = new Campus("New Jersey");
	  
		Campus.campusInfo();
		System.out.println(Campus.country);//because it is changing  

	}

}
