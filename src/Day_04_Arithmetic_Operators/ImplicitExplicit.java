package Day_04_Arithmetic_Operators;

public class ImplicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 130;
		// byte b = x;
		byte b = (byte) x;
		System.out.println(b);
		
		int pies=10, people=4;
		double piecesPerson;
		piecesPerson = (double)pies/people; // pies is becoming double. double/int => double
											// 							int/double => double 	Always bigges one is answer
		System.out.println(piecesPerson);
		
		

	}

}
