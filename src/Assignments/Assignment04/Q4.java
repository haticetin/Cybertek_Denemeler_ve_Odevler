package Assignments.Assignment04;

public class Q4 {

	public static void main(String[] args) {


		double calls=125, bill=0;
		
		if(calls>0 && calls<=100) {
			bill=200;
		}else if(calls>100 && calls<=150) {
			bill=200+((calls-100)*0.60);
		}else if(calls>150 && calls<=200) {
			bill=200+30+((calls-150)*0.50);
		}else if(calls>200) {
			bill=200+30+25+((calls-200)*0.40);
		}else {
			System.out.println("Not a valid call number");
		}
		
		System.out.println("Your monthly telephone bill: " + bill);
	}
}
