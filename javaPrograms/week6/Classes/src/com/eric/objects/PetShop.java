package com.eric.objects;

public class PetShop
{
	public static void main(String[] args)
	{
		// using Constructors
		Dog myDog = new Dog("prince", 12, "brown", "Staffy");
		Dog herDog = new Dog("princess", 10, "black and white", "Minature JackRussel");
		Dog samDog = new Dog("Sam", 26, "black", "jackRussel");

		System.out.print("Name:" + samDog.getName() + "\tAge:" + samDog.getAge() + "\tColour:" + samDog.getColour()
				+ "\tBreed:" + samDog.getBreed());
		System.out.print("\nName:" + myDog.getName() + "\tAge:" + myDog.getAge() + "\tColour:" + myDog.getColour()
				+ "\tBreed:" + myDog.getBreed());
		System.out.print("\nName:" + herDog.getName() + "\tAge:" + herDog.getAge() + "\tColour:" + herDog.getColour()
				+ "\tBreed:" + herDog.getBreed());

		Dog laurasDog = new Dog("Fluffy", 1, "brown", "pug");
		laurasDog.setName("lassy"); // changed dog name
		System.out.print("\nName:" + laurasDog.getName() + "\tAge:" + laurasDog.getAge() + "\tColour:"
				+ laurasDog.getColour() + "\tBreed:" + laurasDog.getBreed());

		// // setting the name of the dog
		// myDog.setName("Banger");
		// System.out.println("My dogs name is " + myDog.getName());
		// herDog.setName("prince");
		// System.out.println("her dogs name is " + herDog.getName());
		//
		// // setting the age of the dog
		// myDog.setAge(12);
		//
		// System.out.println(myDog.getName() + "'s age is " + myDog.getAge());
		// herDog.setAge(8);
		//
		// System.out.println(herDog.getName() + "'s age is " +
		// herDog.getAge());
		//
		// myDog.setColour("Brown");
		// System.out.println("my dog's colour is" + myDog.getColour());
		// herDog.setColour("Red");
		// System.out.println("her dog's colour is" + herDog.getColour());
		//
		// myDog.setBreed("Terrier");
		// System.out.println("my dog's breed is " + myDog.getBreed());
		// herDog.setBreed("JackRussel");
		// System.out.println("her dog's breed is " + herDog.getBreed());
		//
		// myDog.setFav('A');
		// System.out.println("my dogs favourite letter is " + myDog.getFav());
		// herDog.setFav('C');
		// System.out.println("her dogs favourite letter is " +
		// herDog.getFav());
		//
		// myDog.setSize(12.7);
		// System.out.println("My dogs size is " + myDog.getSize());
		// herDog.setSize(20.1);
		// System.out.println("her dogs size is " + herDog.getSize());
		//
		// // setting and getting an object
		//
		// // Dog otherDog = generateDog("Fido", "Red", 21);
		// // System.out.println(otherDog.getName() + otherDog.getAge() +
		// // otherDog.getColour());
		//
		// // using constructors

	}// end main

	public static Dog generateDog(String name, String color, int age)
	{
		Dog tempDog = new Dog();

		tempDog.setName(name);
		tempDog.setAge(age);
		tempDog.setColour(color);
		return tempDog;
	}

}// end class
