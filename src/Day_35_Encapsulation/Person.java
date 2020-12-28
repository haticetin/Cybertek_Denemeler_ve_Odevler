package Day_35_Encapsulation;

public class Person {

//	private --> access just in the same class
	
	// instance variables
	private String name;
	private int age;
	private char gender;
	
	
//	Right click --> Source --> Generate toString()
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

//	Right click --> Source --> Generate Constructor using Fields
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = setAge(age);	// direk - this.age = age; - de diyebilirdim
		this.gender = gender;
	}
	
//	Right click --> Source --> Generate Getters and Setters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public int setAge(int age) {	// eger setterlar olusturulmaz ise 
									// main method'da constructor olusturuldugunda
									// sadece initialize yapiliyor ve deger bir daha degistirilemiyor cunku private
		
		if(age>0 && age<120) {
			this.age = age;
		}else {
			age = 0;
			this.age = age;
			System.out.println("Invalid age!");
			System.out.println("Please enter a valid input");
		}
		
		return age;	// return yapmadan da yapabilirdim
		
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}

// Encapsulation
// 1. hide the data
// 		- private
//		- public setter method
//		- public getter method






