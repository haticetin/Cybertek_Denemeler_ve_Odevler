package Lab.Lab2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of males: ");
		int males = sc.nextInt();
		System.out.print("Enter the number of females: ");
		int females = sc.nextInt();
		

		double total=males+females;
		double percentageMales=(males/total)*100;
		double percentageFemales=(females/total)*100;
		
		System.out.println("Percentage of males: %" + percentageMales);
		System.out.println("Percentage of females: %" + percentageFemales);
		
	}

}
