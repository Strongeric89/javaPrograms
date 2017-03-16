package com.eric.lab8;

public class Card
{
	private String suit;
	private String type;

	public Card(String suit, String type)
	{
		this.suit = suit;
		this.type = type;

	}// end constructor

	public String getSuit()
	{
		return suit;
	}

	public void setSuit(String suit)
	{
		this.suit = suit;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String toString()
	{
		return "\nSuit:" + this.suit + "\tType:" + this.type;
	}

}// end class
