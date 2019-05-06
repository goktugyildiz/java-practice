package day04_pirimitives_operators;

public class UsingVeriables {
	public static void main(String[] args) {
		
		//num1, num2,num3
		
		int num1, num2, num3;
		num1 = 100;
		num2 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		num2 = 200;
		num1 = num2;
		num3 = num1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		//declare apples assign 25
		int apples = 25;
		//declare kiwis and assign value of apples to it
		int kiwis;
		kiwis = apples;
		//declare mangoes and 55
		int mangoes = 55;
		kiwis = mangoes;
		
		System.out.println(apples);
		System.out.println(kiwis);   
		System.out.println(mangoes);
		
		
		
		
	}

}
 