package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Eric Strong Date: 23 Feb 2017 GoogleHashCode: file reading class ID:
 *         C15708709
 */
public class ReadApp
{
	public static void main(String[] args) throws IOException
	{
		// enter file name here
		String filename = "me_at_the_zoo.in";
		File file = new File(filename);
		String lineOne = "";
		Scanner in = new Scanner(file);
		int i = 0;

		while (in.hasNextLine())
		{

			String line = (i + 1) + ".\t" + in.nextLine();
			System.out.println(line);

			if (i == 0)
			{
				lineOne = line;
			} // end if
			i++;

		}

		// int numbers[] = Integer.parseInt(lineOne.split(" "));
		System.out.println(lineOne);
		String numbers[] = lineOne.split(" ");

		int v = 0;
		int realNumbers[] = new int[4];
		int k = 0;
		for (String num : numbers)
		{
			System.out.println(num);
			// realNumbers[k] = Integer.parseInt(num);
			// // realNumbers[k] = v;
			// k++;
		}

		in.close();
	}// end main
}// end ReadApp Class

// // writing to a file
// String text = "";
// for (int j = 0; j < i; j++)
// {
// text = lines[j];
// // saves file to the parent directory of the project - f5 to refresh
// Files.write(Paths.get("./fileName.txt"), text.getBytes());
// }