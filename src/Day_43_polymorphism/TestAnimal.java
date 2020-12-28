package Day_43_polymorphism;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		
		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Bird();
		
		Animal animal = new Animal();
		animal = new Dog();
		animal = new Bird();
		
//		should be parent 			subclass
//		Bird b 				= 		new Animal();
	}

}

class Animal{}
class Dog extends Animal{}
class Bird extends Animal{}