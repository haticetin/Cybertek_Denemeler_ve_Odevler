package Day_06_Logical_Operators;

public class Task {

	public static void main(String[] args) {

		
		System.out.println(-  -6+5);
		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount = 30;
		
		boolean comp =applesCount < orangesCount || orangesCount >= pearsCount;
		// T || --- = T				
		
		System.out.println(comp);
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		String Outsideweather;
		int Degree;
		Outsideweather = "Shinny";
		Degree = 70;
		boolean comp2 = (!(Outsideweather=="Rainny"||Degree==70));
		System.out.println(comp2);
		boolean comp3 = (!(Outsideweather=="Rainny")||(Degree==70)); // ! (F) || (T) -> T || T = T
		System.out.println(comp3);
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		int b=2;
		boolean res= ++b == 2 || --b == 2 && --b ==2;
		
		// memory: 2 -> 3 -> 2 -> 1
		//result: 3 == 2 || 2 == 2 && 1 == 2	=> F || T && F	=> F || F	=>F
		System.out.println(res);
		System.out.println(b);
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		boolean x=true, z=true;
		int y=20;
		x=(y!=10)||(z=false); // z=false => burda bir = var so its assignment operator 
							  // not logical operator so it will anyways be false. x icin de gecerli tekrar assign ediyoruz.
		
		System.out.println(x);
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		double d1=20;
		double d2=80;
		
		double res1 = (d1+d2)*25;
		
		double rem= res1%40;
		
		System.out.println("Remaining total is equal to or less - " + (rem<=20));
		
		System.out.println(res1);
		System.out.println(rem);
		
		
		
		
		
		
	}

}
