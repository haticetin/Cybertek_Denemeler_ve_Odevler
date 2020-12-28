package Day_17_JavaMemory_GarbageCollection_ReadingUserInput;

public class bankAccount {
	
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depositing $" + amount + " to " + accountNumber);
		balance+=amount;
	}

	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from " + accountNumber);
		balance-=amount;
		
		if(balance<=0) {
			balance-=35;
		}
	}
	
	public void showBalance() {
		System.out.println("====================");
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Account number: " + accountNumber);
		System.out.println("balance: $" + balance);
		System.out.println("====================");	
	}
	
	public void charge (double price, String item) {
		if(balance>=price) {
			System.out.println("Buying " + item + " for $" + price + " from " + accountNumber);
			balance-=price;
		}else {
			System.out.println("Insufficient funds to purchase " + item + " from " + accountNumber);
		}
	}
	
	
	
	
	
	
	
	
}
