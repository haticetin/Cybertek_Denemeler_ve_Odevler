package Assignments.Assignment04;

public class Q3 {

	public static void main(String[] args) {

		int year=1500;
		
		if(year%4==0) {
			if(year%100==0 && year%400==0) {
					System.out.println(year + "\t Leap Year");	
			}else if(year%100==0 && year%400!=0){
				System.out.println(year + "\t NOT a Leap Year");
			}else {
				System.out.println(year + "\t Leap Year");
			}
		}else {
			System.out.println(year + "\t NOT a Leap Year");
		}
	}
}


