package day41_custom_classes02;

public class BankAccount {

	/*
	 * balance
	 * accountHolder
	 * accountNum
	 */
	double balance;
	String accountHolder;
	int acountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositing $" +amount+ " to"+accountHolder);
		balance+=amount;
	}
	public void withdraw(double amount) {
		System.out.println("withdraw $"+amount+ " From "+ accountHolder);
		balance-=amount;
		if(balance<0) {
			balance-=35;
		}
		
	}
	public void showBalance() {
		System.out.println("==================");
		System.out.println("accountHolder: "+ accountHolder);
		System.out.println("accountHolder: "+accountHolder);
	}
}
