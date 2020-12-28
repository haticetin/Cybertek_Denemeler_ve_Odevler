package Day_33_ClassObjects_constructors;

public class BankAccount {

	double balance;
	
	// this constructor sets the starting balance to 0.0
	public BankAccount() {	// -> custom constructor
		balance = 0.0;
	}
	
	// this constructor sets the starting balance to the value passed as an argument
	public BankAccount(double startBalance) {
		balance = startBalance;
	}
	
	// this constructor sets the starting balance to the value in the String argument
	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}
	
	// deposit method makes a deposit in 2 account
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	
	public double getBalance() {
		
		return balance;
	
	}
	
	
	
	
	
	
}
