package Day45_exceptions;

public class Nullpointer {
	
	static String name;
	
	public static void main(String[] args) {
		
		System.out.println(name.toUpperCase());
	
		try {
			System.out.println(name.toUpperCase());
		}catch(Exception e){
			System.out.println("Nullpointerexception happened");
			System.out.println("Here is the message: " + e.getMessage());
			System.out.println("Here is the stack trace: ");
			e.printStackTrace();
//			System.out.println(e.toString());
		}
	
	}
	

}
