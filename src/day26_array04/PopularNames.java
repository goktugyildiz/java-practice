package day26_array04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {  "James","Mary",
							"John","Patricia",
							"Robert","Jennifer",
							"Michael","Linda",
							"William","Elizabeth",
							"David","Barbara",
							"Richard","Susan",
							"Joseph","Jessica",
							"Thomas","Sarah",
							"Charles","Margaret",
							"Christopher","Karen",
							"Daniel","Nancy",
							"Matthew","Lisa",
							"Anthony","Betty",
							"Donald","Dorothy",
							"Mark","Sandra",
							"Paul","Ashley",
							"Steven","Kimberly",
							"Andrew","Donna",
							"Kenneth","Emily",
							"George","Carol",
							"Joshua","Michelle",
							"Kevin","Amanda",
							"Brian","Melissa",
							"Edward","Deborah",
							"Ronald","Stephanie",
							"Timothy","Rebecca",
							"Jason","Laura",
							"Jeffrey","Helen",
							"Ryan","Sharon",
							"Jacob","Cynthia",
							"Gary","Kathleen",
							"Nicholas","Amy",
							"Eric","Shirley",
							"Stephen","Angela",
							"Jonathan","Anna",
							"Larry","Ruth",
							"Justin","Brenda",
							"Scott","Pamela",
							"Brandon","Nicole",
							"Frank","Katherine",
							"Benjamin","Samantha",
							"Gregory","Christine",
							"Raymond","Catherine",
							"Samuel","Virginia",
							"Patrick","Debra",
							"Alexander","Rachel",
							"Jack","Janet",
							"Dennis","Emma",
							"Jerry","Carolyn",
							"Tyler","Maria",
							"Aaron","Heather",
							"Henry","Diane",
							"Jose","Julie",
							"Douglas","Joyce",
							"Peter","Evelyn",
							"Adam","Joan",
							"Nathan","Victoria",
							"Zachary","Kelly",
							"Walter","Christina",
							"Kyle","Lauren",
							"Harold","Frances",
							"Carl","Martha",
							"Jeremy","Judith",
							"Gerald","Cheryl",
							"Keith","Megan",
							"Roger","Andrea",
							"Arthur","Olivia",
							"Terry","Ann",
							"Lawrence","Jean",
							"Sean","Alice",
							"Christian","Jacqueline",
							"Ethan","Hannah",
							"Austin","Doris",
							"Joe","Kathryn",
							"Albert","Gloria",
							"Jesse","Teresa",
							"Willie","Sara",
							"Billy","Janice",
							"Bryan","Marie",
							"Bruce","Julia",
							"Noah","Grace",
							"Jordan","Judy",
							"Dylan","Theresa",
							"Ralph","Madison",
							"Roy","Beverly",
							"Alan","Denise",
							"Wayne","Marilyn",
							"Eugene","Amber",
							"Juan","Danielle",
							"Gabriel","Rose",
							"Louis","Brittany",
							"Russell","Diana",
							"Randy","Abigail",
							"Vincent","Natalie",
							"Philip","Jane",
							"Logan","Lori",
							"Bobby","Alexis",
							"Harry","Tiffany",
							"Johnny","Kayla"};
		
			//Print number of names in the array
			
		System.out.println("Tolal Names: "+ names.length); //200 popular names 

		System.out.println(Arrays.toString(names));
		
		//Print in column format. 
		//2 names in each line
		
		for(int i = 0; i<names.length-1; i+=2 ) {
			System.out.println(names[i] +", " + names[i+1]);
		}
		

		//For(int i = 0; i<names.length; i+=2){
		//System.out.println(names[i]+ ", " +names[i+1]);
		//}
		//
		
		//Print male names in single line separate by comma
		System.out.println("Male Names: ");
		for(int j =0; j<=names.length-1; j+=2) {
			
			System.out.print(names[j] +",");
			
			
		}
		
		
		//Print female names in single line separate by comma
		
		System.out.println("\nFemale Name: " );
		for(int c =0; c<names.length; c++) {
			if(c % 2 != 0) {
				System.out.print(names[c] +",");
				
			}
				}
		System.out.println("\n##################################");
		//Print random name from this array
		//Use random class
		Random random = new Random();
		int r = random.nextInt(names.length);
		
		System.out.println(names[r]);
		
		 //Print all name that are up to 4 characters , in upper case in same line
		
		for(String name :names) {
			if(name.length() <=4) {
				System.out.print(name.toUpperCase() + ", ");
			}
		}
		System.out.println("\nNAMES LENGTH SORT");
		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore= "";
		
		for(String ch : names) {
			if(ch.length() <= 4) {
				namesUpto4+= ch + ", ";
			}else if(ch.length() ==5 || ch.length() == 6){
				names5to6+= ch + ", ";
			}else {
				names7orMore+=ch+ ", ";
			}
		}
		System.out.println("namesUpto4: "+namesUpto4);
		System.out.println("names5to6: "+names5to6);
		System.out.println("names7orMore: "+names7orMore);
		
		//all male switch space with female
		//Swap seats 
		System.out.println(Arrays.toString(names));
		
		//Code here
		for(int k = 0; k<names.length-1; k+=2 ) {
			String temp = names[k];
			names[k] =names[k+1];
			names[k+1] = temp;
		}
		
		System.out.println(Arrays.toString(names));
		
		
		String str1 = "first word";
		String str2 = "second word";
		String temp = str1;

		str1 =str2;
		str2=temp;
		System.out.println(str1);
		System.out.println(str2);
		
		
	}

}
