package Day45_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			
			String str = "JAVA";
			
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));	// i might have problem here
			System.out.println(str.charAt(1));
			
		}catch(Exception e){
			
			System.out.println("Exception happened in try block and was caught");
		
		}
		
		System.out.println("After try catch block");
		
	}

}
