package Assignments.Assignment13;

import java.util.*;

public class Q81 {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>(Arrays.asList("Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"));
		
		slotMachine(words);
		
	}
	
	public static void slotMachine(ArrayList<String> words) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of money: ");
		
		double money = sc.nextDouble();
		
		double won = 0;
		double totalWon = 0;
		
		boolean flag = true;
		
		while(flag) {
			
			ArrayList<String> arr = new ArrayList<>();
			
			arr = selectedWords(words);
			
			System.out.println(arr);
			
			if(arr.get(0).equalsIgnoreCase(arr.get(1)) && arr.get(1).equalsIgnoreCase(arr.get(2))) {
				won = (money*3);
			}else if(arr.get(0).equalsIgnoreCase(arr.get(1)) || arr.get(0).equalsIgnoreCase(arr.get(2)) || arr.get(1).equalsIgnoreCase(arr.get(2))) {
				won = (money*2);
			}else {
				won = 0;
			}
			
			totalWon += won;
			
			System.out.println("You won: $" + won);
			
			System.out.println("Do you want to play again? (Yes:Y/y)(No:N/n)");
			
			String YesNo = sc.next();
			
			if(YesNo.equalsIgnoreCase("N")) {
				flag = false;
			}
		}
		
		System.out.println("Total amount of money entered: $" + money);
		System.out.println("Total amount won: $" + totalWon);
		
	}
	
	public static ArrayList<String> selectedWords(ArrayList<String> words) {
		
		Random rn = new Random();
		ArrayList<String> selectedWords = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			int number = rn.nextInt(6);
			switch(number) {
			case 0:
				selectedWords.add("Cherries");
				break;
			case 1:
				selectedWords.add("Oranges");
				break;
			case 2:
				selectedWords.add("Plums");
				break;
			case 3:
				selectedWords.add("Bells");
				break;
			case 4:
				selectedWords.add("Melons");
				break;
			case 5:
				selectedWords.add("Bars");
				break;
			}
		}
		
		return selectedWords;
		
	}

}
