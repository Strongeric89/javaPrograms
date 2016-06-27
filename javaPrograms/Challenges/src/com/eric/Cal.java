package com.eric;

import java.util.Calendar;

public class Cal
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.DAY_OF_WEEK));
	}

}
