package Assignments.Assignment10;
import java.util.Arrays;

public class Q22 {

	public static void main(String[] args) {


		String str = " <!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";
		
		System.out.println(html(str));
	}
	
	public static String html(String str) {
		
		String target = "<html>";
		
		if(!str.contains(target)) {
			return "Invalid input!";
		}

		String[] str2 = str.split("\"");
		str = str2[1];
				
		return str;
	}

}
