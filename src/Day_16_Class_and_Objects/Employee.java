package Day_16_Class_and_Objects;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + " works 8 hours per a day");
	}
	
	public void attendMeeting() {
		System.out.println(jobTitle + name + " must attend the meeting" );
	}
	
	public void introduce() {
		System.out.println("Please introduce yourself");
		System.out.println("My name is " + name + "| I am " + jobTitle + "| I earn $" + salary);
	}

}
