package day41_custom_classes02;

public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank = new BankAccount();
		bank.accountHolder = "gigi";
		bank.acountNumber = 12345;
		bank.deposit(150.45);
		bank.withdraw(50);
		bank.showBalance();
		
		
		
	}

}
