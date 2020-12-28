package Day_26_Arrays_Part3;

public class String_Manipulation_Arrays {

	public static void main(String[] args) {


		String[] myCars = {"Honda","Mercedes","BMW","Toyota","Ford "};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2, 3));
		System.out.println(myCars[1].equals(myCars[2]));
		System.out.println(myCars[1]==myCars[2]);		// different String objects so false
		
		
		System.out.println("================================");
		
		for(int i=0; i<myCars.length; i++) {
			
			System.out.println(myCars[i].length());
			
		}
		
		for(int i=0; i<myCars.length; i++) {
			
			for(int j=0; j<myCars[i].length(); j++) {
				
				System.out.print(myCars[i].charAt(j) + " ");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
