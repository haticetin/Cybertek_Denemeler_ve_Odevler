package Day_15_Method_Overloading;

public class methodOverloading {

	public static void main(String[] args) {
		
		System.out.println(sum(2,3));
		System.out.println(sum(5,7,28));
		System.out.println(sum(178,1972,1298,38912));
		System.out.println(sum(4,679, 27));
//		System.out.println(sum(5));	// auto-boxing
		System.out.println(sum(new Boolean("true")));	// auto-unboxing
		System.out.println(sum('c'));	// compiler will always look for the most specific parameter
										// so in this case char not Character 
										// autoboxing yapmayacak
		
		System.out.println(sum((short)7));
//		System.out.println(sum(8));
		sum(10,2);		// arraya hicbir sekilde gitmedi. Ona gitmesi icin disarda array yazip icin atamamiz lazim yoksa olmuyor
		
	}
	
	public static int sum(short a) {
		return a*10;
	}
	
//	public static int sum(int a) {
//		return a*5;
//	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}

//	public static Number sum(Number a) {
//		return a;
//	}
	
//	Hem array hem de varargs ayni anda olamiyor compilerin kafasi karisiyor
	
	public static void sum(int... nums) {
		for(int num: nums) {
			System.out.print(num + " ");
		}
	}
	
//	public static void sum(int[] nums) {
//		for(int num: nums) {
//			System.out.print(num + " ");
//		}
//	}
	
	
	public static boolean sum(boolean isEffective) {
		return isEffective;
	}
	
	public static char sum(char c) {
		return c;
	}
	
	public static Character sum(Character c) {
		return c;
	}
	
//	public static float sum(float f) {
//		return f/2;
//	}
//	
//	public static double sum(double d) {
//		return d*2;
//	}
//	
//	public static long sum(long l) {
//		return l-1;
//	}
	
	public static Float sum(Float f) {
		return f;
	}
	
}

/*
  
 Method signature == name, number of parameters, type of each parameters
 				     XXX Return type is not part of signature
 				     
1-Number of Parameters
	add(int,int)
	add(int,int,int)
2-Data Type of Parameters
	add(int,int)
	add(int,float)
3-Sequenceof data type
	add(int,float)
	add(float,int)
4-Invalid Case ==> Not overloading
	int add(int,int)
	float add(int,int)
	
 */


// Order f Overloaded method selection 

/*
 * 1. Exact match by type
 * 2. Larger primitive type
 * 3. Auto-boxed type: exact match yoksa Object, Number (super class)
 * 					   yoksa larger wrapper classa GITMIYOR
 * 4. Varargs
 */
