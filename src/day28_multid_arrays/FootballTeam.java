package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] teams = new String[2][6];
		
		teams[0][0] = "Irina";
		teams[0][1] = "zarif";
		teams[0][2] = "cihan";
		teams[0][3] = "habib";
		teams[0][4] = "adel";
		teams[0][5] = "bojan";
		
		teams[1][0] = "olimjon";
		teams[1][1] = "mirsod";
		teams[1][2] = "usman";
		teams[1][3] = "nursultan";
		teams[1][4] = "roman";
		teams[1][5] = "dmitry";
		
		System.out.println("First player for first team: "+teams[0][0]);
		System.out.println("Third player for first team: "+teams[0][3]);
		
		System.out.println(teams[1][4]);
		
		//print how many row in teams
		System.out.println("Number of row"+teams.length);
		System.out.println("People in first team: "+ teams[0].length);
		System.out.println("People in second team: "+ teams[1].length);

		
		System.out.println(Arrays.deepToString(teams));
		
		int[][] nums = new int[3][4];
		
		nums[0][0] = 100;
		nums[0][1] = 235;
		nums[0][2] = 2345;
		nums[0][3] = 4568;
		
		nums[1][0] = 2354;
		nums[1][1] = 76856;
		nums[1][2] = 7273;
		nums[1][3] = 6969;
		
		nums[2][0] =345;
		nums[2][1] = 4343;
		nums[2][2] = 9362;
		nums[2][3] = 3420;
		
		
		System.out.println(Arrays.deepToString(nums));
		
		
		int [][] scores = {{3, 5, 10} , {6, 4, 2,7} };
		
		System.out.println("Days played/Number of arrays: "+ scores.length);
		System.out.println("Number of values in 1 :" + scores[0].length);
		System.out.println("Number of values in 2 :" + scores[1].length);

		int[][] values = new int[4][];
		
		values[0] = new int [] {134,134,34,5,45};
		values[1] = new int [] {23,435,345,12,25,67,47,6,4657,467};
		
		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;
		
		values[3] = new int[] {4,6,7,3,2};
		
		System.out.println(Arrays.deepToString(values));
		
		
		
	}

}
