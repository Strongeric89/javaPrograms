package com.eric.objects;

import java.util.Scanner;

public class GarageApp
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		// using a seperate class (NewCar.java)
		NewCar myCar = new NewCar("Nissan", "R35"); // only two perameters
		System.out.println(myCar); // passing over 2 parameters to the
									// constructor and printing

		System.out.println("Please enter the following information:");
		System.out.print("Car Make:");

		String make = scan.nextLine();

		System.out.print("Car Model:");
		String model = scan.nextLine();

		System.out.print("Car Year:");
		int year = scan.nextInt();

		System.out.print("Car Transmission:");
		char trans = scan.next(".").charAt(0);

		System.out.print("Car Price:");
		double price = scan.nextDouble();
		boolean print = true;

		Car car1 = new Car(print, make, model, year, trans, price);
		boolean isRunning = true;

		// print out details of the car
		System.out.println("what information do you want:");
		while (isRunning)
		{
			System.out.println(
					"\n\n[1]make\n[2]model\n[3]year\n[4]Transmission[5]Price\n[6]Exit\nPlease select an an option(1-6)");
			int userOption = scan.nextInt();
			switch(userOption)
			{
				case 1 :
				{
					System.out.print("Car Make: " + car1.getMake());
				}
					break;

				case 2 :
				{
					System.out.print("Car Model: " + car1.getModel());
				}
					break;

				case 3 :
				{
					System.out.print("Car Year: " + car1.getYear());
				}
					break;

				case 4 :
				{
					System.out.print("Car Transmission: " + car1.getTransmission());
				}
					break;

				case 5 :
				{
					System.out.print("Car Price: €" + car1.getPrice());
				}
					break;

				case 6 :
				{
					System.out.println("Exiting....");
					isRunning = false;
				}
					break;

				case 7 :
				{

				}
					break;

				default:
				{
					System.out.println("not a valid option");
				}
					break;
			}// end switch

		}

	}// end main

}
