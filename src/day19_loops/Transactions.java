package day19_loops;
import java.util.*;
public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//you have balance and assign a value to the balance using scanner
		//what is transaction amount?
		//we keep doing transactions until we run out of balance
		
		//you have insufficient funds, you balance is -10
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is you current balance?");
		
		double balance  = scan.nextDouble();
		
		int count = 0;
		
		
		
		
		while(balance>0) {
			count++;//increase transactions by 1
			System.out.println("What is transactions #"+count+" amaount?");
			double transaction = scan.nextDouble();
			//balance = balance-transaction;
			if (transaction >balance) {
				System.out.println("Your balance is abaout to be negative due to this transaction");
			    //continue; go on top of loop right away
			}
			
			balance-=transaction;
			System.out.println("Current balance: "+ balance);
		}
		
		System.out.println("You have insufficient funds for any more transactions, you balance is: " +balance);
		System.out.println("Transactions total count: "+count);
		
		
		
		
		
		
		
		
		
		
		
	}

}
