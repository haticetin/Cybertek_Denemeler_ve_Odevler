package Lab.Lab1;

public class Q3 {

	public static void main(String[] args) {

		specialElenven(35);
		specialElenven(77);
		specialElenven(23);
	}
	
	public static void specialElenven(int num) {
		
		if(num%11==0 || num%11==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
