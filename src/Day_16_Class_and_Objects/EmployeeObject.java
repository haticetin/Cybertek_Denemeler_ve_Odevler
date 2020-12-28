package Day_16_Class_and_Objects;

public class EmployeeObject {

	public static void main(String[] args) {


		Employee employee1 = new Employee();
		
		employee1.name="Mustafa Cetin";
		employee1.salary=4500;
		employee1.name=employee1.jobTitle;
		System.out.println(employee1.name);
		employee1.jobTitle=employee1.name;
		System.out.println(employee1.jobTitle);
		employee1.jobTitle="Linguistic Professor";
		employee1.introduce();
		
		employee1.name=employee1.jobTitle;
		System.out.println(employee1.name);
	}

}
