package Assignments.Assignment14.Q7;

public class GasTank {
	
	double amount = 0;
	double capacity;
	
	public GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas(double addedGas) {
		amount += addedGas;
		if(amount>capacity) {
			amount = capacity;
		}
	}
	
	public void useGas(double usedGas) {
		amount -= usedGas;
		if(amount<0) {
			amount = 0;
		}
	}
	
	public boolean isEmpty() {
		if(amount<0.1) {
			return true;
		}
		
		return false;
	}
	
	public boolean isFull() {
		if(amount>(capacity-0.1)) {
			return true;
		}
		
		return false;
	}
	
	public double getGasLevel() {
		return amount;
	}
	
	public double fillUp() {
		amount += (capacity-amount);
		return capacity-amount;
	}

}
