package Assignments.Assignment10;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Begin letter: ");
		String begin = sc.next();
		
		System.out.print("End letter: ");
		String end = sc.next();
		
		System.out.println(alphabeticOrder(begin, end));
		
	}
	
	public static String alphabeticOrder(String begin, String end) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String newStr = "";
		
		if(Character.isUpperCase(begin.charAt(0))){
			alphabet = alphabet.toUpperCase();
		}
		
		for(int i=alphabet.indexOf(begin); i<=alphabet.indexOf(end); i++) {
			newStr += alphabet.charAt(i);
		}
		
		return newStr;
	}

}
