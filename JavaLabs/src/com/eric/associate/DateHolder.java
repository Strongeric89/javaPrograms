package com.eric.associate;

public class DateHolder
{

	private String dd;
	private String mm;
	private String yy;
	private int year;

	public DateHolder(String d, String m, String y)
	{
		this.dd = d;
		this.mm = m;
		this.yy = y;

	}// end construct

	// overloaded constructor
	public DateHolder(String d, String m, int y)
	{
		this.dd = d;
		this.mm = m;
		this.year = y;

	}// end construct

	public String toString()
	{

		return "Date: " + this.dd + "/" + this.mm + "/" + this.year;

	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public String getDd()
	{
		return dd;
	}

	public void setDd(String dd)
	{
		this.dd = dd;
	}

	public String getMm()
	{
		return mm;
	}

	public void setMm(String mm)
	{
		this.mm = mm;
	}

	public String getYy()
	{
		return yy;
	}

	public void setYy(String yy)
	{
		this.yy = yy;
	}

}
