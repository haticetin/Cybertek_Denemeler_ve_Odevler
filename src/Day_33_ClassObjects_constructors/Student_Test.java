package Day_33_ClassObjects_constructors;

public class Student_Test {

	public static void main(String[] args) {


		Student s1 = new Student("Mike", 17, 'M', 2016, "Java");
	
		Student s2 = new Student("Smith", 18, 'M', 2015, "JS");
		
		Student s3 = new Student("Mary", 19, 'F', 2017, "TS");
	
		s1.attendLab();
		s2.attendLecture();
		s3.submitAssignment();
	
		System.out.println(s1.name + " is a student of " + s1.university);
		System.out.println(s2.name + " is a student of " + s2.university);
		System.out.println(s3.name + " is a student of " + s3.university);

	
	
	
	}

}
