package com.eric.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightInformation
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Passenger> passengers = new ArrayList<Passenger>();

		boolean isRunning = true;
		do
		{

			System.out.println("Welcome to the Flight Informaton Kiosk.\n-----------------------------------------");

			System.out.println("Enter your Name:");
			String name = scan.nextLine();
			if(name.equalsIgnoreCase("end"))
			{

				break;
			} // end if

			System.out.println("Enter your flightNumber:");
			String flight = scan.nextLine();

			System.out.println("Enter your Destination");
			String dest = scan.nextLine();

			System.out.println("Enter your Departure:");
			String dep = scan.nextLine();

			System.out.println("Enter your Seat:");
			String seat = scan.nextLine();

			Passenger p1 = new Passenger(name, flight, dest, dep, seat);
			passengers.add(p1);

		}
		while (isRunning);

		// PRINTING DETAILS
		for(Passenger p : passengers)
		{
			System.out.println("Name:" + p.getName() + "\tFlight Num:" + p.getFlightNumber() + "\tDestination:"
					+ p.getDestination() + "\tDeparting:" + p.getDeparture() + "\tSeat:" + p.getSeat());
		} // end for

	}// end main
}
