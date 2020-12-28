package Day_07_Control_Flow_Statements;

public class ifStatements {

	public static void main(String[] args) {
		
		
		int score = 80;
		//boolean x = score >= 70;
		//		x				    boyle de olabilir
		if (score >= 70) {
			
			System.out.println("Excellent");
		 	System.out.println("You passed with grade A");
		
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		int sales, bonus;
		double commissionRate, salary;
		
		sales = 5200;
		salary = 10000;
		
		if (sales > 5000) {
			bonus=500;
			commissionRate=1.12;
			
			salary=salary*commissionRate+bonus;
		}
		
		System.out.println("Salary = " + salary);
		

	}

}
