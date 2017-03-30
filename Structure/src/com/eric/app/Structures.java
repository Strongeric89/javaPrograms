package com.eric.app;

import java.io.IOException;
import java.util.HashMap;

public class Structures
{
	public static HashMap<Integer, String[]> classes = new HashMap<Integer, String[]>();

	public static void main(String[] args)
	{

		try
		{
			ReadApp reader = new ReadApp("timetable.txt");

			classes = reader.getContents();

			int k = 17;
			String key = classes.get(k).toString();

			System.out.println("NOW: " + key + "\tModule:" + classes.get(k)[0] + "\tRoom:" + classes.get(k)[1]);

			System.out
					.println("NEXT: " + key + "\tModule:" + classes.get(k + 1)[0] + "\tRoom:" + classes.get(k + 1)[1]);

		} catch (IOException e)
		{
			System.out.println("file not found");
		}

	}// end main

}// endclass
