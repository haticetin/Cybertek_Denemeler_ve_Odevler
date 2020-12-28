package Day_07_Control_Flow_Statements;

public class Task_28 {

	public static void main(String[] args) {


		double revenue, price, quantity, discount;
		price = 10;
		quantity = 500;
		discount=0;
		revenue = price*quantity;
		
		if (revenue > 5000) {
			
			discount = revenue*0.1;
			revenue= revenue-discount;
		}
		
		System.out.println("Discount is " + discount + " and net revenue is " + revenue);
		
		  
	}

}
