package Day_10_Control_Flow_Statements_Part4;

public class Task_44 {

	public static void main(String[] args) {

		double MPH=0;
		int KPH=0;

		System.out.println("\n+----------------------------------+");
		System.out.print("|KPH\t\t|");
		System.out.println("MPH\t\t   |");
		System.out.println("+----------------------------------+");

		for(int i=60;i<=130;i+=10) {
			KPH=i;
			System.out.print("|" + KPH);
			MPH=KPH*0.6214;
			
			if(KPH==80||KPH==90) {
				System.out.println("\t\t|" + MPH + "|");
			}else if(KPH==100){
				System.out.println("\t\t|" + MPH + " |");
			}else {
				System.out.println("\t\t|" + MPH + "\t\t   |");
			}

		}
		System.out.println("+----------------------------------+");
		

	}

}
