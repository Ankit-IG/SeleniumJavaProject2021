package oops_concept;

public class Bank_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank_Account b1= new Bank_Account(12345,"De ZINNIA",100000);
		
		b1.displayCurrentBalance();
		b1.deposit(1000);
		b1.displayCurrentBalance();
		b1.withdraw(2000);
		b1.deposit(-1000);
		b1.displayCurrentBalance();
	}

}
