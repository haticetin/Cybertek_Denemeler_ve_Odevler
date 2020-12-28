package Lab.Lab2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num=1;
		
		System.out.print("Enter number " + num + " : ");
		int previousNum = sc.nextInt();
		
		int largestNum=previousNum;
		int smallestNum=previousNum;
		
		do {
			System.out.print("Enter number " + ++num + " : ");
			int nextNum=sc.nextInt();
			
			if(nextNum>largestNum) {
				largestNum=nextNum;
			}else if(nextNum<smallestNum){
				smallestNum=nextNum;
			}
			
			System.out.print("Do you want to enter another number: ");
			int yesNo=sc.nextInt();
			
			if(yesNo==0) {
				break;
			}else if(yesNo==1){
				continue;
			}else {
				while(true) {
					System.out.println("Invalid number");
					System.out.print("Do you want to enter another number: ");
					yesNo=sc.nextInt();
					if(yesNo==1||yesNo==0) {
						break;
					}else {
						continue;
					}	
				}
				
				if(yesNo==0) {
					break;
				}else {
					continue;
				}
				
			}
			
		}while(true);
		System.out.println();
		System.out.println("Largest number: " + largestNum);
		System.out.println("Smallest number: " + smallestNum);
		
		
	}
	
	
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter your first number  : ");
//		int smallest = scan.nextInt();
//		System.out.print("Enter your second number : ");
//		int largest = scan.nextInt();
//		int temp;
//		if (smallest > largest ) {
//			temp=largest;
//			largest = smallest;
//			smallest=temp;
//		}
//		do {
//			System.out.print("Do you want to enter another number? (0-No, 1-Yes) :");
//			if(scan.nextInt() == 1) {
//				System.out.print("Enter your next number : ");
//				temp=scan.nextInt();
//				if (temp < smallest) {
//					smallest = temp;
//				}
//				if (temp > largest) { // smallest : 1, largest : 5   1,3,6,8,12,15,16,25
//					largest = temp;
//				}
//			} else {
//				break;
//			}
//		} while(true);
//		System.out.println();
//		System.out.println("Smallest number is : " + smallest);
//		System.out.println("Largest number is  : " + largest);
//		scan.close();
//	}
	


}
