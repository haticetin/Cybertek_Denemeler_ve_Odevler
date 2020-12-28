package Assignments.Assignment05;

public class Q8 {

	public static void main(String[] args) {


		int player, house;
		player=5;
		house=10;
		String result="Let the Game Begin";
		boolean wonTheGame=false;
		
		if((player+house)>21) {
			result="Bust";
		}else if(house>player) {
			result="Player lost :(";
		}else if(player==house) {
			result="Its a tie";
		}else if(player>house) {
			result="Player won";
			wonTheGame=true;
		}
		
		System.out.println("Player: " + player);
		System.out.println("House: " + house);
		
		if(wonTheGame==true) {
			System.out.println(result);
		}else {
			System.out.println(result);
			System.out.println("Try again");
		}
		
	}

}
