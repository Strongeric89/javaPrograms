package com.eric.person;

import java.util.Scanner;

public class Person
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// ENTERING DETAILS
		System.out.println("Please enter your name:");
		String name = scan.nextLine();

		System.out.println("Please enter your age");
		int age = scan.nextInt();

		System.out.println("Please enter your Gender:");
		char gender = scan.next(".").charAt(0);

		System.out.println("Please enter your Race:");
		String race = scan.next();

		System.out.println("Please enter your nationality:");
		String nationality = scan.next();

		System.out.println("Please enter your weigth:");
		double weight = scan.nextDouble();

		System.out.println("Please enter your Height:");
		double height = scan.nextDouble();

		System.out.println("Please enter your Eye colour:");
		String eye = scan.next();

		System.out.println("Please enter your hair colour:");
		String hair = scan.next();

		System.out.println("Please enter your writing hand:");
		String hand = scan.next();

		System.out.println("Please enter your native Language:");
		String nativeL = scan.next();

		// creating the object of a person
		Attributes p1 = new Attributes(name, age, race, nationality);
		// printing only the info passed into constructor
		System.out.println(p1);

		// Behaviours
		p1.walk(false);
		p1.cry(false);
		p1.eat(false);
		p1.drums(false);
		p1.code(false);
		p1.love(true);

	}// end main
}// end class
