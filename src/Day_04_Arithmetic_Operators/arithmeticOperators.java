package Day_04_Arithmetic_Operators;

public class arithmeticOperators {

	public static void main(String[] args) {
		
		// Addition
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs + 2);
		
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		float desks=10;
		//neden f kullanmam gerekmedi?
		desks= chairs + moreChairs;
		// neden int, long, float, double ile yapabiliyoruz sadece? Ben daha az yer kaplasin istiyorum RAMde.
		System.out.println(desks);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		System.out.println("\t");
		//Subtraction
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance - transaction);
		balance = balance-transaction;
		System.out.println(balance);
		System.out.println("\t");
		int LinesOfCode = 50;
		System.out.println("LinesOfCode " + LinesOfCode);
		LinesOfCode = LinesOfCode - 2;
		System.out.println("LinesOfCode " + LinesOfCode);
		System.out.println("\t");
		
		//Muktiplication
		System.out.println(22*2);
		int classes = 5;
		System.out.println(LinesOfCode * classes);
		int totalLinesOfCode = LinesOfCode * classes;
		System.out.println("Total Lines of Code = " + totalLinesOfCode);
		System.out.println("\t");
		
		//Division
		System.out.println(10/2);
		System.out.println(60/3);
		System.out.println(10/6);
		//System.out.println(11/0); // throw error while running the code
		System.out.println("\t");
		
		//Remainder (Modulus)
		System.out.println(10%2);
		System.out.println(9%2);
		
		

	}

}
