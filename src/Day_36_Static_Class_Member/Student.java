package Day_36_Static_Class_Member;

public class Student {

	
	String name;
	int age;
	int idNumber;	// belongs to object
	static String school;	// belongs to class
							// any change made in any object to this variable 
							// will automatically change in class and will make all 
							// object values same
							// if you want objects to have different values, you shouldnt use static keyword
	
	
	public Student(String name, int age, int idNumber, String school) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.school = school;
	}
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", ID number= " + idNumber + ", school=" + school + "]";
	}
	
	
	
	
	
	
}
