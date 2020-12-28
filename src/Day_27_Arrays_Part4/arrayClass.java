package Day_27_Arrays_Part4;

import java.util.Arrays;

public class arrayClass {

	public static void main(String[] args) {


		// toString()
		
		int[] nums = {43,12,4,1,3,5};
		System.out.println(Arrays.toString(nums));
		
		// equals()
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};

		System.out.println(Arrays.equals(nums1, nums2));
		
		// sort() : sorts array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu","2Spanish","Italian","English","1Polish","arabic"};
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));		// alphabetic order
															// number > special character > capital letters > small letters
		
		// binarySearch()
		int[] numX = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numX, 7));	// 2
		System.out.println(Arrays.binarySearch(numX, 55));	// 4
		System.out.println(Arrays.binarySearch(numX, 5));	// -2	compilerUnderstanding: -(insertionPoint)-1
															// insertionPoint will be the indexNumber where 
															// the number is closest (this case: 4;5;6 so insertionPoint:1)
		
		System.out.println(Arrays.binarySearch(numX, 15));	// -5
		
		int[] numX2 = {40,6,105,101,72};	// it is being sorted first
		// 6,40,72,101,105
		System.out.println(Arrays.binarySearch(numX2, 83));	// -3
		
		// copyOf()
		
		double[] d1 = {2.3,4.5,12.4};
		double[] d2 = d1;		// pointing same reference; reference matching
								// difference made to any object affects the other one too
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0]=100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1]=400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double[] d3 =Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		double[] d4 = Arrays.copyOf(d3, 5);
		
		System.out.println(Arrays.toString(d4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
