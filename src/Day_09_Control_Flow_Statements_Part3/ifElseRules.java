package Day_09_Control_Flow_Statements_Part3;

public class ifElseRules {

	public static void main(String[] args) {


		if(false)	// for one statement you can skip {} curly braces 
			System.out.println("Hello");
		else
			System.out.println("Bye");
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
	
	if(false)
		System.out.println("Hello"); // when there isn't {} the compiler will run just the 1st statement 
									 // and if the condition is false it will not run just the 1st statement
		System.out.println("Running"); // this is independent from if statement
	//	else yazamiyoruz complain ediyor 
	//	running kismi comment yapsak da {} istiyor cunku hala extra bir line var
	
	
	
	
	}

}
