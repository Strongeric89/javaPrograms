package com.eric.lab6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadApp
{
	public ArrayList<String> names = new ArrayList<String>();
	public String filename;
	public String[] lines = new String[10];
	public int size = 0;

	public ReadApp(String filename) throws IOException
	{
		this.filename = filename;
		System.out.println("file: " + this.filename + " has been set up");

	}// end constructor

	public void readFile() throws IOException
	{
		File file = new File(filename);
		Scanner in = new Scanner(file);

		while (in.hasNextLine())
		{
			String line = in.nextLine();
			names.add(line);
			// System.out.println(line);

		}

		in.close();
	}// end readFile

	public void writeFile(String outputfile, String argument) throws IOException
	{
		// writing to a file

		// // saves file to the parent directory of the project - f5 to refresh
		// Files.write(Paths.get(output), argument.getBytes());

		FileWriter fileout = new FileWriter(outputfile);
		PrintWriter text = new PrintWriter(fileout);
		System.out.println("writing to file now.....");
		text.println(argument);
		text.close();

	}

	public ArrayList<String> getFileContents()
	{
		System.out.println("the array list is empty? :" + names.isEmpty());
		return this.names;
	}

	public String toString()
	{
		return "" + lines.toString();
	}
}// end class
