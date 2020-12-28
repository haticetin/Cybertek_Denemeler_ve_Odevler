package Day_38_Inheritance_Part2;

public class FullTimeEmployee extends Employee{
	
//	
	@Override	// Annotation --> doesnt allow you to change method name or parameters
	public void calculatePay(int hours, double rate) {
		double total = (hours*rate)*1.05;
		System.out.println("Full time employee total pay:" + total);
	}

}
