package com.eric.associate;

public class DOB
{
	private String dd;
	private String mm;
	private String yy;

	public DOB(String d, String m, String y)
	{
		this.dd = d;
		this.mm = m;
		this.yy = y;

	}// end construct

	public String toString()
	{
		return "Date of Birth: " + this.dd + "/" + this.mm + "/" + this.yy;

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
