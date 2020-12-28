package Assignments.Assignment08;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		
		/*
		 * To book a room first it needs to be available for rent and make sure its available at the date selected:

			the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018
			
			example:
			
			simpleRoomBook(false,2,1,2018)
			return false
			
			simpleRoomBook(true,2,1,2018)
			return true
			
			simpleRoomBook(true,7,2,2018)
			return false
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Is it available for rent?");
		boolean isavailable=sc.nextBoolean();
		System.out.print("Which year?");
		int yearUserInput=sc.nextInt();
		System.out.print("Which month do you want to book?");
		int monthUserInput= sc.nextInt();
		System.out.print("Which day?");
		int dayUserInput=sc.nextInt();
		
		System.out.println(simpleRoomBook(isavailable,monthUserInput, dayUserInput, yearUserInput));
		
	}
	
	public static boolean simpleRoomBook(boolean availableforRent, int month, int day, int year) {
		
		boolean OK;
		
		OK = (availableforRent)?(year==2018)?(month==7)?(day>8)?true:false:true:false:false;
				
		return OK;
	}
	
}