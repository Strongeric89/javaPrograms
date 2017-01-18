package com.robotvshuman;

public class Army
{
	private String type;
	private String name;
	private int health = 0;
	private int attack = 0;

	public Army(String type, String name, int health, int attack)
	{
		this.type = type;
		this.name = name;
		this.health = health;
		this.attack = attack;
	}// end constructor

	public String toString()
	{
		return "Type: " + this.type + "\nName: " + this.name + "\nHealth: " + this.health + "\nAttack: " + this.attack
				+ "\n";
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public int getAttack()
	{
		return attack;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}

}// end class
