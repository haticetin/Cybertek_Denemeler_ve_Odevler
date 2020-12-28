package Day_37_Inheritance;

import java.util.Scanner;

public class FinalExamTest{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many questions are on the final exam?");
		int questions = sc.nextInt();
		System.out.println("How many questions did the student miss?");
		int missed = sc.nextInt();
		
		FinalExam result1 = new FinalExam(questions, missed);
		
		System.out.println("Grade: " + result1.getGrade());
		
	}

}
