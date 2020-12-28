package Day_20_String_Manipulation_Part2;

public class Task_81 {

	public static void main(String[] args) {

		String time = timeStamp("10/10/2019 14:59:00");
		System.out.println(time);
		
	}
	
	public static String timeStamp(String date) {
		
		date = date.replace("/", "").replace(" ", "").replace(":", "");

		return date;
	}

}
