package day15_string_manupulation;

public class StringWarmUpTest {

	public static void main(String[] args) {
		String emoji = ":)";
		//==, != CHECK IF DOES NOT EQAUL TO 2 CHARS
		
		if(emoji.length() != 2) {
			System.out.println("Invalid emoji");
			return; //stop execution
			
		}
		
		//IF CODE REACHES THIS POINT , THEN EMOJI IS 2 CHARS
		//get first and second char and assign to variables
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if (first == ':') {
			if(second ==')') {
				System.out.println("Smile");
			}else if(second == '(') {
				System.out.println("Sad");
			}else if(second == '/') {
				System.out.println("Upset");
			}else if(second == 'p') {
				System.out.println("Playful");
			}else {
				System.out.println("Unkwon imoji");
			}
		}else if (first ==';') {
			     if(second == ')') {
			    	 System.out.println("Wink");
			     }else if (second =='0') {
			    	System.out.println("Suprised"); 
			     }else {
			    	 System.out.println("Unkwon imoji");
			     }
		}else if  (first == '(') {
			      if(second ==':') {
			    	  System.out.println("Smile");
			      }else {
			    	  System.out.println("Unkwon imoji");
			      }
		}else if (first ==')') {
			      if(second == '(') {
			    	  System.out.println("Sad");
			      }else {
			    	  System.out.println("Unkwon imoji");
			      }
		}else {
			System.out.println("Invalid imoji");
		}
		
		
		
		
		
		
		

	}

}
