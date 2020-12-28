package Day_37_Inheritance;

public class School {

	public static void main(String[] args) {


		Person person = new Person();
		Student student = new Student();
		
		person.name = "Mike";
		person.age = 35;
		person.gender = 'm';
		
		student.name = "Smith";
		student.age = 30;
		student.gender = 'm';
		
		student.studentID = 1000;
		
		person.eat("Steak");
		student.eat("Pizza");
		
//		person.code("Java");	// error because person does not have code method
		
		
		
	}

}
