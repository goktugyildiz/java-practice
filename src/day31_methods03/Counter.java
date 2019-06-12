package day31_methods03;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		countUp(5);
		countUp(0);

		countDown(0);
		countDown(12);
		
		int n = 5;
		countDown(n);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp");
		//get number from keyboard
		int inputNum = scan.nextInt();
		//callcountUp method and set it as input
		countDown(inputNum);
	}

	/*
	 * name : countUp return type : void param : int it prints from 1 to value of
	 * the param countUp(5): 1 2 3 4 5 param value less than 1 then print
	 * "Invalid input"
	 * 
	 */

	// 2-)
	/*
	 * name: countdown return type: void param: int it prints from param value till
	 * 1 countDown(0); "Invalid input"
	 * 
	 */
	public static void countUp(int num) {

		if (num < 1) {
			System.out.println("Invalid input");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}

	}

	public static void countDown(int num1) {
		if (num1 < 1) {
			System.out.println("Invalid input");

		} else {
			for (int k = num1; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
