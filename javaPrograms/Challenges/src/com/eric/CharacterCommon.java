package com.eric;
import java.util.Scanner;

public class CharacterCommon {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 letters:");
		char letters[] = new char [3];
		for(int i=0;i<letters.length;i++)
		{
			letters[i] = scan.next(".").charAt(0);
		}//end for
		System.out.println(letters);
		char common = countLetters(letters);
		
	}//end main
	public static char countLetters(char letters[])
	{
		
		char temp;
		int letCount[] = {0,0,0};
		
		int num=0;
		
			for(int i=0;i<letters.length;i++)
			{
				temp = letters[i];
				for(int j=0;j<letters[i];j++)
				{
					if(temp == letters[j])
					{
						num++;
						
					}//end for
					letCount[j] = num;
				}//end inner
			}//end for
	}//end countLetters
	
}//end class
