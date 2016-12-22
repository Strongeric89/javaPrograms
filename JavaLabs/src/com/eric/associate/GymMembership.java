package com.eric.associate;

public class GymMembership
{
	private static int id = -1;

	private Person p1;
	private DateHolder start;
	private DateHolder expire;
	private int num;

	public GymMembership(Person p1, DateHolder start, DateHolder expire)
	{
		id++;
		this.num = id;
		this.p1 = p1;
		this.start = start;
		this.expire = expire;
		System.out.printf("%s membership created", this.p1.getFirst());

	}// end constructor

	public String toString()
	{
		return "ID: " + this.num + "\nName: " + this.p1 + "\nStart Date: " + this.start + "\nExpire Date: "
				+ this.expire;
	}

	public void payMembership()
	{
		// changes the expiry date to increment by 1
		int x = expire.getYear();
		x++;
		this.expire.setYear(x);
		System.out.println("Paid for another year");
	}

	public static int getId()
	{
		return id;
	}

	public static void setId(int id)
	{
		GymMembership.id = id;
	}

	public Person getP1()
	{
		return p1;
	}

	public void setP1(Person p1)
	{
		this.p1 = p1;
	}

	public DateHolder getStart()
	{
		return start;
	}

	public void setStart(DateHolder start)
	{
		this.start = start;
	}

	public DateHolder getExpire()
	{
		return expire;
	}

	public void setExpire(DateHolder expire)
	{
		this.expire = expire;
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

}// end class
