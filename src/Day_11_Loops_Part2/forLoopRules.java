package Day_11_Loops_Part2;

public class forLoopRules {

	public static void main(String[] args) {


		//1-Creating an infinite loop
		//components of the loop are each optional
		
//		for( ; ; ) {
//			System.out.println("Hello");			// no error, infinitely Hello printed; no condition 
//		}
		
//		====================================================================================================
		
//		int i=1;
//		
//		for( ; i<=5; i++) {
//			System.out.println(i);					// no error perfectly fine; i declared globally
//		}
		
//		====================================================================================================
		
//		for( ; ; i++) {
//			System.out.println(i);					// no error, infinitely i printed; no condition 
//		}
		
//		====================================================================================================
		
//		int i=1;
		
//		for( ; i<=5; ) {
//			System.out.println(i);					// no error, infinitely i(1) printed; condition always true
//		}

//		====================================================================================================

		//2-Adding Multiple Terms to the for statement
		
//		int x=0;
//		
//		for(long y=0, z=4; x<5 && y<10; x++,y++) {		// no error, 0 1 2 3 4 5 printed; when x becomes 5=>condition-false
//			System.out.print(y + " ");					// y increases until 5, prints 0-4, result 5 is value of x,
//		}												// x is declared globally
//		
//		System.out.println(x);
		
//		====================================================================================================

		//3-Redeclaring a variable in the init block
		
//		 int x=0;										
//		 for(long y=0, x=4 ; x<5&&y<10 ; x++,y++) { 	// complain, does not compile; x globally declared, 
//			System.out.println("Hello");				// x cannot be declared in loop, too
//		}

//		====================================================================================================

//		int x=0;
//		long y=0;				
//		
//		for(y=1,x=4; x<5 && y<10; x++,y++) {			// no error, Hello; variables declared globally,
//			System.out.println("Hello");				// reassigned in the loop
//		}
		
//		====================================================================================================
		
		//4-Using incompatible data types in the init block
		//the variables in the init block must all be of the same data type
		
//		for(long y=0, int x=0;x<5 && y<10; x++,y++) {	// complain, does not compile; 2 data types in loop declared
//			System.out.println("Hello");
//		}

//		====================================================================================================
		
		//5-Using loop variables outside the loop
		
//		for(long y=0,x=4; x<5 && y<10; x++,y++) {
//			System.out.println("Hello");
//		}
//		System.out.println(x);							// complain, does not compile; x declared in the loop
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
		
	}

}
