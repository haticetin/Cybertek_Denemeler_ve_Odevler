package Day_10_Control_Flow_Statements_Part4;

public class Task_44_2nd_Way {

	public static void main(String[] args) {


		//Constants
		final int Starting_KPH=60;
		final int Max_KPH=130;
		final int Increment=10;
		
		//Variables
		int kph;	// to hold speed in km
		double mph; // to hold speed in miles
		
		//Display the table header
		
		System.out.println("\n+----------------------------------+");

		System.out.println("|KPH\t\t|MPH\t\t   |");
		System.out.println("+----------------------------------+");
		
		for(kph=Starting_KPH;kph<=Max_KPH;kph+=Increment) {
			
			//Calculate
			mph=kph*0.6214;
	
			//Display the speeds in kph and mph
			
			if(kph==80||kph==90) {
				System.out.println("|" + kph + "\t\t|" + mph + "|");
			}else if(kph==100) {
				System.out.println("|" + kph + "\t\t|" + mph + " |");
			}else {
				System.out.println("|" + kph + "\t\t|" + mph + "\t\t   |");
			}
			
		}
		
		System.out.println("+----------------------------------+");

	}

}
