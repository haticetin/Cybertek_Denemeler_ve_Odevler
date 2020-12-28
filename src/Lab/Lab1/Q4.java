package Lab.Lab1;

public class Q4 {

	public static void main(String[] args) {

		deerPlay(85, true);
		deerPlay(100, false);
		deerPlay(100, true);
	}
	
	public static void deerPlay(int temperature, boolean isSummer) {
		
		if(isSummer) {
			if(temperature>=60 && temperature<=100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else if(isSummer==false) {
			if(temperature>=60 && temperature<=90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			System.out.println("No play");
		}
	}

}
