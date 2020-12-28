package Assignments.Assignment13;

public class Q73 {

	public static void main(String[] args) {

		String[][] money = {{"euro","1.5"},{"yen","21.5"},{"mark","100.0"}};
		String[][] convertionRate = {{"euro","0.003"},{"yen","0.5"},{"mark","0.87"}};
		
		System.out.println("Total: $" + money(money, convertionRate));
		
	}
	
	public static double money(String[][] money, String[][] convertionRate) {
		
		double[] arrMoney = new double[money.length]; 
		double[] arrConvertion = new double[convertionRate.length];
		
		double total = 0;
		
		for(int i=0; i<money.length; i++) {
			for(int j=0; j<money[i].length; j++) {
				if(j==money[i].length-1) {
					arrMoney[i] = Double.parseDouble(money[i][j]);
					arrConvertion[i] = Double.parseDouble(convertionRate[i][j]);
				}
			}
		}
		
		for(int i=0; i<arrMoney.length; i++) {
					
			total += arrMoney[i]*arrConvertion[i];
		}
		
		return Math.round(total*100.0)/100.0;
	}

}
