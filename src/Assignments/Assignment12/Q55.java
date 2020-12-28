package Assignments.Assignment12;

import java.util.Arrays;

public class Q55 {

	public static void main(String[] args) {


		String s = "abcdefgh";
		String str = "";
		String[][] chessboard = new String[8][8]; 
		
		for(int i=0; i<chessboard.length; i++) {
			for(int j=0; j<chessboard[i].length; j++) {
				chessboard[i][j] = (i+1) + s.substring(j, j+1);
			}
		}
		
		for(String[] value : chessboard) {
			str += Arrays.toString(value) + ", ";
		}
		
		str = str.substring(0, str.length()-2);
		
		System.out.println("[" + str + "]");
	}

}
