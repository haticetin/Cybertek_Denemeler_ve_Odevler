package Day45_exceptions;

public class ORCatchBlock {
	
	static String str = "abc";
	
	public static void main(String[] args) {
		
		try {
			System.out.println(str.toUpperCase());
		}catch(IllegalArgumentException | NullPointerException e) {
			// Exception types cannot be sub-parent relationship
			e.printStackTrace();
		}
		
	}

}
