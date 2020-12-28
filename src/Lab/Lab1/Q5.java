package Lab.Lab1;

public class Q5 {

	public static void main(String[] args) {

		caughtSpeeding(84, true);
		caughtSpeeding(99, false);
		caughtSpeeding(65, true);
	}

	public static void caughtSpeeding(int speed, boolean isB_Day) {
		
		if(speed<=60) {
			System.out.println(0 + "-No ticket");
		}else if(speed>=61 && speed<=80) {
			if(isB_Day) {
				if(speed>=60 && speed<=65) {
					System.out.println(0 + "-No ticket");
				}else {
					System.out.println(1 + "-Small ticket");
				}
			}else {
				System.out.println(1 + "-Small ticket");
			}
		}else if(speed>=81) {
			if(isB_Day) {
				if(speed>=81 && speed<=86) {
					System.out.println(1 + "-Small ticket");
				}else {
					System.out.println(2 + "-Big ticket");
				}
			}else {
				System.out.println(2 + "-Big ticket");
			}
		}else {
			System.out.println("Invalid speed");
		}
		
		
	}
}
