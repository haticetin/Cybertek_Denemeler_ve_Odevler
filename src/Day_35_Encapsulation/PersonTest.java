package Day_35_Encapsulation;

public class PersonTest {

	public static void main(String[] args) {


		Person p1 = new Person("Mike", -5, 'm'); 
		
		System.out.println("===========1==========");
		System.out.println(p1.toString());
		p1.setAge(-35);
		
		System.out.println("===========2==========");

		System.out.println(p1.toString());

		
		
	}

}
