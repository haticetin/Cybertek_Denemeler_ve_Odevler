import java.util.Arrays;

public class primitiveVSarrayAsArgument {

	public static void main(String[] args) {

		int[] x1 = {1, 2, 3 };
		int[] y = {};
		int[] a = {7, 4, 6, 2 };
		int[] b = {};
		System.out.println(Arrays.toString(twoArrays(x1, y)));
		System.out.println(Arrays.toString(x1));
		System.out.println(Arrays.toString(twoArrays(a, b)));
		
		
		int[] x = {1, 2};
		int n1 = x[0];
		int n2 = x[1];
		System.out.println(Arrays.toString(x));// before invoking methods
		swapInPrimitive(n1, n2);//after invoking primitive arguments method
		System.out.println(Arrays.toString(x));
		swapInArray(x);//after invoking array argument method
		System.out.println(Arrays.toString(x));
		
	}
	
	public static int[] twoArrays(int[] a, int[] b) {
		a[2]= 15;
		return a;
		
		
	}
	
	public static void swapInArray(int[] a) {
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	public static void swapInPrimitive(int a, int b) {
		int temp = a;
		a = b;
		b =temp;
	}

}
