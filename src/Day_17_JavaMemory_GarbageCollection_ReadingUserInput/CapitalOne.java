package Day_17_JavaMemory_GarbageCollection_ReadingUserInput;

public class CapitalOne {

	public static void main(String[] args) {


		bankAccount account1 = new bankAccount();
		BMW car1 = new BMW();
		
		account1.accountHolder="Mike Smith";
		account1.accountNumber=1234569012;
		account1.balance=40232.14;
		
		car1.model="330i";
		
		account1.showBalance();
		
		account1.deposit(250);
		
		account1.showBalance();
		
		account1.withdraw(100);
		
		account1.showBalance();
		
		account1.charge(car1.showPrice(), car1.model);
		
		account1.charge(107.29, "Adidas shoes");
		
		account1.charge(50, "table");
		
		account1.showBalance();
		
		
	}

}
