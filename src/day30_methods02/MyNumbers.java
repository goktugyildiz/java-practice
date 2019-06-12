package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void main(String[] args) {
		
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		
		doPush10Ups();
		
		rangePrint();

	}
	
	public static void showMe5Numbers() {
		Random r = new Random();
		for(int i =1; i<=5; i++) {
			System.out.print(r.nextInt(1001)+" "); //Print random 0 - 1000
		}
		System.out.println();//take it to new line
	}

	public static void doPush10Ups() {
		for(int i=1; i<=10; i++) {
			System.out.println("Pushup - " + i);
				
			}
		System.out.println("Time to rest");
			
		}
	/*method name : rangePrint
	 * returns type: void
	 * params/args: no
	 *Using a scanner ask for 2 integers
	 * you need to print all numbers between those to numbers
	 * ex:
	 * rangePrint():
	 * 5
	 * 8
	 * 5 6 7 8
	 * rangePrint();
	 * 10
	 * 7
	 * 10 9 8 7
	 * rangePrint();
	 * 40
	 * 40
	 * Print 40 only
	 */
	
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(num1 < num2) {
			for(int i =num1; i<=num2; i++) {
				System.out.println(i+ " ");
			}
		}else if(num1 > num2) {
			for(int j = num1; j>=num2; j--) {
				System.out.println(j+ " ");
			}
		}else {
			System.out.println(num1);
		}
	}
	

}
	

