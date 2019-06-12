package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArryas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String[] [] pizzas = {{"pineaplle", "pepperoni"} , 
						{"mushrooms" , "anchovies", "olives"},
						{"4 cheese"},
						{"chicken" , "tomatoes" , "japalenios" , "onions"},
						{"grren pappers", "zuccini" , "borccoli" , "spinach", "shirmp"}
								};
						//we have 5 pizza index is 4
			
			
				//System.out.println(Arrays.toString(pizzas[0]));
			
				for(String[] pizza : pizzas) {
					System.out.print(pizza.length+" - ");
					System.out.println(Arrays.toString(pizza));
				}
			
				System.out.println("#### FOR LOOP ####");
		
				for(int i =0; i<pizzas.length-1; i++) {
					System.out.print(pizzas[i].length+" - ");
					System.out.println(Arrays.toString(pizzas[i]));
					
				}
		
		
				for(String topping : pizzas[4]) {
					System.out.println(topping);
				}
				
				
				int [][] students = {{4,5,6} , 
									{12,5,7} , 	
									{23,56,12,55,3}
									};
				
				//2 parts: outer loop , inner loop
				//outer loop will take each loop
				//inner loop will take each value or student id
				
				for(int[] group : students) {
					for(int studentsId : group) {
						System.out.print(studentsId+" , ");
						
					}
					System.out.println();
				}
				
				int[][] nums = {
								{10 , 20},
						        {20 ,30 ,40, 50},
						        {100, 200, 400},
						        {555, 333, 111, 444, 666, 78}
						          };
				
				
				
				for(int i = 0; i<nums.length; i++) {
					for(int j = 0; j< nums[i].length; j++) {
						System.out.print(nums[i][j]+"  ");
					}
					System.out.println();
				}
		
		
	}

}
