package Day_30_WrapperClass;

import java.text.DecimalFormat;

public class Task_96 {

	public static void main(String[] args) {


		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String[] str2 = str1.split(" ");
		String degree = str2[5];
		
		
		int fahrenheit = Integer.parseInt(degree);
		double celcius = (fahrenheit-32)/1.8;
		String newCelcius = new DecimalFormat("0.00").format(celcius);
		celcius = Math.round(celcius*100.0)/100.0; // Output: 22.22
		System.out.println(fahrenheit + " degree is equal to " + celcius + " celcius");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
