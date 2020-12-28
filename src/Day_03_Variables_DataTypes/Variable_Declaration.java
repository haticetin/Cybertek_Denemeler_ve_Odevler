package Day_03_Variables_DataTypes;

public class Variable_Declaration {

	public static void main(String[] args) {

		//declaration
		byte inches;
		int speed;
		short month;
		float salesCommision;
		double distance;
		
		// assigned
		inches = 5;
		speed = 200;
		month = 2;
		distance = 40.2;
		salesCommision = 5;
		
		// declared + assigned
		byte inches2 = 5;
		// you cannot declare 2 same Variable names
		// System.out.println("month");  tirnak icine yazarsan month print edecek, variable tirnaksiz yazilir. 
		
		System.out.println(inches);
		System.out.println(speed);
		
		int number = 20; 
		System.out.println("My number is " + number + "."); 
		
	}

}
