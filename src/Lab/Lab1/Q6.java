package Lab.Lab1;

public class Q6 {

	public static void main(String[] args) {

		cigarParty(67, true);
		cigarParty(90, true);
		cigarParty(35, true);
		cigarParty(90, false); 
	}
	
	public static void cigarParty(int numberOfCigar, boolean isWeekend) {
		
		if(isWeekend) {
			if(numberOfCigar>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(numberOfCigar>=40 && numberOfCigar<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
	}
}
