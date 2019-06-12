package day50_inheritance03;

public class Google extends SearchEngine {
	
	@Override
	public int search(String item) {
		System.out.println("Searcging for: "+ item);
		int resultsCount = item.length();
		return resultsCount;
	}

	protected void  search(String item, String item2) {
		System.out.println("Searcging for 2 items: "+ item + ", "+ item2);
		int resultsCount2 = item.length() + item2.length();
		System.out.println("Total count: "+resultsCount2 );
	
	}
	//default
	String clickResult() {
		System.out.println("Cliking result");
		return "Searching result page";
	}
}
