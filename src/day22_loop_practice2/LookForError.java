package day22_loop_practice2;

public class LookForError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String log = ".ggasferrorqeferrorhdvqweerro!#$!@eerrorerrogtverfhterroerrorjeh:::^^$#error#@@errorRGHerroAHSFVSererrorroGAerrorBARerrerroroGVAWT";
		
		//llok for error and print count
		//for loop, substring , if statement
		int count = 0;
		
		for(int i=0; i<log.length()-5; i++) {
			String temp = log.substring(i, i+5);
			System.out.println(temp);
			
			if(temp.equals("error")) {
				count++;
			}
		}
		
		System.out.println("Count: "+count);
		
			if(count>0) {
				System.out.println("Fail");
			}else {
				System.out.println("PASS");
			}
		
		
		//-5 becaues we are looking for error
		
		
		
		
		
		
		
		
	}

}
