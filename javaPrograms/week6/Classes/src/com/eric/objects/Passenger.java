package com.eric.objects;

public class Passenger
{
	private String name;
	private String flightNum;
	private String destination;
	private String departure;
	private String seat;

	public Passenger(String newname, String newflightNum, String newdestination, String newdeparture, String newseat)
	{

		name = newname;
		flightNum = newflightNum;
		destination = newdestination;
		departure = newdeparture;
		seat = newseat;
	}// end passengerConstruct

	public String getName()
	{
		return name;
	}

	public String getFlightNumber()
	{
		return flightNum;
	}

	public String getDestination()
	{
		return destination;
	}

	public String getDeparture()
	{
		return departure;
	}

	public String getSeat()
	{
		return seat;
	}

}// end class
