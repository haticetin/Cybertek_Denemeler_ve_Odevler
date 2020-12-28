package Week8ReviewSession;

public class CheckingAccount {
	
	double balance;
	long accountNumber;
	String accountHolder;
	String type = "checking";	// default value
	
	public void setInfo(double pBalance, long pAccNumber, String pAccHolder) {
		
		System.out.println("Setting account info...");
		balance = pBalance;
		accountNumber = pAccNumber;
		accountHolder = pAccHolder;
		
	}
	
	public void getAccountInfo() {
		
		System.out.println("Checking account : $" + balance + ", " + accountNumber + ", " + accountHolder );
		
	}
	
	public void deposit(double amount) {
		
		System.out.println("Depositing $" + amount + " to account number: " + accountNumber);
		
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		
		System.out.println("Withdrawing $" + amount + " from account number: " + accountNumber);
		
		if(amount<=balance) {
			balance-=amount;
		}else {
			System.out.println("Error: Insufficient funds...");
		}
		
	}
	
	public void purchase(String item, double price) {
		
		System.out.println("Purchasing " + item + " for $" + price);
		
		if(price<=balance) {
			balance-=price;
		}else {
			System.out.println("Insufficient fund - overdraft fee is applied");
			balance-=(price+35);
		}
		
		System.out.println("Transaction completed for " + item + ", currrent balance: " + balance);
	}

}
