package Day_16_Class_and_Objects;

public class DogObject {

	public static void main(String[] args) {


		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog dog3 = new Dog(); 
		
		dog1.age=10;
		dog1.breed="Maltese";
		dog1.color="red";
		dog1.name="Rover";
		
		System.out.println("Dog 1 Info");
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		dog2.age=2;
		dog2.breed="unknown";
		dog2.color="brown";
		dog2.name="Golge";
		
		System.out.println("Dog 2 Info");
		
		System.out.println(dog2.name + " = " + dog2.breed + " | " + dog2.color + " | " + dog2.age + " years old");
		
		dog3.age=22;
		dog3.breed="Pitbull";
		dog3.color="white";
		dog3.name="Betul";
		
		System.out.println("Dog 3 Info");
		
		String dog3Info = "A " + dog3.age + " years old " + dog3.breed + " in " + dog3.color + " color called " + dog3.name +
				" needs rabies vaccine!!! ";
		
		System.out.println(dog3Info);
		
		dog3.hungry();
		dog3.barking();
		dog3.sleeping();
	
	
	}

}
