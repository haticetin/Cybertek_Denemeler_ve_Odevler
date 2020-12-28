package Lab.Lab1;

public class Q1 {

	public static void main(String[] args) {

		stringTimes("Hi",6);
		
	}
	
	public static void stringTimes(String hi, int times) {
		
/*		if(times>=0) {
			for (int i=1; i<=times; i++) {
				System.out.print("Hi");
			}
		}else {
			System.out.println("");
*/		
		
		String str="";
		
		for(int i=1; i<=times; i++) {
			
		str = str + hi;
			
		}
		System.out.println(str);
		
	}
		
		

}
