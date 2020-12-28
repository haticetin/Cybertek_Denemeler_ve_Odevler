package Lab.Lab1;

public class Q2 {

	public static void main(String[] args) {

		love6(6, 29);
		love6(5, 1);
		love6(17, 9);
		love6(15, 9);
	}
	
	public static void love6(int num1, int num2 ) {
		
		boolean love6=true;
		
		if(num1==6 || num2==6||num1-num2==6 || num1+num2==6|| num2-num1==6) {
			System.out.println(love6);
		}else {
			System.out.println(!love6);
		}
	}

}
