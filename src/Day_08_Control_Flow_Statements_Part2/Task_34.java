package Day_08_Control_Flow_Statements_Part2;

public class Task_34 {

	public static void main(String[] args) {

		double mark1=45, mark2=67, mark3=90;
		double math, english, science;
		math=(mark1+mark2+mark3)/3;
		english=(mark1+mark3)/2;
		science=(mark1+mark2)/2;
		
		if((math+english+science)/3<=59 && (math+english+science)/3>=0) {
			System.out.println("F");
		}else if((math+english+science)/3<=69 && (math+english+science)/3>=60) {
			System.out.println("D");
		}else if((math+english+science)/3<=79 && (math+english+science)/3>=70) {
			System.out.println("C");
		}else if((math+english+science)/3<=89 && (math+english+science)/3>=80) {
			System.out.println("B");
		}else if((math+english+science)/3<=100 && (math+english+science)/3>=90) {
			System.out.println("A");
		}else {
			System.out.println("Invalid");
		}
	}

}
