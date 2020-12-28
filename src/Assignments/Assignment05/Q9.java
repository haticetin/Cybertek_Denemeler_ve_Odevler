package Assignments.Assignment05;

public class Q9 {

	public static void main(String[] args) {


		int number, prompt1, prompt2, prompt3, prompt4, prompt5, prompt6;
		number=210934;
		prompt1=number/100000;
		prompt2=(number%100000)/10000;
		prompt3=(number%10000)/1000;
		prompt4=(number%1000)/100;
		prompt5=(number%100)/10;
		prompt6=number%10;
		
		System.out.println("Your number: " + number);
		System.out.println("\t");
		System.out.println("Display prompt: " + prompt1);
		System.out.println("Display prompt: " + prompt2);
		System.out.println("Display prompt: " + prompt3);
		System.out.println("Display prompt: " + prompt4);
		System.out.println("Display prompt: " + prompt5);
		System.out.println("Display prompt: " + prompt6);

	}

}
