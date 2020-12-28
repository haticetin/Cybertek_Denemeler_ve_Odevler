package Day_25_Arrays_Part2;

public class returnArray {

	public static void main(String[] args) {

//		double[] values;
//		values = getArray();
		
		for(double values : getArray()) {
			System.out.println(values);
		}
		
		
	}
	
	public static double[] getArray() {
		
		double[] array = {1.2,2.3,4.4,5.6};
		
		return array;
	}

}
