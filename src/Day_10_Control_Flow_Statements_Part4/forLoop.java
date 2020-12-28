package Day_10_Control_Flow_Statements_Part4;

public class forLoop {

	public static void main(String[] args) {

		for(int i=0; i<5; ++i) {
			System.out.println("Hello");
		}
		
		// i  condition    action       increment(i++) i=i+1
		
		// 0    true    Print Hello        	1  
		
		//      true    Print Hello         2
		
		//      true    Print Hello         3
		
		//      true    Print Hello	     	4
		
		//		true	Print Hello			5
		
		//      false
		
		
//		for(int i=1;1<=10;i++) {
//			System.out.println("i = " + i);
//		}
		
		// condition hep true olacagi icin infinetly print ediyo ve dolayisiyla bi altindakine hep error veriyor
		
		for(int i=5;i<=10;++i) {
			System.out.println("i = " + i);
		}
		
		for(int num=20;num>=10;num--) {
			System.out.println("num = " + num);
		}
		
		for(double i=0;i<=100;i+=10) {      	// Syntax olarak kabul ediyor ama bu sadece bir 
			System.out.println("i = " + i);		// counter oldugu icin mantikli degil
		}
		
		for (int i=50;i>=0;i-=5) {
			System.out.println("i = " + i);
		}
	}

}
