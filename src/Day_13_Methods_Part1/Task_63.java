package Day_13_Methods_Part1;

public class Task_63 {

	public static void main(String[] args) {

		Celcius(32);
	}
	
	public static void Celcius(double Fahrenheit) {
		
		double Celcius=(Fahrenheit-32)/1.8;
		System.out.println(Fahrenheit + " Fahrenheit = " + Celcius + " Celcius");
	}

}
