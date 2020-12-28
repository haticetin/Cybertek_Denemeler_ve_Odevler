package Assignments.Assignment14.Q4;

public class PersonTest {

	public static void main(String[] args) {


		Person person1 = new Person();

		System.out.println(person1.getFirstName()); 
		System.out.println(person1.getLastName()); 
		System.out.println(person1.getAge()); 
		System.out.println(person1.toString());

		person1.setFirstName("John");
		person1.setLastName("Doe");
		person1.setAge(44);

		System.out.println(person1.toString() ); 

		Person person2 = new Person("Fatima", "Lee", 22);

		System.out.println(person2.getFirstName()); 
		System.out.println(person2.getLastName()); 
		System.out.println(person2.getAge()); 
		System.out.println(person2.toString()); 
	}

}
