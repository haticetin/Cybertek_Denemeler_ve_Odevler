package Day_36_Static_Class_Member;

public class CampusTest {

	public static void main(String[] args) {


		Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country);
//		System.out.println(c1.city);
		
//		m2();  ERROR non-static cannot go to static
	}
	
//	public void m2() {
//		
//	}

}
