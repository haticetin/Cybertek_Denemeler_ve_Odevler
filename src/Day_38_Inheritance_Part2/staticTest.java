package Day_38_Inheritance_Part2;

public class staticTest {

	public static void main(String[] args) {


		staticSub obj = new staticSub();
		
		obj.num = 5;
		obj.print();
		
		staticSuper.num = 10;
		obj.print();
		System.out.println(staticSub.num);
		
//		staticSub.m2();		// m2 method is not static
		obj.m2();
		
	}

}
