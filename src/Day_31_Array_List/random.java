package Day_31_Array_List;

public class random {
	
	public static void main(String args) {
		
		int[] data = {2010, 2013, 2014, 2015, 2014};
		
		int key = 2014;
		
		int count = 0;
		
		for(int e : data) {
			
			if(e!=key) {
				continue;
//				count++;		// return, break, continue oldugunda sonraki koda ulasamadigi icin "unreachable code" hatasi veriyor cunku hic count++'ya gidemez
								// count++ if statementin disinda olsaydi calisirdi
			}
			
		}
		
		System.out.println(count + "Found");
		
	}

}
