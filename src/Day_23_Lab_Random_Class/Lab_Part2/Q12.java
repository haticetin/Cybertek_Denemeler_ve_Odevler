package Day_23_Lab_Random_Class.Lab_Part2;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String : ");
		
		System.out.println(catDog(sc.nextLine()));

		
	}
	
	public static boolean catDog(String str) {
		
		int counterCat=0;
		int counterDog=0;
		for(int i=0; i<str.length()-2; i++) {
			if(str.substring(i, i+3).equalsIgnoreCase("cat")) {
				counterCat++;
			}else if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
				counterDog++;
			}
		}
		
		if(counterCat==counterDog) {
			return true;
		}else {
			return false;
		}
		
	}

}
