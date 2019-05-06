package day15_string_manupulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		String word1 = "eclipse";
	    
		//startsWith ==> tests if string starts with another string
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ecli"));
		
		System.out.println(word1.startsWith("Ec"));//false
		
		System.out.println(word1.endsWith("e"));//true
		System.out.println(word1.endsWith("ipse"));//true
		
		System.out.println(word1.endsWith("java")); //false
		
		//"PSE                   //ECLIPSE        PSE
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		
		System.out.println(word1.endsWith("eclipse"));
		//when %100 match whole word than means true
		
		//Mr. ==> man
		//Mrs. ==> married woman
		//Ms. ==>some woman
		//Dr. ===>doctor
		//====> unknown status
		
		String name = "Mr. Jackson";
		
		if (name.startsWith("Mr.")) {
			System.out.println("Man");
		}else if(name.startsWith("Mrs.")) {
		    System.out.println("Married woman");	
		}else if (name.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if (name.startsWith("Dr.")) {
			System.out.println("doctor");
		}else {
			System.out.println("unknown status");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
