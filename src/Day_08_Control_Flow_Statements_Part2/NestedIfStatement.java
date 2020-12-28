package Day_08_Control_Flow_Statements_Part2;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		boolean rushHour=false;
		int carType=1;
		double price=0.0;
		
		if(carType==1) {
			if(rushHour) {
				price=30.0;
			}else {
				price=5.0;
			}
		}else if (carType==2) {
			if(rushHour) {
				price=55.30;
			}else {
				price=15.99;
			}
		}
		
		System.out.println("Toll Cost: " + price);
		
	}
}
