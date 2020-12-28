package Week8ReviewSession;

public class bankAccountTest {

	public static void main(String[] args) {


		// Create an account
		CheckingAccount clientOne = new CheckingAccount();
		// set data
		clientOne.accountNumber=31942842440L;
		clientOne.accountHolder="Amazon";
		clientOne.balance=1000;
		
		clientOne.getAccountInfo();
		
		// Create another account and set data using method
		
		CheckingAccount clientTwo = new CheckingAccount();
		
		clientTwo.setInfo(1000, 43894230490L, "Amazon");
		clientTwo.getAccountInfo();
		
		//test deposit method
		clientOne.deposit(300);
		clientTwo.deposit(1000);
		
		//test withdraw method
		clientOne.withdraw(200);
		clientOne.getAccountInfo();
		
		//call purchase method
		CheckingAccount myAccount = new CheckingAccount();
		myAccount.setInfo(200, 22222214444L, "Ozzy");
		myAccount.purchase("Book", 95);
		System.out.println("Current balance:" + myAccount.balance);
		
		myAccount.purchase("Shoes", 120);
		myAccount.purchase("Computer", 500);
		
		myAccount.getAccountInfo();
	}

}