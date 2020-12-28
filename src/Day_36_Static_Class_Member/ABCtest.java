package Day_36_Static_Class_Member;

public class ABCtest {

	public static void main(String[] args) {

		ABC.m1();	// call method thru only static way
		
//		ABC o1 = new ABC();	// error
//		o1.m1();
		
//		Whenever all of your methods in your class are static, and you 
//		want everyone to call them static way ClassName.methodName(), 
//		then you can simply make your constructor private
		
		
	}
	
	public static void print() {
//		static int a = 5;	// local variables CANNOT be static
	}
	
	

}
