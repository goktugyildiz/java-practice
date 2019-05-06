package Day07_scanner_operators;

public class PreAndPost {
	public static void main(String[] args) {
		
		int num = 0;
		int num2 = num++;
		System.out.println("num: "+num);
		System.out.println("num2: "+num2);
		
		
		int n = 0;
		int n2= ++n;
		System.out.println("n:" +n);
		System.out.println("n2:" +n2);
		
		int i =10;
		i++; //add 1
		++i; //add 1
		
		System.out.println("My value: "+ i);
		
		int bananas = 6;
		int pears = bananas++; //pears:6 bananas:7
		int apples = ++bananas;//apples:8 bananas:8
		
		System.out.println("Bananas: " +bananas);
		System.out.println("Pears: " +pears);		
		System.out.println("Apples: " +apples);
		
		
		int friends = 10;
		System.out.println(friends++); //10 
		System.out.println(++friends); //12 be careful
		
		
		int p1 = 10;
		int sum = p1++ +5; //sum:10 p1:16
		
		System.out.println("Sum: " +sum);
		System.out.println("p1: " +p1);
		
		///===========================
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		
		System.out.println("batteries: "+batteries);
		System.out.println("oldBatteries: "+oldBatteries);
		System.out.println("TotalBatteries: "+totalBatteries);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
