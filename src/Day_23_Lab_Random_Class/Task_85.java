package Day_23_Lab_Random_Class;

import java.util.Random;

public class Task_85 {

	public static void main(String[] args) {

		Random rn = new Random();
		
		int counterComp=0;
		int counterUser=0;
		
		for(int i=1; i<=10; i++) {
			int computer = rn.nextInt(6)+1;
			int user = rn.nextInt(6)+1;
			
			if(computer>user) {
				System.out.println("Computer is the winner of this round: " + computer);
				counterComp++;
			}else if(user>computer) {
				System.out.println("User is the winner of this round: " + user);
				counterUser++;
			}else {
				
			}
		}
		
		System.out.println();
		
		if(counterComp>counterUser) {
			System.out.println("Computer is the grand winner");
		}else if(counterUser>counterComp) {
			System.out.println("User is the grand winner");
		}else {
			System.out.println("There is no winner");
		}
		
	}

}
