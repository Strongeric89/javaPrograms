package com.eric.c15708709;

/**
 * @author Eric Date: 30 Jan 2017 classwork: week1
 */
public class Zoo
{
	public static void main(String[] args)
	{
		Fish dory = new Fish("bluelagoon", 2, "Dory");
		Bird bigBird = new Bird("roosterhen", 9, "Big Bird");
		Fish nemo = new Fish("clownfish", 1, "nemo");

		move(dory);
		move(bigBird);
		move(nemo);

		dory.fishfloat();
		bigBird.fly();

		Bird pidgeotto = new Bird();

		pidgeotto.fly();
		Animal animal = new Bird();
		animal.move();

	}// end main

	// example of polymorphism and generalisation
	public static void move(Animal animal)
	{

		animal.move();
	}

}
