package Day_35_Encapsulation;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a pocket number : ");
		int pocketNumber = sc.nextInt();
		
		RoulettePocket rp1 = new RoulettePocket(pocketNumber);
		
		while(pocketNumber<0 && pocketNumber>36) {
			System.out.print("Enter a pocket number : ");
			pocketNumber = sc.nextInt();
			rp1.PocketColor(pocketNumber);
		}
		
		
	}

}
