package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadApp
{
	public static void main(String[] args) throws IOException
	{
		String filename = "C:\\Users\\Eric\\Documents\\GitHub\\javaPrograms\\JavaLabs\\src\\com\\io\\test.txt";
		File file = new File(filename);
		Scanner in = new Scanner(file);
		int i = 0;
		String[] lines = new String[10];
		while (in.hasNextLine())
		{
			String line = (i + 1) + ".\t" + in.nextLine() + "\t ADDING IN TEXT";
			lines[i] = line;
			System.out.println(line);
			i++;
		}

		// writing to a file
		String text = "";
		for (int j = 0; j < i; j++)
		{
			text = lines[j];
			// saves file to the parent directory of the project - f5 to refresh
			Files.write(Paths.get("./fileName.txt"), text.getBytes());
		}

	}// end main
}// end class