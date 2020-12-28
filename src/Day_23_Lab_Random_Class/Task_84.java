package Day_23_Lab_Random_Class;

import java.util.Random;

public class Task_84 {

	public static void main(String[] args) {

		Random rn = new Random();
		
		for(int i=1; i<=10; i++) {
			
			int num=rn.nextInt(2);	
						
			if(num==1) {
				System.out.println("Tails");
			}else {
				System.out.println("Heads");
			}
			
			
		}
	}

}
