package day16_String_manupilation;



public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Coding is fun, it is my hobby";
		
		String withNoSpaces = sentence.replace(" ", "");
		
		
		System.out.println(sentence);
		
		System.out.println(withNoSpaces);
		
		//replace , with!!!
		
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		String mixed = "%$#@&ja-v|a@#$%";
		//clean up mixed
		
		mixed = mixed.replace("%$#@&","");
		
		System.out.println(mixed);
		mixed = mixed.replace("-","");
		mixed = mixed.replace("|","");
		mixed = mixed.replace("@#$%","");
         
		//mixed =mixed.replace("-","").mixed.replace("|","").replace("@#$%","");
		
		
		System.out.println(mixed);

		mixed = mixed.replace("a", "");
		
		System.out.println(mixed);
        
		
		String result = "About 115,000,000 results (0.66)seconds";
		
		//using string methods(replace, substring) get number of result
		
		//115,000,000
		
		result = result.replace("About ", "");//115,000,00 results (0.11 seconds)
		System.out.println(result);

		
		//result = result.replace(" results (0.66)seconds", ""); might break with number 0.66 to 0.11
		result = result.substring(0, result.indexOf(" "));
		
		System.out.println(result);
		
		result = result.replaceFirst("," , "" );// it will replace the first , 
		
		System.out.println(result);

		
		
		
		
		
		
		
		
	}

}
