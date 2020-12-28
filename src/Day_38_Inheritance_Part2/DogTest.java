package Day_38_Inheritance_Part2;

public class DogTest {

	public static void main(String[] args) {


		Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");
		System.out.println(dog.getName());
		Animal an = new Animal("Golge", 2, 2, 18, 28);
		
		System.out.println(dog.getName());
		
		dog.eat();
		System.out.println(an.getName());
		
//		dog.name = "Mike";		// name is private 
//		dog.setName = "Mike";	// no setter just getter so name is immutable
		
		dog.move(10);
		
	}

}
