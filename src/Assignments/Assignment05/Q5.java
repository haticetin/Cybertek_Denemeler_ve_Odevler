package Assignments.Assignment05;

public class Q5 {

	public static void main(String[] args) {


		int age=6;
		
		System.out.println("Age: " + age);
		
		if(age>0 && age<2) {
			System.out.println("Ineligible");
		}else if(age==2) {
			System.out.println("Toddler");
		}else if(age>=3 && age<=5) {
			System.out.println("Early childhood");
		}else if(age>=6 && age<=7) {
			System.out.println("Young reader");
		}else if(age>=8 && age<=10) {
			System.out.println("Elementary");
		}else if(age==11 || age==12) {
			System.out.println("Middle");
		}else if(age==13) {
			System.out.println("Impossible");
		}else if(age>=14 && age<=16) {
			System.out.println("High school");
		}else if(age>=17 && age<=18) {
			System.out.println("Scholar");
		}else if(age>18) {
			System.out.println("Ineligible");
		}else {
			System.out.println("Invalid age");
		}
	}

}
