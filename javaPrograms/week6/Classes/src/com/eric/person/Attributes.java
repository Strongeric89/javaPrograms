package com.eric.person;

public class Attributes
{
	private String name;
	private int age;
	private double weigth;
	private String race;
	private String nationality;
	private double height;
	private String eye;
	private String hair;
	private String handed;
	private String nativeLanguage;
	private char gender;

	private int master = 0;

	public Attributes(String newName, int newAge, String newRace, String newNationality)
	{
		name = newName;
		age = newAge;
		race = newRace;
		nationality = newNationality;

	}// end Attributes

	public String toString()
	{
		return "name: " + name + "\nage: " + age + "\nrace: " + race + "\nnationality: " + nationality;

	}

	public void walk(boolean isDoing)
	{
		if(isDoing == true)
		{
			System.out.println(name + " is walking......");
		}
		else if(isDoing == false)
		{
			System.out.println(name + " is Not walking......");
			master = master + 1;
		}
	}

	public void sleep(boolean isDoing)
	{
		if(isDoing == true)

		{
			System.out.println(name + " is Sleeping......");
		}
		else if(isDoing == false)
		{
			System.out.println(name + " is Not Sleeping......");
			master = master + 1;
		}
	}

	public void eat(boolean isDoing)
	{
		if(isDoing == true)
		{
			System.out.println(name + " is eating......");
		}
		else if(isDoing == false)
		{
			System.out.println(name + " is Not eating......");
			master = master + 1;
		}
	}

	public void cry(boolean isDoing)
	{
		if(isDoing == true)
		{
			System.out.println(name + " is crying......");
		}
		else if(isDoing == false)
		{
			System.out.println(name + " is Not crying......");
			master = master + 1;

		}
	}

	public void drums(boolean isDoing)
	{
		if(isDoing == true)
		{
			System.out.println(name + " is playing drums......");
		}
		else if(isDoing == false)
		{
			System.out.println(name + " is Not playing drums......");
			master = master + 1;
		}
	}

	public void code(boolean isDoing)
	{
		if(isDoing == true)
		{
			System.out.println(name + " is coding......");
		}
		else if(isDoing == false)
		{
			System.out.println(name + " is Not coding......");
			master = master + 1;
		}
	}

	public void love(boolean isDoing)
	{
		if(isDoing == true)
		{
			System.out.println(name + " is making Love......");
		}
		else if(isDoing == false)
		{
			System.out.println(name + " is Not making Love......");
			master = master + 1;
		}
		if(master == 6)
		{
			System.out.println("Do something you lazy shit!");
		}
	}

}
