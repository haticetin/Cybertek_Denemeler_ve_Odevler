package Assignments.Assignment08;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");

		isPalindrome(sc.nextInt());
	}

	public static int isPalindrome(int number) {
		
		int unitsDigit=((number%1000)%100)%10;
		int tensDigit=((number%1000)%100)/10;
		int hundredsDigit=(number%1000)/100;
		int thousandsDigit=number/1000;
		
		if(number>999 && number<10000) {
			if((unitsDigit==thousandsDigit)&&(tensDigit==hundredsDigit)) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else if(number>99 && number<1000){
			if(unitsDigit==hundredsDigit) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else if(number>9 && number<100) {
			if(unitsDigit==tensDigit) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else if(number>=0 && number<=9) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		return number;

	}
		


}
