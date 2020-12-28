package Assignments.Assignment09;

public class Q15 {

	public static void main(String[] args) {


		String str = "catdogdog";
		
		System.out.println(numOfCat_Dog(str));
		
	}
	
	public static boolean numOfCat_Dog(String str) {
		
		int counterCat = 0;
		int counterDog = 0;
		
		for(int i=0; i<str.length()-2; i++) {
			
			if(str.substring(i,i+3).equalsIgnoreCase("cat")) {
				counterCat++;
			}else if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
				counterDog++;
			}
		}
		
		if(counterCat==counterDog) {
			return true;
		}
		
		return false;
		
	}

}
