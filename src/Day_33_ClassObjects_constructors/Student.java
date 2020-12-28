package Day_33_ClassObjects_constructors;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	String course;
	String university = "Cybertek University";
	
	public Student(String name, int age, char gender, int year, String course) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	public void attendLecture() {
		System.out.println(name + " attended lecture");
	}
	
	public void submitAssignment() {
		System.out.println(name + " submitted assignment");
	}
	
	public void attendLab() {
		System.out.println(name + " attended Lab");
	}
	
}
